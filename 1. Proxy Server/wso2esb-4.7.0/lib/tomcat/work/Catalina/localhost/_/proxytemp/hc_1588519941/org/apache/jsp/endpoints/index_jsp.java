package org.apache.jsp.endpoints;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.endpoint.stub.types.service.EndpointMetaData;
import org.wso2.carbon.endpoint.ui.client.EndpointAdminClient;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointService;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointStore;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import java.util.Collection;

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

      out.write("<!--\n");
      out.write("~ Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
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
      out.write("<script type=\"text/javascript\" src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/container/container_core-min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../yui/build/container/assets/skins/sam/container.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/container/container-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/element/element-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../admin/js/widgets.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/yahoo/yahoo-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/event/event-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/connection/connection-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/ressubmitEndpoint.jspource_util.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/menu/menu-min.js\"></script>\n");
      out.write("<link type=\"text/css\" href=\"../dialog/js/jqueryui/tabs/ui.all.css\" rel=\"stylesheet\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-1.2.6.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"../dialog/js/jqueryui/tabs/jquery-ui-1.6.custom.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery.cookie.js\"></script>\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.endpoint.ui.i18n.Resources");
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
          _jspx_th_carbon_breadcrumb_0.setLabel("endpoints");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.newendpoint.ui.i18n.Resources");
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

    String sequenceSearchString = request.getParameter("sequenceSearchString");
    boolean isSuccessfulSearch = true;
    if (sequenceSearchString == null) {
        sequenceSearchString = "";
    }
String pageNumberStr = request.getParameter("pageNumber");
    String dynamicPageNumberStr = request.getParameter("dynamicPageNumber");

    int endpointPageNumber = 0;
    int dynamicEnpointPageNumber = 0;
    if (pageNumberStr != null) {
        endpointPageNumber = Integer.parseInt(pageNumberStr);
    }
    if(dynamicPageNumberStr!=null){
        dynamicEnpointPageNumber = Integer.parseInt(dynamicPageNumberStr);
    }

          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("//Script for search Endpoints\n");
          out.write("function searchSequence() {\n");
          out.write("    document.searchForm.submit();\n");
          out.write("}\n");
          out.write("\n");
          out.write("// script for tab handling\n");
          out.write("$(function() {\n");
          out.write("    $(\"#tabs\").tabs();\n");
          out.write("});\n");
          out.write("\n");
          out.write("$(document).ready(function() {\n");
          out.write("    var $tabs = $('#tabs > ul').tabs({ cookie: { expires: 30 } });\n");
          out.write("    $('a', $tabs).click(function() {\n");
          out.write("        if ($(this).parent().hasClass('ui-tabs-selected')) {\n");
          out.write("            $tabs.tabs('load', $('a', $tabs).index(this));\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("    ");

String tabs = request.getParameter("tabs");
if(tabs!=null && tabs.equals("0")) {
    
          out.write("$tabs.tabs('option', 'selected', 0);\n");
          out.write("    ");

}else if(tabs!=null && tabs.equals("1")){
    
          out.write("$tabs.tabs('option', 'selected', 1);\n");
          out.write("    ");

    }
    
          out.write("\n");
          out.write("    if (!isDefinedSequenceFound && !isDynamicSequenceFound) {\n");
          out.write("        $tabs.tabs('option', 'selected', 2);\n");
          out.write("    }\n");
          out.write("});\n");
          out.write("\n");
          out.write("function enableStat(endpointName) {\n");
          out.write("    $.ajax({\n");
          out.write("               type: 'POST',\n");
          out.write("               url: 'ajaxprocessors/stat-ajaxprocessor.jsp',\n");
          out.write("               data: 'endpointName=' + endpointName + '&action=enableStat',\n");
          out.write("               success: function(msg) {\n");
          out.write("                   var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                   if (index != -1 && msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                       CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                   } else {\n");
          out.write("                       handleStatCallback('enableStat', endpointName);\n");
          out.write("                   }\n");
          out.write("               }\n");
          out.write("           });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function disableStat(endpointName) {\n");
          out.write("    $.ajax({\n");
          out.write("               type: 'POST',\n");
          out.write("               url: 'ajaxprocessors/stat-ajaxprocessor.jsp',\n");
          out.write("               data: 'endpointName=' + endpointName + '&action=disableStat',\n");
          out.write("               success: function(msg) {\n");
          out.write("                   var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                   if (index != -1 && msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                       CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                   } else {\n");
          out.write("                       handleStatCallback('disableStat', endpointName);\n");
          out.write("                   }\n");
          out.write("               }\n");
          out.write("           });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function handleStatCallback(action, endpointName) {\n");
          out.write("    var element;\n");
          out.write("    if (action == 'enableStat') {\n");
          out.write("        element = document.getElementById(\"disableStat\" + endpointName);\n");
          out.write("        element.style.display = \"\";\n");
          out.write("        element = document.getElementById(\"enableStat\" + endpointName);\n");
          out.write("        element.style.display = \"none\";\n");
          out.write("    } else {\n");
          out.write("        element = document.getElementById(\"disableStat\" + endpointName);\n");
          out.write("        element.style.display = \"none\";\n");
          out.write("        element = document.getElementById(\"enableStat\" + endpointName);\n");
          out.write("        element.style.display = \"\";\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function switchOn(endpointName) {\n");
          out.write("    $.ajax({\n");
          out.write("               type: 'POST',\n");
          out.write("               url: 'ajaxprocessors/switchOnOff-ajaxprocessor.jsp',\n");
          out.write("               data: 'endpointName=' + endpointName + '&action=switchOn',\n");
          out.write("               success: function(msg) {\n");
          out.write("                   var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                   if (index != -1 && msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                       CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                   } else {\n");
          out.write("                       handleSwitchOnOffCallback('switchOn', endpointName);\n");
          out.write("                   }\n");
          out.write("               }\n");
          out.write("           });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function switchOff(endpointName) {\n");
          out.write("    $.ajax({\n");
          out.write("               type: 'POST',\n");
          out.write("               url: 'ajaxprocessors/switchOnOff-ajaxprocessor.jsp',\n");
          out.write("               data: 'endpointName=' + endpointName + '&action=switchOff',\n");
          out.write("               success: function(msg) {\n");
          out.write("                   var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                   if (index != -1 && msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                       CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                   } else {\n");
          out.write("                       handleSwitchOnOffCallback('switchOff', endpointName);\n");
          out.write("                   }\n");
          out.write("               }\n");
          out.write("           });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function handleSwitchOnOffCallback(action, endpointName) {\n");
          out.write("    var element;\n");
          out.write("    if (action == 'switchOn') {\n");
          out.write("        element = document.getElementById(\"switchOff\" + endpointName);\n");
          out.write("        element.style.display = \"\";\n");
          out.write("        element = document.getElementById(\"switchOn\" + endpointName);\n");
          out.write("        element.style.display = \"none\";\n");
          out.write("    } else {\n");
          out.write("        element = document.getElementById(\"switchOff\" + endpointName);\n");
          out.write("        element.style.display = \"none\";\n");
          out.write("        element = document.getElementById(\"switchOn\" + endpointName);\n");
          out.write("        element.style.display = \"\";\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function goBack(orginiator) {\n");
          out.write("    if (orginiator == null) {\n");
          out.write("        alert('Error: Origin not found');\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("    document.location.href = orginiator + '?cancelled=true';\n");
          out.write("    return true;\n");
          out.write("}\n");
          out.write("\n");
          out.write("function deleteEndpoint(endpointName) {\n");
          out.write("    CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + endpointName + \" ?\", function() {\n");
          out.write("        $.ajax({\n");
          out.write("                   type: 'POST',\n");
          out.write("                   url: 'ajaxprocessors/deleteEndpoint-ajaxprocessor.jsp',\n");
          out.write("                   data: 'endpointName=' + endpointName + '&force=false',\n");
          out.write("                   success: function(msg) {\n");
          out.write("                       var index = msg.toString().trim().indexOf('<div>Dep Error:</div>');\n");
          out.write("                       if (index != -1) {\n");
          out.write("                           confirmForceDelete(endpointName, msg.toString().trim().substring(index + 21));\n");
          out.write("                       } else {\n");
          out.write("                           loadEndpointsAfterDeletion();\n");
          out.write("                       }\n");
          out.write("                   }\n");
          out.write("               });\n");
          out.write("    });\n");
          out.write("\n");
          out.write("}\n");
          out.write("\n");
          out.write("function loadEndpointsAfterDeletion() {\n");
          out.write("    var url = \"ajaxprocessors/deleteEndpoint-ajaxprocessor.jsp?loadpage=true&pageNumber=");
          out.print(endpointPageNumber);
          out.write("\";\n");
          out.write("    jQuery(\"#tabs-1\").load(url, null, function (responseText, status, XMLHttpRequest) {\n");
          out.write("        if (status != \"success\") {\n");
          out.write("            CARBON.showErrorDialog(jsi18n[\"endpoint.design.load.error\"]);\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function deleteDynamicEndpoint(key) {\n");
          out.write("    CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + key + \"?\", function() {\n");
          out.write("        var url = \"ajaxprocessors/deleteDynamicEndpoint-ajaxprocessor.jsp?endpointName=\" + key+\"&dynamicPageNumber=");
          out.print(dynamicEnpointPageNumber);
          out.write("\";\n");
          out.write("        jQuery(\"#tabs-2\").load(url, null, function (responseText, status, XMLHttpRequest) {\n");
          out.write("            if (status != \"success\") {\n");
          out.write("                CARBON.showErrorDialog(jsi18n[\"endpoint.design.load.error\"]);\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    });\n");
          out.write("\n");
          out.write("}\n");
          out.write("\n");
          out.write("function confirmForceDelete(endpointName, msg) {\n");
          out.write("    CARBON.showConfirmationDialog('This endpoint is a dependency for following items!<br/><br/>'\n");
          out.write("                                          + msg + '<br/>Force delete?', function() {\n");
          out.write("        $.ajax({\n");
          out.write("                   type: 'POST',\n");
          out.write("                   url: 'ajaxprocessors/deleteEndpoint-ajaxprocessor.jsp',\n");
          out.write("                   data: 'endpointName=' + endpointName + '&force=true',\n");
          out.write("\n");
          out.write("                   success: function(msg) {\n");
          out.write("                       loadEndpointsAfterDeletion();\n");
          out.write("                   }\n");
          out.write("               });\n");
          out.write("    });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function editEndpoint(endpointType, endPointName) {\n");
          out.write("    document.location.href = endpointType + 'Endpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit';\n");
          out.write("}\n");
          out.write("\n");
          out.write("function editDynamicEndpoint(key) {\n");
          out.write("    if (key != null && key != undefined && key != \"\") {\n");
          out.write("        location.href = \"dynamicEndpoint.jsp?anonEpAction=edit&key=\" + key;\n");
          out.write("    } else {\n");
          out.write("        CARBON.showErrorDialog(\"Specify the key of the Endpoint to be edited\");\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");

    int numberOfPages = 0;
    int numberOfDynamicPages = 0;

    String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

    EndpointAdminClient client;
    EndpointMetaData[] ePMetaData = null;
    String[] dynamicEndpoints = null;
    try {
        client = new EndpointAdminClient(cookie, serverURL, configContext);
        int epCount = 0;
        int dynamicEpCount = 0;
        if (sequenceSearchString.equals("")) {
            ePMetaData = client.getEndpointMetaData(endpointPageNumber, EndpointAdminClient.ENDPOINT_PER_PAGE);
            dynamicEndpoints = client.getDynamicEndpoints(dynamicEnpointPageNumber, EndpointAdminClient.ENDPOINT_PER_PAGE);
            epCount = client.getEndpointCount();
            dynamicEpCount = client.getDynamicEndpointCount();
        }
        else {
             ePMetaData = client.getEndpointMetaDataSearch(endpointPageNumber, EndpointAdminClient.ENDPOINT_PER_PAGE,sequenceSearchString);
             if (ePMetaData == null) {
                isSuccessfulSearch =false;
                ePMetaData = client.getEndpointMetaData(endpointPageNumber, EndpointAdminClient.ENDPOINT_PER_PAGE);
                epCount = client.getEndpointCount();
             } else {
                epCount = ePMetaData.length;
             }
             dynamicEndpoints = client.getDynamicEndpoints(dynamicEnpointPageNumber, EndpointAdminClient.ENDPOINT_PER_PAGE);
             dynamicEpCount = client.getDynamicEndpointCount();
        }

        if (epCount % EndpointAdminClient.ENDPOINT_PER_PAGE == 0) {
            numberOfPages = epCount / EndpointAdminClient.ENDPOINT_PER_PAGE;
        } else {
            numberOfPages = epCount / EndpointAdminClient.ENDPOINT_PER_PAGE + 1;
        }

        if (dynamicEpCount % EndpointAdminClient.ENDPOINT_PER_PAGE == 0) {
            numberOfDynamicPages = dynamicEpCount / EndpointAdminClient.ENDPOINT_PER_PAGE;
        } else {
            numberOfDynamicPages = dynamicEpCount / EndpointAdminClient.ENDPOINT_PER_PAGE + 1;
        }

    } catch (Exception e) {
        CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    location.href = \"../admin/error.jsp\";\n");
          out.write("</script>\n");

        return;
    }

    //Template specific parameters
    String templateAdd = request.getParameter("templateAdd");
    boolean isTemplateAdd = templateAdd != null && "true".equals(templateAdd) ? true : false;

    // Anonymous Endpoint specific parameters
    String endpointMode = null; // this holds an anonymous endpoint which can come trough proxy and send mediator
    String anonymousOriginator = null;
    boolean isAnonymous = false;
    String anonymousEndpointXML = null;

    // came through clicking menu on the left
    if (request.getParameter("region") != null && request.getParameter("item") != null) {
        session.removeAttribute("epMode");
        session.removeAttribute("anonEpXML");
        session.removeAttribute("proxy");
        session.removeAttribute("header");
        session.removeAttribute("endpointTemplate");
        session.removeAttribute("templateEdittingMode");
        session.removeAttribute("templateRegKey");
    } else {
        // a user is adding an anonymous endpoint
        endpointMode = (String) session.getAttribute("epMode");
        if (endpointMode != null && endpointMode.equals("anon")) {
            // if the user is here that means the user is going to add (not edit an existing endpoint)
            // a new endpoint
            isAnonymous = true;
            anonymousOriginator = (String) session.getAttribute("anonOriginator");
        }
    }
    String proxyServiceName = request.getParameter("serviceName");

          out.write("\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("<h2>\n");
          out.write("    ");

        if (!isAnonymous) {
            if (isTemplateAdd) {
    
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

} else {

          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

    }
} else {
    if (proxyServiceName != null) {

          out.print(proxyServiceName);
          out.write(":&nbsp;");

    }

          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

    }

          out.write("\n");
          out.write("</h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\" style=\"background-color:#F4F4F4;\">\n");

    if (!isAnonymous) { //hide tabs during anonymous mode

          out.write("\n");
          out.write("<div id=\"tabs\">\n");
          out.write("<ul>\n");
          out.write("    ");
 if (!isTemplateAdd) { 
          out.write("\n");
          out.write("    <li><a href=\"#tabs-1\">");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("    <li><a href=\"#tabs-2\">");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("    ");
}
          out.write("\n");
          out.write("    <li><a href=\"#tabs-3\">");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_7.setKey(isTemplateAdd ?"add.endpoint.template":"add.endpoint");
          int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
          if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
          out.write("</a></li>\n");
          out.write("</ul>\n");
          out.write("\n");
          out.write("<!--Tab 1: Endpoint List-->\n");
 if (!isTemplateAdd) { 
          out.write("\n");
          out.write("<div id=\"tabs-1\">\n");
          out.write("    <br/>\n");
          out.write("    <form action=\"index.jsp\" name=\"searchForm\">\n");
          out.write("        <table style=\"border:0; !important\">\n");
          out.write("            <tbody>\n");
          out.write("            <tr style=\"border:0; !important\">\n");
          out.write("                <td style=\"border:0; !important\">\n");
          out.write("                    <nobr>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        <label>\n");
          out.write("                            <input type=\"text\" name=\"sequenceSearchString\"\n");
          out.write("                                   value=\"");
          out.print( sequenceSearchString != null? sequenceSearchString : "");
          out.write("\"/>\n");
          out.write("                        </label>&nbsp;\n");
          out.write("                    </nobr>\n");
          out.write("                </td>\n");
          out.write("                <td style=\"border:0; !important\">\n");
          out.write("                    <a class=\"icon-link\" href=\"#\" style=\"background-image: url(images/search.gif);\"\n");
          out.write("                       onclick=\"javascript:searchSequence(); return false;\"\n");
          out.write("                       alt=\"");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"></a>\n");
          out.write("                </td>\n");
          out.write("                ");

                    if (!isSuccessfulSearch) {
                
          out.write("\n");
          out.write("                <td style=\"border:0; !important\">\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                ");

                    }
                
          out.write("\n");
          out.write("            </tr>\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("    </form>\n");
          out.write("    <br/>\n");
          out.write("    <div id=\"noEpDiv\" style=\"");
          out.print(ePMetaData!=null ?"display:none":"");
          out.write("\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </div>\n");
          out.write("\n");
          out.write("    ");
 if (ePMetaData != null) {
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        isDefinedSequenceFound = true;\n");
          out.write("    </script>\n");
          out.write("    <p>");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("    <br/>\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_0.setPageNumber(endpointPageNumber);
          _jspx_th_carbon_paginator_0.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_0.setPage("index.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_0.setResourceBundle("org.wso2.carbon.endpoint.ui.i18n.Resources");
          _jspx_th_carbon_paginator_0.setPrevKey("prev");
          _jspx_th_carbon_paginator_0.setNextKey("next");
          _jspx_th_carbon_paginator_0.setParameters("");
          int _jspx_eval_carbon_paginator_0 = _jspx_th_carbon_paginator_0.doStartTag();
          if (_jspx_th_carbon_paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_0);
          out.write("\n");
          out.write("    <br/>\n");
          out.write("\n");
          out.write("    <table class=\"styledLeft\" cellpadding=\"1\" id=\"endpointListTable\">\n");
          out.write("        <thead>\n");
          out.write("        <tr>\n");
          out.write("            <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            <th colspan=\"4\">");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("        </tr>\n");
          out.write("        </thead>\n");
          out.write("\n");
          out.write("        <tbody>\n");
          out.write("        ");
for (EndpointMetaData endpoint : ePMetaData) {
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td>");
 if (endpoint.getDescription() != null) { 
          out.write("\n");
          out.write("                    <span href=\"#\">\n");
          out.write("                          ");
          out.print( endpoint.getName());
          out.write("\n");
          out.write("                    </span>\n");
          out.write("                ");

                } else {
                
          out.write("\n");
          out.write("                <span href=\"#\">");
          out.print( endpoint.getName());
          out.write("</span>\n");
          out.write("                ");

                    }
                
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                ");

                    EndpointService ePService = client.getEndpointService(endpoint);
                
          out.write("\n");
          out.write("                ");
          out.print(ePService.getDisplayName());
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td style=\"border-right:none;border-left:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    ");
 if (endpoint.getSwitchOn()) { 
          out.write("\n");
          out.write("                    <div id=\"switchOff");
          out.print(endpoint.getName());
          out.write("\">\n");
          out.write("                        <a href=\"#\" onclick=\"switchOff('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(images/endpoint-on.gif);\">");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                    <div id=\"switchOn");
          out.print(endpoint.getName());
          out.write("\" style=\"display:none;\">\n");
          out.write("                        <a href=\"#\" onclick=\"switchOn('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(images/endpoint-off.gif);\">");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                    ");
} else {
          out.write("\n");
          out.write("                    <div id=\"switchOff");
          out.print(endpoint.getName());
          out.write("\" style=\"display:none;\">\n");
          out.write("                        <a href=\"#\" onclick=\"switchOff('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(images/endpoint-on.gif);\">");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                    <div id=\"switchOn");
          out.print(endpoint.getName());
          out.write("\" style=\"\">\n");
          out.write("                        <a href=\"#\" onclick=\"switchOn('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(images/endpoint-off.gif);\">");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                    ");
 }
                        if (ePService.isStatisticsAvailable()) {
                            if (endpoint.getEnableStatistics()) { 
          out.write("\n");
          out.write("                    <td style=\"border-right:none;border-left:none;width:100px\">\n");
          out.write("                        <div id=\"disableStat");
          out.print( endpoint.getName());
          out.write("\">\n");
          out.write("                            <a href=\"#\" onclick=\"disableStat('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                               class=\"icon-link\"\n");
          out.write("                               style=\"background-image:url(../admin/images/static-icon.gif);\">");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </div>\n");
          out.write("                        <div id=\"enableStat");
          out.print( endpoint.getName());
          out.write("\" style=\"display:none;\">\n");
          out.write("                            <a href=\"#\" onclick=\"enableStat('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                               class=\"icon-link\"\n");
          out.write("                               style=\"background-image:url(../admin/images/static-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </div>\n");
          out.write("                    </td>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("            ");

            } else { 
          out.write("\n");
          out.write("            <td style=\"border-right:none;border-left:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    <div id=\"enableStat");
          out.print( endpoint.getName());
          out.write("\">\n");
          out.write("                        <a href=\"#\" onclick=\"enableStat('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/static-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                    <div id=\"disableStat");
          out.print( endpoint.getName());
          out.write("\" style=\"display:none\">\n");
          out.write("                        <a href=\"#\" onclick=\"disableStat('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/static-icon.gif);\">");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("\n");
          out.write("            ");
 }
            } else {
          out.write("\n");
          out.write("            <td style=\"border-right:none;border-left:none;width:100px\"></td>\n");
          out.write("            ");

                }
            
          out.write("\n");
          out.write("            <td style=\"border-left:none;border-right:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    <a href=\"#\"\n");
          out.write("                       class=\"icon-link\"\n");
          out.write("                       onclick=\"editEndpoint('");
          out.print(ePService.getUIPageName());
          out.write("','");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                       style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("            <td style=\"border-left:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    <a href=\"#\"\n");
          out.write("                       onclick=\"deleteEndpoint('");
          out.print( endpoint.getName() );
          out.write("')\"\n");
          out.write("                       class=\"icon-link\"\n");
          out.write("                       style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
}
          out.write("\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("    <br/>\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_1.setPageNumber(endpointPageNumber);
          _jspx_th_carbon_paginator_1.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_1.setPage("index.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_1.setResourceBundle("org.wso2.carbon.endpoint.ui.i18n.Resources");
          _jspx_th_carbon_paginator_1.setPrevKey("prev");
          _jspx_th_carbon_paginator_1.setNextKey("next");
          _jspx_th_carbon_paginator_1.setParameters("");
          int _jspx_eval_carbon_paginator_1 = _jspx_th_carbon_paginator_1.doStartTag();
          if (_jspx_th_carbon_paginator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_1);
          out.write("\n");
          out.write("    ");
 } 
          out.write("\n");
          out.write("</div>\n");
          out.write("\n");
          out.write("<!--Tab 2: Dynamic Endpoints-->\n");
          out.write("<div id=\"tabs-2\">\n");
          out.write("    ");

        if (client.isRegisterNull() && dynamicEndpoints != null) {
            dynamicEndpoints = null;
            dynamicEnpointPageNumber = 0;
    
          out.write("\n");
          out.write("    <div id=\"noEpDiv\"\n");
          out.write("         style=\"");
          out.print(dynamicEndpoints!=null || isAnonymous?"display:none":"");
          out.write("\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </div>\n");
          out.write("    ");

    } else {
    
          out.write("\n");
          out.write("    <div id=\"noEpDiv\"\n");
          out.write("         style=\"");
          out.print(dynamicEndpoints!=null || isAnonymous?"display:none":"");
          out.write("\">\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </div>\n");
          out.write("    ");

        }
        if ((dynamicEndpoints != null) && (dynamicEndpoints.length > 0) && (!isAnonymous)) {
    
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        isDynamicSequenceFound = true;\n");
          out.write("    </script>\n");
          out.write("    <p>");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("    <br/>\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_2 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_2.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_2.setPageNumber(dynamicEnpointPageNumber);
          _jspx_th_carbon_paginator_2.setNumberOfPages(numberOfDynamicPages);
          _jspx_th_carbon_paginator_2.setPage("index.jsp");
          _jspx_th_carbon_paginator_2.setPageNumberParameterName("dynamicPageNumber");
          _jspx_th_carbon_paginator_2.setResourceBundle("org.wso2.carbon.endpoint.ui.i18n.Resources");
          _jspx_th_carbon_paginator_2.setPrevKey("prev");
          _jspx_th_carbon_paginator_2.setNextKey("next");
          _jspx_th_carbon_paginator_2.setParameters("");
          int _jspx_eval_carbon_paginator_2 = _jspx_th_carbon_paginator_2.doStartTag();
          if (_jspx_th_carbon_paginator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_2);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_2);
          out.write("\n");
          out.write("    <br/>\n");
          out.write("    <table class=\"styledLeft\" cellspacing=\"1\" id=\"dynamicEndpointsTable\">\n");
          out.write("        <thead>\n");
          out.write("        <tr>\n");
          out.write("            <th style=\"width:30%\">\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </th>\n");
          out.write("            <th style=\"width:20%\">\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </th>\n");
          out.write("            <th class=\"registryWriteOperation\" colspan=\"2\">\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </th>\n");
          out.write("        </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("        ");
 for (String endpoint : dynamicEndpoints) { 
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td>\n");
          out.write("                ");
          out.print(endpoint );
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                ");

                    String epXML = client.getDynamicEndpoint(endpoint);
                    EndpointService epService = client.getEndpointService(epXML);
                
          out.write("\n");
          out.write("                ");
          out.print(epService.getDisplayName());
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td class=\"registryWriteOperation\" style=\"border-right:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    <a href=\"#\" onclick=\"editDynamicEndpoint('");
          out.print(endpoint);
          out.write("')\" class=\"icon-link\"\n");
          out.write("                       style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("            <td class=\"registryWriteOperation\" style=\"border-left:none;width:100px\">\n");
          out.write("                <div class=\"inlineDiv\">\n");
          out.write("                    <a href=\"#\" onclick=\"deleteDynamicEndpoint('");
          out.print( endpoint );
          out.write("')\"\n");
          out.write("                       class=\"icon-link\"\n");
          out.write("                       style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
}
          out.write("\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("    <br/>\n");
          out.write("    ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_3 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_3.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_3.setPageNumber(dynamicEnpointPageNumber);
          _jspx_th_carbon_paginator_3.setNumberOfPages(numberOfDynamicPages);
          _jspx_th_carbon_paginator_3.setPage("index.jsp");
          _jspx_th_carbon_paginator_3.setPageNumberParameterName("dynamicPageNumber");
          _jspx_th_carbon_paginator_3.setResourceBundle("org.wso2.carbon.endpoint.ui.i18n.Resources");
          _jspx_th_carbon_paginator_3.setPrevKey("prev");
          _jspx_th_carbon_paginator_3.setNextKey("next");
          _jspx_th_carbon_paginator_3.setParameters("");
          int _jspx_eval_carbon_paginator_3 = _jspx_th_carbon_paginator_3.doStartTag();
          if (_jspx_th_carbon_paginator_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_3);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_3);
          out.write("\n");
          out.write("    ");

        }
    
          out.write("\n");
          out.write("    <br/>\n");
          out.write("</div>\n");
          out.write("\n");
}
          out.write('\n');
} //hide tabs during anonymous mode
          out.write("\n");
          out.write("\n");
          out.write("<!-- Tab 3: Add new Endpoints -->\n");
          out.write("<div id=\"tabs-3\">\n");
          out.write("    <table id=\"endpointOptionTable\" class=\"styledLeft\" cellpadding=\"1\">\n");
          out.write("        <thead>\n");
          out.write("        <tr>\n");
          out.write("            <th colspan=\"2\">\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </th>\n");
          out.write("        </tr>\n");
          out.write("        </thead>\n");
          out.write("        ");

            String proxyServiceParam = proxyServiceName != null ?
                                       "serviceName=" + proxyServiceName : "";
            String fullQueryString = (isTemplateAdd ? "templateAdd=true&" : "") +
                                     proxyServiceParam;
            Collection<EndpointService> endpointServices = EndpointStore.getInstance().getRegisteredEndpoints();
            for (EndpointService endpointService : endpointServices) {
                if (isTemplateAdd && endpointService.canAddAsTemplate()) {
        
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td width=\"155px\">\n");
          out.write("                <a class=\"icon-link\"\n");
          out.write("                   href=\"");
          out.print(endpointService.getUIPageName());
          out.write("Endpoint.jsp?");
          out.print(fullQueryString);
          out.write("\"\n");
          out.write("                   style=\"background-image: url(../admin/images/add.gif);\">\n");
          out.write("                    ");
          out.print(endpointService.getDisplayName());
          out.write(" Template\n");
          out.write("                </a>\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                ");
          out.print(endpointService.getDescription());
          out.write("\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
 } else if (!isTemplateAdd) { 
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td width=\"155px\">\n");
          out.write("                <a class=\"icon-link\"\n");
          out.write("                   href=\"");
          out.print(endpointService.getUIPageName());
          out.write("Endpoint.jsp?");
          out.print(fullQueryString);
          out.write("\"\n");
          out.write("                   style=\"background-image: url(../admin/images/add.gif);\">\n");
          out.write("                    ");
          out.print(endpointService.getDisplayName() );
          out.write("\n");
          out.write("                </a>\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                ");
          out.print(endpointService.getDescription());
          out.write("\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
 }
        }
        
          out.write("\n");
          out.write("        <tr id=\"btnRow\" style=\"");
          out.print(isAnonymous?"":"display:none");
          out.write("\">\n");
          out.write("            <td colspan=\"2\" class=\"buttonRow\">\n");
          out.write("                <input id=\"cancelBtn\" type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"\n");
          out.write("                       class=\"button\"\n");
          out.write("                       onclick=\"goBack('");
          out.print(anonymousOriginator);
          out.write("');return false\"/>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("    </table>\n");
          out.write("</div>\n");
 if (!isAnonymous) { //hide tabs during anonymous mode
          out.write("\n");
          out.write("</div>\n");
}
          out.write("\n");
          out.write("</div>\n");
          out.write("</div>\n");
          out.write("\n");
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
    _jspx_th_fmt_message_0.setKey("do.you.want.to.delete.the.endpoint");
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
    _jspx_th_fmt_message_1.setKey("do.you.want.to.delete.the.endpoint");
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
    _jspx_th_fmt_message_2.setKey("manage.endpoints.template");
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
    _jspx_th_fmt_message_3.setKey("manage.endpoints");
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
    _jspx_th_fmt_message_4.setKey("create.anon.endpoint");
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
    _jspx_th_fmt_message_5.setKey("defined.endpoints");
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
    _jspx_th_fmt_message_6.setKey("dynamic.endpoints");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
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
    _jspx_th_fmt_message_8.setKey("search.endPoint");
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
    _jspx_th_fmt_message_9.setKey("search");
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
    _jspx_th_fmt_message_10.setKey("search.unable.endPoint");
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
    _jspx_th_fmt_message_11.setKey("no.endpoints.in.synapse.config");
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
    _jspx_th_fmt_message_12.setKey("endpoints.synapse.text");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_13.setKey("endpoint.name");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_14.setKey("type");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_15.setKey("action");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_16.setKey("switch.off");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_17.setKey("switch.on");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_18.setKey("switch.off");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_19.setKey("switch.on");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_20.setKey("disable.statistics");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_21.setKey("enable.statistics");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_22.setKey("enable.statistics");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_23.setKey("disable.statistics");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_24.setKey("edit");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_25.setKey("delete");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_26.setKey("enable.endpoints.in.registry");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_27.setKey("no.endpoints.in.registry");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_28.setKey("endpoints.dynamic.text");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_29.setKey("endpoint.name");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_30.setKey("type");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_31.setKey("action");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_32.setKey("edit");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_33.setKey("delete");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_34.setKey("select.endpoint.type");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_35.setKey("back");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }
}
