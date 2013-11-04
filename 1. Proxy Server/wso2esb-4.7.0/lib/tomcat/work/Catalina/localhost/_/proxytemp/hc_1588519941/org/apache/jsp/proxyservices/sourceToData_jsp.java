package org.apache.jsp.proxyservices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.proxyadmin.ui.client.ProxyServiceAdminClient;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.CarbonConstants;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.ui.CarbonUIMessage;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.IllegalStateException;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;

public final class sourceToData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
      out.write(" ~\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\n");
      out.write(" ~ in compliance with the License.\n");
      out.write(" ~ You may obtain a copy of the License at\n");
      out.write(" ~\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write(" ~\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\n");
      out.write(" ~ software distributed under the License is distributed on an\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\n");
      out.write(" ~ specific language governing permissions and limitations\n");
      out.write(" ~ under the License.\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.proxyadmin.ui.i18n.Resources",
            request.getLocale());
    String header = request.getParameter("header");

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ProxyServiceAdminClient client = new ProxyServiceAdminClient(
            configContext, backendServerURL, cookie, request.getLocale());

    String source = request.getParameter("srcTextArea");
    ProxyData pd;
    String param = request.getParameter("submit");
    String forwardTo = "";

    // global validation for the name: checks whether any invalid character is present or not
    boolean validName = false;
    boolean invalidCharInName = false;
    String str;

    try {
        Pattern pattern = Pattern.compile("name=\"(.+?)\"");
        Matcher matcher = pattern.matcher(source);
        matcher.find();
        str = matcher.group(1);

        // regular expression to match any string containing the following special characters
        // Note: _ (underscore) character is allowed to be present in the text
        // ~ ! @ # $ % ^ & * ( ) \ / + = - : ; < > ' " ? [ ] { } | \s ,
        if (Pattern.matches("\\p{Alnum}*[~!@#$%^&*()\\+=\\-:;<>\\s?\\[\\]{},/\\\\\"]+\\p{Alnum}*", str)) {
            session.setAttribute("proxyXML", source);
            forwardTo = "source.jsp?header=" + header;
            CarbonUIMessage.sendCarbonUIMessage(bundle.getString("invalid.char.in.name"),
                    CarbonUIMessage.ERROR, request);
            invalidCharInName = true;
        } else {
            // the name does not match with given regular expression means that it does not contain any
            // special characters. Therefore, it is a valid name
            validName = true;
        }
    } catch(Exception e) {
        validName=false;
        invalidCharInName = true;
    }

    if (validName && !invalidCharInName) {
        try {
            // replaces any & mark to &amp;
            // this is a lazy way of doing this, first change all &amp; into & and then change all & into &amp;
            // a good way would be to use regular expressions
            source = source.replaceAll("&amp;", "&").replaceAll("&","&amp;");
            pd = client.getDesignView(source);
            session.setAttribute("proxy", pd);

            // checks whether we are going to submit or just switching to design view
            if (param != null) {

                // ok we are going to submit
                if (pd.getName() == null || "".equals(pd.getName())) {
                    // missing proxy name
                    // now the XML is wrong so set the wrong XML to the session for user to see that
                    // and remove the proxy data object from session since it is wrong
                    session.removeAttribute("proxy");
                    session.setAttribute("proxyXML", source);
                    forwardTo = "source.jsp?header=" + header;
                    CarbonUIMessage.sendCarbonUIMessage(bundle.getString("proxy.name.missing"),
                            CarbonUIMessage.ERROR, request);
                } else if((pd.getInSeqKey() == null || "".equals(pd.getInSeqKey())) &&
                                (pd.getInSeqXML() == null || "".equals(pd.getInSeqXML())) &&
                                (pd.getEndpointKey() == null || "".equals(pd.getEndpointKey())) &&
                                (pd.getEndpointXML() == null || "".equals(pd.getEndpointXML()))) {
                    // missing in sequence or endpoint
                    // now the XML is wrong so set the wrong XML to the session for user to see that
                    // and remove the proxy data object from session since it is wrong
                    session.removeAttribute("proxy");
                    session.setAttribute("proxyXML", source);
                    forwardTo = "source.jsp?header=" + header;
                    CarbonUIMessage.sendCarbonUIMessage(bundle.getString("proxy.target.missing"),
                            CarbonUIMessage.ERROR, request);
                } else {
                    // validation went smooth and fine for the submission
                    forwardTo = "submit.jsp?forwardTo=" + request.getParameter("forwardTo") + "&submit=" + param + "&originator=sourceToData.jsp&header=" + header;
                }
            } else if ((param = request.getParameter("return")) != null) {
                // forward to design page and this does not require validation
                forwardTo = param + "?header=" + header + "&ordinal=1";
            }
        } catch (Exception e) {
            // could not create proxy data object from the given source
            session.setAttribute("proxyXML", source);
            forwardTo = "source.jsp?header=" + header;
            String msg = bundle.getString("unable.to.generate.proxy.data.from.source") + ": " +
                    e.getMessage().replaceAll("\n", "").replaceAll("\"", "'"); 
            CarbonUIMessage.sendCarbonUIMessage(msg, CarbonUIMessage.ERROR, request);
        }
    } else if (!validName && !invalidCharInName) {
        session.setAttribute("proxyXML", source);
        forwardTo = "source.jsp?header=" + header;
        CarbonUIMessage.sendCarbonUIMessage(bundle.getString("invalid.name"),
                CarbonUIMessage.ERROR, request);
    } else if(!validName && ((param = request.getParameter("return")) != null)) {
        // forward to design page and this does not require validation
        forwardTo = param + "?header=" + header + "&ordinal=1";
    } else {
        session.setAttribute("proxyXML", source);
        forwardTo = "source.jsp?header=" + header;
        CarbonUIMessage.sendCarbonUIMessage(bundle.getString("invalid.name"),
                        CarbonUIMessage.ERROR, request);
    }

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    if (window.location.href.indexOf('originator') != -1) {\n");
      out.write("        window.location.href='");
      out.print(forwardTo);
      out.write("';\n");
      out.write("    } else {\n");
      out.write("        window.location.href='source.jsp';\n");
      out.write("    }\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
