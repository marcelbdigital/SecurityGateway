package org.apache.jsp.proxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.proxyadmin.ui.client.ProxyServiceAdminClient;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;

public final class extra_005fconfig_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"../resources/js/resource_util.js\"></script>\n");

    String serviceName = request.getParameter("serviceName");
    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ProxyServiceAdminClient client = new ProxyServiceAdminClient(
            configContext, backendServerURL, cookie, request.getLocale());
    ProxyData pd = client.getProxy(serviceName);
    String name = pd.getName();

      out.write('\n');
      //  carbon:jsi18n
      org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
      _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
      _jspx_th_carbon_jsi18n_0.setParent(null);
      _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.proxyadmin.ui.i18n.JSResources");
      _jspx_th_carbon_jsi18n_0.setRequest(request);
      _jspx_th_carbon_jsi18n_0.setI18nObjectName("proxyi18n");
      int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
      if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
        return;
      }
      _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
      out.write("\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td id=\"edit");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"editPS();return false;\"><img src=\"../admin/images/edit.gif\" alt=\"\" border=\"0\"> Edit</a>\n");
      out.write("        </td>\n");
      out.write("        <td id=\"enableStat");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"statOnOffPS('");
      out.print(name);
      out.write("', 'enable');return false;\"><img src=\"../admin/images/static-icon-disabled.gif\" alt=\"\" border=\"0\"> Enable Statistics</a>\n");
      out.write("        </td>\n");
      out.write("        <td id=\"disableStat");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"statOnOffPS('");
      out.print(name);
      out.write("', 'disable');return false;\"><img src=\"../admin/images/static-icon.gif\" alt=\"\" border=\"0\"> Disable Statistics</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td id=\"redeploy");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"redeployPS('");
      out.print(name);
      out.write("');return false;\"><img src=\"../proxyservices/images/core/icon-redeploy.gif\" alt=\"\" border=\"0\"> Redeploy</a>\n");
      out.write("        </td>\n");
      out.write("        <td id=\"enableTracing");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"traceOnOffPS('");
      out.print(name);
      out.write("', 'enable');return false;\"><img src=\"../admin/images/trace-icon-disabled.gif\" alt=\"\" border=\"0\"> Enable Tracing</a>\n");
      out.write("        </td>\n");
      out.write("        <td id=\"disableTracing");
      out.print(name);
      out.write("\">\n");
      out.write("            <a href=\"#\" onclick=\"traceOnOffPS('");
      out.print(name);
      out.write("', 'disable');return false;\"><img src=\"../admin/images/trace-icon.gif\" alt=\"\" border=\"0\"> Disable Tracing</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../carbon/global-params.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    ");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.proxyadmin.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    jQuery(document).ready(function() {\n");
          out.write("        showHideOptionsOnLoad();\n");
          out.write("    });\n");
          out.write("\n");
          out.write("    function showHideOptionsOnLoad() {\n");
          out.write("        if (");
          out.print(pd.getEnableStatistics());
          out.write(") {\n");
          out.write("            hideElem('enableStat' + '");
          out.print(name);
          out.write("')\n");
          out.write("            showElem('disableStat' + '");
          out.print(name);
          out.write("')\n");
          out.write("        } else {\n");
          out.write("            hideElem('disableStat' + '");
          out.print(name);
          out.write("')\n");
          out.write("            showElem('enableStat' + '");
          out.print(name);
          out.write("')\n");
          out.write("        }\n");
          out.write("        if (");
          out.print(pd.getEnableTracing());
          out.write(") {\n");
          out.write("            hideElem('enableTracing' + '");
          out.print(name);
          out.write("');\n");
          out.write("            showElem('disableTracing' + '");
          out.print(name);
          out.write("');\n");
          out.write("        } else {\n");
          out.write("            hideElem('disableTracing' + '");
          out.print(name);
          out.write("');\n");
          out.write("            showElem('enableTracing' + '");
          out.print(name);
          out.write("');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showElem(id) {\n");
          out.write("        document.getElementById(id).style.display = \"\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function hideElem(id) {\n");
          out.write("        document.getElementById(id).style.display = \"none\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    wso2.wsf.Util.initURLs();\n");
          out.write("    var frontdendURL = wso2.wsf.Util.getServerURL() + \"/\";\n");
          out.write("\n");
          out.write("    function editPS() {\n");
          out.write("        window.location.href='../proxyservices/index.jsp?header=' + '");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' + '&serviceName=");
          out.print(name);
          out.write("&startwiz=true';\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function redeployPS() {\n");
          out.write("        jQuery.get(\"../proxyservices/config-ajaxprocessor.jsp\", {'psName' : arguments[0], 'operation' : 'redeploy'},\n");
          out.write("                    function(data,status) {\n");
          out.write("                        handleProxyCallBack(data, status,\n");
          out.write("                                \"successfully.redeployed.proxy.service\", \"unable.to.redeploy.proxy.service\", null, null);\n");
          out.write("                    });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function statOnOffPS() {\n");
          out.write("        var command = arguments[1];\n");
          out.write("        if (\"enable\" == command) {\n");
          out.write("            jQuery.get(\"../proxyservices/config-ajaxprocessor.jsp\", {'psName' : arguments[0], 'operation' : 'enableStat'},\n");
          out.write("                    function(data,status) {\n");
          out.write("                        handleProxyCallBack(data,status, \"successfully.enabled.statistics\", \"unable.to.enable.statistics\",\n");
          out.write("                                \"disableStat\", \"enableStat\");\n");
          out.write("                    });\n");
          out.write("        } else if (\"disable\" == command) {\n");
          out.write("            jQuery.get(\"../proxyservices/config-ajaxprocessor.jsp\", {'psName' : arguments[0], 'operation' : 'disableStat'},\n");
          out.write("                    function(data,status) {\n");
          out.write("                        handleProxyCallBack(data,status, \"successfully.disabled.statistics\", \"unable.to.disable.statistics\",\n");
          out.write("                                \"enableStat\", \"disableStat\");\n");
          out.write("                    });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function traceOnOffPS() {\n");
          out.write("        var command = arguments[1];\n");
          out.write("        if (\"enable\" == command) {\n");
          out.write("            jQuery.get(\"../proxyservices/config-ajaxprocessor.jsp\", {'psName' : arguments[0], 'operation' : 'enableTrace'},\n");
          out.write("                    function(data,status) {\n");
          out.write("                        handleProxyCallBack(data,status, \"successfully.enabled.tracing\", \"unable.to.enable.tracing\",\n");
          out.write("                                \"disableTracing\", \"enableTracing\");\n");
          out.write("                    });\n");
          out.write("        } else if (\"disable\" == command) {\n");
          out.write("            jQuery.get(\"../proxyservices/config-ajaxprocessor.jsp\", {'psName' : arguments[0], 'operation' : 'disableTrace'},\n");
          out.write("                    function(data,status) {\n");
          out.write("                        handleProxyCallBack(data,status, \"successfully.disabled.tracing\", \"unable.to.disable.tracing\",\n");
          out.write("                                \"enableTracing\", \"disableTracing\");\n");
          out.write("                    });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function handleProxyCallBack(data, status, textOnSuccess, textOnFail, show, hide) {\n");
          out.write("        if (data.replace(/^\\s+|\\s+$/g, '') != 'successful') {\n");
          out.write("            CARBON.showErrorDialog(proxyi18n[textOnFail]);\n");
          out.write("        } else {\n");
          out.write("            if (show != null && hide != null) {\n");
          out.write("                showHideIcon(show,hide);\n");
          out.write("            }\n");
          out.write("            CARBON.showInfoDialog(proxyi18n[textOnSuccess]);\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showHideIcon(show, hide) {\n");
          out.write("        hideElem(hide + '");
          out.print(name);
          out.write("');\n");
          out.write("        showElem(show + '");
          out.print(name);
          out.write("');\n");
          out.write("    }\n");
          out.write("    ");
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
      out.write("\n");
      out.write("</script>");
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
    _jspx_th_fmt_message_0.setKey("header.modify");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }
}
