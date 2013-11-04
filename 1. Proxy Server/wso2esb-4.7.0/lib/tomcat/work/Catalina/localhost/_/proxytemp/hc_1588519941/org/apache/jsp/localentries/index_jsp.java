package org.apache.jsp.localentries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.localentry.ui.client.LocalEntryAdminClient;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.utils.ServerConstants;
import org.wso2.carbon.localentry.stub.types.EntryData;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.release();
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
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.localentry.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write('\n');
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.localentry.ui.i18n.Resources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write('\n');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("localentry");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.localentry.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(true);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("\n");
          out.write("<link type=\"text/css\" href=\"../dialog/js/jqueryui/tabs/ui.all.css\" rel=\"stylesheet\" />\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-1.2.6.min.js\"></script>\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-ui-1.6.custom.min.js\"></script>\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery.cookie.js\"></script>\n");
          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    var allowTabChange = true;\n");
          out.write("    var emtpyEntries = false;\n");
          out.write("\n");
          out.write("    $(function() {\n");
          out.write("        var $myTabs = $(\"#tabs\");\n");
          out.write("\n");
          out.write("        $myTabs.tabs({\n");
          out.write("            select: function(event, ui) {\n");
          out.write("                if (!allowTabChange) {\n");
          out.write("                    alert(\"Tab selection is disabled, while you are in the middle of a workflow\");\n");
          out.write("                }\n");
          out.write("                return allowTabChange;\n");
          out.write("            },\n");
          out.write("\n");
          out.write("            show: function(event, ui) {\n");
          out.write("                var selectedTab = $myTabs.tabs('option', 'selected');\n");
          out.write("                allowTabChange = true;\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("\n");
          out.write("        $myTabs.tabs('select', 0);\n");
          out.write("        if(emtpyEntries){\n");
          out.write("           $myTabs.tabs('select', 1);\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    function deleteRow(i) {\n");
          out.write("        var table = document.getElementById(\"myTable\");\n");
          out.write("        var row = table.rows[i];\n");
          out.write("        var cell = row.cells[0];\n");
          out.write("        var content = cell.firstChild.nodeValue;\n");
          out.write("\n");
          out.write("        function delEp() {\n");
          out.write("            document.location.href = \"deleteEntriesHandler.jsp?\" + \"entryName=\" + content;\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\", delEp);\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    String.prototype.trim = function() {\n");
          out.write("        return this.replace(/^\\s+|\\s+$/g, \"\");\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    String.prototype.ltrim = function() {\n");
          out.write("        return this.replace(/^\\s+/, \"\");\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    String.prototype.rtrim = function() {\n");
          out.write("        return this.replace(/\\s+$/, \"\");\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function editRow(i) {\n");
          out.write("        var table = document.getElementById(\"myTable\");\n");
          out.write("        var row = table.rows[i];\n");
          out.write("        var cell = row.cells[0];\n");
          out.write("        var type = row.cells[1];\n");
          out.write("        var content = cell.firstChild.nodeValue;\n");
          out.write("        var endType = type.firstChild.nodeValue;\n");
          out.write("\n");
          out.write("        if (endType.trim() == 'Inline Text') {\n");
          out.write("            document.location.href = \"inlinedText.jsp?\" + \"entryName=\" + content;\n");
          out.write("        }\n");
          out.write("        else if (endType.trim() == 'Inline XML') {\n");
          out.write("            document.location.href = \"inlinedXML.jsp?\" + \"entryName=\" + content\n");
          out.write("        }\n");
          out.write("        else {\n");
          out.write("            document.location.href = \"sourceURL.jsp?\" + \"entryName=\" + content;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function redirect(selNode) {\n");
          out.write("        var selected = selNode.options[selNode.selectedIndex].value;\n");
          out.write("        if (selected != \"\")window.location.href = selNode.options[selNode.selectedIndex].value;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function confirmForceDelete(entry, msg) {\n");
          out.write("        CARBON.showConfirmationDialog('");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<br/><br/>'\n");
          out.write("                + msg + '<br/>");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("', function() {\n");
          out.write("            document.location.href = \"deleteEntriesHandler.jsp?\" + \"entryName=\" + entry + \"&force=true\";\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("    <h2>");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("    <div id=\"workArea\">\n");
          out.write("        <div id=\"tabs\">\n");
          out.write("            <ul>\n");
          out.write("                <li><a href=\"#tabs-1\">");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("                <li><a href=\"#tabs-2\">");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("\n");
          out.write("            </ul>\n");
          out.write("\n");
          out.write("            ");

                String url = CarbonUIUtil.getServerURL(this.getServletConfig().getServletContext(),
                        session);
                ConfigurationContext configContext =
                        (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
                String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
                LocalEntryAdminClient client;
                EntryData[] localEntries = null;

                int numberOfPages = 1;
                String pageNumber = request.getParameter("pageNumber");
                if (pageNumber == null) {
                    pageNumber = "0";
                }
                int pageNumberInt = 0;
                try {
                    pageNumberInt = Integer.parseInt(pageNumber);
                }
                catch (NumberFormatException ignored) {
                }

                try {
                    client = new LocalEntryAdminClient(cookie, url, configContext);
                    localEntries = client.getPaginatedEntryData(pageNumberInt);     // Using pagination
                    numberOfPages = (int) Math.ceil((double) client.getEntryDataCount() / LocalEntryAdminClient.LOCAL_ENTRIES_PER_PAGE);

                } catch (Exception e) {
                    CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);
            
          out.write("\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                location.href = \"../admin/error.jsp\";\n");
          out.write("            </script>\n");
          out.write("            ");

                }
                if (localEntries == null) {
            
          out.write("\n");
          out.write("            <div id=\"tabs-1\">\n");
          out.write("                <script type=\"text/javascript\"> emtpyEntries=true</script>\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </div>\n");
          out.write("\n");
          out.write("            ");
}
          out.write("\n");
          out.write("\n");
          out.write("            ");
if (localEntries != null) {
          out.write("\n");
          out.write("            <div id=\"tabs-1\">\n");
          out.write("                ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_0.setPageNumber(pageNumberInt);
          _jspx_th_carbon_paginator_0.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_0.setPage("index.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_0.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
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
          out.write("                <br/>\n");
          out.write("                <table id=\"myTable\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"styledLeft\">\n");
          out.write("                    <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th>");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                        <th>");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                        <th>");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                        <th>");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                    </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("\n");
          out.write("                    ");
 for (EntryData dao : localEntries) {
                        EntryData entry = dao;
                    
          out.write("\n");
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          out.print( entry.getName());
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                        <td>");
          out.print( entry.getType());
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                        <td>");
          out.print( entry.getDescription() != null ? entry.getDescription() : "" );
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                        <td><a onclick=\"editRow(this.parentNode.parentNode.rowIndex)\" href=\"#\"\n");
          out.write("                               class=\"icon-link\"\n");
          out.write("                               style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            <a href=\"#\" onclick=\"deleteRow(this.parentNode.parentNode.rowIndex)\"\n");
          out.write("                               id=\"delete_link\" class=\"icon-link\"\n");
          out.write("                               style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");
}
          out.write("\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("                ");
}
          out.write("\n");
          out.write("                <br/>\n");
          out.write("                ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_1.setPageNumber(pageNumberInt);
          _jspx_th_carbon_paginator_1.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_1.setPage("index.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_1.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
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
          out.write("                <br/>\n");
          out.write("                <br/>\n");
          out.write("            </div>\n");
          out.write("            <div id=\"tabs-2\">\n");
          out.write("\n");
          out.write("                <table id=\"localentryTypesTable\" cellspacing=\"0\" class=\"styledLeft\" id=\"templatesTable\">\n");
          out.write("                    <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th colspan=\"2\">");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                    </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("                    <tr>\n");
          out.write("                        <td width=\"20%\">\n");
          out.write("                            <a class=\"icon-link\"\n");
          out.write("                               href=\"inlinedText.jsp\"\n");
          out.write("                               style=\"background-image: url(../admin/images/add.gif);\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </a>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td>\n");
          out.write("                            <a class=\"icon-link\"\n");
          out.write("                               href=\"inlinedXML.jsp\"\n");
          out.write("                               style=\"background-image: url(../admin/images/add.gif);\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </a>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td>\n");
          out.write("                            <a class=\"icon-link\"\n");
          out.write("                               href=\"sourceURL.jsp\"\n");
          out.write("                               style=\"background-image: url(../admin/images/add.gif);\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </a>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("                ");

                    String dependencyMgtError = (String) session.getAttribute("d.mgt.error.msg");
                    if (dependencyMgtError != null) {
                        String entryToDelete = (String) session.getAttribute("d.mgt.error.entry.name");
                
          out.write("\n");
          out.write("                <script type=\"text/javascript\">\n");
          out.write("                    confirmForceDelete('");
          out.print(entryToDelete);
          out.write("', '");
          out.print(dependencyMgtError);
          out.write("');\n");
          out.write("                </script>\n");
          out.write("                ");

                        session.removeAttribute("d.mgt.error.msg");
                        session.removeAttribute("d.mgt.error.entry.name");
                    }
                
          out.write("\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("</div>\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    alternateTableRows('myTable', 'tableEvenRow', 'tableOddRow');\n");
          out.write("    alternateTableRows('localentryTypesTable', 'tableEvenRow', 'tableOddRow');\n");
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
    _jspx_th_fmt_message_0.setKey("do.you.want.to.delete.the.entry");
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
    _jspx_th_fmt_message_1.setKey("dependency.mgt.warning");
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
    _jspx_th_fmt_message_2.setKey("force.delete");
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
    _jspx_th_fmt_message_3.setKey("manage.local.registry.entries");
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
    _jspx_th_fmt_message_4.setKey("available.localentries.tab.title");
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
    _jspx_th_fmt_message_5.setKey("add.localentries.tab.title");
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
    _jspx_th_fmt_message_6.setKey("no.entries.are.currently.defined.press.add.local.entry.to.define.a.new.entry.on.the.local.registry");
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
    _jspx_th_fmt_message_7.setKey("enntry.name");
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
    _jspx_th_fmt_message_8.setKey("type");
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
    _jspx_th_fmt_message_9.setKey("description");
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
    _jspx_th_fmt_message_10.setKey("action");
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
    _jspx_th_fmt_message_11.setKey("edit");
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
    _jspx_th_fmt_message_12.setKey("delete");
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
    _jspx_th_fmt_message_13.setKey("add.localentry.title");
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
    _jspx_th_fmt_message_14.setKey("add.in.lined.text");
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
    _jspx_th_fmt_message_15.setKey("add.in.lined.text.desc");
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
    _jspx_th_fmt_message_16.setKey("add.in.lined.xml");
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
    _jspx_th_fmt_message_17.setKey("add.in.lined.xml.desc");
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
    _jspx_th_fmt_message_18.setKey("add.source.url");
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
    _jspx_th_fmt_message_19.setKey("add.source.url.desc");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }
}
