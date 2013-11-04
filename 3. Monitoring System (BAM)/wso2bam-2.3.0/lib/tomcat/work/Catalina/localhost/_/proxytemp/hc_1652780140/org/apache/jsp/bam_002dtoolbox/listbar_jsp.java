package org.apache.jsp.bam_002dtoolbox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.bam.toolbox.deployer.stub.BAMToolboxDepolyerServiceStub.ToolBoxStatusDTO;
import org.wso2.carbon.bam.toolbox.deployer.ui.client.BAMToolBoxDeployerClient;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;

public final class listbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.bam.toolbox.deployer.ui.i18n.Resources");
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
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    function deleteRow(name, msg) {\n");
          out.write("        CARBON.showConfirmationDialog(msg + \"' \" + name + \" ' ?\", function() {\n");
          out.write("            document.location.href = \"undeploy.jsp?\" + \"toolBoxName=\" + name;\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("</script>\n");
          out.write("\n");

    String toolBoxSearchString = request.getParameter("toolboxSearchString");

          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    window.onload = setupRefresh;\n");
          out.write("    var isMessageBox = false;\n");
          out.write("    var lastSearchStr = ");
 if(null== toolBoxSearchString){
    
          out.write(" '';\n");
          out.write("    ");

    }else {
    
          out.write("\n");
          out.write("    '");
          out.print(toolBoxSearchString);
          out.write("';\n");
          out.write("    ");

    }
    
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("    function setupRefresh() {\n");
          out.write("        setInterval(\"refreshPage();\", 10000); // milliseconds\n");
          out.write("    }\n");
          out.write("    function refreshPage() {\n");
          out.write("        if (!isSelected() && !isMessageBox && !isSearchStringTyped()) {\n");
          out.write("            window.location = location.href;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function isSelected() {\n");
          out.write("        var counter = 0,\n");
          out.write("                i = 0,\n");
          out.write("                fieldsStr = '',\n");
          out.write("                input_obj = document.getElementsByTagName('input');\n");
          out.write("\n");
          out.write("        for (i = 0; i < input_obj.length; i++) {\n");
          out.write("            if (input_obj[i].type === 'checkbox' && input_obj[i].checked === true) {\n");
          out.write("                counter++;\n");
          out.write("                fieldsStr = fieldsStr + ',' + input_obj[i].value;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        if (counter > 0) {\n");
          out.write("            return true;\n");
          out.write("        } else {\n");
          out.write("            return false;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function isSearchStringTyped() {\n");
          out.write("        lastSearchStr = trimText(lastSearchStr);\n");
          out.write("        if (null != document.getElementById('toolboxSearchString')) {\n");
          out.write("            var currSearchStr = trimText(document.searchForm.toolboxSearchString.value);\n");
          out.write("            if (lastSearchStr != currSearchStr) {\n");
          out.write("                return true;\n");
          out.write("            } else {\n");
          out.write("                return false;\n");
          out.write("            }\n");
          out.write("        } else {\n");
          out.write("            return false;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("available.bam.tools");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.bam.toolbox.deployer.ui.i18n.Resources");
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

    String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

    String toolBoxType = request.getParameter("toolType");

    BAMToolBoxDeployerClient client = new BAMToolBoxDeployerClient(cookie, serverURL, configContext);
    String[] deployedTools = null;
    String[] toBeDeployedTools = null;
    String[] toBeUndeployedTools = null;

    String requestUrl = request.getHeader("Referer");
    String success = null;
    if (null != requestUrl && requestUrl.contains("undeploy.jsp")) {
        success = request.getParameter("undeploysuccess");
    }
    String message = request.getParameter("message");


    try {
        ToolBoxStatusDTO statusDTO = client.getToolBoxStatus(toolBoxType, toolBoxSearchString);
        deployedTools = statusDTO.getDeployedTools();
        toBeDeployedTools = statusDTO.getToBeDeployedTools();
        toBeUndeployedTools = statusDTO.getToBeUndeployedTools();

    } catch (Exception e) {

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    CARBON.showErrorDialog(\"Error while getting the status of BAM ToolBox\");\n");
          out.write("</script>\n");

    }

          out.write("\n");
          out.write("\n");
          out.write("\n");

    if (null != success && !success.equals("")) {
        if (success.equalsIgnoreCase("true")) {

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    CARBON.showInfoDialog('");
          out.print(message);
          out.write("');\n");
          out.write("</script>\n");

} else {

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    CARBON.showErrorDialog('");
          out.print(message);
          out.write("');\n");
          out.write("</script>\n");

        }
    }

          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    function selectAllTools() {\n");
          out.write("        var i = 0,\n");
          out.write("                input_obj = document.getElementsByTagName('input');\n");
          out.write("\n");
          out.write("        for (i = 0; i < input_obj.length; i++) {\n");
          out.write("            if (input_obj[i].type === 'checkbox') {\n");
          out.write("                input_obj[i].checked = true;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function selectNoneTools() {\n");
          out.write("        var i = 0,\n");
          out.write("                input_obj = document.getElementsByTagName('input');\n");
          out.write("\n");
          out.write("        for (i = 0; i < input_obj.length; i++) {\n");
          out.write("            if (input_obj[i].type === 'checkbox') {\n");
          out.write("                input_obj[i].checked = false;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function undeployTools() {\n");
          out.write("        var counter = 0,\n");
          out.write("                i = 0,\n");
          out.write("                fieldsStr = '',\n");
          out.write("                input_obj = document.getElementsByTagName('input');\n");
          out.write("\n");
          out.write("        for (i = 0; i < input_obj.length; i++) {\n");
          out.write("            if (input_obj[i].type === 'checkbox' && input_obj[i].checked === true) {\n");
          out.write("                counter++;\n");
          out.write("                fieldsStr = fieldsStr + ',' + input_obj[i].value;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        if (counter > 0) {\n");
          out.write("            fieldsStr = fieldsStr.substr(1);\n");
          out.write("        }\n");
          out.write("        if ('' == fieldsStr) {\n");
          out.write("            CARBON.showErrorDialog(\"No tools has been selected to undeploy!!\");\n");
          out.write("        } else {\n");
          out.write("            isMessageBox = true;\n");
          out.write("            CARBON.showConfirmationDialog(\"Do you want to undeploy selected tools?\", function() {\n");
          out.write("                document.location.href = \"undeploy.jsp?\" + \"toolBoxNames=\" + fieldsStr;\n");
          out.write("            });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function searchServices() {\n");
          out.write("        var searchStr = document.searchForm.toolboxSearchString.value;\n");
          out.write("        document.searchForm.toolboxSearchString.value = trimText(searchStr);\n");
          out.write("        document.searchForm.submit();\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function trimText(text) {\n");
          out.write("        return text.replace(/(?:(?:^|\\n)\\s+|\\s+(?:$|\\n))/g, '').replace(/\\s+/g, ' ');\n");
          out.write("    }\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("<h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\">\n");
          out.write("<form action=\"listbar.jsp\" name=\"searchForm\">\n");
          out.write("    <table class=\"styledLeft\">\n");
          out.write("        <tr>\n");
          out.write("            <td style=\"border:0; !important\">\n");
          out.write("                <nobr>\n");
          out.write("                    ");

                        if (null == toolBoxType || toolBoxType.equals("") || toolBoxType.equals("1")) {
                    
          out.write("\n");
          out.write("                    <a href=\"listbar.jsp?toolType=2\">");
          out.print(deployedTools != null ? deployedTools.length : 0);
          out.write(' ');
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>.&nbsp;\n");
          out.write("                    <a href=\"listbar.jsp?toolType=3\">");
          out.print(toBeDeployedTools != null ? toBeDeployedTools.length : 0);
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>.&nbsp;\n");
          out.write("                    <a href=\"listbar.jsp?toolType=4\">");
          out.print(toBeUndeployedTools != null ? toBeUndeployedTools.length : 0);
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    ");

                    } else if (toolBoxType.equals("2")) {
                    
          out.write("\n");
          out.write("                    ");
          out.print(deployedTools != null ? deployedTools.length : 0);
          out.write(' ');
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("&nbsp;\n");
          out.write("                    ");

                    } else if (toolBoxType.equals("3")) {
                    
          out.write("\n");
          out.write("                    ");
          out.print(toBeDeployedTools != null ? toBeDeployedTools.length : 0);
          out.write(' ');
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("&nbsp;\n");
          out.write("                    ");

                    } else {
                    
          out.write("\n");
          out.write("                    ");
          out.print(toBeUndeployedTools != null ? toBeUndeployedTools.length : 0);
          out.write(' ');
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    ");

                        }
                    
          out.write("\n");
          out.write("                </nobr>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");
 if ((null != deployedTools && deployedTools.length != 0) ||
                (null != toBeDeployedTools && toBeDeployedTools.length != 0) ||
                (null != toBeUndeployedTools && toBeUndeployedTools.length != 0)) { 
          out.write("\n");
          out.write("        <tr>\n");
          out.write("            <td style=\"border:0; !important\">&nbsp;</td>\n");
          out.write("        </tr>\n");
          out.write("        <tr>\n");
          out.write("            <td>\n");
          out.write("                <table style=\"border:0; !important\">\n");
          out.write("                    <tbody>\n");
          out.write("                    <tr style=\"border:0; !important\">\n");
          out.write("                        <td style=\"border:0; !important\">\n");
          out.write("                            <nobr>\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(":&nbsp;&nbsp;\n");
          out.write("                                <select name=\"toolType\" id=\"tooType\">\n");
          out.write("                                    <option value=\"1\" ");
          out.print( (null == toolBoxType || toolBoxType.equals("1")) ? "selected=\'selected\'" : "");
          out.write(">\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                    <option value=\"2\" ");
          out.print( (null != toolBoxType && toolBoxType.equals("2")) ? "selected=\'selected\'" : "");
          out.write(">\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                    <option value=\"3\" ");
          out.print( (null != toolBoxType && toolBoxType.equals("3")) ? "selected=\'selected\'" : "");
          out.write(">\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                    <option value=\"4\" ");
          out.print( (null != toolBoxType && toolBoxType.equals("4")) ? "selected=\'selected\'" : "");
          out.write(">\n");
          out.write("                                        ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                </select>\n");
          out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                <input type=\"text\" name=\"toolboxSearchString\"\n");
          out.write("                                       id =\"toolboxSearchString\" value=\"");
          out.print( toolBoxSearchString != null? toolBoxSearchString : "");
          out.write("\"/>&nbsp;\n");
          out.write("                            </nobr>\n");
          out.write("                        </td>\n");
          out.write("                        <td style=\"border:0; !important\">\n");
          out.write("                            <a class=\"icon-link\" href=\"#\" style=\"background-image: url(images/search.gif);\"\n");
          out.write("                               onclick=\"javascript:searchServices(); return false;\"\n");
          out.write("                               alt=\"");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"></a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("    </table>\n");
          out.write("</form>\n");
          out.write("\n");
          out.write("<table class=\"normal-nopadding\">\n");
          out.write("    <tbody>\n");
          out.write("    <tr>\n");
          out.write("        <td width=\"25px\">\n");
          out.write("\n");
          out.write("        </td>\n");
          out.write("        <td width=\"25px\">\n");
          out.write("            <nobr>\n");
          out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("\n");
          out.write("                <a style=\"cursor:pointer\" onclick=\"selectAllTools()\"><font color=\"#2F7ABD\">");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</font></a>\n");
          out.write("\n");
          out.write("                &nbsp;&nbsp;<b>|</b> &nbsp;&nbsp;\n");
          out.write("                <a style=\"cursor:pointer\" onclick=\"selectNoneTools()\"><font color=\"#2F7ABD\">");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</font></a>\n");
          out.write("                &nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("            </nobr>\n");
          out.write("        </td>\n");
          out.write("        <td width=\"800px\">\n");
          out.write("            <nobr>\n");
          out.write("                <a href=\"javascript:undeployTools();\"\n");
          out.write("                   class=\"icon-link\" style=\"background-image:url(images/undeploy.png);\"\n");
          out.write("                   target=\"_self\">\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </a>\n");
          out.write("            </nobr>\n");
          out.write("        </td>\n");
          out.write("    </tr>\n");
          out.write("\n");
          out.write("\n");
          out.write("    </tbody>\n");
          out.write("</table>\n");
          out.write("\n");
          out.write("<form id=\"listTools\" name=\"listTools\" action=\"\" method=\"POST\">\n");
          out.write("    <table class=\"styledLeft\">\n");
          out.write("        <thead>\n");
          out.write("        <tr>\n");
          out.write("            <th></th>\n");
          out.write("            <th><span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("            </th>\n");
          out.write("            <th><span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("            </th>\n");
          out.write("            <th><span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("            </th>\n");
          out.write("        </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("\n");
          out.write("        ");
 int position = 0;
            if (null != deployedTools) {
                for (String aName : deployedTools) {
                    String bgColor = ((position % 2) == 1) ? "#EEEFFB" : "white";
                    position++;
        
          out.write("\n");
          out.write("        <tr bgcolor=\"");
          out.print(bgColor);
          out.write("\">\n");
          out.write("            <td width=\"10px\" style=\"text-align:center; !important\">\n");
          out.write("                <input type=\"checkbox\" id=\"toolboxes_");
          out.print(position);
          out.write("\" name=toolboxes_");
          out.print(position);
          out.write("\n");
          out.write("                       value=\"");
          out.print(aName);
          out.write("\"\n");
          out.write("                       class=\"chkBox\"/>\n");
          out.write("            </td>\n");
          out.write("            <td><label>\n");
          out.write("                ");
          out.print(aName);
          out.write("\n");
          out.write("            </label>\n");
          out.write("            </td>\n");
          out.write("            <td>");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("                <nobr>\n");
          out.write("                    <a href=\"download-ajaxprocessor.jsp?toolboxName=");
          out.print(aName);
          out.write("\"\n");
          out.write("                       class=\"icon-link\" style=\"background-image:url(images/download.gif);\"\n");
          out.write("                       target=\"_self\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </a>\n");
          out.write("                </nobr>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        ");

                }
            }
        
          out.write("\n");
          out.write("\n");
          out.write("        ");
 if (null != toBeDeployedTools) {
            for (String aName : toBeDeployedTools) {
                String bgColor = ((position % 2) == 1) ? "#EEEFFB" : "white";
                position++;
        
          out.write("\n");
          out.write("        <tr bgcolor=\"");
          out.print(bgColor);
          out.write("\">\n");
          out.write("            <td width=\"10px\" style=\"text-align:center; !important\">\n");
          out.write("                <input type=\"checkbox\" id=\"toolboxes_");
          out.print(position);
          out.write("\" name=toolboxes_");
          out.print(position);
          out.write("\n");
          out.write("                       value=\"");
          out.print(aName);
          out.write("\"\n");
          out.write("                       class=\"chkBox\"/>\n");
          out.write("            </td>\n");
          out.write("            <td><label>\n");
          out.write("                ");
          out.print(aName);
          out.write("\n");
          out.write("            </label>\n");
          out.write("            </td>\n");
          out.write("            <td>");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("            </td>\n");
          out.write("\n");
          out.write("        </tr>\n");
          out.write("        <input type=\"hidden\" name=\"finalIdToolsToUndeply\" id=\"finalIdToolsToUndeply\" value=\"");
          out.print(position);
          out.write("\"/>\n");
          out.write("        ");

                }
            }
        
          out.write("\n");
          out.write("\n");
          out.write("        ");
 if (null != toBeUndeployedTools) {
            for (String aName : toBeUndeployedTools) {
                String bgColor = ((position % 2) == 1) ? "#EEEFFB" : "white";
                position++;
        
          out.write("\n");
          out.write("        <tr bgcolor=\"");
          out.print(bgColor);
          out.write("\">\n");
          out.write("            <td width=\"10px\" style=\"text-align:center; !important\">\n");
          out.write("                <input type=\"checkbox\" id=\"toolboxes_");
          out.print(position);
          out.write("\" name=toolboxes_");
          out.print(position);
          out.write("\n");
          out.write("                       value=\"");
          out.print(aName);
          out.write("\"\n");
          out.write("                       class=\"chkBox\" disabled=\"true\"/>\n");
          out.write("            </td>\n");
          out.write("            <td><label>\n");
          out.write("                ");
          out.print(aName);
          out.write("\n");
          out.write("            </label>\n");
          out.write("            </td>\n");
          out.write("            <td>");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td>\n");
          out.write("            </td>\n");
          out.write("\n");
          out.write("        </tr>\n");
          out.write("        ");

                    }
                }
            }
        
          out.write("\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("</form>\n");
          out.write("\n");
          out.write("<table>\n");
          out.write("    <tbody>\n");
          out.write("    <tr>\n");
          out.write("        <td></td>\n");
          out.write("    </tr>\n");
          out.write("    <tr>\n");
          out.write("        <td><a class=\"icon-link\" style=\"background-image:url(images/add.gif);\" href=\"uploadbar.jsp\">");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></td>\n");
          out.write("    </tr>\n");
          out.write("    </tbody>\n");
          out.write("</table>\n");
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
    _jspx_th_fmt_message_0.setKey("available.bam.tools");
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
    _jspx_th_fmt_message_1.setKey("deployed.toolboxes");
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
    _jspx_th_fmt_message_2.setKey("awaiting.to.deploy.toolboxes");
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
    _jspx_th_fmt_message_3.setKey("awaiting.to.undeploy.toolboxes");
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
    _jspx_th_fmt_message_4.setKey("deployed.toolboxes");
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
    _jspx_th_fmt_message_5.setKey("awaiting.to.deploy.toolboxes");
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
    _jspx_th_fmt_message_6.setKey("awaiting.to.undeploy.toolboxes");
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
    _jspx_th_fmt_message_7.setKey("toolbox.status");
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
    _jspx_th_fmt_message_8.setKey("all");
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
    _jspx_th_fmt_message_9.setKey("bam.tool.status.deployed");
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
    _jspx_th_fmt_message_10.setKey("bam.tool.status.tobedeployed");
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
    _jspx_th_fmt_message_11.setKey("bam.tool.status.tobeundeployed");
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
    _jspx_th_fmt_message_12.setKey("search.toolbox");
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
    _jspx_th_fmt_message_13.setKey("search");
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
    _jspx_th_fmt_message_14.setKey("select.all");
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
    _jspx_th_fmt_message_15.setKey("select.none");
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
    _jspx_th_fmt_message_16.setKey("bam.undeploy");
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
    _jspx_th_fmt_message_17.setKey("bam.toolboxes");
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
    _jspx_th_fmt_message_18.setKey("tools.status");
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
    _jspx_th_fmt_message_19.setKey("operation");
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
    _jspx_th_fmt_message_20.setKey("bam.tool.status.deployed");
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
    _jspx_th_fmt_message_21.setKey("download");
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
    _jspx_th_fmt_message_22.setKey("bam.tool.status.tobedeployed");
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
    _jspx_th_fmt_message_23.setKey("bam.tool.status.tobeundeployed");
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
    _jspx_th_fmt_message_24.setKey("add.new.toolbox");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }
}
