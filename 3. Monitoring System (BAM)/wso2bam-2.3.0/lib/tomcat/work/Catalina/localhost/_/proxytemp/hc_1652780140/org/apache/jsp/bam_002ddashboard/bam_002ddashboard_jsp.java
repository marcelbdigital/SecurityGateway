package org.apache.jsp.bam_002ddashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.context.CarbonContext;

public final class bam_002ddashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    /*ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);*/
    String mgtConsoleUrl = CarbonUIUtil.getAdminConsoleURL(request);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    String appName = (String) CarbonContext.getCurrentContext().getApplicationName();
    String tenantDomain = (String) CarbonContext.getCurrentContext().getTenantDomain();
    int tenantId = CarbonContext.getCurrentContext().getTenantId();

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery(document).ready(function(){\n");
      out.write("            var SUPER_TENENT_ID = -1234;\n");
      out.write("            var tenentId = ");
      out.print(tenantId);
      out.write(";\n");
      out.write("\t    var tenantDomain = \"");
      out.print(tenantDomain);
      out.write("\";\n");
      out.write("            var dashboardUrl;\n");
      out.write("\t    var contextRoot = \"");
      out.print(appName);
      out.write("\";\t\n");
      out.write("            if(tenentId == SUPER_TENENT_ID){\n");
      out.write("\t\tif((contextRoot === null) || (contextRoot == \"\") || (contextRoot == 'null')){\n");
      out.write("        \t\tdashboardUrl = \"../../bamdashboards/index.jag\";\n");
      out.write("\t\t}\n");
      out.write("\t\telse{\n");
      out.write("\t\t\tdashboardUrl = \"../../../bamdashboards/index.jag?appName=\"+contextRoot;\n");
      out.write("\t\t}\n");
      out.write("            }\n");
      out.write("            else{\n");
      out.write("\t\tif((contextRoot === null) || (contextRoot == \"\") || (contextRoot == 'null')){\n");
      out.write("        \t\tdashboardUrl = \"../../jaggeryapps/bamdashboards/index.jag\";\n");
      out.write("\t\t}\n");
      out.write("\t\telse{\n");
      out.write("\t\t\tvar url = \"t/\"+tenantDomain+\"/jaggeryapps/bamdashboards/index.jag?appName=\"+contextRoot;\n");
      out.write("\t\t\tdashboardUrl = \"../../../../../\"+url;\n");
      out.write("\t\t}                \n");
      out.write("            }\n");
      out.write("            location.href = dashboardUrl;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
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
