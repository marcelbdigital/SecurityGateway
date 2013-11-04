package org.apache.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.dashboard.ui.DashboardServiceClient;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;

public final class dashboardServiceClient_002dajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    String adminConsoleURL = CarbonUIUtil.getAdminConsoleURL(request);

    String context = request.getContextPath();

    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext()
                    .getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

    DashboardServiceClient dashboardServiceClient = new DashboardServiceClient(cookie,
            backendServerURL,
            configContext,
            request.getLocale());

    // Getting the function name
    String funcName = request.getParameter("func");
    if ("sessionValid".equals(funcName)) {
        out.print(dashboardServiceClient.isSessionValid());

    } else if ("addGadget".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String url = request.getParameter("url");
        String dashboardName = request.getParameter("dashboardName");
        String group = request.getParameter("group");

        out.print(dashboardServiceClient.addGadgetToUser(userId, tabId, url, dashboardName, group));

    } else if ("addNewTab".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabTitle = request.getParameter("tabTitle");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.addNewTab(userId, tabTitle, dashboardName));

    } else if ("getGadgetLayout".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.getGadgetLayout(userId, tabId, dashboardName));

    } else if ("getGadgetPrefs".equals(funcName)) {
        String userId = request.getParameter("userId");
        String gadgetId = request.getParameter("gadgetId");
        String prefId = request.getParameter("prefId");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.getGadgetPrefs(userId, gadgetId, prefId, dashboardName));

    } else if ("getGadgetUrlsToLayout".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");

        String[] urlsToLayout =
                dashboardServiceClient.getGadgetUrlsToLayout(userId, tabId, dashboardName, adminConsoleURL);
        String jsArray = "";
        if (urlsToLayout != null) {
            for (int x = 0; x < urlsToLayout.length; x++) {
                if (x == 0) {
                    jsArray = jsArray + urlsToLayout[x];
                } else {
                    jsArray = jsArray + "," + urlsToLayout[x];
                }
            }
        }

        out.print(jsArray);

    } else if ("getTabLayout".equals(funcName)) {
        String userId = request.getParameter("userId");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.getTabLayout(userId, dashboardName));

    } else if ("getTabTitle".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.getTabTitle(userId, tabId, dashboardName));

    } else if ("isReadOnlyMode".equals(funcName)) {
        String userId = request.getParameter("userId");

        out.print(dashboardServiceClient.isReadOnlyMode(userId));

    } else if ("removeGadget".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");
        String gadgetId = request.getParameter("gadgetId");

        out.print(dashboardServiceClient.removeGadget(userId, tabId, gadgetId, dashboardName));

    } else if ("removeTab".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.removeTab(userId, tabId, dashboardName));

    } else if ("setGadgetLayout".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String dashboardName = request.getParameter("dashboardName");
        String newLayout = request.getParameter("newLayout");

        out.print(dashboardServiceClient.setGadgetLayout(userId, tabId, newLayout, dashboardName));

    } else if ("setGadgetPrefs".equals(funcName)) {
        String userId = request.getParameter("userId");
        String gadgetId = request.getParameter("gadgetId");
        String prefId = request.getParameter("prefId");
        String value = request.getParameter("value");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.setGadgetPrefs(userId, gadgetId, prefId, value,
                dashboardName));

    } else if ("duplicateTab".equals(funcName)) {
        String userId = request.getParameter("userId");
        String dashboardName = request.getParameter("dashboardName");
        String sourceTabId = request.getParameter("sourceTabId");
        String newTabName = request.getParameter("newTabName");

        out.print(dashboardServiceClient.duplicateTab(userId, dashboardName, sourceTabId, newTabName));
    } else if ("copyGadget".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tab");
        String dashboardName = request.getParameter("dashboardName");
        String sourceGadgetId = request.getParameter("sourceGadgetId");

        out.print(dashboardServiceClient.copyGadget(userId, tabId, dashboardName, sourceGadgetId, "G1#"));
    } else if ("moveGadget".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tab");
        String dashboardName = request.getParameter("dashboardName");
        String sourceGadgetId = request.getParameter("sourceGadgetId");

        out.print(dashboardServiceClient.moveGadgetToTab(userId, dashboardName, sourceGadgetId, tabId));
    } else if ("populateDefaultThreeColumnLayout".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");

        out.print(dashboardServiceClient.populateDefaultThreeColumnLayout(userId, tabId));
    } else if ("populateCustomLayouts".equals(funcName)) {
        String userId = request.getParameter("userId");
        String tabId = request.getParameter("tabId");
        String layout = request.getParameter("layout");
        String dashboardName = request.getParameter("dashboardName");

        out.print(dashboardServiceClient.populateCustomLayouts(userId, tabId, layout, dashboardName));
    } else if ("getTabContentAsJson".equals(funcName)) {
        String userId = request.getParameter("userId");
        String dashboardName = request.getParameter("dashboardName");
        String tDomain = request.getParameter("tDomain");
        String tabId = request.getParameter("tabId");
        out.print(dashboardServiceClient.getTabContentBeanAsJson(userId, dashboardName, tDomain, backendServerURL, tabId));
    } else if ("getTabLayoutWithNames".equals(funcName)) {
        String userId = request.getParameter("userId");
        String dashboardName = request.getParameter("dashboardName");
        out.print(dashboardServiceClient.getTabLayoutWithNames(userId, dashboardName));
    } else if ("populateDashboardTab".equals(funcName)) {
        String tabId = request.getParameter("tabId");
        out.print(dashboardServiceClient.populateDashboardTab(tabId));
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
