package org.apache.jsp.service_002dmgt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.service.mgt.ui.ServiceAdminClient;
import org.wso2.carbon.service.mgt.ui.ServiceTypeNaming;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaDataWrapper;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaData;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonSecuredHttpContext;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_param_value_nobody.release();
    _jspx_tagPool_fmt_message_key.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
    _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.release();
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
      out.write("<!-- This page is included to display messages which are set to request scope or session scope -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write("\n");
      out.write("<!--[if IE 7]>\n");
      out.write("<style>\n");
      out.write(".paginator-ie7-fix table{\n");
      out.write("\twidth:380px;;\n");
      out.write("}\n");
      out.write(".paginator-ie7-fix table td{\n");
      out.write("padding-right:10px;\n");
      out.write("}\n");
      out.write(".paginator-ie7-fix td b{\n");
      out.write("display:inline-block;\n");
      out.write("padding:0 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");

    response.setHeader("Cache-Control", "no-cache");

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ServiceAdminClient client;

    ServiceMetaData[] serviceData;
    int numberOfPages;
    String pageNumber = request.getParameter("pageNumber");
    if (pageNumber == null) {
        pageNumber = "0";
    }
    int pageNumberInt = 0;
    try {
        pageNumberInt = Integer.parseInt(pageNumber);
    } catch (NumberFormatException ignored) {
    }
    ServiceMetaDataWrapper servicesInfo;
    ServiceTypeNaming stn = new ServiceTypeNaming();

    String serviceTypeFilter = request.getParameter("serviceTypeFilter");
    if (serviceTypeFilter == null) {
        serviceTypeFilter = "ALL";
    }
    String serviceSearchString = request.getParameter("serviceSearchString");
    if (serviceSearchString == null) {
        serviceSearchString = "";
    }
    boolean isAuthorizedToManage =
            CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/modify/service");
    boolean hasProxy = false;
    try {
        client = new ServiceAdminClient(cookie, backendServerURL, configContext, request.getLocale());
        servicesInfo = client.getAllServices(serviceTypeFilter,
                                                 serviceSearchString,
                                                 Integer.parseInt(pageNumber));
        numberOfPages = servicesInfo.getNumberOfPages();
        serviceData = servicesInfo.getServices();
    } catch (Exception e) {
        response.setStatus(500);
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\n');

        return;
    }
    int correctServiceGroups = servicesInfo.getNumberOfCorrectServiceGroups();
    int faultyServiceGroups = servicesInfo.getNumberOfFaultyServiceGroups();
    boolean loggedIn = session.getAttribute(CarbonSecuredHttpContext.LOGGED_USER) != null;
    boolean hasDownloadableServices = false;

    if (serviceData != null && serviceData.length > 0) {
        for (ServiceMetaData service : serviceData) {
            if (service != null && service.getServiceType() != null) {
                if ((service.getServiceType().equalsIgnoreCase("axis2") && !(service.getName().equalsIgnoreCase("xkms"))) ||
                    service.getServiceType().equalsIgnoreCase("jaxws") || service.getServiceType().equalsIgnoreCase("spring") ||
                    service.getServiceType().equalsIgnoreCase("js_service") || service.getServiceType().equalsIgnoreCase("jarservice")) {
                    hasDownloadableServices = true;
                    break;
                }
            }
        }
    }

      out.write('\n');
      out.write('\n');
      //  carbon:breadcrumb
      org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
      _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
      _jspx_th_carbon_breadcrumb_0.setParent(null);
      _jspx_th_carbon_breadcrumb_0.setLabel("deployed.services");
      _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
      _jspx_th_carbon_breadcrumb_0.setTopPage(true);
      _jspx_th_carbon_breadcrumb_0.setRequest(request);
      int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
      if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
        return;
      }
      _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javascript_include.jsp", out, false);
      out.write('\n');
      out.write('\n');

    if ((serviceData == null || correctServiceGroups == 0) && faultyServiceGroups == 0) {

      out.write("\n");
      out.write("        ");
      if (_jspx_meth_fmt_bundle_0(_jspx_page_context))
        return;
      out.write('\n');

        return;
    }

      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_1 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_1.setParent(null);
      _jspx_th_fmt_bundle_1.setBasename("org.wso2.carbon.service.mgt.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_1 = _jspx_th_fmt_bundle_1.doStartTag();
      if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_1.doInitBody();
        }
        do {
          out.write('\n');

    if (session.getAttribute(CarbonSecuredHttpContext.LOGGED_USER) != null) {

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    var allServicesSelected = false;\n");
          out.write("\n");
          out.write("    function deleteServices() {\n");
          out.write("        var selected = false;\n");
          out.write("        if (document.servicesForm.serviceGroups[0] != null) { // there is more than 1 service\n");
          out.write("            for (var j = 0; j < document.servicesForm.serviceGroups.length; j++) {\n");
          out.write("                selected = document.servicesForm.serviceGroups[j].checked;\n");
          out.write("                if (selected) break;\n");
          out.write("            }\n");
          out.write("        } else if (document.servicesForm.serviceGroups != null) { // only 1 service\n");
          out.write("            selected = document.servicesForm.serviceGroups.checked;\n");
          out.write("        }\n");
          out.write("        if (!selected) {\n");
          out.write("            CARBON.showInfoDialog('");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("');\n");
          out.write("            return;\n");
          out.write("        }\n");
          out.write("        if (allServicesSelected) {\n");
          out.write("            CARBON.showConfirmationDialog(\"");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_fmt_message_3.setKey("delete.all.services.prompt");
          int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
          if (_jspx_eval_fmt_message_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_fmt_message_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_fmt_message_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_fmt_message_3.doInitBody();
            }
            do {
              //  fmt:param
              org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_param_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _jspx_tagPool_fmt_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
              _jspx_th_fmt_param_0.setPageContext(_jspx_page_context);
              _jspx_th_fmt_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_message_3);
              _jspx_th_fmt_param_0.setValue( servicesInfo.getNumberOfActiveServices());
              int _jspx_eval_fmt_param_0 = _jspx_th_fmt_param_0.doStartTag();
              if (_jspx_th_fmt_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
                return;
              }
              _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
              int evalDoAfterBody = _jspx_th_fmt_message_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_fmt_message_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_3);
            return;
          }
          _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_3);
          out.write("\", function() {\n");
          out.write("                location.href = 'delete_service_groups.jsp?deleteAllServiceGroups=true';\n");
          out.write("            });\n");
          out.write("        } else {\n");
          out.write("\n");
          out.write("            var serviceGroupsString = '';\n");
          out.write("            jQuery('.chkBox').each(function(index) {\n");
          out.write("                if(this.checked) {\n");
          out.write("                    serviceGroupsString += this.value + ':';\n");
          out.write("                }\n");
          out.write("            });\n");
          out.write("\n");
          out.write("            jQuery.ajax(\n");
          out.write("                    {\n");
          out.write("                        url : \"checkForGroupedServices_ajaxprocessor.jsp?serviceGroupsString=\" + serviceGroupsString,\n");
          out.write("                        success : function (data) {\n");
          out.write("                            if(data.search('foundgroupedservice') > 0){\n");
          out.write("                                CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\",\n");
          out.write("                                                              function(){\n");
          out.write("                                                                  document.servicesForm.submit();\n");
          out.write("                                                              },\n");
          out.write("                                                              function(){\n");
          out.write("                                                                  location.href='';\n");
          out.write("                                                              });\n");
          out.write("                            } else {\n");
          out.write("                                CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\", function() {\n");
          out.write("                                    document.servicesForm.submit();\n");
          out.write("                                });\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    }\n");
          out.write("            );\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function selectAllInThisPage(isSelected) {\n");
          out.write("        allServicesSelected = false;\n");
          out.write("        if (document.servicesForm.serviceGroups != null &&\n");
          out.write("            document.servicesForm.serviceGroups[0] != null) { // there is more than 1 service\n");
          out.write("            if (isSelected) {\n");
          out.write("                for (var j = 0; j < document.servicesForm.serviceGroups.length; j++) {\n");
          out.write("                    document.servicesForm.serviceGroups[j].checked = true;\n");
          out.write("                }\n");
          out.write("            } else {\n");
          out.write("                for (j = 0; j < document.servicesForm.serviceGroups.length; j++) {\n");
          out.write("                    document.servicesForm.serviceGroups[j].checked = false;\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        } else if (document.servicesForm.serviceGroups != null) { // only 1 service\n");
          out.write("            document.servicesForm.serviceGroups.checked = isSelected;\n");
          out.write("        }\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function selectAllInAllPages() {\n");
          out.write("        selectAllInThisPage(true);\n");
          out.write("        allServicesSelected = true;\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function resetVars() {\n");
          out.write("        allServicesSelected = false;\n");
          out.write("\n");
          out.write("        var isSelected = false;\n");
          out.write("        if (document.servicesForm.serviceGroups[0] != null) { // there is more than 1 service\n");
          out.write("            for (var j = 0; j < document.servicesForm.serviceGroups.length; j++) {\n");
          out.write("                if (document.servicesForm.serviceGroups[j].checked) {\n");
          out.write("                    isSelected = true;\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        } else if (document.servicesForm.serviceGroups != null) { // only 1 service\n");
          out.write("            if (document.servicesForm.serviceGroups.checked) {\n");
          out.write("                isSelected = true;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("</script>\n");

    }

          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    function searchServices() {\n");
          out.write("        document.searchForm.submit();\n");
          out.write("    }\n");
          out.write("    function editPS(serviceName) {\n");
          out.write("        window.location.href='../proxyservices/index.jsp?header=Modify' + '&serviceName='+serviceName+'&startwiz=true';\n");
          out.write("    }\n");
          out.write("    function editProxySourceView(serviceName) {\n");
          out.write("        window.location.href='../proxyservices/index.jsp?header=Modify' + '&serviceName='+serviceName+'&startwiz=false&sourceView=true';\n");
          out.write("    }\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("<h2>");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\">\n");
          out.write("<form action=\"index.jsp\" name=\"searchForm\">\n");
          out.write("    <table class=\"styledLeft\">\n");
          out.write("        ");
 if(loggedIn) { 
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td style=\"border:0; !important\">\n");
          out.write("                <nobr>\n");
          out.write("                    ");
          out.print( servicesInfo.getNumberOfActiveServices());
          out.write(' ');
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write(".&nbsp;\n");
          out.write("                    <a href=\"service_groups.jsp\">\n");
          out.write("                    ");
          out.print( correctServiceGroups);
          out.write(' ');
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </a>\n");
          out.write("                    ");

                        if (session.getAttribute(CarbonSecuredHttpContext.LOGGED_USER) != null) {
                            if (faultyServiceGroups > 0) {
                    
          out.write("\n");
          out.write("                    <u>\n");
          out.write("                        <a href=\"faulty_services.jsp\">\n");
          out.write("                            <font color=\"red\">");
          out.print( faultyServiceGroups);
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</font>\n");
          out.write("                        </a>\n");
          out.write("                    </u>\n");
          out.write("                    ");

                            }
                        }
                    
          out.write("\n");
          out.write("                </nobr>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
 } 
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td style=\"border:0; !important\">&nbsp;</td>\n");
          out.write("        </tr>\n");
          out.write("        <tr>  \n");
          out.write("            <td>\n");
          out.write("                <table style=\"border:0; !important\">\n");
          out.write("                <tbody>\n");
          out.write("                <tr style=\"border:0; !important\">\n");
          out.write("                    <td style=\"border:0; !important\">\n");
          out.write("                        <nobr>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <select name=\"serviceTypeFilter\">\n");
          out.write("                                ");

                                    if (serviceTypeFilter.equals("ALL")) {
                                
          out.write("\n");
          out.write("                                <option value=\"ALL\" selected=\"selected\">");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                ");

                                } else {
                                
          out.write("\n");
          out.write("                                <option value=\"ALL\">");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                ");

                                    }
                                    for (String serviceType : servicesInfo.getServiceTypes()) {
                                        if (serviceTypeFilter.equals(serviceType)) {
                                
          out.write("\n");
          out.write("                                <option value=\"");
          out.print( serviceType);
          out.write("\" selected=\"selected\">");
          out.print( stn.convertString(serviceType) );
          out.write("\n");
          out.write("                                </option>\n");
          out.write("                                ");

                                } else {
                                
          out.write("                           \n");
          out.write("                                <option value=\"");
          out.print( serviceType);
          out.write('"');
          out.write('>');
          out.print( stn.convertString(serviceType) );
          out.write("\n");
          out.write("                                </option>\n");
          out.write("                                ");

                                        }
                                    }
                                
          out.write("\n");
          out.write("                            </select>\n");
          out.write("                            &nbsp;&nbsp;&nbsp;\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <input type=\"text\" name=\"serviceSearchString\"\n");
          out.write("                                   value=\"");
          out.print( serviceSearchString != null? serviceSearchString : "");
          out.write("\"/>&nbsp;\n");
          out.write("                        </nobr>\n");
          out.write("                    </td>\n");
          out.write("                    <td style=\"border:0; !important\">\n");
          out.write("                         <a class=\"icon-link\" href=\"#\" style=\"background-image: url(images/search.gif);\"\n");
          out.write("                               onclick=\"javascript:searchServices(); return false;\"\n");
          out.write("                               alt=\"");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\"></a>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("    </table>\n");
          out.write("</form>\n");
          out.write("\n");
          out.write("<p>&nbsp;</p>\n");

    if (serviceData != null && correctServiceGroups > 0) {
        String parameters = "serviceTypeFilter=" + serviceTypeFilter +
                "&serviceSearchString=" + serviceSearchString;

          out.write("\n");
          out.write("<div class=\"paginator-ie7-fix\">\n");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_paginator_0.setPageNumber(pageNumberInt);
          _jspx_th_carbon_paginator_0.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_0.setPage("index.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_0.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
          _jspx_th_carbon_paginator_0.setPrevKey("prev");
          _jspx_th_carbon_paginator_0.setNextKey("next");
          _jspx_th_carbon_paginator_0.setParameters(parameters);
          int _jspx_eval_carbon_paginator_0 = _jspx_th_carbon_paginator_0.doStartTag();
          if (_jspx_th_carbon_paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
          out.write('\n');

	if (loggedIn && isAuthorizedToManage) {

          out.write('\n');
          //  carbon:itemGroupSelector
          org.wso2.carbon.ui.taglibs.ItemGroupSelector _jspx_th_carbon_itemGroupSelector_0 = (org.wso2.carbon.ui.taglibs.ItemGroupSelector) _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.get(org.wso2.carbon.ui.taglibs.ItemGroupSelector.class);
          _jspx_th_carbon_itemGroupSelector_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_itemGroupSelector_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_itemGroupSelector_0.setSelectAllInPageFunction("selectAllInThisPage(true)");
          _jspx_th_carbon_itemGroupSelector_0.setSelectAllFunction("selectAllInAllPages()");
          _jspx_th_carbon_itemGroupSelector_0.setSelectNoneFunction("selectAllInThisPage(false)");
          _jspx_th_carbon_itemGroupSelector_0.setAddRemoveFunction("deleteServices()");
          _jspx_th_carbon_itemGroupSelector_0.setAddRemoveButtonId("delete1");
          _jspx_th_carbon_itemGroupSelector_0.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
          _jspx_th_carbon_itemGroupSelector_0.setSelectAllInPageKey("selectAllInPage");
          _jspx_th_carbon_itemGroupSelector_0.setSelectAllKey("selectAll");
          _jspx_th_carbon_itemGroupSelector_0.setSelectNoneKey("selectNone");
          _jspx_th_carbon_itemGroupSelector_0.setAddRemoveKey("delete");
          _jspx_th_carbon_itemGroupSelector_0.setNumberOfPages(numberOfPages);
          int _jspx_eval_carbon_itemGroupSelector_0 = _jspx_th_carbon_itemGroupSelector_0.doStartTag();
          if (_jspx_th_carbon_itemGroupSelector_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.reuse(_jspx_th_carbon_itemGroupSelector_0);
            return;
          }
          _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.reuse(_jspx_th_carbon_itemGroupSelector_0);
          out.write('\n');
 } 
          out.write("\n");
          out.write("</div>\t<!-- paginator-ie7-fix -->\n");
          out.write("<p>&nbsp;</p>\n");
          out.write("\n");
          out.write("<form action=\"delete_service_groups.jsp\" name=\"servicesForm\" method=\"post\">\n");
          out.write("    <input type=\"hidden\" name=\"pageNumber\" value=\"");
          out.print( pageNumber);
          out.write("\"/>\n");
          out.write("    <table class=\"styledLeft\" id=\"sgTable\" width=\"100%\">\n");
          out.write("        <thead>\n");
          out.write("        <tr>\n");
          out.write("            ");

                if (loggedIn && hasDownloadableServices) {
            
          out.write("\n");
          out.write("            <th colspan=\"10\">");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            ");

            } else if (loggedIn) {
            
          out.write("\n");
          out.write("            <th colspan=\"9\">");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            ");

            } else {
            
          out.write("\n");
          out.write("            <th colspan=\"8\">");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("        </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("\n");
          out.write("        ");

            int position = 0;
            for (ServiceMetaData service : serviceData) {
                String bgColor = ((position % 2) == 1) ? "#EEEFFB" : "white";
                position++;
                if (service == null) {
                    continue;
                }
        
          out.write("\n");
          out.write("\n");
          out.write("        <tr bgcolor=\"");
          out.print( bgColor);
          out.write("\">\n");
          out.write("                    ");
 if (loggedIn) {
          out.write("\n");
          out.write("            <td width=\"10px\" style=\"text-align:center; !important\">\n");
          out.write("                ");

                    String serviceType = service.getServiceType();
                    if (!serviceType.equals("bpel") && !serviceType.equals("bpelmgt") && !service.getDisableDeletion()) {
                
          out.write("\n");
          out.write("                <input type=\"checkbox\" name=\"serviceGroups\"\n");
          out.write("                       value=\"");
          out.print(service.getServiceGroupName());
          out.write("\"\n");
          out.write("                       onclick=\"resetVars()\" class=\"chkBox\"/>\n");
          out.write("                ");

                } else {
                
          out.write("\n");
          out.write("                &nbsp;\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("            </td>\n");
          out.write("                    ");
 } 
          out.write("\n");
          out.write("            <td width=\"200px\">\n");
          out.write("                <nobr>\n");
          out.write("                    ");

                        String serviceName = service.getName();
                        if (loggedIn) {
                    
          out.write("\n");
          out.write("                    <a href=\"./service_info.jsp?serviceName=");
          out.print(serviceName);
          out.write('"');
          out.write('>');
          out.print(serviceName);
          out.write("\n");
          out.write("                    </a>\n");
          out.write("                    ");
 } else { 
          out.write("\n");
          out.write("                    ");
          out.print(serviceName);
          out.write("\n");
          out.write("                    ");
 } 
          out.write("\n");
          out.write("                </nobr>\n");
          out.write("            </td>\n");
          out.write("            <td width=\"20px\" style=\"text-align:left;\">\n");
          out.write("                <nobr>\n");
          out.write("                <img src=\"../");
          out.print( service.getServiceType());
          out.write("/images/type.gif\"\n");
          out.write("                     title=\"");
          out.print( service.getServiceType());
          out.write("\"\n");
          out.write("                     alt=\"");
          out.print( service.getServiceType());
          out.write("\"/>\n");
          out.write("                ");
          out.print( service.getServiceType() );
          out.write("\n");
          out.write("                </nobr>\n");
          out.write("            </td>\n");
          out.write("            ");
 if(isAuthorizedToManage) { 
          out.write("\n");
          out.write("            <td style=\"text-align:left;\" width=\"10px\">\n");
          out.write("                <nobr>\n");
          out.write("                ");
          out.print( service.getSecurityScenarioId() != null ?
                "<a href='../securityconfig/index.jsp?serviceName=" + serviceName + "'  class='icon-link' style='background-image:url(images/secured.gif);' " +
                "title='Secured using "+ service.getSecurityScenarioId() +"'>Secured</a>":
                "<a href='../securityconfig/index.jsp?serviceName=" + serviceName +  "'  class='icon-link' style='background-image:url(images/unsecured.gif);' " +
                "title='Unsecured'>Unsecured</a>"
                );
          out.write("\n");
          out.write("                 </nobr>\n");
          out.write("            </td>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("            <td width=\"100px\">\n");
          out.write("                ");
 if (service.getActive()) {
          out.write("\n");
          out.write("                <a href=\"");
          out.print(service.getWsdlURLs()[0]);
          out.write("\" class=\"icon-link\"\n");
          out.write("                   style=\"background-image:url(images/wsdl.gif);\" target=\"_blank\">\n");
          out.write("                    WSDL1.1\n");
          out.write("                </a>\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td width=\"100px\">\n");
          out.write("                ");
 if (service.getActive()) {
          out.write("\n");
          out.write("                <a href=\"");
          out.print(service.getWsdlURLs()[1]);
          out.write("\" class=\"icon-link\"\n");
          out.write("                   style=\"background-image:url(images/wsdl.gif);\" target=\"_blank\">\n");
          out.write("                    WSDL2.0\n");
          out.write("                </a>\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td width=\"100px\">\n");
          out.write("\t\t\t\t<div style=\"text-align:center\">\n");
          out.write("                ");
 if (!service.getDisableTryit() && service.getActive()) {
          out.write("\n");
          out.write("                <nobr>\n");
          out.write("                    <a href=\"");
          out.print(service.getTryitURL());
          out.write("\" class=\"icon-link\"\n");
          out.write("                       style=\"background-image:url(images/tryit.gif);\" target=\"_blank\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </a>\n");
          out.write("                </nobr>\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("            </td>\n");
          out.write("            ");
 if (loggedIn && hasDownloadableServices) { 
          out.write("\n");
          out.write("            <td width=\"100px\">\n");
          out.write("                ");
 if ((service.getServiceType().equalsIgnoreCase("axis2") && !(service.getName().equalsIgnoreCase("xkms"))) ||
                        service.getServiceType().equalsIgnoreCase("jaxws") ||service.getServiceType().equalsIgnoreCase("spring") ||
                        service.getServiceType().equalsIgnoreCase("js_service") || service.getServiceType().equalsIgnoreCase("jarservice")) { 
          out.write("\n");
          out.write("                <nobr>\n");
          out.write("                    <a href=\"download-ajaxprocessor.jsp?serviceName=");
          out.print(service.getServiceGroupName());
          out.write("&serviceType=");
          out.print(service.getServiceType());
          out.write("\"\n");
          out.write("                       class=\"icon-link\" style=\"background-image:url(images/download.gif);\"\n");
          out.write("                       target=\"_self\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </a>\n");
          out.write("                </nobr>        \n");
          out.write("                ");
 } else { 
          out.write("\n");
          out.write("                        &nbsp;\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("            </td>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("            ");
 if (service.getServiceType().equalsIgnoreCase("proxy")) { 
          out.write("\n");
          out.write("            ");
 hasProxy = true; 
          out.write("\n");
          out.write("            <td>\n");
          out.write("                <a title=\"Edit '");
          out.print(service.getName());
          out.write("' in the design view\" href=\"#\" onclick=\"editPS('");
          out.print(service.getName());
          out.write("');return false;\">\n");
          out.write("                    <img src=\"../proxyservices/images/design-view.gif\" alt=\"\" border=\"0\"> Design View</a>\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                <a title=\"Edit '");
          out.print(service.getName());
          out.write("' in the source view editor\" \n");
          out.write("                    style=\"background-image: url(../proxyservices/images/source-view.gif);\" \n");
          out.write("                    class=\"icon-link\" onclick=\"editProxySourceView('");
          out.print(service.getName());
          out.write("')\" href=\"#\">Source View</a>\n");
          out.write("            </td>\n");
          out.write("            ");
 } else {
          out.write("\n");
          out.write("            <td colspan=\"2\"></td>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("        </tr>\n");
          out.write("        ");

            } // for services
        
          out.write("\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("    <script>\n");
          out.write("    if (");
          out.print(hasProxy);
          out.write(" == false) {\n");
          out.write("        jQuery('#sgTable tr th').attr('colspan', parseInt(jQuery('#sgTable tr th').attr('colspan')) - 2);\n");
          out.write("        $(\"#sgTable tr\").each(function(){\n");
          out.write("            $(this).find(\"td:last\").remove();\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("    </script>\n");
          out.write("</form>\n");
          out.write("<p>&nbsp;</p>\n");
          out.write("<div class=\"paginator-ie7-fix\">\n");

    if (loggedIn && isAuthorizedToManage) {

          out.write('\n');
          //  carbon:itemGroupSelector
          org.wso2.carbon.ui.taglibs.ItemGroupSelector _jspx_th_carbon_itemGroupSelector_1 = (org.wso2.carbon.ui.taglibs.ItemGroupSelector) _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.get(org.wso2.carbon.ui.taglibs.ItemGroupSelector.class);
          _jspx_th_carbon_itemGroupSelector_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_itemGroupSelector_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_itemGroupSelector_1.setSelectAllInPageFunction("selectAllInThisPage(true)");
          _jspx_th_carbon_itemGroupSelector_1.setSelectAllFunction("selectAllInAllPages()");
          _jspx_th_carbon_itemGroupSelector_1.setSelectNoneFunction("selectAllInThisPage(false)");
          _jspx_th_carbon_itemGroupSelector_1.setAddRemoveFunction("deleteServices()");
          _jspx_th_carbon_itemGroupSelector_1.setAddRemoveButtonId("delete2");
          _jspx_th_carbon_itemGroupSelector_1.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
          _jspx_th_carbon_itemGroupSelector_1.setSelectAllInPageKey("selectAllInPage");
          _jspx_th_carbon_itemGroupSelector_1.setSelectAllKey("selectAll");
          _jspx_th_carbon_itemGroupSelector_1.setSelectNoneKey("selectNone");
          _jspx_th_carbon_itemGroupSelector_1.setAddRemoveKey("delete");
          _jspx_th_carbon_itemGroupSelector_1.setNumberOfPages(numberOfPages);
          int _jspx_eval_carbon_itemGroupSelector_1 = _jspx_th_carbon_itemGroupSelector_1.doStartTag();
          if (_jspx_th_carbon_itemGroupSelector_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.reuse(_jspx_th_carbon_itemGroupSelector_1);
            return;
          }
          _jspx_tagPool_carbon_itemGroupSelector_selectNoneKey_selectNoneFunction_selectAllKey_selectAllInPageKey_selectAllInPageFunction_selectAllFunction_resourceBundle_numberOfPages_addRemoveKey_addRemoveFunction_addRemoveButtonId_nobody.reuse(_jspx_th_carbon_itemGroupSelector_1);
          out.write('\n');
 } 
          out.write('\n');
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_paginator_1.setPageNumber(pageNumberInt);
          _jspx_th_carbon_paginator_1.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_1.setPage("index.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_1.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
          _jspx_th_carbon_paginator_1.setPrevKey("prev");
          _jspx_th_carbon_paginator_1.setNextKey("next");
          _jspx_th_carbon_paginator_1.setParameters( parameters);
          int _jspx_eval_carbon_paginator_1 = _jspx_th_carbon_paginator_1.doStartTag();
          if (_jspx_th_carbon_paginator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
          out.write('\n');

} else {

          out.write("\n");
          out.write("<b>");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</b>\n");

    }

          out.write("\n");
          out.write("</div><!-- paginator-ie7-fix end -->\n");
          out.write("\n");
          out.write("</div>\n");
          out.write("</div>\n");
          int evalDoAfterBody = _jspx_th_fmt_bundle_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_fmt_bundle_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_1);
        return;
      }
      _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_1);
      out.write("   \n");
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

  private boolean _jspx_meth_fmt_bundle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:bundle
    org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
    _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_bundle_0.setParent(null);
    _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.service.mgt.ui.i18n.Resources");
    int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
    if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_bundle_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            <div id=\"middle\">\n");
        out.write("                <h2>");
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
          return true;
        out.write("</h2>\n");
        out.write("                <div id=\"workArea\">\n");
        out.write("                    ");
        if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_bundle_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_bundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_0);
      return true;
    }
    _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_0.setKey("deployed.services");
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
    _jspx_th_fmt_message_1.setKey("no.deployed.services.found");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_2.setKey("select.services.to.be.deleted");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_4.setKey("delete.service.groups.with.multiples.services.prompt");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_5.setKey("delete.services.on.page.prompt");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_6.setKey("deployed.services");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_7.setKey("active.services");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_8.setKey("deployed.service.groups");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_9.setKey("faulty.services");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_10.setKey("service.type");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_11.setKey("all");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_12.setKey("all");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_13.setKey("search.service");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_14.setKey("search");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_15.setKey("services");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_16.setKey("services");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_17.setKey("services");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_18.setKey("try.this.service");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_19.setKey("download");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_20.setKey("no.deployed.services.found");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }
}
