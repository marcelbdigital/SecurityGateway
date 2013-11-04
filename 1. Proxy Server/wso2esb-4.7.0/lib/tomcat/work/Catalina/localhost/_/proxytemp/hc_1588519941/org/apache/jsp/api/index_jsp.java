package org.apache.jsp.api;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.rest.api.stub.types.carbon.APIData;
import org.wso2.carbon.rest.api.ui.util.RestAPIConstants;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.rest.api.ui.client.RestApiAdminClient;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonSecuredHttpContext;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.release();
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

      out.write("<!--\r\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\r\n");
      out.write(" ~\r\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\r\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\r\n");
      out.write(" ~ in compliance with the License.\r\n");
      out.write(" ~ You may obtain a copy of the License at\r\n");
      out.write(" ~\r\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write(" ~\r\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\r\n");
      out.write(" ~ software distributed under the License is distributed on an\r\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\r\n");
      out.write(" ~ specific language governing permissions and limitations\r\n");
      out.write(" ~ under the License.\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- This page is included to display messages which are set to request scope or session scope -->\r\n");
      out.write("\r\n");

    response.setHeader("Cache-Control", "no-cache");

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    RestApiAdminClient client;
    
    String serviceContextPath = configContext.getServiceContextPath();
    
    String serverContext = "";
    APIData[] apis = null;

    int pageNumber;
    int numberOfPages;
    int apiCount;
    
    String pageNumberStr = request.getParameter("pageNumber");
    String apiSearchString = request.getParameter("apiSearchString");
    if (apiSearchString == null) {
        apiSearchString = "";
    }

    if (pageNumberStr == null) {
        pageNumber = 0;
    }
    else{
    	try {
    		pageNumber = Integer.parseInt(pageNumberStr);
        } catch (NumberFormatException e) {
        	response.setStatus(500);
            CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, 
            		"pageNumber parameter is not an integer", e);
            session.setAttribute(CarbonUIMessage.ID, uiMsg);
		    
      out.write("\r\n");
      out.write("\t\t    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t    ");

            return;
        }
    }
    
    String serviceTypeFilter = request.getParameter("serviceTypeFilter");
    if (serviceTypeFilter == null) {
        serviceTypeFilter = "ALL";
    }
    String serviceSearchString = request.getParameter("serviceSearchString");
    if (serviceSearchString == null) {
        serviceSearchString = "";
    }
    boolean isAuthorizedToManage =
            CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/mediation");
    try {
        client = new RestApiAdminClient(configContext, backendServerURL, cookie, request.getLocale());
        serverContext = client.getServerContext();
        apiCount = client.getAPICount();

        if (apiSearchString.equals("")) {
            apis = client.getAPIsForListing(pageNumber, RestAPIConstants.APIS_PER_PAGE);
        } else {
            apis = client.getAPIsForSearchListing(pageNumber, RestAPIConstants.APIS_PER_PAGE, apiSearchString);
            if (apis!=null) {
                apiCount=apis.length;
            }
        }

        if(apiCount % RestAPIConstants.APIS_PER_PAGE == 0){
        	numberOfPages = apiCount / RestAPIConstants.APIS_PER_PAGE;
        }
        else{
        	numberOfPages = (apiCount / RestAPIConstants.APIS_PER_PAGE) + 1;
        }



    } catch (Exception e) {
        response.setStatus(500);
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\r');
      out.write('\n');

        return;
    }

    session.removeAttribute("index");

    //int correctServiceGroups = servicesInfo.getNumberOfCorrectServiceGroups();
    //int faultyServiceGroups = servicesInfo.getNumberOfFaultyServiceGroups();
    
    boolean loggedIn = session.getAttribute(CarbonSecuredHttpContext.LOGGED_USER) != null;
    
    //boolean hasDownloadableServices = false;

      out.write("\r\n");
      out.write("\r\n");
      //  carbon:breadcrumb
      org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
      _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
      _jspx_th_carbon_breadcrumb_0.setParent(null);
      _jspx_th_carbon_breadcrumb_0.setLabel("deployed.apis");
      _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.rest.api.ui.i18n.Resources");
      _jspx_th_carbon_breadcrumb_0.setTopPage(true);
      _jspx_th_carbon_breadcrumb_0.setRequest(request);
      int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
      if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
        return;
      }
      _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
      out.write("\r\n");
      out.write("\r\n");

    if (apiCount==0) {

      out.write("\r\n");
      out.write("        ");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.rest.api.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            <div id=\"middle\">\r\n");
          out.write("                <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\r\n");
          out.write("                <div id=\"workArea\">\r\n");
          out.write("                \t<a style=\"background-image: url(../admin/images/add.gif);\" href=\"manageAPI.jsp?mode=add\" class=\"icon-link\">\r\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    </a><br/><br/>\r\n");
          out.write("                    ");
