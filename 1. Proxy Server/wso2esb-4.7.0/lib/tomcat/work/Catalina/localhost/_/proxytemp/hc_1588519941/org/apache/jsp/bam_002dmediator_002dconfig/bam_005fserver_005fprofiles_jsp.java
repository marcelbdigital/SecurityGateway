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
import org.wso2.carbon.mediator.bam.config.ui.BamServerProfilesHelper;

public final class bam_005fserver_005fprofiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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
      out.write("\n");

    response.setHeader("Cache-Control", "no-cache");

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
          out.write("\n");
          out.write("\n");
          out.write("    ");
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
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("bam.server.profiles");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.mediator.bam.config.ui.i18n.Resources");
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
          out.write("    ");
          out.write("\n");
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        function removeServerProfile(profileName){\n");
          out.write("            window.location.href = \"bam_server_profiles.jsp?serverProfileName=\" + profileName + \"&action=remove\";\n");
          out.write("        }\n");
          out.write("        function editServerProfile(profileName){\n");
          out.write("            window.location.href = \"configure_server_profiles.jsp?txtServerProfileLocation=\" + profileName + \"&hfAction=load\";\n");
          out.write("        }\n");
          out.write("        function removeForcefully(profileName){\n");
          out.write("            window.location.href = \"bam_server_profiles.jsp?serverProfileName=\" + profileName + \"&action=remove&force=true\";\n");
          out.write("        }\n");
          out.write("        function reloadPage(){\n");
          out.write("            window.location.href = \"bam_server_profiles.jsp\";\n");
          out.write("        }\n");
          out.write("        function addServerProfile(){\n");
          out.write("            window.location.href = \"configure_server_profiles.jsp\";\n");
          out.write("        }\n");
          out.write("    </script>\n");
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        ");

            String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
            String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
            ConfigurationContext configContext =
                    (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

            BamServerProfilesHelper bamServerProfilesHelper =
                    new BamServerProfilesHelper(cookie, backendServerURL, configContext, request.getLocale());

            if(!bamServerProfilesHelper.resourceAlreadyExists(SERVER_PROFILE_LOCATION)){
                bamServerProfilesHelper.addCollection(SERVER_PROFILE_LOCATION);
            }

            String[] serverNameList = bamServerProfilesHelper.getServerProfileList(SERVER_PROFILE_LOCATION);
            String action = request.getParameter("action");
            String profileName = request.getParameter("serverProfileName");
            String force = request.getParameter("force");
            if(bamServerProfilesHelper.isNotNullOrEmpty(action) && action.equals("remove") &&
               bamServerProfilesHelper.isNotNullOrEmpty(profileName)){
                if(bamServerProfilesHelper.isNotNullOrEmpty(force) && force.equals("true")){
                    bamServerProfilesHelper.removeResource(SERVER_PROFILE_LOCATION + "/" + profileName);
            
          out.write("\n");
          out.write("\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                CARBON.showInfoDialog(\"Server Profile was successfully deleted.\", reloadPage);\n");
          out.write("            </script>\n");
          out.write("\n");
          out.write("            ");

                } else {
                    
          out.write("\n");
          out.write("\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        //CARBON.showConfirmationDialog(\"Are you sure you want to remove the existing Server Profile?\", removeForcefully, reloadPage, true);\n");
          out.write("                        var remove = confirm(\"Are you sure you want to remove the existing Server Profile?\");\n");
          out.write("                        if(remove){\n");
          out.write("                            removeForcefully(\"");
          out.print(profileName);
          out.write("\");\n");
          out.write("                        } else {\n");
          out.write("                            reloadPage();\n");
          out.write("                        }\n");
          out.write("                    </script>\n");
          out.write("\n");
          out.write("                    ");

                }
            } else {

        
          out.write("\n");
          out.write("\n");
          out.write("        <h2>\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        </h2>\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <table width=\"100%\" class=\"styledLeft\" style=\"margin-left: 0px;\">\n");
          out.write("                <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </th>\n");
          out.write("                        <th></th>\n");
          out.write("                    </tr>\n");
          out.write("                </thead>\n");
          out.write("                <tbody>\n");
          out.write("                    ");

                        for (String serverName : serverNameList) {
                            
          out.write("\n");
          out.write("                                 <tr>\n");
          out.write("                                     <td>\n");
          out.write("                                         ");
          out.print(serverName);
          out.write("\n");
          out.write("                                     </td>\n");
          out.write("                                     <td>\n");
          out.write("                                         <span><a onClick='javaScript:removeServerProfile(\"");
          out.print(serverName);
          out.write("\")' style='background-image:url(../admin/images/delete.gif);'class='icon-link addIcon'>Remove Profile</a></span>\n");
          out.write("                                         <span><a onClick='javaScript:editServerProfile(\"");
          out.print(serverName);
          out.write("\")' style='background-image:url(../admin/images/edit.gif);'class='icon-link addIcon'>Edit Profile</a></span>\n");
          out.write("                                     </td>\n");
          out.write("                                 </tr>\n");
          out.write("                            ");

                        }
                    }
                    
          out.write("\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("        </div>\n");
          out.write("        <span><a onClick='javaScript:addServerProfile()' style='background-image:\n");
          out.write("                                        url(../admin/images/add.gif);'class='icon-link addIcon'>Add Profile</a></span>\n");
          out.write("    </div>\n");
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
    _jspx_th_fmt_message_0.setKey("bam.server.profiles");
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
    _jspx_th_fmt_message_1.setKey("server.profile.name");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }
}
