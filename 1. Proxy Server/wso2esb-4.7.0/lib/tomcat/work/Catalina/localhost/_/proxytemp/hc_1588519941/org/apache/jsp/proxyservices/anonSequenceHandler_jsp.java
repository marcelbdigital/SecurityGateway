package org.apache.jsp.proxyservices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.config.xml.MediatorFactoryFinder;
import org.wso2.carbon.CarbonError;
import java.io.ByteArrayInputStream;
import org.wso2.carbon.mediator.service.builtin.SequenceMediator;
import org.wso2.carbon.ui.CarbonUIMessage;
import java.util.ResourceBundle;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;

public final class anonSequenceHandler_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    void removeCommonSessionAttributes(HttpSession session) {
        session.removeAttribute("anonOriginator");
        session.removeAttribute("sequenceAnonOriginator");
        session.removeAttribute("header");
        session.removeAttribute("editingSequence");
        session.removeAttribute("editingSequenceAction");
        session.removeAttribute("mediator.position");
    }

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
    String header = "";
    String sequence = request.getParameter("sequence");
    String seqXML = (String)session.getAttribute("seqXML");

    String forwardTo = "";
    if (request.getParameter("cancelled") != null && "true".equals(request.getParameter("cancelled"))) {
        forwardTo = "index.jsp?header=" + session.getAttribute("header") + "&fromdesign=true";
        // removes common attributes
        removeCommonSessionAttributes(session);
    } else {
        if (seqXML != null && !"".equals(seqXML)) {
            // return path from save_sequence.jsp
            header = (String)session.getAttribute("header");
            forwardTo = "index.jsp?header=" + header + "&fromdesign=true";
            seqXML = seqXML.replaceAll("&gt", ">");
            seqXML = seqXML.replaceAll("&lt", "<");
            ProxyData pd = (ProxyData) session.getAttribute("proxy");
            if ("in".equals(sequence)) {
                pd.setInSeqXML(seqXML);
            } else if ("out".equals(sequence)) {
                pd.setOutSeqXML(seqXML);
            } else if ("fault".equals(sequence)) {
                pd.setFaultSeqXML(seqXML);
            }
            session.setAttribute("proxy", pd);
            // removes the session attribute, seqXML
            session.removeAttribute("seqXML");
            // removes common session attributes
            removeCommonSessionAttributes(session);
        } else {
            // sets the anonOriginator to anonSequenceHandler.jsp. This will be the page to which result should be returned
            session.setAttribute("sequenceAnonOriginator", "../proxyservices/anonSequenceHandler.jsp");
            // send path to design_sequence.jsp
            header = request.getParameter("header");
            // exports the header in to the session
            session.setAttribute("header", header);
            ProxyData pd = (ProxyData) session.getAttribute("proxy");
            // sets pd as a session attribute to use in the return path
            forwardTo = "../sequences/design_sequence.jsp?serviceName=" + pd.getName();
            session.setAttribute("proxy", pd);
            // sets sequnce (i.e. in/out/fault) as a session attribute
            session.setAttribute("sequence", sequence);
            String xml = "";
            if ("in".equals(sequence)) {
                xml = pd.getInSeqXML();
            } else if ("out".equals(sequence)) {
                xml = pd.getOutSeqXML();
            } else if ("fault".equals(sequence)) {
                xml = pd.getFaultSeqXML();
            }
            SequenceMediator seq = null;
            if (xml != null && !"".equals(xml)) {
                try {
                	//spacial case verify any unwanted characters embedded with the xpath expression given
                	int xpathIndex = xml.indexOf("xpath=");
            		String xmlout = null;
            		if (xpathIndex > 0) {
            			String xpathBegin = xml.substring(xpathIndex);
            			int xpathBeginIndex = xpathBegin.indexOf("\"");
            			String xpathVariableStart = xpathBegin.substring(xpathBeginIndex + 1);
            			int xpathEndIndex = xpathVariableStart.indexOf("\"");
            			String xpath = xpathVariableStart.substring(0, xpathEndIndex);
            			int lenthXpath = xpath.length();

            			String xmlBxpath = xml.substring(0, xpathIndex + 7);
            			String xpathAxpathString = xml.substring(xpathIndex + 7 + lenthXpath, xml.length());
            			xmlout = xmlBxpath + xpath.replaceAll("<", "&lt").replaceAll(">", "&gt") + xpathAxpathString;
            		}else{
            			xmlout =xml;
            		}
                	
                    OMElement elem = new StAXOMBuilder(new ByteArrayInputStream(xmlout.getBytes())).getDocumentElement();
                    OMFactory fac = elem.getOMFactory();
                    elem.addAttribute("name", "__anonSequence__", fac.createOMNamespace("", ""));
                    // changes the name inSequence or outSequence or faultSequence to just sequence
                    elem.setLocalName("sequence");
                    seq = new SequenceMediator();
                    seq.build(elem);
                } catch (Exception e) {
                    removeCommonSessionAttributes(session);
                    CarbonUIMessage.sendCarbonUIMessage(bundle.getString(bundle.getString(
                            "unable.to.build.sequence.object.from.the.given.sequence.information")),
                            CarbonUIMessage.ERROR, request);
                    return;
                }
            } else {
                    seq = new SequenceMediator();
                    seq.setName("__anonSequence__");
            }
            session.setAttribute("editingSequence", seq);
            session.setAttribute("editingSequenceAction", "anonify");
            session.removeAttribute("mediator.position");
            session.removeAttribute("editorClientFactory");
        }
    }

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    if (window.location.href.indexOf('originator') != -1 ||\n");
      out.write("            window.location.href.indexOf('cancelled') != -1) {\n");
      out.write("        window.location.href = \"");
      out.print(forwardTo);
      out.write("\";\n");
      out.write("    } else {\n");
      out.write("        window.location.href = 'index.jsp';\n");
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
