package org.apache.jsp.configadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.mediation.configadmin.ui.ConfigManagementClient;
import org.wso2.carbon.mediation.configadmin.ui.ResponseInformation;
import org.wso2.carbon.ui.CarbonUIMessage;
import java.util.List;
import org.wso2.carbon.mediation.configadmin.stub.types.carbon.ConfigurationInformation;
import java.util.ArrayList;
import java.util.ResourceBundle;
import org.wso2.carbon.mediation.configadmin.stub.types.carbon.ValidationError;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<script type=\"text/javascript\" src=\"global-params.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"configcommon.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"../dialog/js/jqueryui/tabs/ui.all.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-1.2.6.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-ui-1.6.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery.cookie.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Yahoo includes for dom event handling-->\r\n");
      out.write("<script src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var allowTabChange = true;\r\n");
      out.write("    var emtpyEntries = false;\r\n");
      out.write("\r\n");
      out.write("//    $(function() {\r\n");
      out.write("//        var $myTabs = $(\"#tabs\");\r\n");
      out.write("//\r\n");
      out.write("//        $myTabs.tabs({\r\n");
      out.write("//            select: function(event, ui) {\r\n");
      out.write("//                if (!allowTabChange) {\r\n");
      out.write("//                    alert(\"Tab selection is disabled, while you are in the middle of a workflow\");\r\n");
      out.write("//                }\r\n");
      out.write("//                return allowTabChange;\r\n");
      out.write("//            },\r\n");
      out.write("//\r\n");
      out.write("//            show: function(event, ui) {\r\n");
      out.write("//                var selectedTab = $myTabs.tabs('option', 'selected');\r\n");
      out.write("//                allowTabChange = true;\r\n");
      out.write("//            }\r\n");
      out.write("//        });\r\n");
      out.write("//\r\n");
      out.write("//        $myTabs.tabs('select', 0);\r\n");
      out.write("//        if(emtpyEntries){\r\n");
      out.write("//           $myTabs.tabs('select', 1);\r\n");
      out.write("//        }\r\n");
      out.write("//    });\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("//    $(document).ready(function() {\r\n");
      out.write("//        var $tabs = $('#tabs > ul').tabs({ cookie: { expires: 30 } });\r\n");
      out.write("//        $('a', $tabs).click(function() {\r\n");
      out.write("//            if ($(this).parent().hasClass('ui-tabs-selected')) {\r\n");
      out.write("//                $tabs.tabs('load', $('a', $tabs).index(this));\r\n");
      out.write("//            }\r\n");
      out.write("//        });\r\n");
      out.write("//        if (tabIndex == 0) {\r\n");
      out.write("//            $tabs.tabs('option', 'selected', 0);\r\n");
      out.write("//        } else if (tabIndex == 1) {\r\n");
      out.write("//            $tabs.tabs('option', 'selected', 1);\r\n");
      out.write("//        }\r\n");
      out.write("//    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function addConfig() {\r\n");
      out.write("        window.location.href = \"new.jsp\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function activateSequence(name) {\r\n");
      out.write("        window.location.href = \"activate.jsp?name=\" + name + \"&action=activate\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function editSequence() {\r\n");
      out.write("        var $myTabs = $(\"#tabs\");\r\n");
      out.write("        $myTabs.tabs('select', 0);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function addExistingConfig() {\r\n");
      out.write("        window.location.href = \"existingConfig.jsp\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleteSequence(name) {\r\n");
      out.write("        window.location.href = \"activate.jsp?name=\" + name + \"&action=delete\";\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    .graylink{\r\n");
      out.write("        color:#aaaaaa !important;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.mediation.configadmin.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    ");
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.mediation.configadmin.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("configjsi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\r\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.mediation.configadmin.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setLabel("manage.synapse.config");
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");

        String status = request.getParameter("status");
        ResourceBundle bundle = ResourceBundle.getBundle(
                "org.wso2.carbon.mediation.configadmin.ui.i18n.Resources", request.getLocale());

        if ("newConfigCreated".equals(status)) {
    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showInfoDialog('");
          out.print(bundle.getString("activated.configuration"));
          out.write("');\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

        } else if ("activated".equals(status)) {
    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showInfoDialog('");
          out.print(bundle.getString("activated.configuration"));
          out.write("');\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

        } else if ("updated".equals(status)) {
    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showInfoDialog('");
          out.print(bundle.getString("configuration.updated.successfully"));
          out.write("');\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

        } else if ("updateFailed".equals(status)) {
    
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("        jQuery(document).ready(function() {\r\n");
          out.write("            CARBON.showErrorDialog('");
          out.print(bundle.getString("failed.to.update.configuration"));
          out.write("');\r\n");
          out.write("        });\r\n");
          out.write("    </script>\r\n");
          out.write("    ");

    }
    else if ("session".equals(status)) {
    
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("        jQuery(document).ready(function() {\r\n");
          out.write("            CARBON.showErrorDialog('");
          out.print(bundle.getString("failed.to.update.configuration.session"));
          out.write("');\r\n");
          out.write("        });\r\n");
          out.write("    </script>\r\n");
          out.write("    ");

    } else if ("deleted".equals(status)) {
    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showInfoDialog('");
          out.print(bundle.getString("deleted.configuration"));
          out.write("');\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

        }
    
          out.write("\r\n");
          out.write("\r\n");
          out.write("    ");

        String synapseConfig = null;
		Boolean loadEditArea = false;
        List<ConfigurationInformation> synapseConfigList = null;

        ResponseInformation configurationList;
        ResponseInformation activeConfiguration;

        try {
            ConfigManagementClient client = ConfigManagementClient.getInstance(config, session);
            boolean validationFailed = Boolean.parseBoolean(request.getParameter("configInvalid"));
            if (validationFailed) {
                activeConfiguration = new ResponseInformation();
                activeConfiguration.setResult(session.getAttribute("input.config"));
                ValidationError[] errors = (ValidationError[]) session.getAttribute("validation.errors");
                session.removeAttribute("input.config");
                session.removeAttribute("validation.errors");

                String msg = "Problems detected in the provided configuration:<br/><br/>";
                for (ValidationError error : errors) {
                    msg += " - " + error.getItemName() + ": " + error.getMessage().replaceAll("\"", "'") +
                            "<br/><br/>";
                }
                msg += "Remove faulty items and continue?";

    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showConfirmationDialog(\"");
          out.print(msg);
          out.write("\", function() {\r\n");
          out.write("                    forceUpdateConfiguration(document.configform);\r\n");
          out.write("                });\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

            } else {
                activeConfiguration = client.getConfiguration(session);
            }

            configurationList = client.getConfigurations();

            if (activeConfiguration.isFault() || configurationList.isFault()) {
                throw new Exception("Error while retrieving Synapse configuration details");
            }

            synapseConfig = (String) activeConfiguration.getResult();
            if (synapseConfig != null) {
                synapseConfig = synapseConfig.trim().replace("&", "&amp;");
            } else {
                synapseConfig = "";
            }
			if(synapseConfig.length() < 50000){
				loadEditArea = true;
			}
			
            synapseConfigList = (List<ConfigurationInformation>) configurationList.getResult();
            if (synapseConfigList == null) {
                synapseConfigList = new ArrayList<ConfigurationInformation>();
            }

        } catch (Exception e) {
            CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);
    
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            location.href = \"../admin/error.jsp\";\r\n");
          out.write("        </script>\r\n");
          out.write("    ");

        }
    
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
 if(loadEditArea){ 
          out.write("\r\n");
          out.write("\t<script type=\"text/javascript\">\r\n");
          out.write("    editAreaLoader.init({\r\n");
          out.write("        id : \"rawConfig\"\t\t// text area id\r\n");
          out.write("        ,syntax: \"xml\"\t\t\t// syntax to be uses for highlighting\r\n");
          out.write("        ,start_highlight: true  // to display with highlight mode on start-up\r\n");
          out.write("    });\r\n");
          out.write("    </script>\r\n");
          out.write("\t");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <div id=\"middle\">\r\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\r\n");
          out.write("        <div id=\"workArea\">\r\n");
          out.write("            ");
          out.write("\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                    <form method=\"post\" name=\"configform\" id=\"configform\" action=\"index.jsp\">\r\n");
          out.write("                        <div id=\"saveConfiguration\">\r\n");
          out.write("                            <span style=\"margin-top:10px;margin-bottom:10px; display:block;_margin-top:0px;\">\r\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                            </span>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <table class=\"styledLeft\" style=\"width:100%\">\r\n");
          out.write("                            <thead>\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <th>\r\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                    </th>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            </thead>\r\n");
          out.write("                            <tbody>\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td class=\"formRow\">\r\n");
          out.write("                                        <table class=\"normal\" style=\"width:100%\">\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td id=\"rawConfigTD\">\r\n");
          out.write("                                                    <textarea name=\"rawConfig\" id=\"rawConfig\"\r\n");
          out.write("                                                              style=\"border:solid 1px #cccccc; width: 99%; height: 400px; margin-top:5px;\">");
          out.print(synapseConfig);
          out.write("</textarea>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 if(!loadEditArea){ 
          out.write("\t\t  \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"padding:10px;color:#444;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
 } 
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        </table>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td class=\"buttonRow\">\r\n");
          out.write("                                        <button class=\"button\" onclick=\"updateConfiguration(document.configform); return false;\">");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</button>\r\n");
          out.write("                                        <button class=\"button\" onclick=\"resetConfiguration(); return false;\">");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</button>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            </tbody>\r\n");
          out.write("                        </table>\r\n");
          out.write("                    </form>\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                               ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                            ");
          out.write("\r\n");
          out.write("                                        ");
          out.write("\r\n");
          out.write("                                    ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                                ");
          out.write("\r\n");
          out.write("                            ");
          out.write("\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                           ");
          out.write("\r\n");
          out.write("                    ");
          out.write("\r\n");
          out.write("                ");
          out.write("\r\n");
          out.write("            ");
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("    </div>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    _jspx_th_fmt_message_0.setKey("manage.synapse.config");
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
    _jspx_th_fmt_message_1.setKey("save.advice");
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
    _jspx_th_fmt_message_2.setKey("esb.configuration");
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
    _jspx_th_fmt_message_3.setKey("syntax.disabled");
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
    _jspx_th_fmt_message_4.setKey("update");
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
    _jspx_th_fmt_message_5.setKey("reset");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }
}
