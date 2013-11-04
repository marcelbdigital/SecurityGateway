package org.apache.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.dashboard.ui.DashboardUiContext;
import org.wso2.carbon.dashboard.ui.DashboardUiUtils;
import org.wso2.carbon.dashboard.ui.DashboardServiceClient;
import org.wso2.carbon.registry.core.RegistryConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.dashboard.stub.types.bean.DashboardContentBean;
import org.wso2.carbon.dashboard.ui.DashboardUtilServiceClient;
import org.wso2.carbon.dashboard.stub.types.bean.DashboardUtilBean;
import java.net.URLEncoder;
import org.wso2.carbon.utils.CarbonUtils;
import org.wso2.carbon.ui.CarbonUIMessage;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/dashboard/../dialog/display_messages.jsp");
    _jspx_dependants.add("/dashboard/includes/gs-gadget-top-links-anon.html");
    _jspx_dependants.add("/dashboard/includes/gs-gadget-top-links.html");
    _jspx_dependants.add("/dashboard/includes/gadget-top-links-product.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write('\n');

    String loggeduser = (String) request.getSession().getAttribute("logged-user");
    String contextRoot = DashboardUiContext.getConfigContext().getContextRoot();
    boolean userLogedIn = true;

    // Check whether we are loading in debug mode
    String debugMode = request.getParameter("debug");
    if ((debugMode == null) | ("null".equals(debugMode))) {
        debugMode = "0";
    }

    // Getting the Dashboard name. Will be null in case of portal mode.
    String dashboardName = request.getParameter("name");
    if ((dashboardName == null) | ("null".equals(dashboardName))) {
        dashboardName = null;
    }

    if (dashboardName == null && !DashboardUiUtils.isGadgetServer()) {
        return;
    }

    //In some products the add gadget / add tabs etc buttons should be hidden by default
    String hideOptions = request.getParameter("hideOpt");
    if ((hideOptions == null) || ("null".equals(hideOptions))) {
        hideOptions = null;
    }

    // Adding tenant domain if available.
    String tenantDomain = (String) request.getSession().getAttribute(RegistryConstants.TENANT_DOMAIN);
    String tenantDomainWithAt = "";
    if (tenantDomain != null) {
        tenantDomainWithAt = "@" + tenantDomain;
    }

    if ((request.getSession().getAttribute("logged-user") == null) && (dashboardName == null)) {
        userLogedIn = false;
        response.sendRedirect(request.getContextPath() + "/admin/login.jsp");
        return;
    }
    DashboardServiceClient dashboardServiceClient = null;
    DashboardUtilServiceClient dashboardUtilServiceClient = null;
    String backendServerURL = null;
    DashboardContentBean dashboardContentBean = null;
    DashboardUtilBean dashboardUtilBean = null;

    boolean isReadOnlyMode = false;


    backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    String adminConsoleURL = CarbonUIUtil.getAdminConsoleURL(request);

    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext()
                    .getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    try {
        dashboardUtilServiceClient = new DashboardUtilServiceClient(cookie,
                backendServerURL,
                configContext,
                request.getLocale());
        dashboardUtilBean = dashboardUtilServiceClient.getDashboardUtils(tenantDomain);

        if (userLogedIn) {
            dashboardServiceClient = new DashboardServiceClient(cookie,
                    backendServerURL,
                    configContext,
                    request.getLocale());
            dashboardContentBean = dashboardServiceClient.getDashboardContentBean(loggeduser, dashboardName, tenantDomain, backendServerURL);
            // Check the rendering mode
            isReadOnlyMode = dashboardContentBean.getReadOnlyMode();
        }
    } catch (Exception e) {
        response.sendRedirect(request.getContextPath() + "/admin/login.jsp");
//        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
//        session.setAttribute(CarbonUIMessage.ID, uiMsg);
//        e.printStackTrace();


      out.write("\n");
      out.write("\n");
      out.write("\n");

        return;
    }
    String tenantdomainFromReq = (String) request.getAttribute(CarbonConstants.TENANT_DOMAIN);
    if ((null == loggeduser || !dashboardUtilBean.isSessionValidSpecified()) && !dashboardUtilBean.isAnonModeActiveSpecified()) {
        response.sendRedirect(DashboardUiUtils.getLoginUrl("../gsusermgt/login.jsp", DashboardUiUtils.getHttpsPort(adminConsoleURL), request));
    }

    DashboardUiUtils.currentContext = request.getRequestURL();
    String portalCSS = DashboardUiUtils.getPortalCss(request, config, dashboardServiceClient);

    String currentActiveTab = request.getParameter("tab");
    if (currentActiveTab == null) {
        // Default to Home
        currentActiveTab = "0";
    } else if (userLogedIn) {
        // Check if this is a valid tab
        String[] userTabs = dashboardContentBean.getTabLayout().split(",");
        boolean validTab = false;
        for (String userTab : userTabs) {
            if (userTab.equals(currentActiveTab)) {
                validTab = true;
                break;
            }
        }

        if (!validTab) {
            // Revert to home
            currentActiveTab = "0";
        }

    }

    String[] gadgetUrls = null;

    try {
        if (dashboardName == null) {
            // We are in portal mode
            //Checking for the home tab, the default gadgets will be only for a NEW user (New user has only 1 tab)
            if ("0".equals(currentActiveTab)) {
                if (userLogedIn) {
                    gadgetUrls = dashboardContentBean.getDefaultGadgetUrlSet();
                } else {
                    gadgetUrls = dashboardUtilBean.getGadgetUrlSetForUnSignedUser();
                }
            }
        } else {
            // We are in embedded mode
            //gadgetUrls = dashboardServiceClient.getGadgetUrlsToLayout(loggeduser, currentActiveTab, dashboardName, backendServerURL);
            gadgetUrls = DashboardUiUtils.getGadgetUrlsToLayout(currentActiveTab, dashboardContentBean.getTabs());

            // We need to populate gadgets for this tab (On demand population)
            //dashboardServiceClient.populateDashboardTab(currentActiveTab);
        }


    } catch (Exception e) {
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);
        e.printStackTrace();

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\n');

        return;
    }
    if (dashboardName == null) {
        // Adding HTML wrapper tags

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\"/>\n");
      out.write("    <title>WSO2 Gadget Server</title>\n");
      out.write("    <link href=\"../admin/css/global.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("          media=\"all\"/>\n");
      out.write("    <link href=\"../dialog/css/jqueryui/jqueryui-themeroller.css\"\n");
      out.write("          rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("    <link href=\"../dialog/css/dialog.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("          media=\"all\"/>\n");
      out.write("\n");
      out.write("    <link href=\"");
      out.print(portalCSS);
      out.write("\" rel=\"stylesheet\"\n");
      out.write("          type=\"text/css\" media=\"all\"/>\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"../admin/images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../admin/images/favicon.ico\"\n");
      out.write("          type=\"image/x-icon\"/>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"../admin/js/WSRequest.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../admin/js/cookies.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"dcontainer\"></div>\n");
      out.write("<!--This is the link panel of the portal page-->\n");
      out.write("<div id=\"link-panel\">\n");
      out.write("    ");
