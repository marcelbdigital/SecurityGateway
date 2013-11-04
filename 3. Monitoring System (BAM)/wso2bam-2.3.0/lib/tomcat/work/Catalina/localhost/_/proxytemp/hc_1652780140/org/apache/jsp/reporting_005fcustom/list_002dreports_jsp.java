package org.apache.jsp.reporting_005fcustom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.reporting.custom.ui.client.DBReportingServiceClient;
import org.wso2.carbon.reporting.custom.ui.client.ReportResourceSupplierClient;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.reporting.custom.ui.client.ReportTemplateClient;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.utils.ServerConstants;

public final class list_002dreports_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    boolean isTemplate = true;
    try {
        Class.forName("org.wso2.carbon.reporting.template.ui.client.ReportTemplateClient");
    } catch (ClassNotFoundException e) {
        isTemplate = false;
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if (isTemplate) {

      out.write('\n');
      out.write('\n');

    }

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
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.reporting.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    <script type=\"text/javascript\" src=\"../js/reporting-commons.js\"></script>\n");
          out.write("    <script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\n");
          out.write("\n");
          out.write("    ");

        ReportResourceSupplierClient resourcesSupplier = ReportResourceSupplierClient.getInstance(config, session);
        String[] reports = new String[0];
        String error2 = "Failed to get report list";

        String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);

        try {
            reports = resourcesSupplier.getAllReports();
        } catch (Exception e) {
            request.setAttribute(CarbonUIMessage.ID, new CarbonUIMessage(error2, e.getMessage(), e));
    
          out.write("\n");
          out.write("    ");
          if (true) {
            _jspx_page_context.forward("../admin/error.jsp");
            return;
          }
          out.write("\n");
          out.write("    ");

        }

    
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("report.manage.menu.text");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.reporting.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(true);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\n");
          out.write("    <br/>\n");
          out.write("\n");
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <br/>\n");
          out.write("\n");
          out.write("            <form action=\"../dbreport\" id=\"report-form\" name=\"reportConfig\" method=\"post\"\n");
          out.write("                  target=\"_blank\">\n");
          out.write("                <table class=\"styledLeft\" id=\"table1\">\n");
          out.write("                    <thead>\n");
          out.write("                    <th class=\"tableOddRow\" colspan=\"3\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </th>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("                    ");

                        if (reports != null && reports.length > 0) {
                            for (int i = 0; i < reports.length; i++) {
                                if (reports[i] != null) {
                    
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>\n");
          out.write("                            <label>\n");
          out.write("                                ");

                                    String directTo = "";
                                    if (isTemplate) {
                                        ReportTemplateClient client = null;
                                        try {
                                            client = new ReportTemplateClient(configContext, serverURL, cookie);
                                            if (client.isReportTemplate(reports[i])) {
                                                directTo = "../reporting-template/template-report-generator.jsp?reportName=" + reports[i];
                                            } else {
                                                directTo = "report-details.jsp?reportName=" + reports[i];
                                            }
                                        } catch (Exception e) {
                                            directTo = "report-details.jsp?reportName=" + reports[i];
                                        }
                                    } else {
                                        directTo = "report-details.jsp?reportName=" + reports[i];
                                    }

                                
          out.write("\n");
          out.write("                                <a id=\"reportName");
          out.print(i);
          out.write("\" name=\"reportName\"\n");
          out.write("                                   href=\"");
          out.print(directTo);
          out.write('"');
          out.write('>');
          out.print(reports[i]);
          out.write("\n");
          out.write("                                </a>\n");
          out.write("                            </label>\n");
          out.write("                        </td>\n");
          out.write("                        <td style=\"vertical-align:top !important;\"><a class=\"edit-icon-link\"\n");
          out.write("                                                                      href=\"template-editer.jsp?reportName=");
          out.print(reports[i]);
          out.write("\">Edit</a>\n");
          out.write("                            <a onclick=\"deleteRow('");
          out.print(reports[i]);
          out.write("','Do you want to delete')\"\n");
          out.write("                               class=\"delete-icon-link\" href=\"#\" style=\"margin-left:50px\">Delete</a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    ");

                            }
                        }
                    } else {
                    
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td colspan=\"2\">");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\n");
          out.write("                    </tr>\n");
          out.write("                    ");

                        }
                    
          out.write("\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("\n");
          out.write("            </form>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        alternateTableRows('table1', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        alternateTableRows('table2', 'tableEvenRow', 'tableOddRow');\n");
          out.write("    </script>\n");
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
    _jspx_th_fmt_message_0.setKey("available.report");
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
    _jspx_th_fmt_message_1.setKey("report.templates");
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
    _jspx_th_fmt_message_2.setKey("report.notemplates");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }
}
