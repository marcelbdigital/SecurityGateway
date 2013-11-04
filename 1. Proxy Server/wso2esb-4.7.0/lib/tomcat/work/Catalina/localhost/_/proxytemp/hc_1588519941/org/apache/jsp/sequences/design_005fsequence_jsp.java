package org.apache.jsp.sequences;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.commons.lang.StringEscapeUtils;
import org.wso2.carbon.mediator.service.MediatorStore;
import org.wso2.carbon.mediator.service.builtin.SequenceMediator;
import org.wso2.carbon.mediator.service.ui.Mediator;
import org.wso2.carbon.sequences.ui.client.SequenceAdminClient;
import org.wso2.carbon.sequences.ui.SequenceEditorConstants;
import org.wso2.carbon.sequences.ui.util.SequenceEditorHelper;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.ResourceBundle;
import org.wso2.carbon.sequences.ui.client.EditorUIClient;
import org.wso2.carbon.mediation.service.templates.TemplateMediator;
import java.util.Iterator;

public final class design_005fsequence_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.sequences.ui.i18n.Resources", request.getLocale());
    String name = request.getParameter("sequenceName");
    String sequenceXML = request.getParameter("sequenceXML");
    String action = request.getParameter("sequenceAction");
    SequenceMediator sequence;
    if (action != null) {
        if (name != null) {
            org.wso2.carbon.sequences.ui.client.EditorUIClient sequenceClient
                    = SequenceEditorHelper.getClientForEditor(getServletConfig(), session);//new SequenceAdminClient(getServletConfig(), session);
            sequence = sequenceClient.getSequenceMediator(name);
        } else {
            sequence = SequenceEditorHelper.getSequenceForEditor(session);//new SequenceMediator();
        }
        session.setAttribute("editingSequenceAction", action);
    } else if (sequenceXML != null && !"".equals(sequenceXML)) {
        if (SequenceEditorConstants.ACTION_PARAM_VALUE_ANONIFY.equals(
                SequenceEditorHelper.getEditingSequenceAction(session))) {
            OMElement elem = SequenceEditorHelper.parseStringToElement(sequenceXML);
            // changes the inSequence or outSequence or faultSequence to just sequence
            if ("sequence".equals(SequenceEditorHelper.getEditorMode(session))) {
                elem.setLocalName("sequence");
            }
            OMAttribute nameAttr = elem.getAttribute(new QName("name"));
            if (nameAttr != null) {
                nameAttr.setAttributeValue("__anonSequence__");
            } else {
                OMFactory fac = elem.getOMFactory();
                elem.addAttribute("name", "__anonSequence__", fac.createOMNamespace("", ""));
            }
            sequenceXML = elem.toString().trim();
        }
        try {
            sequence = SequenceEditorHelper.parseStringToSequence(sequenceXML);
        } catch (Exception e) {
            session.setAttribute("sequence.error.message", bundle.getString("sequence.source.invalid") + e.getMessage());

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    document.location.href = \"source_sequence.jsp?ordinal=1\";\r\n");
      out.write("</script>\r\n");

            return;
        }
    } else {
        sequence = SequenceEditorHelper.getEditingSequence(session);
    }

    if (sequence == null) {
        session.setAttribute("sequence.error.message", bundle.getString("sequence.design.view.error"));

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    document.location.href = \"list_sequences.jsp\";\r\n");
      out.write("</script>\r\n");

    } else {
    session.setAttribute("editingSequence", sequence);

    // gets the sequence, i.e. in/out/fault
    String seq = (String) session.getAttribute("sequence");
    HashMap<String, HashMap<String, String>> mediatorMap
            = MediatorStore.getInstance().getMediatorMenuItems();


      out.write("\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/tree-styles.css\"/>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/menu-styles.css\"/>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    .mediator-links{\r\n");
      out.write("        position:absolute;\r\n");
      out.write("        margin-left:95px;\r\n");
      out.write("    }\r\n");
      out.write("    .mediator-link-top, .mediator-link-bottom {\r\n");
      out.write("        display:block;\r\n");
      out.write("        background-image:url(images/add.gif);\r\n");
      out.write("        background-repeat:no-repeat;\r\n");
      out.write("        background-position:0 0;\r\n");
      out.write("        font-size:9px !important;\r\n");
      out.write("        color:#000 !important;\r\n");
      out.write("        font-weight:bold;\r\n");
      out.write("        line-height:12px !important;  height:auto !important;\r\n");
      out.write("    }\r\n");
      out.write("    .mediator-link-top img, .mediator-link-bottom img {\r\n");
      out.write("        border:0px;\r\n");
      out.write("        vertical-align:middle;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/container/container_core-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/yahoo/yahoo-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/event/event-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/connection/connection-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/menu/menu-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/resource_util.js\"></script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../resources/resources-i18n-ajaxprocessor.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/registry.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/tabs.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/mediator-menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/ns-editor.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/form.js\"></script>\r\n");
if (sequence instanceof TemplateMediator){
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../templates/js/template_param.js\"></script>\r\n");
}
      out.write("\r\n");
      out.write("<script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../sequences/js/registry-browser.js\"></script>\r\n");
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
          out.write('\r');
          out.write('\n');
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("seqEditi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("\r\n");
          out.write("    var currentMedTLN = \"\";\r\n");
          out.write("\r\n");
          out.write("    // Creating the menu\r\n");
          out.write("    var oMenu = new YAHOO.widget.Menu(\"basicmenu\");\r\n");
          out.write("\r\n");
          out.write("    var aMenuItems = [\r\n");
          out.write("        ");
 for (String group : mediatorMap.keySet()) {
            HashMap<String, String> childMenu = mediatorMap.get(group);
        
          out.write("\r\n");
          out.write("            {\r\n");
          out.write("                text: \"");
          out.print( group );
          out.write("\", submenu: {\r\n");
          out.write("                    id: \"submenu");
          out.print( group );
          out.write("\",\r\n");
          out.write("                    itemdata: [\r\n");
          out.write("                        ");
 for (String logicalName : childMenu.keySet()) {
          out.write("\r\n");
          out.write("                            {text: \"");
          out.print( childMenu.get(logicalName) );
          out.write("\", id: \"");
          out.print( logicalName );
          out.write("\"},\r\n");
          out.write("                        ");
 } 
          out.write("\r\n");
          out.write("                    ]\r\n");
          out.write("                }\r\n");
          out.write("            },\r\n");
          out.write("        ");
}
          out.write("\r\n");
          out.write("        ];\r\n");
          out.write("\r\n");
          out.write("    oMenu.addItems(aMenuItems);\r\n");
          out.write("\r\n");
          out.write("    jQuery(document).ready(function() {\r\n");
          out.write("        initMediators();\r\n");
          out.write("        showHideName();\r\n");
          out.write("        ");
 if (session.getAttribute("mediator.position") != null) { 
          out.write("\r\n");
          out.write("            showMediatorConfig('");
          out.print(session.getAttribute("mediator.position"));
          out.write("')\r\n");
          out.write("        ");
 } 
          out.write("\r\n");
          out.write("    });\r\n");
          out.write("\r\n");
          out.write("    function showMediatorConfig(mediatorPosition) {\r\n");
          out.write("        var allDivs = document.getElementById(\"treePane\").getElementsByTagName(\"*\");\r\n");
          out.write("        var mediatorNodes = new Array();\r\n");
          out.write("        var toolbarNodes = new Array();\r\n");
          out.write("\r\n");
          out.write("        for (var i = 0; i < allDivs.length; i++) {\r\n");
          out.write("            if (YAHOO.util.Dom.hasClass(allDivs[i], \"mediatorLink\")) {\r\n");
          out.write("                mediatorNodes.push(allDivs[i]);\r\n");
          out.write("            }\r\n");
          out.write("            if (YAHOO.util.Dom.hasClass(allDivs[i], \"sequenceToolbar\")) {\r\n");
          out.write("                toolbarNodes.push(allDivs[i]);\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("\r\n");
          out.write("        for (i = 0; i < mediatorNodes.length; i++) {\r\n");
          out.write("            if (mediatorNodes[i].getAttribute(\"id\") == mediatorPosition) {\r\n");
          out.write("                mediatorCallback(null, [mediatorNodes[i],mediatorNodes[i].id,mediatorNodes,toolbarNodes]);\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function showHideName() {\r\n");
          out.write("        if ('");
          out.print(SequenceEditorHelper.getEditingSequenceAction(session));
          out.write("' == 'anonify' && '");
          out.print(session.getAttribute("sequenceAnonOriginator"));
          out.write("' != \"registry_sequence.jsp\") {\r\n");
          out.write("            document.getElementById('sequenceNameSection').style.display =\"none\";\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function sourceView() {\r\n");
          out.write("        var mediatorSource = document.getElementById(\"mediatorSource\");\r\n");
          out.write("\r\n");
          out.write("        ");
if (sequence instanceof TemplateMediator){
          out.write("\r\n");
          out.write("            handleParamAdd('template', getParamCount());\r\n");
          out.write("        ");

        }
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("        if (mediatorSource && mediatorSource.style.display != \"none\") {\r\n");
          out.write("            if (document.getElementById(\"mediator-source-form\") != 'undefined' && document.getElementById(\"mediator-source-form\") != undefined) {\r\n");
          out.write("                var options = {\r\n");
          out.write("                    beforeSubmit:  addCustomParam,  // pre-submit callback\r\n");
          out.write("                    success:       directToViewSource  // post-submit callback\r\n");
          out.write("                };\r\n");
          out.write("\r\n");
          out.write("                var funcName = currentMedTLN + \"MediatorValidate\";\r\n");
          out.write("                if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("                    if (eval(funcName + \"()\")) {\r\n");
          out.write("                        jQuery('#mediator-source-form').ajaxForm(options);\r\n");
          out.write("                    } else {\r\n");
          out.write("                        return;\r\n");
          out.write("                    }\r\n");
          out.write("                } else {\r\n");
          out.write("                    jQuery('#mediator-source-form').ajaxForm(options);\r\n");
          out.write("                }\r\n");
          out.write("                jQuery('#mediator-source-form').submit();\r\n");
          out.write("            } else {\r\n");
          out.write("                directToViewSource();\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        var mediatorDesign = document.getElementById(\"mediatorDesign\");\r\n");
          out.write("        if (mediatorDesign && mediatorDesign.style.display != \"none\") {\r\n");
          out.write("            if (document.getElementById(\"mediator-editor-form\") != 'undefined' && document.getElementById(\"mediator-editor-form\") != undefined) {\r\n");
          out.write("                var options = {\r\n");
          out.write("                    beforeSubmit:  addCustomParam,  // pre-submit callback\r\n");
          out.write("                    success:       directToViewSource  // post-submit callback\r\n");
          out.write("                };\r\n");
          out.write("\r\n");
          out.write("                var funcName = currentMedTLN + \"MediatorValidate\";\r\n");
          out.write("                if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("                    if (eval(funcName + \"()\")) {\r\n");
          out.write("                        jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                    } else {\r\n");
          out.write("                        return;\r\n");
          out.write("                    }\r\n");
          out.write("                } else {\r\n");
          out.write("                    jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                }\r\n");
          out.write("                jQuery('#mediator-editor-form').submit();\r\n");
          out.write("            } else {\r\n");
          out.write("                directToViewSource();\r\n");
          out.write("            }\r\n");
          out.write("        } else {\r\n");
          out.write("            directToViewSource();\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function directToViewSource() {\r\n");
          out.write("        document.location.href = \"source_sequence.jsp?ordinal=1&sequenceName=\" + document.getElementById(\"sequence.name\").value + \"&onErrorKey=\"\r\n");
          out.write("                + document.getElementById(\"sequence.onerror.key\").value + \"&seqDescription=\" + document.getElementById(\"seqeunceDescription\").value;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function cancelSequence() {\r\n");
          out.write("    ");

           String annonOriginator = (String) session.getAttribute("sequenceAnonOriginator");
           if (annonOriginator != null && !annonOriginator.equals("../sequences/design_sequence.jsp")) {
          out.write("\r\n");
          out.write("                window.location.href='");
          out.print(session.getAttribute("sequenceAnonOriginator"));
          out.write("' + '?cancelled=true';\r\n");
          out.write("            ");
} else {
          out.write("\r\n");
          out.write("                window.location.href = \"");
          out.print(SequenceEditorHelper.getForwardToFrom(session));
          out.write("\";\r\n");
          out.write("            ");
}
        
          out.write("\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function saveSequence() {\r\n");
          out.write("        var options = {\r\n");
          out.write("               // dataType: 'text/xml',\r\n");
          out.write("                success:       onUpdSuccess  // post-submit callback\r\n");
          out.write("            };\r\n");
          out.write("\r\n");
          out.write("        ");
if (sequence instanceof TemplateMediator){
          out.write("\r\n");
          out.write("            handleParamAdd('template', getParamCount());\r\n");
          out.write("        ");

        }
        
          out.write("\r\n");
          out.write("        var mediator_edit_tab = document.getElementById('mediator-edit-tab');\r\n");
          out.write("        var mediatorDesign = document.getElementById(\"mediatorDesign\");\r\n");
          out.write("        var mediatorSource = document.getElementById(\"mediatorSource\");\r\n");
          out.write("        if (mediator_edit_tab && mediator_edit_tab.style.display != \"none\") {\r\n");
          out.write("            if (mediatorDesign && mediatorDesign.style.display != \"none\") {\r\n");
          out.write("                var funcName = currentMedTLN + \"MediatorValidate\";\r\n");
          out.write("                if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("                    if (eval(funcName + \"()\")) {\r\n");
          out.write("                        jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                        jQuery('#mediator-editor-form').submit();\r\n");
          out.write("                    } else {\r\n");
          out.write("                        return false;\r\n");
          out.write("                    }\r\n");
          out.write("                } else {\r\n");
          out.write("                    jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                    jQuery('#mediator-editor-form').submit();\r\n");
          out.write("                }\r\n");
          out.write("            } else if (mediatorSource && mediatorSource.style.display != \"none\") { \r\n");
          out.write("\t            YAHOO.util.Event.onAvailable(\"mediatorSrc\", \r\n");
          out.write("\t            \tfunction() {\r\n");
          out.write("\t            \t\tdocument.getElementById(\"mediatorSrc\").value = editAreaLoader.getValue(\"mediatorSrc\");\r\n");
          out.write("\t            \t}\r\n");
          out.write("\t            );              \r\n");
          out.write("                \r\n");
          out.write("                    jQuery('#mediator-source-form').ajaxForm(options);\r\n");
          out.write("                    jQuery('#mediator-source-form').submit();\r\n");
          out.write("            }\r\n");
          out.write("        } else {\r\n");
          out.write("            onUpdSuccess();\r\n");
          out.write("        }\r\n");
          out.write("        return true;\r\n");
          out.write("\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function onUpdSuccess() {\r\n");
          out.write("        if ('");
          out.print(SequenceEditorHelper.getEditingSequenceAction(session));
          out.write("' == 'anonify') {\r\n");
          out.write("            var seqName = document.getElementById(\"sequence.name\").value;\r\n");
          out.write("            var onErrorKey = document.getElementById(\"sequence.onerror.key\").value;\r\n");
          out.write("            var seqDescription = document.getElementById(\"seqeunceDescription\").value;\r\n");
          out.write("            if (onErrorKey != '') {\r\n");
          out.write("                document.location.href = \"save_sequence.jsp?sequence=");
          out.print(seq);
          out.write("&onErrorKey=\"\r\n");
          out.write("                        + onErrorKey;\r\n");
          out.write("            } else if (seqDescription != ''){\r\n");
          out.write("                 document.location.href = \"save_sequence.jsp?sequence=");
          out.print(seq);
          out.write("\"\r\n");
          out.write("                        +\"&seqDescription=\" + seqDescription;\r\n");
          out.write("            } else {\r\n");
          out.write("                document.location.href = \"save_sequence.jsp?sequence=");
          out.print(seq);
          out.write("\";\r\n");
          out.write("            }\r\n");
          out.write("        } else {\r\n");
          out.write("            var seqName = document.getElementById(\"sequence.name\").value;\r\n");
          out.write("            var onErrorKey = document.getElementById(\"sequence.onerror.key\").value;\r\n");
          out.write("            var seqDescription = document.getElementById(\"seqeunceDescription\").value;\r\n");
          out.write("            if (seqName == \"\") {\r\n");
          out.write("                CARBON.showWarningDialog('");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("                return;\r\n");
          out.write("            }\r\n");
          out.write("            document.location.href = \"save_sequence.jsp?sequenceName=\" + seqName\r\n");
          out.write("                    + \"&onErrorKey=\" + onErrorKey + \"&seqDescription=\" + seqDescription;\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("    function saveSequenceAs() {\r\n");
          out.write("\r\n");
          out.write("        if ('");
          out.print(SequenceEditorHelper.getEditingSequenceAction(session));
          out.write("' == 'anonify') {\r\n");
          out.write("            CARBON.showErrorDialog('Unable to save the sequence to the synapse registry in current mode');\r\n");
          out.write("            return false;\r\n");
          out.write("        }\r\n");
          out.write("\r\n");
          out.write("         ");
if (sequence instanceof TemplateMediator){
          out.write("\r\n");
          out.write("            handleParamAdd('template', getParamCount());\r\n");
          out.write("        ");

        }
        
          out.write("\r\n");
          out.write("        var key = document.getElementById('synRegKey').value;\r\n");
          out.write("        if (key == '') {\r\n");
          out.write("            CARBON.showWarningDialog('The key value must not be empty when saving to the Synapse registry');\r\n");
          out.write("            return false;\r\n");
          out.write("        }\r\n");
          out.write("\r\n");
          out.write("        var registry;\r\n");
          out.write("        if (document.getElementById(\"config_reg\").checked == true) {\r\n");
          out.write("            registry = 'conf';\r\n");
          out.write("        } else {\r\n");
          out.write("            registry = 'gov';\r\n");
          out.write("        }\r\n");
          out.write("        var onErrorKey = document.getElementById(\"sequence.onerror.key\").value;\r\n");
          out.write("        var seqDescription = document.getElementById(\"seqeunceDescription\").value;\r\n");
          out.write("        document.location.href = \"save_sequence_as.jsp?registry=\" + registry + \"&regKey=\" + key + \"&onErrorKey=\"\r\n");
          out.write("                + onErrorKey + \"&seqDescription=\" + seqDescription;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function applySequence() {\r\n");
          out.write("\r\n");
          out.write("        var options = {\r\n");
          out.write("            success: onUpdateSucess // post-submit callback\r\n");
          out.write("        };\r\n");
          out.write("\r\n");
          out.write("        var mediator_edit_tab = document.getElementById('mediator-edit-tab');\r\n");
          out.write("        var mediatorDesign = document.getElementById(\"mediatorDesign\");\r\n");
          out.write("        var mediatorSource = document.getElementById(\"mediatorSource\");\r\n");
          out.write("        if (mediator_edit_tab && mediator_edit_tab.style.display != \"none\") {\r\n");
          out.write("            if (mediatorDesign && mediatorDesign.style.display != \"none\") {\r\n");
          out.write("                var funcName = currentMedTLN + \"MediatorValidate\";\r\n");
          out.write("                if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("                    if (eval(funcName + \"()\")) {\r\n");
          out.write("\r\n");
          out.write("                        jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                        jQuery('#mediator-editor-form').submit();\r\n");
          out.write("\r\n");
          out.write("                    } else {\r\n");
          out.write("                        return false;\r\n");
          out.write("                    }\r\n");
          out.write("                } else {\r\n");
          out.write("\r\n");
          out.write("                    jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                    jQuery('#mediator-editor-form').submit();\r\n");
          out.write("                }\r\n");
          out.write("            } else if (mediatorSource && mediatorSource.style.display != \"none\") {\r\n");
          out.write("\r\n");
          out.write("                jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("                jQuery('#mediator-source-form').submit();\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        else {\r\n");
          out.write("            onUpdateSucess();\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function onUpdateSucess() {\r\n");
          out.write("        if ('");
          out.print(SequenceEditorHelper.getEditingSequenceAction(session));
          out.write("' == 'anonify') {\r\n");
          out.write("            document.location.href = \"save_sequence.jsp?sequence=");
          out.print(seq);
          out.write("&forwardTo=design_sequence.jsp\";\r\n");
          out.write("        } else {\r\n");
          out.write("            var seqName = document.getElementById(\"sequence.name\").value;\r\n");
          out.write("            var onErrorKey = document.getElementById(\"sequence.onerror.key\").value;\r\n");
          out.write("            var seqDescription = document.getElementById(\"seqeunceDescription\").value;\r\n");
          out.write("            if (seqName == \"\") {\r\n");
          out.write("                CARBON.showWarningDialog('");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("                return;\r\n");
          out.write("            }\r\n");
          out.write("            document.location.href = \"save_sequence.jsp?sequenceName=\" + seqName\r\n");
          out.write("                    + \"&onErrorKey=\" + onErrorKey + \"&forwardTo=design_sequence.jsp\" + \"&seqDescription=\" + seqDescription;\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function addMediator(position, mediatorName, type) {\r\n");
          out.write("        document.location.href = \"add_mediator.jsp?position=\" + position\r\n");
          out.write("                + \"&mediatorName=\" + mediatorName + \"&type=\" + type;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    var refreshTree = false;\r\n");
          out.write("    function updateMediator(mediatorName, refresh) {\r\n");
          out.write("        var funcName = mediatorName + \"MediatorValidate\";\r\n");
          out.write("        refreshTree = refresh;\r\n");
          out.write("        var options = {\r\n");
          out.write("                //dataType: 'text/xml',\r\n");
          out.write("                beforeSubmit:  beforeMediatorUpdate,  // pre-submit callback\r\n");
          out.write("                success:       afterMediatorUpdate  // post-submit callback\r\n");
          out.write("            };\r\n");
          out.write("\r\n");
          out.write("        if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("            if (!eval(funcName + \"()\")) {\r\n");
          out.write("                return false;\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        jQuery('#mediator-editor-form').ajaxForm(options);\r\n");
          out.write("        jQuery('#mediator-editor-form').submit();\r\n");
          out.write("    }\r\n");
          out.write("\n");
          out.write("    function afterMediatorUpdate(src) {\n");
          out.write("        var error  = src.trim();\n");
          out.write("        if(error != '' && (error.indexOf(\"error:\") != -1)){\n");
          out.write("            CARBON.showErrorDialog(error.substring(6,error.length));\n");
          out.write("            if (document.getElementById('whileUpload') != null && document.getElementById('whileUpload') != undefined) {\n");
          out.write("                document.getElementById('whileUpload').style.display = \"none\";\n");
          out.write("            }\r\n");
          out.write("            return;\r\n");
          out.write("        }\r\n");
          out.write("        if (document.getElementById('whileUpload') != null && document.getElementById('whileUpload') != undefined) {\r\n");
          out.write("            document.getElementById('whileUpload').style.display = \"none\";\r\n");
          out.write("        }\r\n");
          out.write("        document.getElementById('mediator-designview-header').style.display = 'none';\r\n");
          out.write("        document.getElementById('mediator-sourceview-header').style.display = 'none';\r\n");
          out.write("        document.getElementById('mediator-edit-tab').style.display = 'none';\r\n");
          out.write("        hide(\"mediatorDesign\");\r\n");
          out.write("        if (src != null && src != undefined) {\r\n");
          out.write("//            if (jQuery(src).find(\"script\") != null) {\r\n");
          out.write("//                jQuery(src).find('script').each(function() {\r\n");
          out.write("//                    alert(jQuery(this).text());\r\n");
          out.write("//                    eval(jQuery(this).text());\r\n");
          out.write("//                });\r\n");
          out.write("//            }\r\n");
          out.write("            eval(src);\r\n");
          out.write("        }\r\n");
          out.write("        if (refreshTree) {\r\n");
          out.write("            var url = \"design_sequence-ajaxprocessor.jsp?\" + \"&sequenceName=\"\r\n");
          out.write("                    + document.getElementById(\"sequence.name\").value + \"&onErrorKey=\"\r\n");
          out.write("                    + document.getElementById(\"sequence.onerror.key\").value + \"&mediatorAction=None\";\r\n");
          out.write("\r\n");
          out.write("            jQuery(\"#treePane\").load(url, null, function (responseText, status, XMLHttpRequest) {\r\n");
          out.write("                if (status != \"success\") {\r\n");
          out.write("                    //CARBON.showErrorDialog(jsi18n[\"mediator.design.load.error\"]);\r\n");
          out.write("                } else {\r\n");
          out.write("                    initMediators();\r\n");
          out.write("                }\r\n");
          out.write("            });\r\n");
          out.write("        }\r\n");
          out.write("        focusRootMediator();\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function beforeMediatorUpdate(formData, jqForm, options) {\r\n");
          out.write("        document.getElementById('whileUpload').style.display = \"\";\r\n");
          out.write("        formData[formData.length] = {name : \"followupAction\", value : \"source\"};\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function updateSource() {\r\n");
          out.write("\r\n");
          out.write("        document.getElementById(\"mediatorSrc\").value = editAreaLoader.getValue(\"mediatorSrc\");\r\n");
          out.write("        var options = {\r\n");
          out.write("            beforeSubmit:  beforeSourceUpdate,  // pre-submit callback\r\n");
          out.write("            success:       afterSourceUpdate  // post-submit callback\r\n");
          out.write("        };\r\n");
          out.write("        jQuery.get(\"mediator-source-validate-ajaxprocessor.jsp\",\r\n");
          out.write("        { mediatorSrc: document.getElementById(\"mediatorSrc\").value},\r\n");
          out.write("                function(data, status) {\r\n");
          out.write("                    if (data.replace(/^\\s+|\\s+$/g, '') != 'valid') {\r\n");
          out.write("                        CARBON.showErrorDialog(jsi18n['invalid.mediator.source.syntax']);\r\n");
          out.write("                    } else {\r\n");
          out.write("                        jQuery('#mediator-source-form').ajaxForm(options);\r\n");
          out.write("                        jQuery('#mediator-source-form').submit();\r\n");
          out.write("                    }\r\n");
          out.write("                });\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function afterSourceUpdate() {\r\n");
          out.write("        document.getElementById('whileUpload').style.display = \"none\";\r\n");
          out.write("        document.getElementById('mediator-designview-header').style.display = 'none';\r\n");
          out.write("        document.getElementById('mediator-sourceview-header').style.display = 'none';\r\n");
          out.write("        document.getElementById('mediator-edit-tab').style.display = 'none';\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function beforeSourceUpdate(formData, jqForm, options) {\r\n");
          out.write("        document.getElementById('whileUpload').style.display = \"\";\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function showSaveAsForm(show) {\r\n");
          out.write("        var formElem = document.getElementById('saveAsForm');\r\n");
          out.write("        if (show) {\r\n");
          out.write("            var seqName = document.getElementById(\"sequence.name\").value;\r\n");
          out.write("            formElem.style.display = \"\";\r\n");
          out.write("            var keyField = document.getElementById('synRegKey');\r\n");
          out.write("//            if (keyField.value == '') {\r\n");
          out.write("                  keyField.value = document.getElementById(\"sequence.name\").value;\r\n");
          out.write("//            }\r\n");
          out.write("        } else {\r\n");
          out.write("            formElem.style.display = \"none\";\r\n");
          out.write("        }\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("    function updateEditingMediator() {\r\n");
          out.write("        var mediator_edit_tab = document.getElementById('mediator-edit-tab');\r\n");
          out.write("        var mediatorDesign = document.getElementById(\"mediatorDesign\");\r\n");
          out.write("        var mediatorSource = document.getElementById(\"mediatorSource\");\r\n");
          out.write("        if (mediator_edit_tab && mediator_edit_tab.style.display != \"none\") {\r\n");
          out.write("            if (mediatorDesign && mediatorDesign.style.display != \"none\") {\r\n");
          out.write("                var funcName = currentMedTLN + \"MediatorValidate\";\r\n");
          out.write("                if (eval(\"typeof \" + funcName + \" == 'function'\")) {\r\n");
          out.write("                    if (eval(funcName + \"()\")) {\r\n");
          out.write("                        jQuery('#mediator-editor-form').submit();\r\n");
          out.write("                    } else {\r\n");
          out.write("                        return false;\r\n");
          out.write("                    }\r\n");
          out.write("                } else {\r\n");
          out.write("                    jQuery('#mediator-editor-form').submit();\r\n");
          out.write("                }\r\n");
          out.write("            } else if (mediatorSource && mediatorSource.style.display != \"none\") {\r\n");
          out.write("                jQuery('#mediator-source-form').submit();\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        return true;\r\n");
          out.write("    }\r\n");
          out.write("\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel( "edit".equals(SequenceEditorHelper.getEditingSequenceAction(session)) ? SequenceEditorHelper.getUIMetadataForEditor("sequence.edit.text",session) : SequenceEditorHelper.getUIMetadataForEditor("sequence.design.text",session) );
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\r\n");
          out.write("\r\n");
          out.write("    <div id=\"middle\">\r\n");
          out.write("\r\n");
          out.write("        <h2>\r\n");
          out.write("            ");

                if (request.getParameter("serviceName") != null) {
                    
          out.print(request.getParameter("serviceName"));
          out.write(":&nbsp;");

                }
                if("edit".equals(SequenceEditorHelper.getEditingSequenceAction(session))){
                    if("in".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else if ("out".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else if ("fault".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else {
                        
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_5.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.edit.header",session));
          int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
          if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);

                    }
                }else{
                    if("in".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else if ("out".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else if ("fault".equals(seq)) {
                        
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;

                    } else {
                        
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_9.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.design.header",session));
          int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
          if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);

                    }
                }
            
          out.write("\r\n");
          out.write("        </h2>\r\n");
          out.write("        <div id=\"workArea\">\r\n");
          out.write("            <table class=\"styledLeft\" cellspacing=\"0\">\r\n");
          out.write("                <thead>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <th>\r\n");
          out.write("                            <span style=\"float:left; position:relative; margin-top:2px;\">");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_10.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.design.view.text",session));
          int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
          if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
          out.write("</span><a href=\"#\" onclick=\"sourceView()\" class=\"icon-link\" style=\"background-image:url(images/source-view.gif);\">");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("                        </th>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                </thead>\r\n");
          out.write("                <tbody>\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t<td>\r\n");
          out.write("\t\t<table class=\"normal\" width=\"100%\">\r\n");
          out.write("                    <tr id=\"sequenceNameSection\">\r\n");
          out.write("                        <td width=\"5%\" style=\"white-space:nowrap;\">\r\n");
          out.write("                            ");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_12.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.name",session));
          int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
          if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
          out.write("<span class=\"required\">*</span>\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td align=\"left\" colspan=\"2\">\r\n");
          out.write("                            <input type=\"text\" id=\"sequence.name\" value=\"");
          out.print( sequence.getName() != null ? sequence.getName() : (session.getAttribute("registrySequenceName") != null ? session.getAttribute("sequenceRegistryKey") : "") );
          out.write('"');
          out.write(' ');
          out.print( "edit".equals(SequenceEditorHelper.getEditingSequenceAction(session)) || session.getAttribute("registrySequenceName") != null ? "disabled=\"disabled\"" : "" );
          out.write(" onkeypress=\"return validateText(event);\"/>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr id=\"onErroSection\">\r\n");
          out.write("                        <td width=\"5%\" style=\"white-space:nowrap;\">\r\n");
          out.write("                            ");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td width=\"5%\">\r\n");
          out.write("                            <input type=\"text\" id=\"sequence.onerror.key\" name=\"sequence.onerror.key\" disabled=\"disabled\" value=\"");
          out.print( sequence.getErrorHandler() != null ? sequence.getErrorHandler() : "" );
          out.write("\"/>\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            <a href=\"#\" class=\"registry-picker-icon-link\"  onclick=\"showRegistryBrowser('sequence.onerror.key','/_system/config')\">");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("                            <a href=\"#\" class=\"registry-picker-icon-link\"  onclick=\"showRegistryBrowser('sequence.onerror.key','/_system/governance')\">");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <td colspan=\"3\">\r\n");
          out.write("                            <div class=\"treePane\" id=\"treePane\" style=\"height: 300px; overflow: auto; width: auto; border: 1px solid rgb(204, 204, 204);position:relative;\">\r\n");
          out.write("\r\n");
          out.write("                                    <div style=\"position:absolute;padding:20px;\">\r\n");
          out.write("\r\n");
          out.write("                                        <ul class=\"root-list\" id=\"sequenceTree\">\r\n");
          out.write("\r\n");
          out.write("                                            <li>\r\n");
          out.write("                                                <div class=\"minus-icon\" onclick=\"treeColapse(this)\" id=\"treeColapser\"></div>\r\n");
          out.write("                                                <div class=\"mediators\" id=\"mediator-00\">\r\n");
          out.write("                                                    <a class=\"root-mediator\">");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_16.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.root.text",session));
          int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
          if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
          out.write("</a>\r\n");
          out.write("                                                    <div class=\"sequenceToolbar\" style=\"width:100px;\">\r\n");
          out.write("                                                        <div>\r\n");
          out.write("                                                            <a class=\"addChildStyle\">");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <!--<div id=\"sequenceEditor\">-->\r\n");
          out.write("                                                ");

                                                    int count = sequence.getList().size();
                                                    if (count != 0) {
                                                
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                <div class=\"branch-node\"></div>\r\n");
          out.write("                                                <ul class=\"child-list\">\r\n");
          out.write("                                                     <!--<li>-->\r\n");
          out.write("                                                        ");

                                                            int position = 0;
                                                            for (Mediator mediator : sequence.getList()) {
                                                                count--;
                                                                Mediator beforeMed = position > 0 ? sequence.getList().get(position - 1) : null;
                                                                Mediator afterMed = position + 1 < sequence.getList().size() ? sequence.getList().get(position + 1) : null;
                                                        
          out.write("\r\n");
          out.write("                                                    ");
          out.print(SequenceEditorHelper.getMediatorHTML(mediator, count==0, String.valueOf(position), config, beforeMed, afterMed, request.getLocale()));
          out.write("\r\n");
          out.write("                                                        ");

                                                                position++;
                                                            }
                                                        
          out.write("\r\n");
          out.write("                                                    <!--</li>-->\r\n");
          out.write("                                                </ul>\r\n");
          out.write("\r\n");
          out.write("                                                ");

                                                    }
                                                
          out.write("\r\n");
          out.write("                                                <!--</div>-->\r\n");
          out.write("                                            </li>\r\n");
          out.write("                                        </ul>\r\n");
          out.write("\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <script type=\"text/javascript\">\r\n");
          out.write("                                jQuery(document).ready(function() {\r\n");
          out.write("\r\n");
          out.write("                                    jQuery(\".toggle_container\").hide();\r\n");
          out.write("                                    jQuery(\"h2.trigger\").click(function() {\r\n");
          out.write("                                        if (jQuery(this).next().is(\":visible\")) {\r\n");
          out.write("                                            this.className = \"active trigger\";\r\n");
          out.write("                                        } else {\r\n");
          out.write("                                            this.className = \"trigger\";\r\n");
          out.write("                                        }\r\n");
          out.write("\r\n");
          out.write("                                        jQuery(this).next().slideToggle(\"fast\");\r\n");
          out.write("                                        return false; //Prevent the browser jump to the link anchor\r\n");
          out.write("                                    });\r\n");
          out.write("                                });\r\n");
          out.write("                            </script>\r\n");
          out.write("\r\n");
          out.write("                            <h2 class=\"trigger active\"><a href=\"#\">Sequence Description</a></h2>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"toggle_container\">\r\n");
          out.write("                                <textarea name=\"seqeunceDescription\" id=\"seqeunceDescription\" title=\"Sequence Description\"\r\n");
          out.write("                                          cols=\"100\" rows=\"3\">");
          out.print( sequence.getDescription() != null ? sequence.getDescription() : "");
          out.write("</textarea>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("\r\n");
          out.write("        </table>\r\n");
          out.write("\r\n");
          out.write("            <table class=\"normal\" width=\"100%\">\r\n");
          out.write("                <tr><td><table class=\"styledLeft\" cellspacing=\"0\">\r\n");
          out.write("    <tr id=\"mediator-designview-header\" style=\"display:none;\">\r\n");
          out.write("        <td class=\"middle-header\" >\r\n");
          out.write("            <span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span><a onclick=\"showSource()\" class=\"icon-link\" style=\"background-image:url(images/source-view.gif);\">");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("        </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr id=\"mediator-sourceview-header\" style=\"display:none;\">\r\n");
          out.write("        <td class=\"middle-header\">\r\n");
          out.write("            <span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span><a onclick=\"showDesign()\" class=\"icon-link\" style=\"background-image:url(images/design-view.gif);\">");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("        </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("    <tr id=\"mediator-edit-tab\" style=\"display:none;\">\r\n");
          out.write("        <td style=\"padding: 0px !important;\">\r\n");
          out.write("            <div class=\"tabPaneContentMain forProxy\" id=\"mediatorDesign\" name=\"mediatorDesign\" style=\"display:none;width:auto;padding:0px;\"></div>\r\n");
          out.write("            <div id=\"mediatorSource\" name=\"mediatorSource\" style=\"display:none;\"></div>\r\n");
          out.write("        </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("</table>\r\n");
          out.write("</td></tr>\r\n");
          out.write("</table>\r\n");
          out.write("</td></tr>\r\n");
          out.write("        ");

                            if (sequence instanceof TemplateMediator) {
                                TemplateMediator template = (TemplateMediator) sequence;
                                String propertyTableStyle = template.getParameters().size() == 0 ? "display:none;" : "";
        
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("\r\n");
          out.write("                                <div style=\"margin-top:0px;\">\r\n");
          out.write("\r\n");
          out.write("                            <table id=\"templatePropertyTable\" style=\"");
          out.print(propertyTableStyle);
          out.write("\" class=\"styledInner\">\r\n");
          out.write("                                <thead>\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <th width=\"75%\">");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("                                        <th>");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                    <tbody id=\"templatePropertyBody\">\r\n");
          out.write("                                        ");

                                                int i = 0;

                                                Iterator<String> params=template.getParameters().iterator();
                                                while(params.hasNext()){
                                                    String paramName = params.next();

                                        
          out.write("\r\n");
          out.write("                                                    <tr id=\"templatePropertyRaw");
          out.print(i);
          out.write("\">\r\n");
          out.write("                                                        <td><input type=\"text\" name=\"templatePropertyName");
          out.print(i);
          out.write("\" id=\"templatePropertyName");
          out.print(i);
          out.write("\"\r\n");
          out.write("                                                                   class=\"esb-edit small_textbox\"\r\n");
          out.write("                                                                   value=\"");
          out.print(paramName);
          out.write("\"/>\r\n");
          out.write("                                                        </td>\r\n");
          out.write("                                                        <td><a href=\"#\" class=\"delete-icon-link\"\r\n");
          out.write("                                                                onclick=\"deleteProperty(");
          out.print(i);
          out.write(")\">");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></td>\r\n");
          out.write("                                                    </tr>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                ");

                                                    i++;
                                                }
          out.write("\r\n");
          out.write("                                                <input type=\"hidden\" name=\"templatePropertyCount\" id=\"templatePropertyCount\" value=\"");
          out.print(i);
          out.write("\"/>\r\n");
          out.write("\r\n");
          out.write("                                            </tbody>\r\n");
          out.write("                                        </thead>\r\n");
          out.write("                                   </table>\r\n");
          out.write("                                </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("        </tr>\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td>\r\n");
          out.write("                <div style=\"margin-top:10px;\">\r\n");
          out.write("                    <a name=\"addParamLink\"></a>\r\n");
          out.write("                    <a class=\"add-icon-link\"\r\n");
          out.write("                       href=\"#addParamLink\"\r\n");
          out.write("                       onclick=\"addTemplateParameter()\">");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\r\n");
          out.write("                </div>\r\n");
          out.write("            </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <td class=\"buttonRow\">\r\n");
          out.write("                            <input type=\"button\" class=\"button\" value=\"");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_26.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.button.save.text",session));
          int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
          if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
          out.write("\" id=\"saveButton\" onclick=\"javascript: saveSequence(); return false;\"/>\r\n");
          out.write("                            ");

                                if (SequenceEditorHelper.getEditingSequenceAction(session) != "anonify") {
                            
          out.write("\r\n");
          out.write("                                <input type=\"button\" class=\"button\" value=\"");
          //  fmt:message
          org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
          _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
          _jspx_th_fmt_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_message_27.setKey(SequenceEditorHelper.getUIMetadataForEditor("sequence.button.saveas.text",session));
          int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
          if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
            return;
          }
          _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
          out.write("\" id=\"saveAsButton\" onclick=\"javascript: showSaveAsForm(true); return false;\">\r\n");
          out.write("                            ");

                                }
                            
          out.write("\r\n");
          out.write("                            <input type=\"button\" class=\"button\" value=\"");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"applyButton\" onclick=\"javascript: applySequence(); return false;\"/>\r\n");
          out.write("                            <input type=\"button\" class=\"button\" value=\"");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" onclick=\"javascript: cancelSequence(); return false;\"/>\r\n");
          out.write("\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                </tbody>\r\n");
          out.write("            </table>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("            <div style=\"display:none;\" id=\"saveAsForm\">\r\n");
          out.write("                <p>&nbsp;</p>\r\n");
          out.write("                <table class=\"styledLeft\">\r\n");
          out.write("                    <thead>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <th colspan=\"2\">\r\n");
          out.write("                                <span style=\"float:left; position:relative; margin-top:2px;\">");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\r\n");
          out.write("                            </th>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    </thead>\r\n");
          out.write("                    <tbody>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                <table class=\"normal\">\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <input type=\"radio\" name=\"registry\" id=\"config_reg\"\r\n");
          out.write("                                                                       value=\"conf:\" checked=\"checked\"\r\n");
          out.write("                                                                       onclick=\"document.getElementById('reg').innerHTML='conf:';\"/>\r\n");
          out.write("                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("                                            ");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <input type=\"radio\" name=\"registry\" id=\"gov_reg\"\r\n");
          out.write("                                                                       value=\"gov:\"\r\n");
          out.write("                                                                       onclick=\"document.getElementById('reg').innerHTML='gov:';\"/>\r\n");
          out.write("\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td>");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                                        <td><span id=\"reg\">conf:</span><input type=\"text\" size=\"75\" id=\"synRegKey\"/></td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                </table>\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td class=\"buttonRow\">\r\n");
          out.write("                                <input type=\"button\" class=\"button\" value=\"");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" id=\"saveSynRegButton\" onclick=\"javascript: saveSequenceAs(); return false;\"/>\r\n");
          out.write("                                <input type=\"button\" class=\"button\" value=\"Cancel\" id=\"cancelSynRegButton\" onclick=\"javascript: showSaveAsForm(false); return false;\">\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("\r\n");
          out.write("                    </tbody>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                </table>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");

            if (session.getAttribute("sequence.error.message") != null) {
        
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            ");

                String seqErrorMsg = (String) session.getAttribute("sequence.error.message");
            
          out.write("\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showErrorDialog(\"");
          out.print( StringEscapeUtils.escapeXml(seqErrorMsg) );
          out.write("\");\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("        ");

                session.removeAttribute("sequence.error.message");
            }

            if (session.getAttribute("sequence.error2.message") != null) {
        
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            ");

                String seqErrorMsg2 = (String) session.getAttribute("sequence.error2.message");
            
          out.write("\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showErrorDialog(\"");
          out.print( StringEscapeUtils.escapeXml(seqErrorMsg2) );
          out.write("\");\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("        ");

                session.removeAttribute("sequence.error2.message");
            }

            if (session.getAttribute("sequence.warn.message") != null) {
        
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            ");

                String seqWarnMsg = (String) session.getAttribute("sequence.warn.message");
            
          out.write("\r\n");
          out.write("            jQuery(document).ready(function() {\r\n");
          out.write("                CARBON.showWarningDialog(\"");
          out.print( StringEscapeUtils.escapeXml(seqWarnMsg) );
          out.write("\");\r\n");
          out.write("            });\r\n");
          out.write("        </script>\r\n");
          out.write("        ");

                session.removeAttribute("sequence.warn.message");
            }
        
          out.write("\r\n");
          out.write("\r\n");
          out.write("    </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
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
      out.write('\r');
      out.write('\n');

    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    _jspx_th_fmt_message_0.setKey("sequence.name.required");
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
    _jspx_th_fmt_message_1.setKey("sequence.name.required");
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
    _jspx_th_fmt_message_2.setKey("sequence.in.edit.header");
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
    _jspx_th_fmt_message_3.setKey("sequence.out.edit.header");
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
    _jspx_th_fmt_message_4.setKey("sequence.fault.edit.header");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_fmt_message_6.setKey("sequence.in.design.header");
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
    _jspx_th_fmt_message_7.setKey("sequence.out.design.header");
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
    _jspx_th_fmt_message_8.setKey("sequence.fault.design.header");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
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
    _jspx_th_fmt_message_11.setKey("sequence.switchto.source.text");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
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
    _jspx_th_fmt_message_13.setKey("sequence.onerror");
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
    _jspx_th_fmt_message_14.setKey("sequence.conf.registry.browser");
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
    _jspx_th_fmt_message_15.setKey("sequence.gov.registry.browser");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
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
    _jspx_th_fmt_message_17.setKey("sequence.add.child.action");
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
    _jspx_th_fmt_message_18.setKey("mediator.design.view.text");
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
    _jspx_th_fmt_message_19.setKey("sequence.switchto.source.text");
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
    _jspx_th_fmt_message_20.setKey("mediator.source.view.text");
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
    _jspx_th_fmt_message_21.setKey("sequence.switchto.design.text");
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
    _jspx_th_fmt_message_22.setKey("template.parameter.name");
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
    _jspx_th_fmt_message_23.setKey("template.parameter.action");
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
    _jspx_th_fmt_message_24.setKey("template.parameter.delete");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_25.setKey("template.parameter.add");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_28.setKey("sequence.button.apply.text");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_29.setKey("sequence.button.cancel.text");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_30.setKey("sequence.save.as.title");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_31.setKey("save.in");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_32.setKey("config.registry");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_33.setKey("gov.registry");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_34.setKey("sequence.save.as.key");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_35.setKey("sequence.button.save.text");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }
}
