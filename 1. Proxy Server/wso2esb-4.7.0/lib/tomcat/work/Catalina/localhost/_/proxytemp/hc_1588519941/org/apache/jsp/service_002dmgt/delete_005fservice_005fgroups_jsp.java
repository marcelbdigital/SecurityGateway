package org.apache.jsp.service_002dmgt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.service.mgt.ui.ServiceAdminClient;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import java.util.ResourceBundle;

public final class delete_005fservice_005fgroups_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String[] serviceGroups = request.getParameterValues("serviceGroups");
    String pageNumber = request.getParameter("pageNumber");
    String deleteAllServiceGroups = request.getParameter("deleteAllServiceGroups");
    int pageNumberInt = 0;
    if (pageNumber != null) {
        pageNumberInt = Integer.parseInt(pageNumber);
    }

      out.write('\n');
      out.write('\n');

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    ResourceBundle bundle = ResourceBundle
            .getBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources", request.getLocale());

    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ServiceAdminClient client;
    try {
        client = new ServiceAdminClient(cookie, backendServerURL, configContext, request.getLocale());
    } catch (Exception e) {
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\n');

        return;
    }

    try {
        if (deleteAllServiceGroups != null) {
            client.deleteAllNonAdminServiceGroups();
            CarbonUIMessage.sendCarbonUIMessage(bundle.getString("successfully.deleted.all.non.admin.service.groups"),
                    CarbonUIMessage.INFO, request);
        } else {
            client.deleteServiceGroups(serviceGroups);  //TODO handle the returned boolean value
            CarbonUIMessage.sendCarbonUIMessage(bundle.getString("successfully.deleted.service.groups"),
                    CarbonUIMessage.INFO, request);
        }
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    location.href = 'index.jsp?pageNumber=");
      out.print(pageNumberInt);
      out.write("'\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                ");

    } catch (Exception e) {
                CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request);
                
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                               location.href = \"index.jsp?pageNumber=");
      out.print(pageNumberInt);
      out.write("\";\n");
      out.write("                        </script>\n");
      out.write("                ");

                return;
    }

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
