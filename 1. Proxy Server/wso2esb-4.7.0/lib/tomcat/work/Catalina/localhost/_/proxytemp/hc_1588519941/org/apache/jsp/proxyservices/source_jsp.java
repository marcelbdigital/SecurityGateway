package org.apache.jsp.proxyservices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.proxyadmin.ui.client.ProxyServiceAdminClient;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.CarbonConstants;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.ui.CarbonUIUtil;
import java.rmi.RemoteException;
import java.util.ResourceBundle;
import org.apache.axis2.util.XMLPrettyPrinter;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayOutputStream;

public final class source_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String prettyPrint(String source) {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            OMElement elem;
            try {
                elem= AXIOMUtil.stringToOM(source);
                XMLPrettyPrinter.prettify(elem,stream);
            } catch (XMLStreamException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new String(stream.toByteArray()).trim();
        }
    
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../proxyservices/css/proxyservices.css\"/>\n");
      out.write("<!-- Dependencies -->\n");
      out.write("<script type=\"text/javascript\" src=\"../proxyservices/js/proxyservices.js\"></script>\n");
      out.write("    ");

        ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.proxyadmin.ui.i18n.Resources",
                request.getLocale());
        String header = request.getParameter("header");
        ProxyData pd = (ProxyData)session.getAttribute("proxy");

        String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
        ProxyServiceAdminClient client = new ProxyServiceAdminClient(
                configContext, backendServerURL, cookie, request.getLocale());

        String forwardTo;
        String source;
        if (pd != null) {
            try {
                source = prettyPrint(client.getSourceView(pd).trim());
                // removes the proxy attribute after use
                session.removeAttribute("proxy");
            } catch (RemoteException e) {
                forwardTo = "index.jsp?header=" + header;
                CarbonUIMessage.sendCarbonUIMessage(bundle.getString("unable.to.get.source.from.the.design"),
                        CarbonUIMessage.ERROR, request);
                
      out.write("\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    window.location.href = '");
      out.print(forwardTo);
      out.write("';\n");
      out.write("                </script>\n");
      out.write("                ");

                return;
            }
        } else if ((source = (String)session.getAttribute("proxyXML")) != null && !"".equals(source)){
            // this means that we came here from sourceToData causing an exception
            String ppSource = prettyPrint(source);
            if(ppSource.length() > 0) {
                source = ppSource;
            }
            // removes the session attribute of proxyXML
            session.removeAttribute("proxyXML");
        }

        String saveOrModify = "add";
        if (bundle.getString("header.add").equals(header)) {
            saveOrModify = "add";
        } else if (bundle.getString("header.modify").equals(header)) {
            saveOrModify = "modify";
        }
    
      out.write("\n");
      out.write("    ");
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.proxyadmin.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write('\n');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("proxy.service.source");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.proxyadmin.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        function designView(){\n");
          out.write("            document.getElementById(\"srcTextArea\").value = editAreaLoader.getValue(\"srcTextArea\");            \n");
          out.write("            document.sourceForm.action = \"sourceToData.jsp?return=index.jsp&header=");
          out.print(header);
          out.write("&originator=source.jsp\";\n");
          out.write("            document.sourceForm.submit();\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        function saveData() {\n");
          out.write("            document.getElementById(\"srcTextArea\").value = editAreaLoader.getValue(\"srcTextArea\");\n");
          out.write("            document.sourceForm.action = \"sourceToData.jsp?submit=");
          out.print(saveOrModify);
          out.write("&header=");
          out.print(header);
          out.write("&forwardTo=../service-mgt/index.jsp&originator=source.jsp\";\n");
          out.write("            document.sourceForm.submit();\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        function cancelData() {\n");
          out.write("            window.location.href=\"../service-mgt/index.jsp\";\n");
          out.write("        }\n");
          out.write("    </script>\n");
          out.write("    <script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("    YAHOO.util.Event.onDOMReady(function() {\n");
          out.write("       editAreaLoader.init({\n");
          out.write("           id : \"srcTextArea\"\t\t// textarea id\n");
          out.write("           ,syntax: \"xml\"\t\t\t// syntax to be uses for highgliting\n");
          out.write("           ,start_highlight: true\t\t// to display with highlight mode on start-up\n");
          out.write("       });\n");
          out.write("    });\n");
          out.write("    </script>\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          out.print(header);
          out.write(" Proxy Service</h2>\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <form id=\"form1\" name=\"sourceForm\" method=\"post\" action=\"\">\n");
          out.write("                <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"styledLeft noBorders\">\n");
          out.write("                    <thead>\n");
          out.write("                        <tr>\n");
          out.write("                            <th>\n");
          out.write("                                <span style=\"float: left; position: relative; margin-top: 2px;\">");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span><a\n");
          out.write("                                    style=\"background-image: url(images/design-view.gif);\" class=\"icon-link\"\n");
          out.write("                                    onclick=\"designView();\" href=\"#\">");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </th>\n");
          out.write("                        </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <textarea\n");
          out.write("                                        style=\"border: 0px solid rgb(204, 204, 204); width: 99%; height: 275px; margin-top: 5px;\"\n");
          out.write("                                        id=\"srcTextArea\" name=\"srcTextArea\" rows=\"30\">");
          out.print(source);
          out.write("\n");
          out.write("                                </textarea>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        <tr>\n");
          out.write("                            <td class=\"buttonRow\">\n");
          out.write("                                <input id=\"saveBtn\" type=\"submit\" value=\"");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\"\n");
          out.write("                                       onclick=\"saveData();return false;\"/>\n");
          out.write("                                <input id=\"cancelBtn\" type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\"\n");
          out.write("                                       onclick=\"cancelData();return false;\"/>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("            </form>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          int evalDoAfterBody = _jspx_th_fmt_bundle_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_fmt_bundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_0);
        return;
      }
      _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_0);
      out.write('\n');
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_0.setKey("proxy.service.source");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_1.setKey("proxy.source.switch");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_2.setKey("proxy.source.save");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_3.setKey("proxy.source.cancel");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }
}
