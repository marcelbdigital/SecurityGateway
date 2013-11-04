package org.apache.jsp.bam_002dmediator_002dconfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.mediator.bam.config.ui.BamServerProfileUtils;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.mediator.bam.config.BamServerConfig;
import org.wso2.carbon.mediator.bam.config.stream.StreamConfiguration;
import java.util.List;

public final class configure_005fserver_005fprofiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public static final String PROPERTY_VALUES = "propertyValues";
    public static final String PROPERTY_KEYS = "propertyKeys";
    public static final String STREAM_NAMES = "streamNames";
    public static final String STREAM_VERSIONS = "streamVersions";
    public static final String STREAM_NICKNAME = "streamNickname";
    public static final String STREAM_DESCRIPTION = "streamDescription";
    public static final String SERVER_PROFILE_LOCATION = "bamServerProfiles";

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.release();
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

    response.setHeader("Cache-Control", "no-cache");
    String labelName = request.getParameter("txtServerProfileLocation");
    if(!(labelName != null && !labelName.equals(""))){
        labelName = "New Profile";
    }

      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.mediator.bam.config.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write('\n');
          out.write('\n');
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.mediator.bam.config.ui.i18n.Resources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("bamjsi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write('\n');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel(labelName);
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.mediator.bam.config.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write('\n');
          out.write('\n');
          out.write('\n');
          out.write('\n');

    String userName = "";
    String password = "";
    String urlSet = "";
    String ip = "";
    String authenticationPort = "";
    String receiverPort = "";
    String security = "true";
    String loadbalancer = "false";
    String serverProfileLocation = "";
    String serverProfileName = "";
    String action = "";
    String force = "false";
    String streamTable = "";

    BamServerConfig bamServerConfig = new BamServerConfig();
    List<StreamConfiguration> streamConfigurations;

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    BamServerProfileUtils bamServerProfileUtils =
            new BamServerProfileUtils(cookie, backendServerURL, configContext, request.getLocale());

    String tmpUserName = request.getParameter("txtUsername");
    if(tmpUserName != null && !tmpUserName.equals("")){
        userName = tmpUserName;
    }


    String tmpPassword = request.getParameter("txtPassword");
    if(tmpPassword != null && !tmpPassword.equals("")){
        password = tmpPassword;
    }

    String tmpUrlSet = request.getParameter("urlSet");
    if(tmpUrlSet != null && !tmpUrlSet.equals("")){
        urlSet = tmpUrlSet;
    }

    String tmpIp = request.getParameter("txtIp");
    if(tmpIp != null && !tmpIp.equals("")){
        ip = tmpIp;
    }

    String tmpAuthPort = request.getParameter("authPort");
    if(tmpAuthPort != null && !tmpAuthPort.equals("")){
        authenticationPort = tmpAuthPort;
    }

    String tmpReceiverPort = request.getParameter("receiverPort");
    if(tmpReceiverPort != null && !tmpReceiverPort.equals("")){
        receiverPort = tmpReceiverPort;
    }

    String tmpSecurity = request.getParameter("security");
    if(tmpSecurity !=null && !tmpSecurity.equals("")){
        security = tmpSecurity;
    }
    
    String tmpLoadbalancer = request.getParameter("loadbalancer");
    if(tmpLoadbalancer != null && !tmpLoadbalancer.equals("")){
        loadbalancer = tmpLoadbalancer;
    }

    String tmpStreamTable = request.getParameter("hfStreamTableData");
    if(tmpStreamTable != null && !tmpStreamTable.equals("")){
        streamTable = tmpStreamTable;
    }
    
    String tmpForce = request.getParameter("force");
    if(tmpForce != null && !tmpForce.equals("")){
        force = tmpForce;
    }


    String tmpServerProfileName = request.getParameter("txtServerProfileLocation");
    if(bamServerProfileUtils.isNotNullOrEmpty(tmpServerProfileName)){
        serverProfileName = tmpServerProfileName;
        serverProfileLocation = SERVER_PROFILE_LOCATION + "/" + serverProfileName;
    }

    String tmpAction = request.getParameter("hfAction");
    if(bamServerProfileUtils.isNotNullOrEmpty(tmpAction)){
        action = tmpAction;
    }

    
          out.write("\n");
          out.write("        <style type=\"text/css\">\n");
          out.write("            .no-border-all{\n");
          out.write("                border: none!important;\n");
          out.write("            }\n");
          out.write("            .no-border-all td{\n");
          out.write("                border: none!important;\n");
          out.write("            }\n");
          out.write("        </style>\n");
          out.write("        <script id=\"source\" type=\"text/javascript\">\n");
          out.write("\n");
          out.write("            function onSecurityChanged(){\n");
          out.write("                var securityEnabled = document.getElementById(\"security\");\n");
          out.write("                var receiverPortTr = document.getElementById(\"receiverPortTr\");\n");
          out.write("                if(document.getElementById(\"isSecured\").checked){\n");
          out.write("                    securityEnabled.value = \"true\";\n");
          out.write("                    receiverPortTr.style.display = \"none\";\n");
          out.write("                } else {\n");
          out.write("                    securityEnabled.value = \"false\";\n");
          out.write("                    receiverPortTr.style.display = \"\";\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function onLoadBalancingChanged(){\n");
          out.write("                var loadBalancingEnabled = document.getElementById(\"loadbalancer\");\n");
          out.write("                if(document.getElementById(\"isLoadBalanced\").checked){\n");
          out.write("                    loadBalancingEnabled.value = \"true\";\n");
          out.write("                    jQuery(\".transportSingleUrlTr\").hide();\n");
          out.write("                    jQuery(\".transportMultipleUrlsTr\").show();\n");
          out.write("                } else {\n");
          out.write("                    loadBalancingEnabled.value = \"false\";\n");
          out.write("                    jQuery(\".transportSingleUrlTr\").show();\n");
          out.write("                    jQuery(\".transportMultipleUrlsTr\").hide();\n");
          out.write("                }\n");
          out.write("                onSecurityChanged();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function onReceiverPortBlur(){\n");
          out.write("                var receiverPortInput = document.getElementById(\"receiverPort\");\n");
          out.write("                var authPortInput = document.getElementById(\"authPort\");\n");
          out.write("                if(authPortInput.value == \"\"){\n");
          out.write("                    authPortInput.value = (parseInt(receiverPortInput.value) + 100).toString();\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function loadServerProfiles(serverProfileLocationPath, serverProfilePath) {\n");
          out.write("                jQuery.ajax({\n");
          out.write("                                type:\"GET\",\n");
          out.write("                                url:\"../bam-mediator-config/dropdown_ajaxprocessor.jsp\",\n");
          out.write("                                data:{action:\"getServerProfiles\", serverProfilePath:serverProfileLocationPath},\n");
          out.write("                                success:function(data){\n");
          out.write("                                    document.getElementById(\"serverProfileList\").innerHTML = \"\";\n");
          out.write("                                    jQuery(\"#serverProfileList\").append(\"<option>- Select Server Profile -</option>\");\n");
          out.write("                                    jQuery(\"#serverProfileList\").append(data);\n");
          out.write("                                    if(serverProfilePath != null && serverProfilePath != \"\"){\n");
          out.write("                                        document.getElementById(\"serverProfileList\").value = serverProfilePath;\n");
          out.write("                                    }\n");
          out.write("                                }\n");
          out.write("                            })\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function onServerProfileSelected(parentPath){\n");
          out.write("                document.getElementById('txtServerProfileLocation').value = document.getElementById('serverProfileList').value;\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function showConfigRegistryBrowser(id, path) {\n");
          out.write("                elementId = id;\n");
          out.write("                rootPath = path;\n");
          out.write("                showResourceTree(id, setValue , path);\n");
          out.write("            }\n");
          out.write("\n");
          out.write("\n");
          out.write("            var commonParameterString = \"txtUsername=\" + \"");
          out.print(request.getParameter("txtUsername"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"txtPassword=\" + \"");
          out.print(request.getParameter("txtPassword"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"urlSet=\" + \"");
          out.print(request.getParameter("urlSet"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"txtIp=\" + \"");
          out.print(request.getParameter("txtIp"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"authPort=\" + \"");
          out.print(request.getParameter("authPort"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"receiverPort=\" + \"");
          out.print(request.getParameter("receiverPort"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"security=\" + \"");
          out.print(request.getParameter("security"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"loadbalancer=\" + \"");
          out.print(request.getParameter("loadbalancer"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"hfStreamTableData=\" + \"");
          out.print(request.getParameter("hfStreamTableData"));
          out.write("\" + \"&\"\n");
          out.write("                                                + \"txtServerProfileLocation=\" + \"");
          out.print(request.getParameter("txtServerProfileLocation"));
          out.write("\";\n");
          out.write("\n");
          out.write("            function saveOverwrite(){\n");
          out.write("                window.location.href = \"configure_server_profiles.jsp?\" + commonParameterString + \"&hfAction=save&force=true\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function removeOverwrite(){\n");
          out.write("                window.location.href = \"configure_server_profiles.jsp?\" + commonParameterString + \"&hfAction=remove&force=true\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function reloadPage(){\n");
          out.write("                window.location.href = \"configure_server_profiles.jsp?\" + commonParameterString + \"&hfAction=load\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function showHideDiv(divId) {\n");
          out.write("                var theDiv = document.getElementById(divId);\n");
          out.write("                if (theDiv.style.display == \"none\") {\n");
          out.write("                    theDiv.style.display = \"\";\n");
          out.write("                } else {\n");
          out.write("                    theDiv.style.display = \"none\";\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            var streamRowNum = 1;\n");
          out.write("            var propertyRowNum = 1;\n");
          out.write("\n");
          out.write("            function validatePropertyTable(){\n");
          out.write("                var propertyRowInputs = document.getElementById(\"propertyTable\").getElementsByTagName(\"input\");\n");
          out.write("                var inputName = \"\";\n");
          out.write("                for(var i=0; i<propertyRowInputs.length; i++){\n");
          out.write("                    inputName = propertyRowInputs[i].name;\n");
          out.write("                    if((inputName == \"");
          out.print(PROPERTY_KEYS);
          out.write("\" || inputName == \"");
          out.print(PROPERTY_VALUES);
          out.write("\") && propertyRowInputs[i].value == \"\"){\n");
          out.write("                        return \"Property Name or Property Value cannot be empty.\";\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                return \"true\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function onAddPropertyClicked(){\n");
          out.write("                var result = validatePropertyTable();\n");
          out.write("                if(result == \"true\"){\n");
          out.write("                    addPropertyRow();\n");
          out.write("                } else {\n");
          out.write("                    CARBON.showInfoDialog(result);\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function addPropertyRow() {\n");
          out.write("                propertyRowNum++;\n");
          out.write("                var sId = \"propertyTable_\" + propertyRowNum;\n");
          out.write("\n");
          out.write("                var tableContent = \"<tr id=\\\"\" + sId + \"\\\">\" +\n");
          out.write("                                   \"<td>\\n\" +\n");
          out.write("                                   \"                        <input type=\\\"text\\\" name=\\\"");
          out.print(PROPERTY_KEYS);
          out.write("\\\" value=\\\"\\\">\\n\" +\n");
          out.write("                                   \"                    </td>\\n\" +\n");
          out.write("                                   \"                    <td>\\n\" +\n");
          out.write("                                   \"<table class=\\\"no-border-all\\\">\" +\n");
          out.write("                                   \"         <tr> \" +\n");
          out.write("                                   \"         <td> \" +\n");
          out.write("                                   \"         <table> \" +\n");
          out.write("                                   \"         <tr> \" +\n");
          out.write("                                   \"         <td><input type=\\\"radio\\\" name=\\\"fieldType_\" + sId + \"\\\" value=\\\"value\\\" checked=\\\"checked\\\"/></td> \" +\n");
          out.write("                                   \"          <td>Value</td> \" +\n");
          out.write("                                   \"         <tr> \" +\n");
          out.write("                                   \"         <tr> \" +\n");
          out.write("                                   \"         <td><input type=\\\"radio\\\" name=\\\"fieldType_\" + sId + \"\\\" value=\\\"expression\\\"/></td> \" +\n");
          out.write("                                   \"       <td>Expression</td> \" +\n");
          out.write("                                   \"         <tr> \" +\n");
          out.write("                                   \"       </table> \" +\n");
          out.write("                                   \"       </td> \" +\n");
          out.write("                                   \"         <td> \" +\n");
          out.write("                                   \"<input type=\\\"text\\\" name=\\\"");
          out.print(PROPERTY_VALUES);
          out.write("\\\" value=\\\"\\\"/>\" +\n");
          out.write("                                   \"         </td> \" +\n");
          out.write("                                   \"         </tr> \" +\n");
          out.write("                                   \"         </table> \" +\n");
          out.write("                                   \"         </td> \" +\n");
          out.write("\n");
          out.write("                                   \"<td>\" +\n");
          out.write("                                   \"<select id=\\\"propertyType_\" + sId + \"\\\">\" +\n");
          out.write("                                   \"<option value=\\\"STRING\\\" selected=\\\"selected\\\" >STRING</option>\" +\n");
          out.write("                                   \"<option value=\\\"INTEGER\\\">INTEGER</option>\" +\n");
          out.write("                                   \"<option value=\\\"BOOLEAN\\\">BOOLEAN</option>\" +\n");
          out.write("                                   \"<option value=\\\"DOUBLE\\\">DOUBLE</option>\" +\n");
          out.write("                                   \"<option value=\\\"FLOAT\\\">FLOAT</option>\" +\n");
          out.write("                                   \"<option value=\\\"LONG\\\">LONG</option>\" +\n");
          out.write("                                   \"</select>\" +\n");
          out.write("                                   \"</td>\" +\n");
          out.write("\n");
          out.write("                                   \"<td> \" +\n");
          out.write("                                   \"<a onClick='javaScript:removePropertyColumn(\\\"\" + sId + \"\\\")' style='background-image: url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Property</a> \" +\n");
          out.write("                                   \"</td> \" +\n");
          out.write("                                   \"</tr>;\" ;\n");
          out.write("\n");
          out.write("                jQuery(\"#propertyTable\").append(tableContent);\n");
          out.write("                updatePropertyTableData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function validateStreamsTable(){\n");
          out.write("                var streamRowInputs = document.getElementById(\"streamTable\").getElementsByTagName(\"input\");\n");
          out.write("                var inputName = \"\";\n");
          out.write("                for(var i=0; i<streamRowInputs.length; i++){\n");
          out.write("                    inputName = streamRowInputs[i].name;\n");
          out.write("                    if((inputName == \"");
          out.print(STREAM_NAMES);
          out.write("\" || inputName == \"");
          out.print(STREAM_VERSIONS);
          out.write("\"\n");
          out.write("                               || inputName == \"");
          out.print(STREAM_NICKNAME);
          out.write("\" ||  inputName == \"");
          out.print(STREAM_DESCRIPTION);
          out.write("\") && streamRowInputs[i].value == \"\"){\n");
          out.write("                        return \"Stream Name, Stream Version, Nick Name or Description cannot be empty.\";\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                return \"true\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function addStreamRow() {\n");
          out.write("                var validationResult = validateStreamsTable();\n");
          out.write("                if(validationResult == \"true\"){\n");
          out.write("                    streamRowNum++;\n");
          out.write("                    var sId = \"streamsTable_\" + streamRowNum;\n");
          out.write("                    var tableContent = \"<tr id=\\\"\" + sId + \"\\\">\" +\n");
          out.write("                                       \"<td>\\n\" +\n");
          out.write("                                       \"<input type=\\\"text\\\" name=\\\"");
          out.print(STREAM_NAMES);
          out.write("\\\" value=\\\"\\\">\\n\" +\n");
          out.write("                                       \"</td>\\n\" +\n");
          out.write("                                       \"<td>\\n\" +\n");
          out.write("                                       \"<input type=\\\"text\\\" name=\\\"");
          out.print(STREAM_VERSIONS);
          out.write("\\\" value=\\\"\\\">\\n\" +\n");
          out.write("                                       \"</td>\" +\n");
          out.write("                                       \"<td>\\n\" +\n");
          out.write("                                       \"<input type=\\\"text\\\" name=\\\"");
          out.print(STREAM_NICKNAME);
          out.write("\\\" value=\\\"\\\">\\n\" +\n");
          out.write("                                       \"</td>\\n\" +\n");
          out.write("                                       \"<td>\\n\" +\n");
          out.write("                                       \"<input type=\\\"text\\\" name=\\\"");
          out.print(STREAM_DESCRIPTION);
          out.write("\\\" value=\\\"\\\">\\n\" +\n");
          out.write("                                       \"</td>\" +\n");
          out.write("                                       \"<td>\\n\" +\n");
          out.write("                                       \"<span><a onClick='javaScript:removeStreamColumn(\\\"\" + sId + \"\\\")'\" +\n");
          out.write("                                       \"style='background-image: url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Stream</a></span>\\n\" +\n");
          out.write("                                       \"<span><a onClick='javaScript:editStreamData(\\\"\" + streamRowNum + \"\\\")'\" +\n");
          out.write("                                       \"style='background-image: url(../admin/images/edit.gif);'class='icon-link addIcon'>Edit Stream</a></span>\\n\" +\n");
          out.write("                                       \"<input type=\\\"hidden\\\" id=\\\"hfStreamsTable_\" + streamRowNum + \"\\\" value=\\\"\\\"/>\"\n");
          out.write("                    \"</td>\" +\n");
          out.write("                    \"</tr>\";\n");
          out.write("\n");
          out.write("                    jQuery(\"#streamTable\").append(tableContent);\n");
          out.write("                    updateStreamTableData();\n");
          out.write("                } else {\n");
          out.write("                    CARBON.showInfoDialog(validationResult);\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function removeStreamColumn(id) {\n");
          out.write("                jQuery(\"#\" + id).remove();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function removePropertyColumn(id) {\n");
          out.write("                jQuery(\"#\" + id).remove();\n");
          out.write("                updatePropertyTableData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function updatePropertyTableData(){\n");
          out.write("                var tableData = \"\", inputs, lists, numOfInputs;\n");
          out.write("                inputs = document.getElementById(\"propertyTable\").getElementsByTagName(\"input\");\n");
          out.write("                lists = document.getElementById(\"propertyTable\").getElementsByTagName(\"select\");\n");
          out.write("                numOfInputs = inputs.length;\n");
          out.write("                for(var i=0; i<numOfInputs; i=i+4){\n");
          out.write("                    if(inputs[i].value != \"\" && inputs[i+3].value != \"\"){\n");
          out.write("                        tableData = tableData + inputs[i].value + \"::\" + inputs[i+3].value + \"::\" + lists[i/4].value;\n");
          out.write("                        if(inputs[i+1].checked){\n");
          out.write("                            tableData = tableData + \"::\" + \"value\";\n");
          out.write("                        } else {\n");
          out.write("                            tableData = tableData + \"::\" + \"expression\";\n");
          out.write("                        }\n");
          out.write("                        tableData = tableData + \";\";\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                document.getElementById(\"hfPropertyTableData\").value = tableData;\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function savePropertyTableData(){\n");
          out.write("                updatePropertyTableData();\n");
          out.write("                var streamRowNumber = document.getElementById(\"hfStreamTableRowNumber\").value;\n");
          out.write("                document.getElementById(\"hfStreamsTable_\" + streamRowNumber).value = document.getElementById(\"hfPropertyTableData\").value;\n");
          out.write("                document.getElementById(\"propertiesTr\").style.display = \"none\";\n");
          out.write("                jQuery(\"#streamsTable_\" + document.getElementById(\"hfStreamTableRowNumber\").value).css(\"background-color\",\"\");\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function saveDumpData(){\n");
          out.write("                var data = \"\";\n");
          out.write("                if(document.getElementById(\"mHeader\").checked){\n");
          out.write("                    data = \"dump\";\n");
          out.write("                } else{\n");
          out.write("                    data = \"notDump\";\n");
          out.write("                }\n");
          out.write("                data = data + \";\";\n");
          out.write("                if(document.getElementById(\"mBody\").checked){\n");
          out.write("                    data = data + \"dump\";\n");
          out.write("                } else{\n");
          out.write("                    data = data + \"notDump\";\n");
          out.write("                }\n");
          out.write("                var streamRowNumber = document.getElementById(\"hfStreamTableRowNumber\").value;\n");
          out.write("                document.getElementById(\"hfStreamsTable_\" + streamRowNumber).value = document.getElementById(\"hfStreamsTable_\" + streamRowNumber).value + \"^\" + data;\n");
          out.write("                document.getElementById(\"mHeader\").checked = \"checked\";\n");
          out.write("                document.getElementById(\"mBody\").checked = \"checked\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function savePropertiesData(){\n");
          out.write("                savePropertyTableData();\n");
          out.write("                saveDumpData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function editStreamData(rowNumber){\n");
          out.write("                jQuery(\"#streamsTable_\" + document.getElementById(\"hfStreamTableRowNumber\").value).css(\"background-color\",\"\");\n");
          out.write("                jQuery(\"#streamsTable_\" + rowNumber).css(\"background-color\",\"rgb(234,234,255)\");\n");
          out.write("                document.getElementById(\"propertiesTr\").style.display = \"\";\n");
          out.write("                document.getElementById(\"hfStreamTableRowNumber\").value = rowNumber;\n");
          out.write("                loadPropertyDataTable();\n");
          out.write("                loadDumpData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function loadPropertyDataTable(){\n");
          out.write("                emptyPropertyTable();\n");
          out.write("                var rowNumber =  document.getElementById(\"hfStreamTableRowNumber\").value;\n");
          out.write("                var configDataString = document.getElementById(\"streamsTable_\" + rowNumber).getElementsByTagName(\"input\")[4].value;\n");
          out.write("                var propertyDataString = configDataString.split(\"^\")[0];\n");
          out.write("                var propertyDataArray = propertyDataString.split(\";\");\n");
          out.write("                var numOfProperties = 0;\n");
          out.write("                for(var i=0; i<propertyDataArray.length; i++){\n");
          out.write("                    if(propertyDataArray[i] != \"\"){\n");
          out.write("                        addPropertyRow();\n");
          out.write("                        numOfProperties++;\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("\n");
          out.write("                for(var i=0; i<numOfProperties; i=i+1){\n");
          out.write("                    if(propertyDataArray[i].split(\"::\").length == 4){\n");
          out.write("                        jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[4*i].value = propertyDataArray[i].split(\"::\")[0];\n");
          out.write("                        jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[4*i+3].value = propertyDataArray[i].split(\"::\")[1];\n");
          out.write("                        jQuery(\"#propertyTable\").find(\"tr\").find(\"select\")[i].value = propertyDataArray[i].split(\"::\")[2];\n");
          out.write("                        if(propertyDataArray[i].split(\"::\")[3] == \"value\"){\n");
          out.write("                            jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[4*i+1].checked = true;\n");
          out.write("                        } else if(propertyDataArray[i].split(\"::\")[3] == \"expression\"){\n");
          out.write("                            jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[4*i+2].checked = true;\n");
          out.write("                        }\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                updatePropertyTableData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function loadDumpData(){\n");
          out.write("                cancelDumpData();\n");
          out.write("                var rowNumber =  document.getElementById(\"hfStreamTableRowNumber\").value;\n");
          out.write("                var configDataString = document.getElementById(\"streamsTable_\" + rowNumber).getElementsByTagName(\"input\")[4].value;\n");
          out.write("                var dumpDataString = \"\";\n");
          out.write("                if(configDataString.split(\"^\").length == 2){\n");
          out.write("                    dumpDataString = configDataString.split(\"^\")[1];\n");
          out.write("                    var dumpDataArray = dumpDataString.split(\";\");\n");
          out.write("                    if(dumpDataArray.length == 2){\n");
          out.write("                        if(dumpDataArray[0] == \"dump\"){\n");
          out.write("                            document.getElementById(\"mHeader\").checked = \"checked\";\n");
          out.write("                        } else {\n");
          out.write("                            document.getElementById(\"mHeader\").checked = \"\";\n");
          out.write("                        }\n");
          out.write("                        if(dumpDataArray[1] == \"dump\"){\n");
          out.write("                            document.getElementById(\"mBody\").checked = \"checked\";\n");
          out.write("                        } else {\n");
          out.write("                            document.getElementById(\"mBody\").checked = \"\";\n");
          out.write("                        }\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function emptyPropertyTable(){\n");
          out.write("                document.getElementById(\"hfPropertyTableData\").value = \"\";\n");
          out.write("                jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[0].value = \"\";\n");
          out.write("                jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[3].value = \"\";\n");
          out.write("                jQuery(\"#propertyTable\").find(\"tr\").find(\"select\")[0].value = \"STRING\";\n");
          out.write("                jQuery(\"#propertyTable\").find(\"tr\").find(\"input\")[1].checked = true;\n");
          out.write("                var tableRowNumber = jQuery(\"#propertyTable\").find(\"tr\").length;\n");
          out.write("                var isFirstRow = true;\n");
          out.write("                //var firstRowId = \"\";\n");
          out.write("                var currentRowId;\n");
          out.write("                var trArray = new Array();\n");
          out.write("                for(var i=0; i<tableRowNumber; i=i+1){\n");
          out.write("                    currentRowId = jQuery(\"#propertyTable\").find(\"tr\")[i].id;\n");
          out.write("                    if(currentRowId.split(\"_\")[0] == \"propertyTable\"){\n");
          out.write("                        if(!isFirstRow){\n");
          out.write("                            //jQuery(\"#\" + currentRowId).remove();\n");
          out.write("                            trArray.push(currentRowId);\n");
          out.write("                        }\n");
          out.write("                        isFirstRow = false;\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                for(var i=0; i<trArray.length; i++){\n");
          out.write("                    jQuery(\"#\" + trArray[i]).remove();\n");
          out.write("                }\n");
          out.write("\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function cancelPropertyTableData(){\n");
          out.write("                emptyPropertyTable();\n");
          out.write("                document.getElementById(\"propertiesTr\").style.display = \"none\";\n");
          out.write("                jQuery(\"#streamsTable_\" + document.getElementById(\"hfStreamTableRowNumber\").value).css(\"background-color\",\"\");\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function cancelDumpData(){\n");
          out.write("                document.getElementById(\"mHeader\").checked = \"checked\";\n");
          out.write("                document.getElementById(\"mBody\").checked = \"checked\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function cancelStreamData(){\n");
          out.write("                cancelPropertyTableData();\n");
          out.write("                cancelDumpData();\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function updateStreamTableData(){\n");
          out.write("                var tableData = \"\", inputs, numOfInputs;\n");
          out.write("                inputs = document.getElementById(\"streamTable\").getElementsByTagName(\"input\");\n");
          out.write("                numOfInputs = inputs.length;\n");
          out.write("                for(var i=0; i<numOfInputs; i=i+5){\n");
          out.write("                    if(inputs[i].value != \"\" && inputs[i+1].value != \"\"){\n");
          out.write("                        if(i != 0){\n");
          out.write("                            tableData = tableData + \"~\";\n");
          out.write("                        }\n");
          out.write("                        tableData = tableData + inputs[i].value + \"^\"\n");
          out.write("                                            + inputs[i+1].value + \"^\" + inputs[i+2].value + \"^\"\n");
          out.write("                                            + inputs[i+3].value + \"^\" + inputs[i+4].value;\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("                document.getElementById(\"hfStreamTableData\").value = tableData;\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function submitPage(){\n");
          out.write("                updateStreamTableData();\n");
          out.write("                document.getElementById('hfAction').value='save';\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function testServer(){\n");
          out.write("                var serverIp = document.getElementById('txtIp').value;\n");
          out.write("                var authPort = document.getElementById('authPort').value;\n");
          out.write("\n");
          out.write("                if(!(serverIp != null && serverIp != \"\")){\n");
          out.write("                    CARBON.showInfoDialog(\"Please enter the IP address.\");\n");
          out.write("                } else if(!(authPort != null && authPort != \"\")){\n");
          out.write("                    CARBON.showInfoDialog(\"Please enter the Authentication Port.\");\n");
          out.write("                } else{\n");
          out.write("                    jQuery.ajax({\n");
          out.write("                                    type:\"GET\",\n");
          out.write("                                    url:\"../bam-mediator-config/dropdown_ajaxprocessor.jsp\",\n");
          out.write("                                    data:{action:\"testServer\", ip:serverIp, port:authPort},\n");
          out.write("                                    success:function(data){\n");
          out.write("                                        if(data != null && data != \"\"){\n");
          out.write("                                            var result = data.replace(/\\n+/g, '');\n");
          out.write("                                            if(result == \"true\"){\n");
          out.write("                                                CARBON.showInfoDialog(\"Successfully connected to BAM Server.\");\n");
          out.write("                                            } else if(result == \"false\"){\n");
          out.write("                                                CARBON.showErrorDialog(\"BAM Server cannot be connected!\")\n");
          out.write("                                            }\n");
          out.write("                                        }\n");
          out.write("                                    }\n");
          out.write("                                });\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        </script>\n");
          out.write("\n");
          out.write("\n");
          out.write("    ");


    if(!bamServerProfileUtils.resourceAlreadyExists(SERVER_PROFILE_LOCATION)){
        bamServerProfileUtils.addCollection(SERVER_PROFILE_LOCATION);
    }

    if("save".equals(action) && !"true".equals(force) && bamServerProfileUtils.resourceAlreadyExists(serverProfileLocation)){
        
          out.write("\n");
          out.write("\n");
          out.write("            <script>\n");
          out.write("                CARBON.showConfirmationDialog(\"Are you sure you want to overwrite the existing Server Profile Configuration?\", saveOverwrite, reloadPage, true);\n");
          out.write("            </script>\n");
          out.write("\n");
          out.write("        ");

    }

    else if("remove".equals(action) && !"true".equals(force) && bamServerProfileUtils.resourceAlreadyExists(serverProfileLocation)){
        
          out.write("\n");
          out.write("\n");
          out.write("            <script>\n");
          out.write("                CARBON.showConfirmationDialog(\"Are you sure you want to remove the existing Server Profile Configuration?\", removeOverwrite, reloadPage, true);\n");
          out.write("            </script>\n");
          out.write("\n");
          out.write("        ");

    }

    else if("load".equals(action)){  // loading an existing configuration
        if(bamServerProfileUtils.isNotNullOrEmpty(tmpServerProfileName)){
            serverProfileName = tmpServerProfileName;
            serverProfileLocation = SERVER_PROFILE_LOCATION + "/" + serverProfileName;
            if(bamServerProfileUtils.resourceAlreadyExists(serverProfileLocation)){
                bamServerConfig = bamServerProfileUtils.getResource(serverProfileLocation);

                userName = bamServerConfig.getUsername();
                password = bamServerProfileUtils.decryptPassword(bamServerConfig.getPassword());
                if(bamServerProfileUtils.isNotNullOrEmpty(bamServerConfig.getUrlSet())){
                    urlSet = bamServerConfig.getUrlSet();
                } else {
                    urlSet = "";
                }
                if(bamServerProfileUtils.isNotNullOrEmpty(bamServerConfig.getIp())){
                    ip = bamServerConfig.getIp();
                } else {
                    ip = "";
                }
                if(bamServerProfileUtils.isNotNullOrEmpty(bamServerConfig.getAuthenticationPort())){
                    authenticationPort = bamServerConfig.getAuthenticationPort();
                } else {
                    authenticationPort = "";
                }
                if(bamServerProfileUtils.isNotNullOrEmpty(bamServerConfig.getReceiverPort())){
                    receiverPort = bamServerConfig.getReceiverPort();
                } else {
                    receiverPort = "";
                }
                if(bamServerConfig.isSecure()){
                    security = "true";
                } else {
                    security = "false";
                }
                if(bamServerConfig.isLoadbalanced()){
                    loadbalancer = "true";
                } else {
                    loadbalancer = "false";
                }
            }
            else {
                
          out.write("\n");
          out.write("\n");
          out.write("                <script type=\"text/javascript\">\n");
          out.write("                    CARBON.showErrorDialog(\"Resource is not existing in the given location!\");\n");
          out.write("                </script>\n");
          out.write("\n");
          out.write("                ");

            }
        }
        else {
            
          out.write("\n");
          out.write("\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                CARBON.showInfoDialog(\"Enter the Server Profile Name.\");\n");
          out.write("            </script>\n");
          out.write("\n");
          out.write("            ");

        }
    }

    /*else if("stay".equals(action)){  // staying in the existing page

    }*/

    else if("remove".equals(action) && !"".equals(serverProfileLocation) && "true".equals(force)){  // staying in the existing page
        bamServerProfileUtils.removeResource(serverProfileLocation);

        
          out.write("\n");
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            CARBON.showInfoDialog(\"Server Profile was successfully deleted.\");\n");
          out.write("        </script>\n");
          out.write("\n");
          out.write("        ");

    }

    else if("save".equals(action) && !"".equals(serverProfileLocation)){ // Saving a configuration
        if("true".equals(force)){ // Saving after confirmation
            bamServerProfileUtils.addResource(urlSet, ip, authenticationPort, receiverPort, userName, password, "true".equals(security), "true".equals(loadbalancer),
                                              streamTable, serverProfileLocation);
            
          out.write("\n");
          out.write("\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                CARBON.showInfoDialog(\"Server Profile was successfully saved.\", reloadPage);\n");
          out.write("            </script>\n");
          out.write("\n");
          out.write("            ");

        }
        else if (!"true".equals(force)){ // Trying to save without confirmation
            if(!bamServerProfileUtils.resourceAlreadyExists(serverProfileLocation)){
                bamServerProfileUtils.addResource(urlSet, ip, authenticationPort, receiverPort, userName, password, "true".equals(security), "true".equals(loadbalancer),
                                                  streamTable, serverProfileLocation);
                
          out.write("\n");
          out.write("\n");
          out.write("                <script type=\"text/javascript\">\n");
          out.write("                    CARBON.showInfoDialog(\"Server Profile was successfully saved.\", reloadPage);\n");
          out.write("                </script>\n");
          out.write("\n");
          out.write("                ");

            }
            else {
                
          out.write("\n");
          out.write("\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        CARBON.showErrorDialog(\"Resource already exists!\", reloadPage);\n");
          out.write("                    </script>\n");
          out.write("\n");
          out.write("                ");

            }
        }

    }


          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("    <h2>\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </h2>\n");
          out.write("\n");
          out.write("    <div id=\"workArea\">\n");
          out.write("        <form action=\"configure_server_profiles.jsp\" method=\"post\">\n");
          out.write("        <table>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <h3>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("\n");
          out.write("                            <td>\n");
          out.write("                                <input class=\"longInput\" type=\"text\"\n");
          out.write("                                       value=\"");
          out.print(serverProfileName);
          out.write("\"\n");
          out.write("                                       id=\"txtServerProfileLocation\" name=\"txtServerProfileLocation\"/>\n");
          out.write("                            </td>\n");
          out.write("                            <td style=\"display: none;\">\n");
          out.write("                                <select name=\"serverProfileList\" id=\"serverProfileList\" onchange=\"onServerProfileSelected('");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("')\">\n");
          out.write("                                    <option>- Select Server Profile -</option>\n");
          out.write("                                </select>\n");
          out.write("                                <script type=\"text/javascript\">\n");
          out.write("                                    loadServerProfiles(\"");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("\", \"");
          out.print(serverProfileLocation);
          out.write("\");\n");
          out.write("                                </script>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td></td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"submit\" value=\"Load Profile\" onclick=\"document.getElementById('hfAction').value='load';\" style=\"display: none;\"/>\n");
          out.write("                    <input type=\"submit\" value=\"Remove Profile\" onclick=\"document.getElementById('hfAction').value='remove';\" style=\"display: none;\"/>\n");
          out.write("                    <input type=\"hidden\" name=\"hfAction\" id=\"hfAction\" value=\"\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <h3>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"text\" name=\"txtUsername\" id=\"txtUsername\" value=\"");
          out.print(userName);
          out.write("\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"password\" name=\"txtPassword\" id=\"txtPassword\" value=\"");
          out.print(password);
          out.write("\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <h3>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td style=\"width:250px;\" >\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"checkbox\" id=\"isLoadBalanced\" name=\"isLoadBalanced\" onchange=\"onLoadBalancingChanged()\"/>\n");
          out.write("                    <input type=\"hidden\" id=\"loadbalancer\" name=\"loadbalancer\" value=\"");
          out.print(loadbalancer);
          out.write("\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr style=\"display: none;\" class=\"transportMultipleUrlsTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"text\" name=\"urlSet\" id=\"urlSet\" value=\"");
          out.print(urlSet);
          out.write("\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr class=\"transportSingleUrlTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <select name=\"transportProtocol\" id=\"transportProtocol\" onchange=\"\">\n");
          out.write("                        <option>Thrift</option>\n");
          out.write("                    </select>\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        document.getElementById(\"transportProtocol\").value = \"Thrift\";\n");
          out.write("                    </script>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr class=\"transportSingleUrlTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"checkbox\" id=\"isSecured\" name=\"isSecured\" checked=\"checked\" onchange=\"onSecurityChanged()\"/>\n");
          out.write("                    <input type=\"hidden\" id=\"security\" name=\"security\" value=\"");
          out.print(security);
          out.write("\"/>\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        if(document.getElementById(\"security\").value == \"false\"){\n");
          out.write("                            document.getElementById(\"isSecured\").checked = \"\";\n");
          out.write("                        }\n");
          out.write("                    </script>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr class=\"transportSingleUrlTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"text\" name=\"txtIp\" id=\"txtIp\" value=\"");
          out.print(ip);
          out.write("\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr id=\"receiverPortTr\" style=\"display: none;\" class=\"transportSingleUrlTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"text\" name=\"receiverPort\" id=\"receiverPort\" value=\"");
          out.print(receiverPort);
          out.write("\" onblur=\"onReceiverPortBlur()\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                if(document.getElementById(\"security\").value == \"false\"){\n");
          out.write("                    document.getElementById(\"receiverPortTr\").style.display = \"\";\n");
          out.write("                }\n");
          out.write("            </script>\n");
          out.write("            <tr class=\"transportSingleUrlTr\">\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"text\" name=\"authPort\" id=\"authPort\" value=\"");
          out.print(authenticationPort);
          out.write("\"/>\n");
          out.write("                    <input type=\"button\" value=\"Test Server\" onclick=\"testServer()\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                document.getElementById(\"isLoadBalanced\").checked = false;\n");
          out.write("                if(document.getElementById(\"loadbalancer\").value == \"true\"){\n");
          out.write("                    document.getElementById(\"isLoadBalanced\").checked = \"checked\";\n");
          out.write("                    onLoadBalancingChanged();\n");
          out.write("                }\n");
          out.write("            </script>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <h3>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr id=\"streamsTr\">\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <input name=\"hfStreamTableData\" id=\"hfStreamTableData\" type=\"hidden\" value=\"\" />\n");
          out.write("                    <table id=\"streamTable\" width=\"100%\" class=\"styledLeft\" style=\"margin-left: 0px;\">\n");
          out.write("                        <thead>\n");
          out.write("                            <tr>\n");
          out.write("                                <th width=\"40%\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </th>\n");
          out.write("                                <th width=\"40%\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </th>\n");
          out.write("                                <th width=\"40%\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </th>\n");
          out.write("                                <th width=\"40%\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </th>\n");
          out.write("                                <th>\n");
          out.write("\n");
          out.write("                                </th>\n");
          out.write("                            </tr>\n");
          out.write("                        </thead>\n");
          out.write("                        <tbody>\n");
          out.write("                            ");

                                if (bamServerConfig.getStreamConfigurations() != null && !bamServerConfig.getStreamConfigurations().isEmpty()) {
                                streamConfigurations = bamServerConfig.getStreamConfigurations();
                                int i = 1;
                                for (StreamConfiguration streamConfiguration : streamConfigurations) {
                            
          out.write("\n");
          out.write("                            <tr id=\"streamsTable_");
          out.print(i);
          out.write("\">\n");
          out.write("                                <td>\n");
          out.write("                                    <input id=\"streamName\" type=\"text\" name=\"");
          out.print(STREAM_NAMES);
          out.write("\" value=\"");
          out.print(streamConfiguration.getName());
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input id=\"streamVersion\" type=\"text\" name=\"");
          out.print(STREAM_VERSIONS);
          out.write("\" value=\"");
          out.print(streamConfiguration.getVersion());
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input id=\"streamNickname\" type=\"text\" name=\"");
          out.print(STREAM_NICKNAME);
          out.write("\" value=\"");
          out.print(streamConfiguration.getNickname());
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input id=\"streamDescription\" type=\"text\" name=\"");
          out.print(STREAM_DESCRIPTION);
          out.write("\" value=\"");
          out.print(streamConfiguration.getDescription());
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                ");
 if (i == 1) { 
          out.write("\n");
          out.write("                                <td><span><a onClick='javaScript:removeStreamColumn(\"streamsTable_");
          out.print(i);
          out.write("\")' style='background-image:\n");
          out.write("                                        url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Stream</a></span>\n");
          out.write("                                    <span><a onClick='javaScript:editStreamData(\"");
          out.print(i);
          out.write("\")' style='background-image:\n");
          out.write("                                        url(../admin/images/edit.gif);'class='icon-link addIcon'>Edit Stream</a></span>\n");
          out.write("                                    <input type=\"hidden\" id=\"hfStreamsTable_");
          out.print(i);
          out.write("\" value=\"");
          out.print(bamServerProfileUtils.getStreamConfigurationListString(streamConfiguration));
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                ");
 } else {  
          out.write("\n");
          out.write("                                <td>\n");
          out.write("                                    <span><a onClick='javaScript:removeStreamColumn(\"streamsTable_");
          out.print(i);
          out.write("\")' style='background-image:\n");
          out.write("                                        url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Stream</a></span>\n");
          out.write("                                    <span><a onClick='javaScript:editStreamData(\"");
          out.print(i);
          out.write("\")' style='background-image:\n");
          out.write("                                        url(../admin/images/edit.gif);'class='icon-link addIcon'>Edit Stream</a></span>\n");
          out.write("                                    <input type=\"hidden\" id=\"hfStreamsTable_");
          out.print(i);
          out.write("\" value=\"");
          out.print(bamServerProfileUtils.getStreamConfigurationListString(streamConfiguration));
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                                ");
 } 
          out.write("\n");
          out.write("\n");
          out.write("                            </tr>\n");
          out.write("                            <script type=\"text/javascript\">\n");
          out.write("                                streamRowNum++;\n");
          out.write("                            </script>\n");
          out.write("                            ");
  i++;
                            }
                            } else { 
          out.write("\n");
          out.write("                            <tr id=\"streamsTable_1\">\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"");
          out.print(STREAM_NAMES);
          out.write("\" value=\"\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"");
          out.print(STREAM_VERSIONS);
          out.write("\" value=\"\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"");
          out.print(STREAM_NICKNAME);
          out.write("\" value=\"\"/>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"");
          out.print(STREAM_DESCRIPTION);
          out.write("\" value=\"\"/>\n");
          out.write("                                </td>\n");
          out.write("\n");
          out.write("                                <td>\n");
          out.write("                                    <span><a onClick='javaScript:removeStreamColumn(\"streamsTable_1\")' style='background-image: url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Stream</a></span>\n");
          out.write("                                    <span><a onClick='javaScript:editStreamData(\"1\")' style='background-image: url(../admin/images/edit.gif);'class='icon-link addIcon'>Edit Stream</a></span>\n");
          out.write("                                    <input type=\"hidden\" id=\"hfStreamsTable_1\" value=\"\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        </tbody>\n");
          out.write("\n");
          out.write("                        ");
 } 
          out.write("\n");
          out.write("                    </table>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <span><a onClick='javaScript:addStreamRow()' style='background-image:\n");
          out.write("                                        url(../admin/images/add.gif);'class='icon-link addIcon'>Add Stream</a></span>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr id=\"propertiesTr\" style=\"display: none;\">\n");
          out.write("                <td colspan=\"2\">\n");
          out.write("                    <input name=\"hfPropertyTableData\" id=\"hfPropertyTableData\" type=\"hidden\" value=\"\" />\n");
          out.write("                    <input id=\"hfStreamTableRowNumber\" type=\"hidden\" value=\"1\" />\n");
          out.write("                    <h3>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("\n");
          out.write("                    <table>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <h4>\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </h4>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <table>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <input type=\"checkbox\" id=\"mHeader\" name=\"mHeader\" checked=\"checked\" value=\"dump\"/>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <input type=\"checkbox\" id=\"mBody\" name=\"mBody\" checked=\"checked\" value=\"dump\"/>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </table>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <h4>\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </h4>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <table id=\"propertyTable\" width=\"100%\" class=\"styledLeft\" style=\"margin-left: 0px;\">\n");
          out.write("                                    <thead>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <th width=\"30%\">\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                        </th>\n");
          out.write("                                        <th width=\"30%\">\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                        </th>\n");
          out.write("                                        <th width=\"30%\">\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                        </th>\n");
          out.write("                                        <th></th>\n");
          out.write("                                    </tr>\n");
          out.write("                                    </thead>\n");
          out.write("                                    <tbody>\n");
          out.write("                                    <tr id=\"propertyTable_1\">\n");
          out.write("                                        <td>\n");
          out.write("                                            <input type=\"text\" name=\"");
          out.print(PROPERTY_KEYS);
          out.write("\" value=\"\"/>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <table class=\"no-border-all\">\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <td>\n");
          out.write("                                                        <table>\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td><input type=\"radio\" name=\"fieldType_1\" value=\"value\" checked=\"checked\"/></td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td><input type=\"radio\" name=\"fieldType_1\" value=\"expression\"/></td>\n");
          out.write("                                                                <td>");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                                            </tr>\n");
          out.write("                                                        </table>\n");
          out.write("                                                    </td>\n");
          out.write("                                                    <td>\n");
          out.write("                                                        <input type=\"text\" name=\"");
          out.print(PROPERTY_VALUES);
          out.write("\" value=\"\"/>\n");
          out.write("                                                    </td>\n");
          out.write("                                                </tr>\n");
          out.write("                                            </table>\n");
          out.write("                                        </td>\n");
          out.write("\n");
          out.write("                                        <td>\n");
          out.write("                                            <select id=\"propertyType_1\">\n");
          out.write("                                                <option value=\"STRING\" selected=\"selected\" >STRING</option>\n");
          out.write("                                                <option value=\"INTEGER\">INTEGER</option>\n");
          out.write("                                                <option value=\"BOOLEAN\">BOOLEAN</option>\n");
          out.write("                                                <option value=\"DOUBLE\">DOUBLE</option>\n");
          out.write("                                                <option value=\"FLOAT\">FLOAT</option>\n");
          out.write("                                                <option value=\"LONG\">LONG</option>\n");
          out.write("                                            </select>\n");
          out.write("                                        </td>\n");
          out.write("\n");
          out.write("                                        <td>\n");
          out.write("                                            <a onClick='javaScript:removePropertyColumn(\"propertyTable_1\")' style='background-image: url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Property</a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    </tbody>\n");
          out.write("                                </table>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <table>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>\n");
          out.write("                                            <span>\n");
          out.write("                                                <a onClick='javaScript:onAddPropertyClicked()' style='background-image: url(../admin/images/add.gif);'class='icon-link addIcon'>Add</a>\n");
          out.write("                                            </span>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <span>\n");
          out.write("                                                <a onClick='javaScript:savePropertiesData()' style='background-image: url(images/save-button.gif);'class='icon-link addIcon'>Update</a>\n");
          out.write("                                            </span>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <span>\n");
          out.write("                                                <a onClick='javaScript:cancelStreamData()' style='background-image: url(../admin/images/cancel.gif);'class='icon-link addIcon'>Cancel</a>\n");
          out.write("                                            </span>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </table>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </table>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <input type=\"submit\" value=\"Save\" onclick=\"submitPage()\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
          out.write("        </form>\n");
          out.write("    </div>\n");
          out.write("</div>\n");
          out.write("\n");
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
    _jspx_th_fmt_message_0.setKey("bam.server.profile");
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
    _jspx_th_fmt_message_1.setKey("server.profile");
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
    _jspx_th_fmt_message_2.setKey("profile.name");
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
    _jspx_th_fmt_message_3.setKey("server.credential");
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
    _jspx_th_fmt_message_4.setKey("username");
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
    _jspx_th_fmt_message_5.setKey("password");
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
    _jspx_th_fmt_message_6.setKey("server.transport");
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
    _jspx_th_fmt_message_7.setKey("enable.loadbalancer");
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
    _jspx_th_fmt_message_8.setKey("url.set");
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
    _jspx_th_fmt_message_9.setKey("protocol");
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
    _jspx_th_fmt_message_10.setKey("enable.security");
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
    _jspx_th_fmt_message_11.setKey("ip");
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
    _jspx_th_fmt_message_12.setKey("receiver.port");
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
    _jspx_th_fmt_message_13.setKey("authentication.port");
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
    _jspx_th_fmt_message_14.setKey("streams.configuration");
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
    _jspx_th_fmt_message_15.setKey("stream.name");
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
    _jspx_th_fmt_message_16.setKey("stream.version");
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
    _jspx_th_fmt_message_17.setKey("stream.nickName");
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
    _jspx_th_fmt_message_18.setKey("stream.description");
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
    _jspx_th_fmt_message_19.setKey("stream.configuration");
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
    _jspx_th_fmt_message_20.setKey("stream.payload");
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
    _jspx_th_fmt_message_21.setKey("dump.header");
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
    _jspx_th_fmt_message_22.setKey("dump.body");
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
    _jspx_th_fmt_message_23.setKey("stream.properties");
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
    _jspx_th_fmt_message_24.setKey("property.name");
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
    _jspx_th_fmt_message_25.setKey("property.value");
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
    _jspx_th_fmt_message_26.setKey("property.type");
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
    _jspx_th_fmt_message_27.setKey("property.field.value");
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
    _jspx_th_fmt_message_28.setKey("property.field.expression");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }
}
