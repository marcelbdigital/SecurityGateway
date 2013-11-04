package org.apache.jsp.gadgetrepo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.dashboard.common.DashboardConstants;
import org.wso2.carbon.dashboard.mgt.gadgetrepo.ui.GadgetRepoServiceClient;
import org.wso2.carbon.dashboard.ui.DashboardUiUtils;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


	String selectPageString = (String) request.getParameter("selectPage");
	if (selectPageString == null || selectPageString.equals("")) {
	    selectPageString = "0";
	}
	
	int selectPage;
	try {
	    selectPage = Integer.parseInt(selectPageString);
	} catch (Exception e) {
	    selectPage = 0;
	}

    String backendServerURL = CarbonUIUtil.getServerURL(config
            .getServletContext(), session);
    ConfigurationContext configContext = (ConfigurationContext) config
            .getServletContext().getAttribute(
                    CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session
            .getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

    GadgetRepoServiceClient gadgetRepoServiceClient;

    String pageNumStr = null;
    int pages = 0;

    try {
	    gadgetRepoServiceClient = new GadgetRepoServiceClient(cookie,
                    backendServerURL,
                    configContext,
                    request.getLocale());

        pageNumStr = request.getParameter("pageNum");
        pages = 0;
        if (gadgetRepoServiceClient.getCollectionSize() != null) {
            pages = (gadgetRepoServiceClient.getCollectionSize() - 1) / DashboardConstants.GADGETS_PER_PAGE;


            if (((gadgetRepoServiceClient.getCollectionSize() - 1) % DashboardConstants.GADGETS_PER_PAGE) != 0) {
                pages++;
            }
        }
    } catch (Exception e) {
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\n');

        return;
    }
    if ( !gadgetRepoServiceClient.isSessionValid())  {
       response.sendRedirect(DashboardUiUtils.getLoginUrl("../gsusermgt/login.jsp", DashboardUiUtils.getHttpsPort(backendServerURL), request));
    }


      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"javascript/util.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"javascript/gadgetrepo-service-stub.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("        src=\"javascript/gadgetrepo-server-utils.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    ");
if(pageNumStr == null){
      out.write("\n");
      out.write("    $(window).load(function() {\n");
      out.write("\n");
      out.write("        // load home page when the page loads\n");
      out.write("        $(\"#gadget-table\").load(\"GadgetRepoItems-ajaxprocessor.jsp?pageNum=\" + ");
      out.print(selectPage);
      out.write(");\n");
      out.write("    });\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("    function deleteGadget(gadgetId) {\n");
      out.write("\tconfirmDialog(jsi18n[\"confirm.delete\"], deleteGadgetAction, gadgetId);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function deleteGadgetAction(gadgetId){\n");
      out.write("        var gadgetPath = document.getElementById('gadgetPath-' + gadgetId).value;\n");
      out.write("        GadgetRepoService.deleteGadget(gadgetPath);\n");
      out.write("        $('#table-' + gadgetId).fadeOut('slow');\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function modifyGadget(gadgetId) {\n");
      out.write("        var gadgetPath = document.getElementById('gadgetPath-' + gadgetId).value;\n");
      out.write("        location.href = 'add-gadget.jsp?mode=mod&gadgetPath=' + gadgetPath;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("    function paginate(rand, num) {\n");
      out.write("       // $(document).ready(function() {\n");
      out.write("            // load home page when the page loads\n");
      out.write("            $(\"#gadget-table\").load(\"GadgetRepoItems-ajaxprocessor.jsp?pageNum=\" + num + \"&random=\" + rand );\n");
      out.write("       // });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function makeDefault(gadgetId) {\n");
      out.write("        var isChecked = document.getElementById('makeDefault-' + gadgetId).checked;\n");
      out.write("        var gadgetPath = document.getElementById('gadgetPath-' + gadgetId).value;\n");
      out.write("        GadgetRepoService.makeDefault(gadgetPath, isChecked);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function makeGadgetForUnsignedUser(gadgetId) {\n");
      out.write("        var isChecked = document.getElementById('unsignedUserGadget-' + gadgetId).checked;\n");
      out.write("        var gadgetPath = document.getElementById('gadgetPath-' + gadgetId).value;\n");
      out.write("        GadgetRepoService.unsignedUserGadget(gadgetPath, isChecked);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.dashboard.mgt.gadgetrepo.ui.resource.i18n.Resources");
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
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.dashboard.mgt.gadgetrepo.ui.resource.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("view");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.policyeditor.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <table width=\"100%\">\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <ul class=\"gadgets-top-links\">\n");
          out.write("                            <li><a class=\"icon-link\"\n");
          out.write("                                   style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("                                   href=\"add-gadget.jsp?mode=add\">");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("                        </ul>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                    \t<table style=\"float: right;\">\n");
          out.write("                    \t\t<tr>\n");
          out.write("\t                    \t\t<td>\n");
          out.write("\t                    \t\t\t<div id=\"pag\" class=\"paginator\">");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_0.setPageNumber(selectPage);
          _jspx_th_carbon_paginator_0.setNumberOfPages(pages);
          _jspx_th_carbon_paginator_0.setPage("index.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("selectPage");
          int _jspx_eval_carbon_paginator_0 = _jspx_th_carbon_paginator_0.doStartTag();
          if (_jspx_th_carbon_paginator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.reuse(_jspx_th_carbon_paginator_0);
            return;
          }
          _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.reuse(_jspx_th_carbon_paginator_0);
          out.write("</div>\n");
          out.write("\t                    \t\t</td>\n");
          out.write("                    \t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("            </table>\n");
          out.write("\n");
          out.write("            <div id=\"gadget-table\"><!-- takes from GadgetRepoItems-ajaxprocessor.jsp --></div>\n");
          out.write("\n");
          out.write("            <table style=\"float: right;\">\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <div id=\"pag1\" class=\"paginator\">");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_1.setPageNumber(selectPage);
          _jspx_th_carbon_paginator_1.setNumberOfPages(pages);
          _jspx_th_carbon_paginator_1.setPage("index.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("selectPage");
          int _jspx_eval_carbon_paginator_1 = _jspx_th_carbon_paginator_1.doStartTag();
          if (_jspx_th_carbon_paginator_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.reuse(_jspx_th_carbon_paginator_1);
            return;
          }
          _jspx_tagPool_carbon_paginator_pageNumberParameterName_pageNumber_page_numberOfPages_nobody.reuse(_jspx_th_carbon_paginator_1);
          out.write("</div>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("            </table>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
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
    _jspx_th_fmt_message_0.setKey("gadget.repository");
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
    _jspx_th_fmt_message_1.setKey("add.new.gadget");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }
}
