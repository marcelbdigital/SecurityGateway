package org.apache.jsp.endpoints;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.synapse.config.xml.XMLConfigConstants;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointService;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointStore;
import org.wso2.carbon.utils.xml.XMLPrettyPrinter;
import javax.xml.namespace.QName;
import java.io.ByteArrayInputStream;

public final class sourceView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\n");
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
      out.write("<script type=\"text/javascript\" src=\"../resources/js/resource_util.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/menu/menu-min.js\"></script>\n");
      out.write("<link type=\"text/css\" href=\"../dialog/js/jqueryui/tabs/ui.all.css\" rel=\"stylesheet\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-1.2.6.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"../dialog/js/jqueryui/tabs/jquery-ui-1.6.custom.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery.cookie.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/endpoint-util.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/form.js\"></script>\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/menu.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");

    String configuration = (String) session.getAttribute("endpointConfiguration");

    String prettyPrintPayload = "";
    if (configuration != null) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(configuration.getBytes());
        XMLPrettyPrinter xmlPrettyPrinter = new XMLPrettyPrinter(inputStream);
        prettyPrintPayload = xmlPrettyPrinter.xmlFormat();
    }

    OMElement epElement = AXIOMUtil.stringToOM(configuration);
    EndpointService epService;

    String templateAdd = (String) session.getAttribute("templateAdd");
    boolean isFromTemplateEditor = session.getAttribute("endpointTemplate") != null ? true : false;
    boolean isTemplateAdd = templateAdd != null && "true".equals(templateAdd) ? true : false;
    if (isFromTemplateEditor) {
        epService = EndpointStore.getInstance().getEndpointService(epElement.getFirstChildWithName(new QName(XMLConfigConstants.SYNAPSE_NAMESPACE, "endpoint")));
    } else {
        epService = EndpointStore.getInstance().getEndpointService(epElement);
    }

    boolean isAnonymous = false;
    String endpointMode = (String) session.getAttribute("epMode");
    String anonymousOriginator = null;
    if (endpointMode != null && "anon".equals(endpointMode)) {
        isAnonymous = true;
        anonymousOriginator = (String) session.getAttribute("anonOriginator");
    }

    String designViewUrl = null;
    if (isTemplateAdd) {
        designViewUrl = epService.getUIPageName() + "Endpoint.jsp?templateAdd=true&origin=source";
    } else {
        designViewUrl = epService.getUIPageName() + "Endpoint.jsp?origin=source";
    }

      out.write('\n');
      out.write('\n');
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
          _jspx_th_carbon_breadcrumb_0.setLabel("source.of.endpoint");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.endpoint.ui.i18n.Resources");
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
          out.write("<script type=\"text/javascript\">\n");
          out.write("\n");
          out.write("    function submitEndpointData() {\n");
          out.write("        document.getElementById(\"xmlPay\").value = editAreaLoader.getValue(\"xmlPay\");\n");
          out.write("        var isValidXML = isValidXml(trim(document.getElementById('xmlPay').value));\n");
          out.write("        if (!isValidXML) {\n");
          out.write("            return false;\n");
          out.write("        }\n");
          out.write("        var epString = encodeCharacters(trim(document.getElementById('xmlPay').value));\n");
          out.write("\n");
          out.write("        jQuery.ajax({\n");
          out.write("                        type: 'POST',\n");
          out.write("                        url: 'updatePages/sourceView-update.jsp',\n");
          out.write("                        data: 'endpointString=' + epString,\n");
          out.write("                        success: function(msg) {\n");
          out.write("                            var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                            if (msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                                CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                            } else {\n");
          out.write("                                directToSubmitPage();\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function submitDynamicEndpointData() {\n");
          out.write("        document.getElementById(\"xmlPay\").value = editAreaLoader.getValue(\"xmlPay\");\n");
          out.write("        var isValidXML = isValidXml(trim(document.getElementById('xmlPay').value));\n");
          out.write("        if (!isValidXML) {\n");
          out.write("            return false;\n");
          out.write("        }\n");
          out.write("        var epString = encodeCharacters(trim(document.getElementById('xmlPay').value));\n");
          out.write("\n");
          out.write("        jQuery.ajax({\n");
          out.write("                        type: 'POST',\n");
          out.write("                        url: 'updatePages/sourceView-update.jsp',\n");
          out.write("                        data: 'endpointString=' + epString,\n");
          out.write("                        success: function(msg) {\n");
          out.write("                            var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                            if (msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                                CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                            } else {\n");
          out.write("                                directToSubmitDynamicEndpointPage();\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function directToSubmitDynamicEndpointPage() {\n");
          out.write("        var key = document.getElementById('synRegKey').value;\n");
          out.write("        var registry;\n");
          out.write("        if (document.getElementById(\"config_reg\").checked == true) {\n");
          out.write("            registry = 'conf';\n");
          out.write("        } else {\n");
          out.write("            registry = 'gov';\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        jQuery.ajax({\n");
          out.write("                        type: 'POST',\n");
          out.write("                        url: 'ajaxprocessors/submitDynamicEndpoint-ajaxprocessor.jsp',\n");
          out.write("                        data: 'registry=' + registry + '&regKey=' + key,\n");
          out.write("                        success: function(msg) {\n");
          out.write("                            var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                            if (msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                                CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                            } else {\n");
          out.write("                                location.href = msg.toString().trim().substring(index + 17);\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function directToSubmitPage() {\n");
          out.write("        jQuery.ajax({\n");
          out.write("                        type: 'POST',\n");
          out.write("                        url: 'ajaxprocessors/submitEndpoint-ajaxprocessor.jsp',\n");
          out.write("                        success: function(msg) {\n");
          out.write("                            var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                            if (msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                                CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                            } else {\n");
          out.write("                                location.href = msg.toString().trim().substring(index + 17);\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function switchToDesign(url) {\n");
          out.write("\n");
          out.write("        document.getElementById(\"xmlPay\").value = editAreaLoader.getValue(\"xmlPay\");\n");
          out.write("        var isValidXML = isValidXml(trim(document.getElementById('xmlPay').value));\n");
          out.write("        if (!isValidXML) {\n");
          out.write("            return false;\n");
          out.write("        }\n");
          out.write("        var epString = encodeCharacters(trim(document.getElementById('xmlPay').value));\n");
          out.write("\n");
          out.write("        jQuery.ajax({\n");
          out.write("                        type: 'POST',\n");
          out.write("                        url: 'updatePages/sourceView-update.jsp',\n");
          out.write("                        data: 'endpointString=' + epString,\n");
          out.write("                        success: function(msg) {\n");
          out.write("                            var index = msg.toString().trim().indexOf('<div>');\n");
          out.write("                            if (msg.toString().trim().indexOf('<div>Error:') == index) {\n");
          out.write("                                CARBON.showErrorDialog(msg.toString().trim().substring(index + 17));\n");
          out.write("                            } else {\n");
          out.write("                                location.href = url;\n");
          out.write("                            }\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showSaveAsForm(show) {\n");
          out.write("        var formElem = document.getElementById('saveAsForm');\n");
          out.write("        if (show) {\n");
          out.write("            formElem.style.display = \"\";\n");
          out.write("        } else {\n");
          out.write("            formElem.style.display = \"none\";\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("    <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("    <div id=\"workArea\">\n");
          out.write("        <form name=\"sourceViewForm\" action=\"\" method=\"POST\">\n");
          out.write("            <input type=\"hidden\" id=\"endpointName\" name=\"endpointName\" value=\"\"/>\n");
          out.write("            <table class=\"styledLeft\">\n");
          out.write("                <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <th>\n");
          out.write("                            <span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </span>\n");
          out.write("                        <a href=\"#\" class=\"icon-link\"\n");
          out.write("                           style=\"background-image: url(images/design-view.gif);\"\n");
          out.write("                           onclick=\"switchToDesign('");
          out.print(designViewUrl);
          out.write("')\"> ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </th>\n");
          out.write("                </tr>\n");
          out.write("                </thead>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <textarea id=\"xmlPay\" name=\"design\"\n");
          out.write("                                  style=\"border: 0px solid rgb(204, 204, 204); width: 99%; height: 275px; margin-top: 5px;\"\n");
          out.write("                                  rows=\"30\">");
          out.print(prettyPrintPayload);
          out.write("\n");
          out.write("                        </textarea>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td class=\"buttonRow\">\n");
          out.write("                        <input type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\"\n");
          out.write("                               name=\"save\" onclick=\"submitEndpointData();\"/>\n");
          out.write("                        ");

                            if (!isAnonymous) {
                        
          out.write("\n");
          out.write("                        <input type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\"\n");
          out.write("                               name=\"save\"\n");
          out.write("                               onclick=\"javascript:showSaveAsForm(true);\"/>\n");
          out.write("                        ");

                            }
                        
          out.write("\n");
          out.write("                        <input type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" name=\"cancel\"\n");
          out.write("                               class=\"button\"\n");
          out.write("                               onclick=\"javascript:cancelEndpointData('");
          out.print(anonymousOriginator);
          out.write("','");
          out.print(isFromTemplateEditor);
          out.write("');\"/>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("            </table>\n");
          out.write("            <div style=\"display:none;\" id=\"saveAsForm\">\n");
          out.write("                <p>&nbsp;</p>\n");
          out.write("                <table class=\"styledLeft\">\n");
          out.write("                    <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th colspan=\"2\">\n");
          out.write("                                <span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("                        </th>\n");
          out.write("                    </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("                    <tr>\n");
          out.write("                        <td>\n");
          out.write("                            <table class=\"normal\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <input type=\"radio\"\n");
          out.write("                                                                                    name=\"registry\"\n");
          out.write("                                                                                    id=\"config_reg\"\n");
          out.write("                                                                                    value=\"conf:\"\n");
          out.write("                                                                                    checked=\"checked\"\n");
          out.write("                                                                                    onclick=\"document.getElementById('reg').innerHTML='conf:';\"/>\n");
          out.write("                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <input type=\"radio\"\n");
          out.write("                                                                                 name=\"registry\"\n");
          out.write("                                                                                 id=\"gov_reg\"\n");
          out.write("                                                                                 value=\"gov:\"\n");
          out.write("                                                                                 onclick=\"document.getElementById('reg').innerHTML='gov:';\"/>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                    <td><span id=\"reg\">conf:</span><input type=\"text\" size=\"75\"\n");
          out.write("                                                                         id=\"synRegKey\"/></td>\n");
          out.write("                                </tr>\n");
          out.write("                            </table>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td class=\"buttonRow\">\n");
          out.write("                            <input type=\"button\" class=\"button\"\n");
          out.write("                                   value=\"");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"saveSynRegButton\"\n");
          out.write("                                   onclick=\"javascript:submitDynamicEndpointData(); return false;\"/>\n");
          out.write("                            <input type=\"button\" class=\"button\"\n");
          out.write("                                   value=\"");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"cancelSynRegButton\"\n");
          out.write("                                   onclick=\"javascript:showSaveAsForm(false); return false;\">\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("            </div>\n");
          out.write("        </form>\n");
          out.write("    </div>\n");
          out.write("</div>\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    editAreaLoader.init({\n");
          out.write("                            id : \"xmlPay\"\n");
          out.write("                            ,syntax: \"xml\"\n");
          out.write("                            ,start_highlight: true\n");
          out.write("                        });\n");
          out.write("</script>\n");
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
    _jspx_th_fmt_message_0.setKey("source.of.endpoint");
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
    _jspx_th_fmt_message_1.setKey("source.of.endpoint");
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
    _jspx_th_fmt_message_2.setKey("switch.to.design.view");
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
    _jspx_th_fmt_message_3.setKey("save");
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
    _jspx_th_fmt_message_4.setKey("saveas");
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
    _jspx_th_fmt_message_5.setKey("cancel");
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
    _jspx_th_fmt_message_6.setKey("save.as.title");
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
    _jspx_th_fmt_message_7.setKey("save.in");
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
    _jspx_th_fmt_message_8.setKey("config.registry");
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
    _jspx_th_fmt_message_9.setKey("gov.registry");
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
    _jspx_th_fmt_message_10.setKey("registry.key");
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
    _jspx_th_fmt_message_11.setKey("save");
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
    _jspx_th_fmt_message_12.setKey("cancel");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }
}
