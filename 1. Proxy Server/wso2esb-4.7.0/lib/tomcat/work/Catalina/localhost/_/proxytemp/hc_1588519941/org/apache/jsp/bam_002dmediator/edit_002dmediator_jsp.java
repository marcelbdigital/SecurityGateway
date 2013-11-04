package org.apache.jsp.bam_002dmediator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.mediator.bam.ui.BamMediator;
import org.wso2.carbon.mediator.service.ui.Mediator;
import org.wso2.carbon.sequences.ui.util.SequenceEditorHelper;
import org.wso2.carbon.sequences.ui.util.ns.NameSpacesRegistrar;

public final class edit_002dmediator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public static final String SERVER_PROFILE_LOCATION = "bamServerProfiles";

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
      out.write('\n');
      out.write('\n');

    Mediator mediator = SequenceEditorHelper.getEditingMediator(request, session);

    
    if (!(mediator instanceof BamMediator)) {
        // todo : proper error handling
        throw new RuntimeException("Unable to edit the mediator");
    }
    BamMediator bamMediator = (BamMediator) mediator;

    String serverProfilePath = "";
    String streamName = "";
    String streamVersion = "";


    if(bamMediator.getServerProfile() != null){
        serverProfilePath = bamMediator.getServerProfile();
    }

    if(bamMediator.getStreamName() != null){
        streamName = bamMediator.getStreamName();
    }

    if(bamMediator.getStreamVersion() != null){
        streamVersion = bamMediator.getStreamVersion();
    }


      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.mediator.bam.ui.i18n.Resources");
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
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.mediator.bam.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("propertyMediatorJsi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("    <div>\n");
          out.write("        <script type=\"text/javascript\" src=\"../bam-mediator/js/mediator-util.js\"></script>\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("\n");
          out.write("            function loadServerProfiles(serverProfileLocationPath, serverProfilePath) {\n");
          out.write("                jQuery.ajax({\n");
          out.write("                                type:\"GET\",\n");
          out.write("                                url:\"../bam-mediator/dropdown_ajaxprocessor.jsp\",\n");
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
          out.write("            function loadStreamNames(serverProfilePath, streamName) {\n");
          out.write("                jQuery.ajax({\n");
          out.write("                                type:\"GET\",\n");
          out.write("                                url:\"../bam-mediator/dropdown_ajaxprocessor.jsp\",\n");
          out.write("                                data:{action:\"getStreamNames\", serverProfilePath:serverProfilePath},\n");
          out.write("                                success:function(data){\n");
          out.write("                                    document.getElementById(\"streamNameList\").innerHTML = \"\";\n");
          out.write("                                    jQuery(\"#streamNameList\").append(\"<option>- Select Stream Name -</option>\");\n");
          out.write("                                    jQuery(\"#streamNameList\").append(data);\n");
          out.write("                                    if(streamName != null && streamName != \"\"){\n");
          out.write("                                        document.getElementById(\"streamNameList\").value = streamName;\n");
          out.write("                                    }\n");
          out.write("                                    document.getElementById('streamNameList').disabled = \"\";\n");
          out.write("                                }\n");
          out.write("                            })\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function loadStreamVersions(serverProfilePath, streamName, streamVersion) {\n");
          out.write("                jQuery.ajax({\n");
          out.write("                                type:\"GET\",\n");
          out.write("                                url:\"../bam-mediator/dropdown_ajaxprocessor.jsp\",\n");
          out.write("                                data:{action:\"getStreamVersions\", serverProfilePath:serverProfilePath, streamName:streamName},\n");
          out.write("                                success:function(data){\n");
          out.write("                                    document.getElementById(\"streamVersionList\").innerHTML = \"\";\n");
          out.write("                                    jQuery(\"#streamVersionList\").append(\"<option>- Select Stream Version -</option>\");\n");
          out.write("                                    jQuery(\"#streamVersionList\").append(data);\n");
          out.write("                                    if(streamVersion != null && streamVersion != \"\" && document.getElementById(\"streamVersionList\").value != null){\n");
          out.write("                                        document.getElementById(\"streamVersionList\").value = streamVersion;\n");
          out.write("                                    }\n");
          out.write("                                    document.getElementById('streamVersionList').disabled = \"\";\n");
          out.write("                                }\n");
          out.write("                            })\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function onServerProfileSelected(parentPath){\n");
          out.write("                loadStreamNames(parentPath + \"/\" + document.getElementById('serverProfileList').value, \"\");\n");
          out.write("                document.getElementById('streamNameList').disabled = \"\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function selectStreamVersionList(parentPath){\n");
          out.write("                loadStreamVersions(parentPath + \"/\" + document.getElementById('serverProfileList').value, document.getElementById('streamNameList').value);\n");
          out.write("                document.getElementById('streamVersionList').disabled = \"\";\n");
          out.write("            }\n");
          out.write("\n");
          out.write("        </script>\n");
          out.write("\n");
          out.write("\n");
          out.write("        <table class=\"normal\" width=\"100%\">\n");
          out.write("            <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"4\">\n");
          out.write("                    <h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"4\">\n");
          out.write("                    <h3 class=\"mediator\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </h3>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    <select name=\"serverProfileList\" id=\"serverProfileList\" onchange=\"onServerProfileSelected('");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("')\">\n");
          out.write("                        <option>- Select Server Profile -</option>\n");
          out.write("                    </select>\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        loadServerProfiles(\"");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("\", \"");
          out.print(serverProfilePath);
          out.write("\");\n");
          out.write("                    </script>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            <tr>\n");
          out.write("                <td colspan=\"4\">\n");
          out.write("                    <h3 class=\"mediator\">\n");
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
          out.write("                    <select name=\"streamNameList\" id=\"streamNameList\" disabled=\"disabled\" onchange=\"selectStreamVersionList('");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("')\">\n");
          out.write("                        <option>- Select Stream Name -</option>\n");
          out.write("                    </select>\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        if(\"\" != \"");
          out.print(serverProfilePath);
          out.write("\"){\n");
          out.write("                            loadStreamNames(\"");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("\" + \"/\" + \"");
          out.print(serverProfilePath);
          out.write("\", \"");
          out.print(streamName);
          out.write("\");\n");
          out.write("                        }\n");
          out.write("                    </script>\n");
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
          out.write("                    <select name=\"streamVersionList\" id=\"streamVersionList\" disabled=\"disabled\">\n");
          out.write("                        <option>- Select Stream Version -</option>\n");
          out.write("                    </select>\n");
          out.write("                    <script type=\"text/javascript\">\n");
          out.write("                        if(\"\" != \"");
          out.print(serverProfilePath);
          out.write("\"){\n");
          out.write("                            loadStreamVersions(\"");
          out.print(SERVER_PROFILE_LOCATION);
          out.write("\" + \"/\" + \"");
          out.print(serverProfilePath);
          out.write("\", \"");
          out.print(streamName);
          out.write("\", \"");
          out.print(streamVersion);
          out.write("\");\n");
          out.write("                        }\n");
          out.write("                    </script>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </table>\n");
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
    _jspx_th_fmt_message_0.setKey("bam.mediator");
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
    _jspx_th_fmt_message_1.setKey("server.profile.header");
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
    _jspx_th_fmt_message_2.setKey("server.profile");
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
    _jspx_th_fmt_message_3.setKey("stream.configuration");
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
    _jspx_th_fmt_message_4.setKey("stream.name");
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
    _jspx_th_fmt_message_5.setKey("stream.version");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }
}
