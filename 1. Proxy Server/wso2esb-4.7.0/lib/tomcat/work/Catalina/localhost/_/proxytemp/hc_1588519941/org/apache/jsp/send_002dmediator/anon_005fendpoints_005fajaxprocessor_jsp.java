package org.apache.jsp.send_002dmediator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class anon_005fendpoints_005fajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
      out.write("~\n");
      out.write("~ WSO2 Inc. licenses this file to you under the Apache License,\n");
      out.write("~ Version 2.0 (the \"License\"); you may not use this file except\n");
      out.write("~ in compliance with the License.\n");
      out.write("~ You may obtain a copy of the License at\n");
      out.write("~\n");
      out.write("~ http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("~\n");
      out.write("~ Unless required by applicable law or agreed to in writing,\n");
      out.write("~ software distributed under the License is distributed on an\n");
      out.write("~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
      out.write("~ KIND, either express or implied. See the License for the\n");
      out.write("~ specific language governing permissions and limitations\n");
      out.write("~ under the License.\n");
      out.write("-->\n");

    String anonEpAction = request.getParameter("anonEpAction");
    String forwardTo = "../endpoints/anonymousEndpoint.jsp";

    if (anonEpAction != null && !"".equals(anonEpAction)) {
        session.setAttribute("epMode", "anon");
        // sets the anonOriginator to .jsp. This will be the page to which result should be returned
        session.setAttribute("anonOriginator", "../sequences/design_sequence.jsp");
        if ("add".equals(anonEpAction)) {
            // going to add a new EP
            // remove anonEpXML attribute from session if exists
            session.removeAttribute("anonEpXML");
            session.removeAttribute("endpointXML");
        } else if ("edit".equals(anonEpAction)) {
            // going to modify the existing EP
            String anonEpXML = (String) session.getAttribute("endpointXML");
            session.removeAttribute("endpointXML");
            if (anonEpXML != null && !"".equals(anonEpXML)) {
                session.setAttribute("anonEpXML", anonEpXML);
            }
        }
    }
    response.sendRedirect(forwardTo);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