if (!userLogedIn) { 
      out.write("\n");
      out.write("    <ul>\n");
      out.write("        ");

            /*            //This is to check whether user can self register to the portal or not.
                   GadgetServerUserManagementServiceClient gsUserMgtServiceClient = null;
                   gsUserMgtServiceClient = new GadgetServerUserManagementServiceClient(cookie,
                           backendServerURL,
                           configContext,
                           request.getLocale());
                   if (gsUserMgtServiceClient.isSelfRegistration(tenantdomainFromReq)) {*/
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            /*} else {*/
      out.write("\n");
      out.write("        <li><strong>Create your account now!</strong></li>\n");
      out.write("        ");
 /*}*/
        
      out.write("\n");
      out.write("        <li>|</li>\n");
      out.write("        <!--li><a href=\"../gsusermgt/login.jsp\">Sign-in</a></li-->\n");
      out.write("        <li>\n");
      out.write("            <a href=\"javaScript:redirectToHttpsUrl('../gsusermgt/login.jsp', '");
      out.print(DashboardUiUtils.getBackendPort("https"));
      out.write("')\">Sign-in</a>\n");
      out.write("        </li>\n");
      out.write("        <li>|</li>\n");
      out.write("        <li><a href=\"http://wso2.org/project/gadget-server/1.4.0/docs/index.html\" target=\"_blank\">Help</a></li>\n");
      out.write("    </ul>\n");
      out.write("    ");
} else if (userLogedIn) { 
      out.write("\n");
      out.write("    <ul>\n");
      out.write("        <li><strong>Signed-in as&nbsp;");
      out.print(loggeduser + tenantDomainWithAt);
      out.write("\n");
      out.write("        </strong></li>\n");
      out.write("        <li>|</li>\n");
      out.write("        <!--li><a href=\"javaScript:redirectToHttpsUrl('../gsusermgt/login.jsp?action=signOut', '");
      out.print(DashboardUiUtils.getBackendPort("https"));
      out.write("')\">Sign-out</a></li-->\n");
      out.write("        <li>\n");
      out.write("            <a href=\"../admin/logout_action.jsp\">Sign-out</a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li>|</li>\n");
      out.write("        <li><a href=\"http://wso2.org/project/gadget-server/1.4.0/docs/index.html\" target=\"_blank\">Help</a></li>\n");
      out.write("    </ul>\n");
      out.write("    ");
} 
      out.write("\n");
      out.write("    <div class=\"left-logo\"><a class=\"header-home\" href=\"index.jsp\">\n");
      out.write("        <img width=\"179\" height=\"28\" src=\"images/1px.gif\"/> </a></div>\n");
      out.write("</div>\n");
}
      out.write("\n");
      out.write("<!-- default container look and feel -->\n");

    if (dashboardName == null) {

      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"localstyles/gadgets-gs.css\">\n");
} else {
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"localstyles/gadgets.css\">\n");
}
      out.write("\n");
      out.write("<link href=\"localstyles/menu-style.css\" rel=\"stylesheet\"\n");
      out.write("      type=\"text/css\" media=\"all\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery.menu.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    // Setting the Dashboard name to be used in Javascript : setting this\n");
      out.write("    // here for it is used in gadgets.js\n");
      out.write("    ");

         if(dashboardName == null){
         
      out.write("\n");
      out.write("    var dashboardName = null;\n");
      out.write("    ");

         }else{
         
      out.write("\n");
      out.write("    var dashboardName = '");
      out.print(dashboardName);
      out.write("';\n");
      out.write("    ");

         }
         
      out.write("\n");
      out.write("    var isReadOnly = ");
      out.print(isReadOnlyMode);
      out.write(";\n");
      out.write("\n");
      out.write("    // Setting debug mode. If ON, JS compression for gadgets will be OFF.\n");
      out.write("    ");

         if("0".equals(debugMode)){
         
      out.write("\n");
      out.write("    var debugMode = false;\n");
      out.write("    ");

         }else{
         
      out.write("\n");
      out.write("    var debugMode = true;\n");
      out.write("    ");

         }
         
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");

    if ("0".equals(debugMode)) {

      out.write("\n");
      out.write("<!--script type=\"text/javascript\" src=\"../../gadgets/js/core:rpc:pubsub?c=1\"></script-->\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/core?c=1\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/rpc?c=1\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/pubsub?c=1\"></script>\n");

} else {

      out.write("\n");
      out.write("<!--script type=\"text/javascript\" src=\"../../gadgets/js/core:rpc:pubsub?c=1&debug=1\"></script-->\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/core?c=1&debug=1\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/rpc?c=1&debug=1\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../../gadgets/js/pubsub?c=1&debug=1\"></script>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/cookies.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/json2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/dojo.xd.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/util.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/gadgets.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/wso2-template-engine.js\"></script>\n");
if (userLogedIn) { 
      out.write("\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"javascript/userpref-service-stub.js\"></script>\n");
} else if (!userLogedIn) { 
      out.write("\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"javascript/userpref-service-cookie-stub.js\"></script>\n");
} 
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/encoder-decoder.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"javascript/registry-based-userpref-store.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/gadget-server-utils.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/shortcuts.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/tabs.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/portlet-config.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/jquery-ui.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/dialog.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var msgId;\n");
      out.write("    ");

    if(request.getParameter("msgId") == null){
    
      out.write("\n");
      out.write("    msgId = '");
      out.print("MSG" + System.currentTimeMillis() + Math.random());
      out.write("';\n");
      out.write("    ");

    } else {
    
      out.write("\n");
      out.write("    msgId = '");
      out.print(request.getParameter("msgId"));
      out.write("';\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");

    //First checks whether there is a CarbonUIMessage in the request
    CarbonUIMessage carbonMessage = (CarbonUIMessage) session.getAttribute(CarbonUIMessage.ID);

    if(carbonMessage == null){
        carbonMessage = (CarbonUIMessage) request.getAttribute(CarbonUIMessage.ID);
    } else {
        session.removeAttribute(CarbonUIMessage.ID);
    }

    if (carbonMessage != null) {
        String message = carbonMessage.getMessage();
        String messageType = carbonMessage.getMessageType();
        if (message == null || message.equals("") || messageType == null) {
        } else {
            if (messageType.equals(CarbonUIMessage.INFO)) {

      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                jQuery(document).ready(function() {\n");
      out.write("                    if (getCookie(msgId) == null) {\n");
      out.write("                        CARBON.showInfoDialog(\"");
      out.print( carbonMessage.getMessage());
      out.write("\");\n");
      out.write("                        setCookie(msgId, 'true');\n");
      out.write("                    }                    \n");
      out.write("                });\n");
      out.write("\n");
      out.write("            </script>\n");

            } else if (messageType.equals(CarbonUIMessage.WARNING)) {

      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                jQuery(document).ready(function() {\n");
      out.write("                    if (getCookie(msgId) == null) {\n");
      out.write("                        CARBON.showWarningDialog(\"");
      out.print( carbonMessage.getMessage());
      out.write("\");\n");
      out.write("                        setCookie(msgId, 'true');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            </script>\n");

            } else if (messageType.equals(CarbonUIMessage.ERROR)) {

      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                jQuery(document).ready(function() {\n");
      out.write("                    if (getCookie(msgId) == null) {\n");
      out.write("                        CARBON.showErrorDialog(\"");
      out.print( carbonMessage.getMessage());
      out.write("\");\n");
      out.write("                        setCookie(msgId, 'true');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            </script>\n");

            }
        }
    }

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/gadgetsever.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var backendHttpsPort = '");
      out.print(DashboardUiUtils.getHttpsPort(adminConsoleURL));
      out.write("';\n");
      out.write("    var tDomain = '");
      out.print(tenantDomain);
      out.write("';\n");
      out.write("    //Number of columns in the portal\n");
      out.write("    var userId = '");
      out.print(loggeduser);
      out.write("';\n");
      out.write("\n");
      out.write("    // Setting browser language\n");
      out.write("    var localLanguage = '");
      out.print(request.getLocale().getLanguage());
      out.write("';\n");
      out.write("\n");
      out.write("    // Setting country\n");
      out.write("    var localCountry = '");
      out.print(request.getLocale().getCountry());
      out.write("';\n");
      out.write("\n");
      out.write("    // Storing the currently active tab\n");
      out.write("    var currentActiveTab = '");
      out.print(currentActiveTab);
      out.write("';\n");
      out.write("\n");
      out.write("    // Setting the HTTP server root to be used in Javascript\n");
      out.write("    var httpServerRoot = '");
      out.print(DashboardUiUtils.getHttpServerRoot(adminConsoleURL, dashboardUtilBean.getBackendHttpPort()));
      out.write("';\n");
      out.write("\n");
      out.write("    gadgetserver.gadgetSpecUrls = new Array();\n");
      out.write("    ");

         if(gadgetUrls != null) {
         for(int i=0; i<gadgetUrls.length; i++) {
             if(userLogedIn) {
         
      out.write("\n");
      out.write("    gadgetserver.gadgetSpecUrls[");
      out.print(i);
      out.write("] = '");
      out.print(gadgetUrls[i].trim());
      out.write("';\n");
      out.write("    ");
	} else { 
      out.write("\n");
      out.write("    gadgetserver.gadgetSpecUrls[");
      out.print(i);
      out.write("] = '");
      out.print(gadgetUrls[i].split(",")[1]);
      out.write("';\n");
      out.write("    ");
	}
             }
         }
      out.write("\n");
      out.write("\n");
      out.write("    //If the tab is not valid, make it the default tab 0\n");
      out.write("    if (!dashboardService.isValidTab(userId, currentActiveTab, dashboardName)) {\n");
      out.write("        currentActiveTab = '0';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ");
if(userLogedIn) {
      out.write("\n");
      out.write("    var gadgetLayoutNoSplit = '");
      out.print(DashboardUiUtils.getGadgetLayout(currentActiveTab, dashboardContentBean.getTabs()));
      out.write("';\n");
      out.write("    gadgetserver.gadgetLayout = gadgetLayoutNoSplit.split(\",\");\n");
      out.write("    ");
}else{
      out.write("\n");
      out.write("    gadgetserver.gadgetLayout = dashboardService.getGadgetLayout(userId, currentActiveTab, dashboardName).split(\",\");\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("    if (gadgetserver.gadgetLayout == \"NA\" && dashboardService.isNewUser()) {\n");
      out.write("        // We have to populate default gadgets using the default 3-column layout\n");
      out.write("        gadgetserver.gadgetLayout = dashboardService.populateDefaultThreeColumnLayout(userId, currentActiveTab);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ");
if(userLogedIn) {
      out.write("\n");
      out.write("    var tabLayoutNoSplit = '");
      out.print(dashboardContentBean.getTabLayout());
      out.write("';\n");
      out.write("    gadgetserver.tabLayout = tabLayoutNoSplit.split(\",\");\n");
      out.write("\n");
      out.write("    var tabIdandNames = '");
      out.print(DashboardUiUtils.getTabIdsWithTitles(dashboardContentBean.getTabs()));
      out.write("';\n");
      out.write("    gadgetserver.tabIdandNames = tabIdandNames.split(\",\");\n");
      out.write("\n");
      out.write("    var gadgetIdsandPrefs = '");
      out.print(DashboardUiUtils.getGadgetIdsWithPrefs(currentActiveTab, dashboardContentBean.getTabs()));
      out.write("';\n");
      out.write("    gadgetserver.gadgetIdandPrefs = gadgetIdsandPrefs.split(\"#\");\n");
      out.write("\n");
      out.write("    ");
}else{
      out.write("\n");
      out.write("    gadgetserver.tabLayout = dashboardService.getTabLayout(userId, dashboardName).split(\",\");\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    function optHandler() {\n");
      out.write("        if ($('.gadgets-top-links').is(':visible')) {\n");
      out.write("            $('.gadgets-top-links').hide();\n");
      out.write("\n");
      out.write("            $('#handlerBut').html('Show Options');\n");
      out.write("            $('#handlerBut').css(\"background-image\", \"url(images/show.gif)\");\n");
      out.write("        } else {\n");
      out.write("            $('.gadgets-top-links').show();\n");
      out.write("            $('#handlerBut').html('Hide Options');\n");
      out.write("            $('#handlerBut').css(\"background-image\", \"url(images/hide.gif)\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.dashboard.ui.resource.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.dashboard.ui.resource.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("    ");

        if (dashboardName != null) {
    
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("Dashboard");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.dashboard.ui.resource.i18n.Resource");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("    ");

        }
    
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("\n");
          out.write("        ");

            if (dashboardName != null) {
        
          out.write("\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("        ");

            }
        
          out.write("\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <table width=\"100%\" height=\"100%\" cellspacing=\"0\">\n");
          out.write("                <tr>\n");
          out.write("                    <td style=\"background-color: #FFFFFF;\">\n");
          out.write("                        ");
if (!userLogedIn) {
          out.write("\n");
          out.write("                        ");
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
          out.write("<ul class=\"gadgets-top-links\">\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/add-new-gadget.png);\"\n");
          out.write("           onclick=\"gadgetserver.showExtraGadgets();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/add-new-tab.png);\"\n");
          out.write("           onclick=\"addNewTabUnsignedUser();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/clone-tab-icon.png);\"\n");
          out.write("           onclick=\"duplicateActiveTab();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/remove-tab.png);\"\n");
          out.write("           onclick=\"removeActiveTab();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("</ul>");
          out.write("\n");
          out.write("                        ");
} else if (userLogedIn && (dashboardName == null)) { 
          out.write("\n");
          out.write("                        ");
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
          out.write("<ul class=\"gadgets-top-links\">\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/add-new-gadget.png);\"\n");
          out.write("           onclick=\"sessionAwareShowAddGadgetsPage('G3');\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/add-new-tab.png);\"\n");
          out.write("           onclick=\"sessionAwareAddNewTab();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a>\n");
          out.write("    </li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/clone-tab-icon.png);\"\n");
          out.write("           onclick=\"sessionAwareDuplicateActiveTab();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("    <li><a class=\"icon-link\"\n");
          out.write("           style=\"background-image: url(../dashboard/images/remove-tab.png);\"\n");
          out.write("           onclick=\"sessionAwareRemoveActiveTab();\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </a></li>\n");
          out.write("</ul>");
          out.write("\n");
          out.write("                        ");
} else if (userLogedIn && (dashboardName != null) && !isReadOnlyMode) { 
          out.write("\n");
          out.write("                        ");
if ("true".equals(hideOptions)) {
          out.write("\n");
          out.write("                        <a id=\"handlerBut\" href=\"javascript:optHandler();\"\n");
          out.write("                           style=\"background-image:url(images/show.gif);\">Show Options</a>\n");
          out.write("                        <ul class=\"gadgets-top-links\" style=\"display:none;\">\n");
          out.write("                                    ");
} else{
          out.write("\n");
          out.write("                            <ul class=\"gadgets-top-links\">\n");
          out.write("                                ");
}
          out.write("\n");
          out.write("                                ");
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
          out.write("<li><a class=\"icon-link\"\n");
          out.write("       style=\"background-image: url(../dashboard/images/add-new-gadget.png);\"\n");
          out.write("       onclick=\"sessionAwareShowAddGadgetsPage('G3');\">\n");
          out.write("    ");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</a></li>\n");
          out.write("<li><a class=\"icon-link\"\n");
          out.write("       style=\"background-image: url(../dashboard/images/add-new-tab.png);\"\n");
          out.write("       onclick=\"sessionAwareAddNewTab();\">\n");
          out.write("    ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</a>\n");
          out.write("</li>\n");
          out.write("<li><a class=\"icon-link\"\n");
          out.write("       style=\"background-image: url(../dashboard/images/clone-tab-icon.png);\"\n");
          out.write("       onclick=\"sessionAwareDuplicateActiveTab();\">\n");
          out.write("    ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</a></li>\n");
          out.write("<li><a class=\"icon-link\"\n");
          out.write("       style=\"background-image: url(../dashboard/images/remove-tab.png);\"\n");
          out.write("       onclick=\"sessionAwareRemoveActiveTab();\">\n");
          out.write("    ");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("</a></li>");
          out.write("\n");
          out.write("                            </ul>\n");
          out.write("                                    ");
 } 
          out.write("\n");
          out.write("                                    ");
if (!userLogedIn) { 
          out.write("\n");
          out.write("                            <div id=\"newGadgetsPane\" style=\"display: none;\">\n");
          out.write("                                <table class=\"defaultGadgets\" width=\"100%\">\n");
          out.write("                                    <tr>\n");
          out.write("                                        <form id=\"newGadgetForm\" name=\"newGadgetForm\">\n");
          out.write("                                            ");

                                                if (gadgetUrls != null) {

                                                    for (int x = 0; x < gadgetUrls.length; x = x + 4) {
                                                        out.print("<td width='250' nowrap='nowrap'>");
                                                        for (int i = x; i < 4 * ((x / 4) + 1); i++) {
                                                            if (i >= gadgetUrls.length) break;
                                                            String[] nameUrlPair = gadgetUrls[i].split(",");
                                            
          out.write("\n");
          out.write("\n");
          out.write("                                            <input type=\"checkbox\" name=\"checkgroup\"\n");
          out.write("                                                   onclick=\"gadgetserver.activateAddButton()\"\n");
          out.write("                                                   value=\"");
          out.print(nameUrlPair[1]);
          out.write('"');
          out.write('>');
          out.print(nameUrlPair[0] );
          out.write("\n");
          out.write("                                            </input><br/>\n");
          out.write("\n");
          out.write("                                            ");


                                                        }
                                                        out.print("</td>");
                                                    }
                                                    out.print("<td width='100%'>&nbsp;</td>");
                                                }
                                            
          out.write("\n");
          out.write("\n");
          out.write("                                        </form>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td colspan=\"4\"><br/>&nbsp;<input type=\"button\"\n");
          out.write("                                                                          id=\"addButton\"\n");
          out.write("                                                                          name=\"addButton\"\n");
          out.write("                                                                          class=\"button\"\n");
          out.write("                                                                          disabled\n");
          out.write("                                                                          onclick=\"gadgetserver.saveNewUserGadgets()\"\n");
          out.write("                                                                          value=\"Add\">&nbsp;<input\n");
          out.write("                                                type=\"button\"\n");
          out.write("                                                class=\"button\"\n");
          out.write("                                                onclick=\"gadgetserver.cancelPane()\"\n");
          out.write("                                                value=\"Cancel\">\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </table>\n");
          out.write("                            </div>\n");
          out.write("                                    ");
} 
          out.write("\n");
          out.write("\n");
          out.write("                                    ");
 if(userLogedIn){
	                            
          out.write("\n");
          out.write("                            <ul id=\"tabmenu\">\n");
          out.write("                                ");

                                    String[] tabLayout = dashboardContentBean.getTabLayout().split(",");
                                    for (String tab : tabLayout) {
                                        String tabTitle = DashboardUiUtils.getTabTitle(tab, dashboardContentBean.getTabs());
                                        if (currentActiveTab.equals(tab)) {
                                
          out.write("\n");
          out.write("                                <li onclick=\"makeActive('");
          out.print(tab);
          out.write("')\"><a class=\"active\"\n");
          out.write("                                                                        id=\"tab");
          out.print(tab);
          out.write('"');
          out.write('>');
          out.print(tabTitle);
          out.write("\n");
          out.write("                                </a></li>\n");
          out.write("                                ");
 } else {
                                
          out.write("\n");
          out.write("                                <li onclick=\"makeActive('");
          out.print(tab);
          out.write("')\"><a class=\"\"\n");
          out.write("                                                                        id=\"tab");
          out.print(tab);
          out.write('"');
          out.write('>');
          out.print(tabTitle);
          out.write("\n");
          out.write("                                </a></li>\n");
          out.write("                                ");

                                        }
                                    }
                                
          out.write("\n");
          out.write("                            </ul>\n");
          out.write("                                    ");

	                            }else {
	                            
          out.write("\n");
          out.write("                            <script type=\"text/javascript\">\n");
          out.write("                                document.write(\"<ul id=\\\"tabmenu\\\">\");\n");
          out.write("                                var tabLayout = dashboardService.getTabLayout(userId, dashboardName).split(\",\");\n");
          out.write("                                var x = 0;\n");
          out.write("                                for (x = 0; x < tabLayout.length; x++) {\n");
          out.write("                                    var tabTitle = dashboardService.getTabTitle(userId, tabLayout[x], dashboardName);\n");
          out.write("                                    if (currentActiveTab == tabLayout[x]) {\n");
          out.write("                                        document.write(\"<li onclick=\\\"makeActive(\" + tabLayout[x] + \")\\\"><a class=\\\"active\\\" id=\\\"tab\" + tabLayout[x] + \"\\\">\" + tabTitle + \"</a></li>\");\n");
          out.write("                                    } else {\n");
          out.write("                                        document.write(\"<li onclick=\\\"makeActive(\" + tabLayout[x] + \")\\\"><a class=\\\"\\\" id=\\\"tab\" + tabLayout[x] + \"\\\">\" + tabTitle + \"</a></li>\");\n");
          out.write("                                    }\n");
          out.write("                                }\n");
          out.write("                                document.write(\"</ul>\");\n");
          out.write("                            </script>\n");
          out.write("                                    ");
}
          out.write("\n");
          out.write("                            <div id=\"tabContent\"></div>\n");
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td height=\"100%\" style=\"background-color: #FFFFFF;\">\n");
          out.write("                        <div id=\"maximizedGadget\"\n");
          out.write("                             style=\"width: 100%; min-height: 100%; display: none;\"></div>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td style=\"background-color: #FFFFFF;\"><img width=\"1\" height=\"1\"\n");
          out.write("                                                                src=\"images/1px.gif\"/></td>\n");
          out.write("                </tr>\n");
          out.write("                ");

                    if (dashboardName == null) {
                        // Adding HTML wrapper tags
                
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td height=\"20\">\n");
          out.write("                        <div class=\"footer-content\">\n");
          out.write("                            <div class=\"copyright\">&copy; 2008 - 2011 WSO2 Inc. All Rights\n");
          out.write("                                Reserved.\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                ");

                    }
                
          out.write("\n");
          out.write("            </table>\n");
          out.write("        </div>\n");
          out.write("        ");

            if (dashboardName != null) {
        
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            // This is needed in product mode to fix the bread crumb not having the correct link.\n");
          out.write("            fixBreadCrumb('");
          out.print(dashboardName);
          out.write("');\n");
          out.write("        </script>\n");
          out.write("        ");

            }
        
          out.write("\n");
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

    if (dashboardName == null) {
        // Adding HTML wrapper tags

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

    }

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
    _jspx_th_fmt_message_0.setKey("dashboard");
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
    _jspx_th_fmt_message_1.setKey("add.gadgets");
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
    _jspx_th_fmt_message_2.setKey("add.new.tab");
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
    _jspx_th_fmt_message_3.setKey("duplicate.active.tab");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_4.setKey("remove.active.tab");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_5.setKey("add.gadgets");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_6.setKey("add.new.tab");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_7.setKey("duplicate.active.tab");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_8.setKey("remove.active.tab");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_9.setKey("add.gadgets");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_10.setKey("add.new.tab");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_11.setKey("duplicate.active.tab");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_12.setKey("remove.active.tab");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }
}
