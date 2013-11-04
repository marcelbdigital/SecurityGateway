package org.apache.jsp.filter_002dmediator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.mediator.filter.FilterMediator;
import org.wso2.carbon.mediator.service.ui.Mediator;
import org.wso2.carbon.sequences.ui.util.SequenceEditorHelper;
import org.wso2.carbon.sequences.ui.util.ns.NameSpacesRegistrar;

public final class edit_002dmediator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Mediator mediator = SequenceEditorHelper.getEditingMediator(request, session);
    boolean isSourceXPath = false;
    String sourceVal = "", regEx = "", xpathVal = "";
    if (!(mediator instanceof FilterMediator)) {
        // todo : proper error handling
        throw new RuntimeException("Unable to edit the mediator");
    }
    FilterMediator filterMediator = (FilterMediator) mediator;
    if (filterMediator.getSource() != null && filterMediator.getRegex() != null) {
        isSourceXPath = true;
    } 
    if (filterMediator.getRegex() != null) {
        regEx = filterMediator.getRegex().toString();
    }
    if (filterMediator.getSource() != null) {
        NameSpacesRegistrar nmspRegistrar = NameSpacesRegistrar.getInstance();
        nmspRegistrar.registerNameSpaces(filterMediator.getSource(), "mediator.filter.source_val", session);
        sourceVal = filterMediator.getSource().toString();
        sourceVal = sourceVal.replace("\"","&quot;");//replace quote sign with &quot;
    } else if (filterMediator.getXpath() != null) {
        NameSpacesRegistrar nmspRegistrar = NameSpacesRegistrar.getInstance();
        nmspRegistrar.registerNameSpaces(filterMediator.getXpath(), "mediator.filter.xpath_val", session);
        xpathVal = filterMediator.getXpath().toString();
    }


      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.mediator.filter.ui.i18n.Resources");
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
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.mediator.filter.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("filterMediatorJsi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("    \n");
          out.write("<div>\n");
          out.write("    <script type=\"text/javascript\" src=\"../filter-mediator/js/mediator-util.js\"></script>\n");
          out.write("<table class=\"normal\" width=\"100%\">\n");
          out.write("    <tr>\n");
          out.write("        <td><h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2></td>\n");
          out.write("    </tr>\n");
          out.write("    <tr>\n");
          out.write("        <td>\n");
          out.write("            <table class=\"normal\">\n");
          out.write("                <tbody>\n");
          out.write("                    <tr>\n");
          out.write("                        <td style=\"width:80px;\">");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                        <td style=\"width:80px\">\n");
          out.write("                            <input id=\"xpath\" type=\"radio\"\n");
          out.write("                                   name=\"mediator.filter.type\" ");
          out.print(!isSourceXPath ? "checked=\"checked\"" : "");
          out.write("\n");
          out.write("                                   onclick=\" javascript:displayElement('mediator.filter.reg_ex', false); displayElement('mediator.filter.xpath', true); displayElement('mediator.filter.source', false);\"\n");
          out.write("                                   value=\"xpath\"/>");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            <input id=\"xpathRex\" type=\"radio\"\n");
          out.write("                                   name=\"mediator.filter.type\" ");
          out.print(isSourceXPath ? "checked=\"checked\"" : "");
          out.write("\n");
          out.write("                                   onclick=\" javascript:displayElement('mediator.filter.reg_ex', true); displayElement('mediator.filter.xpath', false); displayElement('mediator.filter.source', true);\"\n");
          out.write("                                   value=\"xpathRegx\"/>");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("        </td>\n");
          out.write("    </tr>\n");
          out.write("    <tr>\n");
          out.write("        <td>\n");
          out.write("            <table border=\"0\" class=\"normal\">\n");
          out.write("                <tbody>\n");
          out.write("                    <tr id=\"mediator.filter.xpath\" ");
          out.print(isSourceXPath ? "style=\"display:none\"" : "");
          out.write(">\n");
          out.write("                        <td style=\"width: 80px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <font style=\"color: red; font-size: 8pt;\"> *</font>\n");
          out.write("                        </td>\n");
          out.write("                        <td style=\"width: 305px;\">\n");
          out.write("                            <input id=\"filter_xpath\" name=\"mediator.filter.xpath_val\" type=\"text\" value=\"");
          out.print(xpathVal);
          out.write("\"\n");
          out.write("                                   style=\"width: 300px;\"/>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            <a href=\"#\"\n");
          out.write("                               id=\"mediator.callout.target.xpath_nmsp_button\"\n");
          out.write("                               onclick=\"showNameSpaceEditor('mediator.filter.xpath_val');\" class=\"nseditor-icon-link\"\n");
          out.write("                                style=\"padding-left:40px\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr id=\"mediator.filter.source\" ");
          out.print(!isSourceXPath ? "style=\"display:none\"" : "");
          out.write(">\n");
          out.write("                        <td style=\"width: 80px;\">\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <font style=\"color: red; font-size: 8pt;\"> *</font>\n");
          out.write("                        </td>\n");
          out.write("                        <td style=\"width: 305px;\">\n");
          out.write("                            <input id=\"filter_src\" name=\"mediator.filter.source_val\" type=\"text\" value=\"");
          out.print(sourceVal);
          out.write("\"\n");
          out.write("                                   style=\"width: 300px;\"/>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            <a href=\"#\"\n");
          out.write("                               id=\"mediator.callout.target.xpath_nmsp\"\n");
          out.write("                               onclick=\"showNameSpaceEditor('mediator.filter.source_val');\" class=\"nseditor-icon-link\"\n");
          out.write("                                style=\"padding-left:40px\">\n");
          out.write("                                ");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr id=\"mediator.filter.reg_ex\" ");
          out.print(!isSourceXPath ? "style=\"display:none\"" : "");
          out.write(">\n");
          out.write("                        <td>\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            <font style=\"color: red; font-size: 8pt;\"> *</font>\n");
          out.write("                        </td>\n");
          out.write("                        <td>\n");
          out.write("                            <input id=\"filter_regex\" name=\"mediator.filter.regex_val\" type=\"text\" size=\"40\"\n");
          out.write("                                   value=\"");
          out.print(regEx);
          out.write("\" style=\"width: 300px;\"/>\n");
          out.write("                        </td>\n");
          out.write("                        <td></td>\n");
          out.write("                    </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("        </td>\n");
          out.write("    </tr>\n");
          out.write("    <tr style=\"display:none;\">\n");
          out.write("        <td>\n");
          out.write("            <div id=\"nsEditor\" style=\"display:none;\"/>\n");
          out.write("        </td>\n");
          out.write("    </tr>\n");
          out.write("</table>\n");
          out.write("    <br/>\n");
          out.write("</div>\n");
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
    _jspx_th_fmt_message_0.setKey("mediator.filter.header");
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
    _jspx_th_fmt_message_1.setKey("mediator.filter.specify");
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
    _jspx_th_fmt_message_2.setKey("mediator.filter.xpath");
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
    _jspx_th_fmt_message_3.setKey("mediator.filter.sourceExpr");
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
    _jspx_th_fmt_message_4.setKey("mediator.filter.xpath");
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
    _jspx_th_fmt_message_5.setKey("mediator.filter.namespace");
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
    _jspx_th_fmt_message_6.setKey("mediator.filter.source");
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
    _jspx_th_fmt_message_7.setKey("mediator.filter.namespace");
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
    _jspx_th_fmt_message_8.setKey("mediator.filter.regex");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }
}