if (!apiSearchString.equals("")){
                    
          out.write("\r\n");
          out.write("                    <a style=\"background-image: url(images/search.gif);\" href=\"index.jsp\" class=\"icon-link\">\r\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    </a><br/><br/>\r\n");
          out.write("                    ");
}
                    else{
                    
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    ");


                    }
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                </div>\r\n");
          out.write("            </div>\r\n");
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
        return;
      }
      _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_0);
      out.write('\r');
      out.write('\n');

        return;
    }

      out.write("\r\n");
      out.write("\r\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_1 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_1.setParent(null);
      _jspx_th_fmt_bundle_1.setBasename("org.wso2.carbon.rest.api.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_1 = _jspx_th_fmt_bundle_1.doStartTag();
      if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_1.doInitBody();
        }
        do {
          out.write('\r');
          out.write('\n');

    if (session.getAttribute(CarbonSecuredHttpContext.LOGGED_USER) != null) {

          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("    var allServicesSelected = false;\r\n");
          out.write("\r\n");
          out.write("    function selectAllInThisPage(isSelected) {\r\n");
          out.write("        allServicesSelected = false;\r\n");
          out.write("        if (document.servicesForm.serviceGroups != null &&\r\n");
          out.write("            document.servicesForm.serviceGroups[0] != null) { // there is more than 1 service\r\n");
          out.write("            if (isSelected) {\r\n");
          out.write("                for (var j = 0; j < document.servicesForm.serviceGroups.length; j++) {\r\n");
          out.write("                    document.servicesForm.serviceGroups[j].checked = true;\r\n");
          out.write("                }\r\n");
          out.write("            } else {\r\n");
          out.write("                for (j = 0; j < document.servicesForm.serviceGroups.length; j++) {\r\n");
          out.write("                    document.servicesForm.serviceGroups[j].checked = false;\r\n");
          out.write("                }\r\n");
          out.write("            }\r\n");
          out.write("        } else if (document.servicesForm.serviceGroups != null) { // only 1 service\r\n");
          out.write("            document.servicesForm.serviceGroups.checked = isSelected;\r\n");
          out.write("        }\r\n");
          out.write("        return false;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function selectAllInAllPages() {\r\n");
          out.write("        selectAllInThisPage(true);\r\n");
          out.write("        allServicesSelected = true;\r\n");
          out.write("        return false;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function resetVars() {\r\n");
          out.write("        allServicesSelected = false;\r\n");
          out.write("\r\n");
          out.write("        var isSelected = false;\r\n");
          out.write("        if (document.servicesForm.serviceGroups[0] != null) { // there is more than 1 service\r\n");
          out.write("            for (var j = 0; j < document.servicesForm.serviceGroups.length; j++) {\r\n");
          out.write("                if (document.servicesForm.serviceGroups[j].checked) {\r\n");
          out.write("                    isSelected = true;\r\n");
          out.write("                }\r\n");
          out.write("            }\r\n");
          out.write("        } else if (document.servicesForm.serviceGroups != null) { // only 1 service\r\n");
          out.write("            if (document.servicesForm.serviceGroups.checked) {\r\n");
          out.write("                isSelected = true;\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        return false;\r\n");
          out.write("    }\r\n");
          out.write("    \r\n");
          out.write("    function deleteApi(apiName) {\r\n");
          out.write("         CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write(" \" + apiName + \"?\", function() {\r\n");
          out.write("             location.href = \"delete_api.jsp?apiName=\" + apiName;\r\n");
          out.write("         });\r\n");
          out.write("    }\r\n");
          out.write("    function searchSequence() {\r\n");
          out.write("        document.searchForm.submit();\r\n");
          out.write("    }\r\n");
          out.write("</script>\r\n");

    }

          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"middle\">\r\n");
          out.write("<h2>");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</h2>\r\n");
          out.write("\r\n");
          out.write("<div id=\"workArea\">\r\n");
          out.write("<a style=\"background-image: url(../admin/images/add.gif);\" href=\"manageAPI.jsp?mode=add\" class=\"icon-link\">\r\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("</a>\r\n");
          out.write("<p>&nbsp;</p>\r\n");

    if (apis != null) {
        /*String parameters = "serviceTypeFilter=" + serviceTypeFilter +
                "&serviceSearchString=" + serviceSearchString;*/

          out.write(" \r\n");
          out.write("\r\n");

	if (loggedIn && isAuthorizedToManage) {

          out.write('\r');
          out.write('\n');
 } 
          out.write("\r\n");
          out.write("<p>&nbsp;</p>\r\n");
          out.write("\r\n");
          out.write("    <form action=\"index.jsp\" name=\"searchForm\">\r\n");
          out.write("        <table style=\"border:0; !important\">\r\n");
          out.write("            <tbody>\r\n");
          out.write("            <tr style=\"border:0; !important\">\r\n");
          out.write("                <td style=\"border:0; !important\">\r\n");
          out.write("                    <nobr>\r\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        <input type=\"text\" name=\"apiSearchString\"\r\n");
          out.write("                               value=\"");
          out.print( apiSearchString != null? apiSearchString : "");
          out.write("\"/>&nbsp;\r\n");
          out.write("                    </nobr>\r\n");
          out.write("                </td>\r\n");
          out.write("                <td style=\"border:0; !important\">\r\n");
          out.write("                    <a class=\"icon-link\" href=\"#\" style=\"background-image: url(images/search.gif);\"\r\n");
          out.write("                       onclick=\"javascript:searchSequence(); return false;\"\r\n");
          out.write("                       alt=\"");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("\"></a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            </tbody>\r\n");
          out.write("        </table>\r\n");
          out.write("    </form>\r\n");
          out.write("\r\n");
          out.write("<form action=\"delete_service_groups.jsp\" name=\"servicesForm\" method=\"post\">\r\n");
          out.write("    <input type=\"hidden\" name=\"pageNumber\" value=\"");
          out.print( pageNumber);
          out.write("\"/>\r\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_paginator_0.setPageNumber(pageNumber);
          _jspx_th_carbon_paginator_0.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_0.setPage("index.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_0.setResourceBundle("org.wso2.carbon.rest.api.ui.i18n.Resources");
          _jspx_th_carbon_paginator_0.setPrevKey("prev");
          _jspx_th_carbon_paginator_0.setNextKey("next");
          _jspx_th_carbon_paginator_0.setParameters("");
          int _jspx_eval_carbon_paginator_0 = _jspx_th_carbon_paginator_0.doStartTag();
          if (_jspx_th_carbon_paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
          out.write("\r\n");
          out.write("    <table class=\"styledLeft\" id=\"sgTable\" width=\"100%\">\r\n");
          out.write("        <thead>\r\n");
          out.write("        <tr>\r\n");
          out.write("        \t<th>");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("        \t<th>");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("        \t<th colspan=\"2\">");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("        </tr>\r\n");
          out.write("        </thead>\r\n");
          out.write("        <tbody>\r\n");
          out.write("\r\n");
          out.write("        ");

            int position = 0;
            for (APIData apiData : apis) {
                String bgColor = ((position % 2) == 1) ? "#EEEFFB" : "white";
                position++;
                if (apiData == null) {
                    continue;
                }
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <tr bgcolor=\"");
          out.print(bgColor);
          out.write("\">\r\n");
          out.write("                    ");
 if (loggedIn) {
          out.write("\r\n");
          out.write("                    ");
 } 
          out.write("\r\n");
          out.write("            <td width=\"100px\">\r\n");
          out.write("                <nobr>\r\n");
          out.write("                    ");
          out.print(apiData.getName());
          out.write("\r\n");
          out.write("                </nobr>\r\n");
          out.write("            </td>\r\n");
          out.write("            <td width=\"100px\">\r\n");
          out.write("                <nobr>\r\n");
          out.write("                    ");
          out.print(serverContext + apiData.getContext());
          out.write("\r\n");
          out.write("                </nobr>\r\n");
          out.write("            </td>\r\n");
          out.write("            <td width=\"20px\" style=\"text-align:left;border-left:none;border-right:none;width:100px;\">\r\n");
          out.write("                <div class=\"inlineDiv\">\r\n");
          out.write("                    <a style=\"background-image:url(../admin/images/edit.gif);\" class=\"icon-link\" href=\"manageAPI.jsp?mode=edit&amp;apiName=");
          out.print(apiData.getName());
          out.write("\">Edit</a>\r\n");
          out.write("                </div>\r\n");
          out.write("            </td>\r\n");
          out.write("            <td width=\"20px\" style=\"text-align:left;border-left:none;width:100px;\">\r\n");
          out.write("                <div class=\"inlineDiv\">\r\n");
          out.write("                    <a style=\"background-image:url(../admin/images/delete.gif);\" class=\"icon-link\" href=\"#\"\r\n");
          out.write("                    \tonclick=\"deleteApi('");
          out.print(apiData.getName());
          out.write("')\">Delete</a>\r\n");
          out.write("                </div>\r\n");
          out.write("            </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        ");

            } // for each api
        
          out.write("\r\n");
          out.write("        </tbody>\r\n");
          out.write("    </table>\r\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
          _jspx_th_carbon_paginator_1.setPageNumber(pageNumber);
          _jspx_th_carbon_paginator_1.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_1.setPage("index.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_1.setResourceBundle("org.wso2.carbon.rest.api.ui.i18n.Resources");
          _jspx_th_carbon_paginator_1.setPrevKey("prev");
          _jspx_th_carbon_paginator_1.setNextKey("next");
          _jspx_th_carbon_paginator_1.setParameters("");
          int _jspx_eval_carbon_paginator_1 = _jspx_th_carbon_paginator_1.doStartTag();
          if (_jspx_th_carbon_paginator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
          out.write("\r\n");
          out.write("</form>\r\n");
          out.write("<p>&nbsp;</p>\r\n");

    if (loggedIn && isAuthorizedToManage) {

          out.write('\r');
          out.write('\n');
 } 
          out.write('\r');
          out.write('\n');

} else {

          out.write("\r\n");
          out.write("<b>");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
            return;
          out.write("</b>\r\n");

    }

          out.write("\r\n");
          out.write("</div>\r\n");
          out.write("</div>\r\n");
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
      out.write('\r');
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
    _jspx_th_fmt_message_0.setKey("deployed.apis");
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
    _jspx_th_fmt_message_1.setKey("add.api");
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
    _jspx_th_fmt_message_2.setKey("no.search.apis.found");
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
    _jspx_th_fmt_message_3.setKey("no.deployed.apis.found");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
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
    _jspx_th_fmt_message_4.setKey("api.delete.confirmation");
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
    _jspx_th_fmt_message_5.setKey("deployed.apis");
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
    _jspx_th_fmt_message_6.setKey("add.api");
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
    _jspx_th_fmt_message_7.setKey("search.api");
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
    _jspx_th_fmt_message_8.setKey("search");
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
    _jspx_th_fmt_message_9.setKey("api.name");
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
    _jspx_th_fmt_message_10.setKey("api.invocation.url");
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
    _jspx_th_fmt_message_11.setKey("apis.table.action.header");
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
    _jspx_th_fmt_message_12.setKey("no.deployed.services.found");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }
}
