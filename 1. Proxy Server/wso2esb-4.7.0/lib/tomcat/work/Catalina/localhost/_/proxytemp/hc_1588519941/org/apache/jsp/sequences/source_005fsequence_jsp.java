package org.apache.jsp.sequences;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.mediator.service.builtin.SequenceMediator;
import org.wso2.carbon.sequences.ui.SequenceEditorConstants;
import org.wso2.carbon.sequences.ui.util.SequenceEditorHelper;
import java.util.ResourceBundle;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringEscapeUtils;

public final class source_005fsequence_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");

    ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.sequences.ui.i18n.Resources", request.getLocale());
    String sequenceName = request.getParameter("sequenceName");
    String onErrorKey = request.getParameter("onErrorKey");
    String sequenceXML = "";
    SequenceMediator sequence = SequenceEditorHelper.getEditingSequence(session);
    if (sequence == null) {
        session.setAttribute("sequence.error.message", bundle.getString("sequence.source.view.error"));

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    document.location.href = \"list_sequences.jsp\";\n");
      out.write("</script>\n");

    } else {

    if (onErrorKey != null && !"".equals(onErrorKey)) {
        SequenceEditorHelper.getEditingSequence(session).setErrorHandler(onErrorKey);
    }

    try {
        if (SequenceEditorConstants.ACTION_PARAM_VALUE_ADD.equals(
                SequenceEditorHelper.getEditingSequenceAction(session))) {
            if (sequenceName != null) {
                SequenceEditorHelper.getEditingSequence(session).setName(sequenceName);
            }
            sequenceXML = SequenceEditorHelper.parseSequenceToPrettyfiedString(
                    SequenceEditorHelper.getEditingSequence(session));
        } else if (SequenceEditorConstants.ACTION_PARAM_VALUE_ANONIFY.equals(
                SequenceEditorHelper.getEditingSequenceAction(session))) {
            if((String)session.getAttribute("sequence")!=null){
            sequenceXML = SequenceEditorHelper.parseAnonSequenceToPrettyfiedString(
                    SequenceEditorHelper.getEditingSequence(session), (String)session.getAttribute("sequence"));
            } else {
                sequenceXML = SequenceEditorHelper.parseAnonSequenceToPrettyfiedString(
                        SequenceEditorHelper.getEditingSequence(session));    
            }
        } else {
            sequenceXML = SequenceEditorHelper.parseSequenceToPrettyfiedString(
                    SequenceEditorHelper.getEditingSequence(session));
        }

        sequenceXML =  StringEscapeUtils.escapeXml(sequenceXML);
    } catch (Exception e) {
        session.setAttribute("sequence.error2.message", "" + e.getMessage());

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    document.location.href = \"design_sequence.jsp?ordinal=1\";\n");
      out.write("</script>\n");

        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \tvar xt=\"\",h3OK=1;\n");
      out.write("\tfunction checkErrorXML(x) {\n");
      out.write("\t    xt = \"\"\n");
      out.write("\t    h3OK = 1\n");
      out.write("\t    checkXML(x)\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction checkXML(n)\n");
      out.write("\t{\n");
      out.write("\t    var l,i,nam\n");
      out.write("\t    nam = n.nodeName\n");
      out.write("\t    if (nam == \"h3\")\n");
      out.write("\t    {\n");
      out.write("\t        if (h3OK == 0)\n");
      out.write("\t        {\n");
      out.write("\t            return;\n");
      out.write("\t        }\n");
      out.write("\t        h3OK = 0\n");
      out.write("\t    }\n");
      out.write("\t    if (nam == \"#text\")\n");
      out.write("\t    {\n");
      out.write("\t        xt = xt + n.nodeValue + \"\\n\"\n");
      out.write("\t    }\n");
      out.write("\t    l = n.childNodes.length\n");
      out.write("\t    for (i = 0; i < l; i++)\n");
      out.write("\t    {\n");
      out.write("\t        checkXML(n.childNodes[i])\n");
      out.write("\t    }\n");
      out.write("\t}\n");
      out.write("\tfunction validateXML(txt)\n");
      out.write("\t{\n");
      out.write("\t    // code for IE\n");
      out.write("\t    var error = \"\";\n");
      out.write("\t    if (window.ActiveXObject)\n");
      out.write("\t    {\n");
      out.write("\t        var xmlDoc = new ActiveXObject(\"Microsoft.XMLDOM\");\n");
      out.write("\t        xmlDoc.async = \"false\";\n");
      out.write("\t        xmlDoc.loadXML(txt);\n");
      out.write("\t\n");
      out.write("\t        if (xmlDoc.parseError.errorCode != 0)\n");
      out.write("\t        {\n");
      out.write("\t            txt = \"Error Code: \" + xmlDoc.parseError.errorCode + \"\\n\";\n");
      out.write("\t            txt = txt + \"Error Reason: \" + xmlDoc.parseError.reason;\n");
      out.write("\t            txt = txt + \"Error Line: \" + xmlDoc.parseError.line;\n");
      out.write("\t            error = txt;\n");
      out.write("\t        }\n");
      out.write("\t    }\n");
      out.write("\t    // code for Mozilla, Firefox, Opera, etc.\n");
      out.write("\t    else if (document.implementation.createDocument)\n");
      out.write("\t    {\n");
      out.write("\t        var parser = new DOMParser();\n");
      out.write("\t        var text = txt;\n");
      out.write("\t        var xmlDoc = parser.parseFromString(text, \"text/xml\");\n");
      out.write("\t\n");
      out.write("\t        if (xmlDoc.getElementsByTagName(\"parsererror\").length > 0)\n");
      out.write("\t        {\n");
      out.write("\t            checkErrorXML(xmlDoc.getElementsByTagName(\"parsererror\")[0]);\n");
      out.write("\t            error = xt;\n");
      out.write("\t        }\n");
      out.write("\t\n");
      out.write("\t    }\n");
      out.write("\t    return error;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("    function cancelSequence() {\n");
      out.write("        ");

        String annonOriginator = (String) session.getAttribute("sequenceAnonOriginator");
        if (annonOriginator != null && annonOriginator.equals("registry_sequence.jsp")) {
        
      out.write("\n");
      out.write("            window.location.href='");
      out.print(annonOriginator);
      out.write("' + '?cancelled=true';\n");
      out.write("        ");
} else {
        
      out.write("\n");
      out.write("            window.location.href = \"");
      out.print(SequenceEditorHelper.getForwardToFrom(session));
      out.write("\";\n");
      out.write("        ");
}
        
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function saveSequence() {\n");
      out.write("        document.getElementById(\"sequence_source\").value = editAreaLoader.getValue(\"sequence_source\");        \n");
      out.write("        document.seqSrcForm.action = \"save_sequence.jsp\";\n");
      out.write("        document.seqSrcForm.submit();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function saveSequenceAs() {\n");
      out.write("        var key = document.getElementById('synRegKey').value;\n");
      out.write("        if (key == '') {\n");
      out.write("            CARBON.showWarningDialog('Registry key must not be empty');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var registry;\n");
      out.write("        if (document.getElementById(\"config_reg\").checked == true) {\n");
      out.write("            registry = 'conf';\n");
      out.write("        } else {\n");
      out.write("            registry = 'gov';\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        document.seqSrcForm.action = \"save_sequence_as.jsp?regKey=\" + key+ \"&registry=\" + registry;\n");
      out.write("        document.seqSrcForm.submit();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function designView() {\n");
      out.write("        var source_form = document.getElementById(\"sequence.source.form\");\n");
      out.write("        var entryvalue = editAreaLoader.getValue(\"sequence_source\");\n");
      out.write("        document.getElementById(\"sequence_source\").value = entryvalue;\n");
      out.write("        var error = validateXML(entryvalue);\n");
      out.write("\tif(error != \"\")\n");
      out.write("\t{\n");
      out.write("\t\tCARBON.showErrorDialog(\"");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("<br />\"+ error);\n");
      out.write("\t\treturn false;\t\t\n");
      out.write("\t}\n");
      out.write("        source_form.action = \"design_sequence.jsp?ordinal=1\";\n");
      out.write("        source_form.submit();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function showSaveAsForm(show) {\n");
      out.write("        var formElem = document.getElementById('saveAsForm');\n");
      out.write("        if (show) {\n");
      out.write("            formElem.style.display = \"\";\n");
      out.write("\n");
      out.write("            var keyField = document.getElementById('synRegKey');\n");
      out.write("            if (keyField.value == '') {\n");
      out.write("                keyField.value =  document.getElementById('sequenceName').value;\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("            formElem.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.sequences.ui.i18n.Resources");
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
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("sequence.source.text");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.Resources");
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
          out.write("    <div id=\"middle\">\n");
          out.write("        <h2>");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("        <div id=\"workArea\">\n");
          out.write("            <form action=\"\" method=\"post\" id=\"sequence.source.form\" name=\"seqSrcForm\">\n");
          out.write("            <table class=\"styledLeft\" cellspacing=\"0\" cellpadding=\"0\">\n");
          out.write("                <thead>\n");
          out.write("                    <tr>\n");
          out.write("                        <th>\n");
          out.write("\t\t\t<span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span><a href=\"#\" onclick=\"designView()\" class=\"icon-link\" style=\"background-image:url(images/design-view.gif);\">");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                        </th>\n");
          out.write("                    </tr>\n");
          out.write("                </thead>\n");
          out.write("                <tbody>\n");
          out.write("                    <tr>\n");
          out.write("                        <td><font style=\"color:#333333; font-size:small;\">");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</font></td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td>\n");
          out.write("                            <textarea id=\"sequence_source\" name=\"sequenceXML\" style=\"border: 0px solid rgb(204, 204, 204); width: 99%; height: 400px; margin-top: 5px;\">");
          out.print( sequenceXML );
          out.write("</textarea>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td class=\"buttonRow\">\n");
          out.write("                            <input type=\"button\" class=\"button\" onclick=\"javascript: saveSequence();\" value=\"");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"/>\n");
          out.write("                            ");

                                if (SequenceEditorHelper.getEditingSequenceAction(session) != "anonify") {
                            
          out.write("\n");
          out.write("                            <input type=\"button\" class=\"button\" onclick=\"javascript: showSaveAsForm(true);\" value=\"");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"/>\n");
          out.write("                            ");

                                }
                            
          out.write("\n");
          out.write("                             <input type=\"button\" class=\"button\" onclick=\"javascript: cancelSequence(); return false;\" value=\"");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"/>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("                </form>\n");
          out.write("            <div style=\"display:none;\" id=\"saveAsForm\">\n");
          out.write("                <p>&nbsp;</p>\n");
          out.write("                <table class=\"styledLeft\">\n");
          out.write("                    <thead>\n");
          out.write("                        <tr>\n");
          out.write("                            <th colspan=\"2\">\n");
          out.write("                                <span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("                            </th>\n");
          out.write("                        </tr>\n");
          out.write("                    </thead>\n");
          out.write("                    <tbody>\n");
          out.write("                        <tr>\n");
          out.write("                            <td>\n");
          out.write("                                <table class=\"normal\">\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                            <input type=\"radio\" name=\"registry\" id=\"config_reg\" value=\"conf:\" checked=\"checked\" onclick=\"document.getElementById('reg').innerHTML='conf:';\"/>\n");
          out.write("                                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <input type=\"radio\" name=\"registry\" id=\"gov_reg\" value=\"gov:\" onclick=\"document.getElementById('reg').innerHTML='gov:';\"/>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                        <td><input type=\"text\" size=\"75\" id=\"synRegKey\"/><input type=\"hidden\" id=\"sequenceName\" value=\"");
 out.println(sequenceName);
          out.write("\"></td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </table>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        <tr>\n");
          out.write("                            <td class=\"buttonRow\">\n");
          out.write("                                <input type=\"button\" class=\"button\" value=\"");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"saveSynRegButton\" onclick=\"javascript: saveSequenceAs(); return false;\"/>\n");
          out.write("                                <input type=\"button\" class=\"button\" value=\"");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"cancelSynRegButton\" onclick=\"javascript: showSaveAsForm(false); return false;\">\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    </tbody>\n");
          out.write("                </table>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("        </div>\n");
          out.write("        ");

            if (session.getAttribute("sequence.error.message") != null) {
        
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            ");

                String seqErrorMsg = (String) session.getAttribute("sequence.error.message");
            
          out.write("\n");
          out.write("            jQuery(document).ready(function() {\n");
          out.write("                CARBON.showErrorDialog(\"");
          out.print( StringEscapeUtils.escapeXml(seqErrorMsg) );
          out.write("\");\n");
          out.write("            });\n");
          out.write("        </script>\n");
          out.write("        ");

                session.removeAttribute("sequence.error.message");
            }
        
          out.write("\n");
          out.write("\n");
          out.write("        ");

            if (session.getAttribute("sequence.warn.message") != null) {
        
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            ");

                String seqWarnMsg = (String) session.getAttribute("sequence.warn.message");
            
          out.write("\n");
          out.write("            jQuery(document).ready(function() {\n");
          out.write("                CARBON.showWarningDialog(\"");
          out.print( StringEscapeUtils.escapeXml(seqWarnMsg) );
          out.write("\");\n");
          out.write("            });\n");
          out.write("        </script>\n");
          out.write("        ");

                session.removeAttribute("sequence.warn.message");
            }
        
          out.write("\n");
          out.write("    </div>\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        editAreaLoader.init({\n");
          out.write("            id : \"sequence_source\"\t\t// textarea id\n");
          out.write("            ,syntax: \"xml\"\t\t\t// syntax to be uses for highgliting\n");
          out.write("            ,start_highlight: true\t\t// to display with highlight mode on start-up\n");
          out.write("        });\n");
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

    }

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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("invalid.value.error.parsing.xml");
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
    _jspx_th_fmt_message_1.setKey("sequence.source.header");
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
    _jspx_th_fmt_message_2.setKey("sequence.source.view.text");
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
    _jspx_th_fmt_message_3.setKey("sequence.switchto.design.text");
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
    _jspx_th_fmt_message_4.setKey("sequence.source.name.warning");
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
    _jspx_th_fmt_message_5.setKey("sequence.button.save.text");
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
    _jspx_th_fmt_message_6.setKey("sequence.button.saveas.text");
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
    _jspx_th_fmt_message_7.setKey("sequence.button.cancel.text");
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
    _jspx_th_fmt_message_8.setKey("sequence.save.as.title");
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
    _jspx_th_fmt_message_9.setKey("save.in");
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
    _jspx_th_fmt_message_10.setKey("config.registry");
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
    _jspx_th_fmt_message_11.setKey("gov.registry");
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
    _jspx_th_fmt_message_12.setKey("sequence.save.as.key");
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
    _jspx_th_fmt_message_13.setKey("sequence.button.save.text");
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
    _jspx_th_fmt_message_14.setKey("sequence.button.cancel.text");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }
}
