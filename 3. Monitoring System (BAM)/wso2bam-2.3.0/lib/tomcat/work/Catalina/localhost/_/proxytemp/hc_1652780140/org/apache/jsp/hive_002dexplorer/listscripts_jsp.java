package org.apache.jsp.hive_002dexplorer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.analytics.hive.ui.client.HiveScriptStoreClient;

public final class listscripts_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.analytics.hive.ui.i18n.Resources");
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
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("hive.listScripts");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.analytics.hive.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        function deleteRow(name, msg) {\n");
          out.write("            CARBON.showConfirmationDialog(msg + \"' \" + name + \" ' ?\", function() {\n");
          out.write("                document.location.href = \"deleteScript.jsp?\" + \"scriptName=\" + name;\n");
          out.write("            });\n");
          out.write("        }\n");
          out.write("    </script>\n");
          out.write("    ");

        String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

        HiveScriptStoreClient client = new HiveScriptStoreClient(cookie, serverURL, configContext);
        String[] scriptNames = null;

        try {
            scriptNames = client.getAllScriptNames();
        } catch (Exception e) {
    
          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        CARBON.showErrorDialog(\"Error while getting the list of scripts\");\n");
          out.write("    </script>\n");
          out.write("    ");

        }
    
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>Available Scripts</h2>\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("\n");
          out.write("            <form id=\"listScripts\" name=\"listScripts\" action=\"\" method=\"POST\">\n");
          out.write("                <table class=\"styledLeft\">\n");
          out.write("                    <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th style=\"width:200px\"><span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("                        </th>\n");
          out.write("                        <th>Actions</th>\n");
          out.write("                    </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("\n");
          out.write("                    ");
 if (null != scriptNames) {
                        for (String aName : scriptNames) {
                    
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td><label>\n");
          out.write("                            ");
          out.print(aName);
          out.write("\n");
          out.write("                        </label>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            <a class=\"icon-link\" style=\"background: url('../hive-explorer/images/edit.gif') no-repeat;\"\n");
          out.write("                               href=\"../hive-explorer/hiveexplorer.jsp?mode=edit&scriptName=");
          out.print(aName);
          out.write("\">Edit</a>\n");
          out.write("                            <a class=\"icon-link\" href=\"../hive-explorer/execute.jsp?scriptName=");
          out.print(aName);
          out.write("\"\n");
          out.write("                               style=\"background: url('../hive-explorer/images/execute.gif') no-repeat;\">\n");
          out.write("                                Execute</a>\n");
          out.write("                            <a class=\"icon-link\" style=\"background: url('images/tasks-icon.gif') no-repeat;\"\n");
          out.write("                                      href=\"../hive-explorer/scheduleAndSave.jsp?scriptName=");
          out.print(aName);
          out.write("\">Schedule\n");
          out.write("                                Script\n");
          out.write("                            </a>\n");
          out.write("                            <a onclick=\"deleteRow('");
          out.print(aName);
          out.write("','Do you want to delete')\"\n");
          out.write("                               class=\"delete-icon-link\" href=\"#\">Delete</a>\n");
          out.write("                        </td>\n");
          out.write("\n");
          out.write("                    </tr>\n");
          out.write("                    ");

                        }
                    } else { 
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td colspan=\"2\">No scripts found.</td>\n");
          out.write("                    </tr>\n");
          out.write("\n");
          out.write("                    ");
 }
                    
          out.write("\n");
          out.write("                    </tbody>\n");
          out.write("                    <input type=\"hidden\" id=\"driver\" name=\"driver\" value=\"\">\n");
          out.write("                </table>\n");
          out.write("            </form>\n");
          out.write("            <table>\n");
          out.write("                <tbody>\n");
          out.write("                <tr>\n");
          out.write("                    <td></td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td><a class=\"icon-link\" style=\"background-image:url(images/add.gif);\"\n");
          out.write("                           href=\"hiveexplorer.jsp\">");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
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
    _jspx_th_fmt_message_0.setKey("analytic.scripts");
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
    _jspx_th_fmt_message_1.setKey("script.add.main");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }
}
