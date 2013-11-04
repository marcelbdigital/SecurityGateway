package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.sequences.common.to.SequenceInfo;
import org.wso2.carbon.mediation.templates.ui.TemplateAdminClientAdapter;
import org.wso2.carbon.mediation.templates.ui.TemplateEditorConstants;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import java.util.ResourceBundle;
import org.wso2.carbon.mediation.templates.ui.factory.TemplateEditorClientFactory;
import org.wso2.carbon.mediation.templates.ui.EndpointTemplateAdminClient;
import org.wso2.carbon.mediation.templates.common.EndpointTemplateInfo;

public final class list_005ftemplates_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("\n");
      out.write("\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
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
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("\n");
          out.write("<link type=\"text/css\" href=\"../dialog/js/jqueryui/tabs/ui.all.css\" rel=\"stylesheet\" />\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-1.2.6.min.js\"></script>\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery-ui-1.6.custom.min.js\"></script>\n");
          out.write("<script type=\"text/javascript\" src=\"../dialog/js/jqueryui/tabs/jquery.cookie.js\"></script>\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    function confirmForceDelete(sequenceName, msg) {\n");
          out.write("        CARBON.showConfirmationDialog('");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<br/><br/>'\n");
          out.write("                + msg + '<br/>");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("', function() {\n");
          out.write("            location.href = \"../templates/delete_template.jsp?sequenceName=\" + sequenceName + \"&force=true\";\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("</script>\n");
          out.write("\n");

    //remove session variables if user exited form design sequence of proxy admin
    session.removeAttribute("sequence");
    //createClient factory for editor
    session.setAttribute("editorClientFactory",new TemplateEditorClientFactory());


    TemplateAdminClientAdapter templateAdminClient
            = new TemplateAdminClientAdapter(this.getServletConfig(), session);
    SequenceInfo[] sequences = null;
    SequenceInfo[] dynamicSequences = null;
    String pageNumberStr = request.getParameter("pageNumber");
    String dynamicPageNumberStr = request.getParameter("dynamicPageNumber");
    int pageNumber = 0;
    int dynamicPageNumber = 0;
    if (pageNumberStr != null) {
        pageNumber = Integer.parseInt(pageNumberStr);
    }
    if(dynamicPageNumberStr!=null){
        dynamicPageNumber = Integer.parseInt(dynamicPageNumberStr);
    }
    int numberOfPages = 0;
    int numberOfDynamicPages = 0;
    try {
        sequences = templateAdminClient.getTemplates(pageNumber, TemplateEditorConstants.SEQUENCE_PER_PAGE);
        dynamicSequences = templateAdminClient.getDynamicSequences(dynamicPageNumber,
                TemplateEditorConstants.SEQUENCE_PER_PAGE);
        if(sequences == null){
            sequences = new SequenceInfo[0];
        }
        if(dynamicSequences == null){
            dynamicSequences = new SequenceInfo[0];
        }
        int seqCount = templateAdminClient.getSequencesCount();
        int dynamicSequenceCount = templateAdminClient.getDynamicSequenceCount();

        if (seqCount % TemplateEditorConstants.SEQUENCE_PER_PAGE == 0) {
            numberOfPages = seqCount / TemplateEditorConstants.SEQUENCE_PER_PAGE;
        } else {
            numberOfPages = seqCount / TemplateEditorConstants.SEQUENCE_PER_PAGE + 1;
        }

        if (dynamicSequenceCount % TemplateEditorConstants.SEQUENCE_PER_PAGE == 0) {
            numberOfDynamicPages = dynamicSequenceCount / TemplateEditorConstants.SEQUENCE_PER_PAGE;
        } else {
            numberOfDynamicPages = dynamicSequenceCount / TemplateEditorConstants.SEQUENCE_PER_PAGE + 1;
        }
    } catch (Exception e) {
        CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);

          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("               location.href = \"../admin/error.jsp\";\n");
          out.write("        </script>\n");

        return;
    }

    ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources",
            request.getLocale());
    if("fail".equals(session.getAttribute("dynamic_edit"))){
        
          out.write("\n");
          out.write("            <script type=\"text/javascript\">\n");
          out.write("                CARBON.showErrorDialog(\"");
          out.print( bundle.getString(
                    "unable.to.build.sequence.object.from.the.given.sequence.information") );
          out.write("\");\n");
          out.write("            </script>\n");
          out.write("        ");

                session.removeAttribute("dynamic_edit");
    }
    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    session.removeAttribute("mediator.position");

    String dependencyMgtError = (String) session.getAttribute("seq.d.mgt.error.msg");
    if (dependencyMgtError != null) {
        String seqToDelete = (String) session.getAttribute("seq.d.mgt.error.name");

          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        confirmForceDelete('");
          out.print(seqToDelete);
          out.write("', '");
          out.print(dependencyMgtError);
          out.write("');\n");
          out.write("    </script>\n");

        session.removeAttribute("seq.d.mgt.error.msg");
        session.removeAttribute("seq.d.mgt.error.name");
    }

    try {
        if (((String) session.getAttribute("hasDuplicateTemplateEndpoint")).equals("true")) {

          out.write("\n");
          out.write("    <script type=\"text/javascript\">\n");
          out.write("        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\n");
          out.write("    </script>\n");
          out.write("    ");

                session.removeAttribute("hasDuplicateTemplateEndpoint");
            }
        } catch (Exception e) {
        }

          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\" src=\"../carbon/global-params.js\"></script>\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("\n");
          out.write("    wso2.wsf.Util.initURLs();\n");
          out.write("    var ENABLE = \"enable\";\n");
          out.write("    var DISABLE = \"disable\";\n");
          out.write("    var STAT = \"statistics\";\n");
          out.write("    var TRACE = \"Tracing\";\n");
          out.write("\n");
          out.write("    var frondendURL = wso2.wsf.Util.getServerURL() + \"/\";\n");
          out.write("\n");
          out.write("    function addSequence() {\n");
          out.write("        document.location.href = \"../sequences/design_sequence.jsp?sequenceAction=add&seqEditor=template\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function addEndpoint() {\n");
          out.write("        jQuery.ajax({\n");
          out.write("                     type: 'POST',\n");
          out.write("                     url: '../templates/endpoint_template-ajaxprocessor.jsp',\n");
          out.write("                     data: 'data=null',\n");
          out.write("                     success: function(msg) {\n");
          out.write("                                 document.location.href = \"../endpoints/index.jsp?templateAdd=true&endpointOriginator=template\";\n");
          out.write("                     },\n");
          out.write("                     error: function(msg) {\n");
          out.write("//                        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("//                                               ' ' + templateName);\n");
          out.write("                     }\n");
          out.write("                 })\n");
          out.write("\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function disableStat(sequenceName) {\n");
          out.write("        $.ajax({\n");
          out.write("            type: 'POST',\n");
          out.write("            url: '../sequences/stat_tracing-ajaxprocessor.jsp',\n");
          out.write("            data: 'sequenceName=' + sequenceName + '&action=disableStat',\n");
          out.write("            success: function(msg) {\n");
          out.write("                handleCallback(sequenceName, DISABLE, STAT);\n");
          out.write("            },\n");
          out.write("            error: function(msg) {\n");
          out.write("                CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("                                       ' ' + sequenceName);\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function enableStat(sequenceName) {\n");
          out.write("        $.ajax({\n");
          out.write("            type: 'POST',\n");
          out.write("            url: '../sequences/stat_tracing-ajaxprocessor.jsp',\n");
          out.write("            data: 'sequenceName=' + sequenceName + '&action=enableStat',\n");
          out.write("            success: function(msg) {\n");
          out.write("                handleCallback(sequenceName, ENABLE, STAT);\n");
          out.write("            },\n");
          out.write("            error: function(msg) {\n");
          out.write("                CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("                                       ' ' + sequenceName);\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function handleCallback(seq, action, type) {\n");
          out.write("        var element;\n");
          out.write("        if (action == \"enable\") {\n");
          out.write("            if (type == \"statistics\") {\n");
          out.write("                element = document.getElementById(\"disableStat\" + seq);\n");
          out.write("                element.style.display = \"\";\n");
          out.write("                element = document.getElementById(\"enableStat\" + seq);\n");
          out.write("                element.style.display = \"none\";\n");
          out.write("            } else {\n");
          out.write("                element = document.getElementById(\"disableTracing\" + seq);\n");
          out.write("                element.style.display = \"\";\n");
          out.write("                element = document.getElementById(\"enableTracing\" + seq);\n");
          out.write("                element.style.display = \"none\";\n");
          out.write("            }\n");
          out.write("        } else {\n");
          out.write("            if (type == \"statistics\") {\n");
          out.write("                element = document.getElementById(\"disableStat\" + seq);\n");
          out.write("                element.style.display = \"none\";\n");
          out.write("                element = document.getElementById(\"enableStat\" + seq);\n");
          out.write("                element.style.display = \"\";\n");
          out.write("            } else {\n");
          out.write("                element = document.getElementById(\"disableTracing\" + seq);\n");
          out.write("                element.style.display = \"none\";\n");
          out.write("                element = document.getElementById(\"enableTracing\" + seq);\n");
          out.write("                element.style.display = \"\";\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function enableTracing(sequenceName) {\n");
          out.write("        $.ajax({\n");
          out.write("            type: 'POST',\n");
          out.write("            url: '../sequences/stat_tracing-ajaxprocessor.jsp',\n");
          out.write("            data: 'sequenceName=' + sequenceName + '&action=enableTracing',\n");
          out.write("            success: function(msg) {\n");
          out.write("                handleCallback(sequenceName, ENABLE, TRACE);\n");
          out.write("            },\n");
          out.write("            error: function(msg) {\n");
          out.write("                CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("                                       ' ' + sequenceName);\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function disableTracing(sequenceName) {\n");
          out.write("        $.ajax({\n");
          out.write("            type: 'POST',\n");
          out.write("            url: '../sequences/stat_tracing-ajaxprocessor.jsp',\n");
          out.write("            data: 'sequenceName=' + sequenceName + '&action=disableTracing',\n");
          out.write("            success: function(msg) {\n");
          out.write("                handleCallback(sequenceName, DISABLE, TRACE);\n");
          out.write("            },\n");
          out.write("            error: function(msg) {\n");
          out.write("                CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("                                       ' ' + sequenceName);\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function editSequence() {\n");
          out.write("        document.location.href = \"../sequences/design_sequence.jsp?sequenceAction=edit&seqEditor=template&sequenceName=\" + arguments[0];\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function editEndpoint(endPointName, endPointType ,paramCollectionStr) {\n");
          out.write("\n");
          out.write("       jQuery.ajax({\n");
          out.write("                    type: 'POST',\n");
          out.write("                    url: '../templates/endpoint_template-ajaxprocessor.jsp',\n");
          out.write("                    data: 'templateName=' + endPointName,\n");
          out.write("                    success: function(msg) {\n");
          out.write("                        editEndpointSuccess(endPointName, endPointType);\n");
          out.write("                    },\n");
          out.write("                    error: function(msg) {\n");
          out.write("//                        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("//                                               ' ' + templateName);\n");
          out.write("                    }\n");
          out.write("                })\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function editEndpointSuccess(endPointName, endPointType){\n");
          out.write("        if (endPointType == 'address') {\n");
          out.write("            document.location.href = '../endpoints/addressEndpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit&endpointOriginator=template';\n");
          out.write("        } else if (endPointType == 'wsdl') {\n");
          out.write("            document.location.href = '../endpoints/wsdlEndpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit&endpointOriginator=template';\n");
          out.write("        } else if (endPointType == 'failover') {\n");
          out.write("            document.location.href = '../endpoints/failOverEndpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit&endpointOriginator=template';\n");
          out.write("        } else if (endPointType == 'loadbalance') {\n");
          out.write("            document.location.href = '../endpoints/loadBalanceEndpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit&endpointOriginator=template';\n");
          out.write("        } else if (endPointType == 'default') {\n");
          out.write("            document.location.href = '../endpoints/defaultEndpoint.jsp?endpointName=' + endPointName + '&endpointAction=edit&endpointOriginator=template';\n");
          out.write("        }\n");
          out.write("\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteSequence(sequenceName) {\n");
          out.write("        if (sequenceName == \"main\" || sequenceName == \"fault\") {\n");
          out.write("           CARBON.showWarningDialog('");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\n");
          out.write("        } else {\n");
          out.write("            CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + sequenceName + \"?\", function(){\n");
          out.write("                location.href = \"../templates/delete_template.jsp?sequenceName=\" + sequenceName;\n");
          out.write("            });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteEndpoint(sequenceName) {\n");
          out.write("        CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + sequenceName + \"?\", function() {\n");
          out.write("            location.href = \"../templates/delete_template.jsp?sequenceName=\" + sequenceName + \"&templateType=endpoint\";\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function getResponseValue(responseXML) {\n");
          out.write("        var returnElementList = responseXML.getElementsByTagName(\"ns:return\");\n");
          out.write("        // Older browsers might not recognize namespaces (e.g. FF2)\n");
          out.write("        if (returnElementList.length == 0)\n");
          out.write("            returnElementList = responseXML.getElementsByTagName(\"return\");\n");
          out.write("        var returnElement = returnElementList[0];\n");
          out.write("\n");
          out.write("        return returnElement.firstChild.nodeValue;\n");
          out.write("    }\n");
          out.write("    function editRegistrySequence(key) {\n");
          out.write("        if (key != null && key != undefined && key != \"\") {\n");
          out.write("            location.href = \"../sequences/registry_sequence.jsp?action=edit&key=\" + key;\n");
          out.write("        } else {\n");
          out.write("            CARBON.showErrorDialog(\"Specify the key of the Sequence to be edited\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function editRegistryEndpoint(endPointName, endPointType ,paramCollectionStr) {\n");
          out.write("        jQuery.ajax({\n");
          out.write("                     type: 'POST',\n");
          out.write("                     url: '../templates/endpoint_template-ajaxprocessor.jsp',\n");
          out.write("                     data: 'templateName=' + endPointName + \"&edittingType=registry\",\n");
          out.write("                     success: function(msg) {\n");
          out.write("                         var parameters = msg.trim().split(\";\");\n");
          out.write("                         var epType = parameters[0].trim();\n");
          out.write("                         var epName = parameters[1].trim();\n");
          out.write("                         editEndpointSuccess(epName, epType);\n");
          out.write("                     },\n");
          out.write("                     error: function(msg) {\n");
          out.write("//                        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' +\n");
          out.write("//                                               ' ' + templateName);\n");
          out.write("                     }\n");
          out.write("                 })\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteRegistrySequence(sequenceName) {\n");
          out.write("        if (sequenceName == \"main\" || sequenceName == \"fault\") {\n");
          out.write("           CARBON.showWarningDialog('");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\n");
          out.write("        } else {\n");
          out.write("            CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + sequenceName + \"?\", function(){\n");
          out.write("                location.href = \"../templates/delete_template.jsp?type=registry&sequenceName=\" + sequenceName;\n");
          out.write("            });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteRegistryEndpoint(sequenceName) {\n");
          out.write("        CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" \" + sequenceName + \"?\", function() {\n");
          out.write("            location.href = \"../templates/delete_template.jsp?type=registry&sequenceName=\" + sequenceName + \"&templateType=endpoint\";\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function minMaxReg() {\n");
          out.write("        var minMaxRegBox = $('minMaxRegBox');\n");
          out.write("        if (minMaxRegBox.style.display == \"none\") {\n");
          out.write("            minMaxRegBox.style.display = \"\";\n");
          out.write("        } else {\n");
          out.write("            minMaxRegBox.style.display = \"none\";\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("    $(function() {\n");
          out.write("        $(\"#tabs\").tabs();\n");
          out.write("    });\n");
          out.write("\n");
          out.write("//tab handling logic\n");
          out.write("    var tabIndex = -1;\n");
          out.write("    ");

    String tab = request.getParameter("tab");
    if(tab!=null && tab.equals("0")){
    
          out.write("\n");
          out.write("    tabIndex = 0;\n");
          out.write("    ");

    } else if (tab!=null && tab.equals("1")) {
    
          out.write("\n");
          out.write("    tabIndex = 1;\n");
          out.write("    ");
}
          out.write("\n");
          out.write("    $(document).ready(function() {\n");
          out.write("        var $tabs = $('#tabs > ul').tabs({ cookie: { expires: 30 } });\n");
          out.write("        $('a', $tabs).click(function() {\n");
          out.write("            if ($(this).parent().hasClass('ui-tabs-selected')) {\n");
          out.write("                $tabs.tabs('load', $('a', $tabs).index(this));\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("        if (tabIndex == 0) {\n");
          out.write("            $tabs.tabs('option', 'selected', 0);\n");
          out.write("        } else if (tabIndex == 1) {\n");
          out.write("            $tabs.tabs('option', 'selected', 1);\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<style type=\"text/css\">\n");
          out.write("    .inlineDiv div {\n");
          out.write("        float: left;\n");
          out.write("    }\n");
          out.write("</style>\n");
          out.write("\n");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("sequence.menu.text");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
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
          out.write("<div id=\"middle\">\n");
          out.write("\n");
          out.write("    <h2>\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\" style=\"background-color:#F4F4F4;\">\n");
          out.write("<div style=\"height:25px;\">\n");
          out.write("    <a class=\"icon-link\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("       href=\"javascript:addSequence()\">");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("</div>\n");
          out.write("\n");
          out.write("<div style=\"height:25px;\">\n");
          out.write("    <a class=\"icon-link\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("       href=\"javascript:addEndpoint()\">");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("</div>\n");
          out.write("<div id=\"tabs\">\n");
          out.write("    <ul>\n");
          out.write("        <li><a href=\"#tabs-1\">");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("        <li><a href=\"#tabs-2\">");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("        <li><a href=\"#tabs-3\">");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("        <li><a href=\"#tabs-4\">");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a></li>\n");
          out.write("    </ul>\n");
          out.write("    <div id=\"tabs-1\">\n");
          out.write("        ");
 if ((sequences != null) && (sequences.length > 0)) { 
          out.write("\n");
          out.write("        <p>");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        <br/>\n");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_0 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_0.setPageNumber(pageNumber);
          _jspx_th_carbon_paginator_0.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_0.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_0.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_0.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
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
          out.write("<br>\n");
          out.write("        <table class=\"styledLeft\" cellspacing=\"1\" id=\"sequencesTable\">\n");
          out.write("            <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <th>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </th>\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    <th colspan=\"4\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </th>\n");
          out.write("                </tr>\n");
          out.write("            </thead>\n");
          out.write("            <tbody>\n");
          out.write("                ");
 for (SequenceInfo sequence : sequences) { 
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        ");
          out.print( sequence.getName() );
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                    ");
          out.write("\n");
          out.write("                            ");
 if (sequence.isEnableStatistics()) { 
          out.write("\n");
          out.write("                            <td style=\"border-right:none;border-left:none;width:200px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <div id=\"disableStat");
          out.print( sequence.getName());
          out.write("\">\n");
          out.write("                                <a href=\"#\" onclick=\"disableStat('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/static-icon.gif);\">");
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                            <div id=\"enableStat");
          out.print( sequence.getName());
          out.write("\" style=\"display:none;\">\n");
          out.write("                                <a href=\"#\" onclick=\"enableStat('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/static-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                            ");
 } else { 
          out.write("\n");
          out.write("                                    <td style=\"border-right:none;border-left:none;width:200px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <div id=\"enableStat");
          out.print( sequence.getName());
          out.write("\">\n");
          out.write("                                <a href=\"#\" onclick=\"enableStat('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/static-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                            <div id=\"disableStat");
          out.print( sequence.getName());
          out.write("\" style=\"display:none\">\n");
          out.write("                                <a href=\"#\" onclick=\"disableStat('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/static-icon.gif);\">");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                            ");
 } 
          out.write("\n");
          out.write("                            ");
 if (sequence.isEnableTracing()) { 
          out.write("\n");
          out.write("                                    <td style=\"border-right:none;border-left:none;width:200px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <div id=\"disableTracing");
          out.print( sequence.getName());
          out.write("\">\n");
          out.write("                                <a href=\"#\" onclick=\"disableTracing('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/trace-icon.gif);\">");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                            <div id=\"enableTracing");
          out.print( sequence.getName());
          out.write("\" style=\"display:none;\">\n");
          out.write("                                <a href=\"#\" onclick=\"enableTracing('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/trace-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                            ");
 } else { 
          out.write("\n");
          out.write("                                    <td style=\"border-right:none;border-left:none;width:200px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <div id=\"enableTracing");
          out.print( sequence.getName());
          out.write("\">\n");
          out.write("                                <a href=\"#\" onclick=\"enableTracing('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/trace-icon-disabled.gif);\">");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                            <div id=\"disableTracing");
          out.print( sequence.getName());
          out.write("\" style=\"display:none\">\n");
          out.write("                                <a href=\"#\" onclick=\"disableTracing('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/trace-icon.gif);\">");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                            </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                            ");
 } 
          out.write("\n");
          out.write("                                    <td style=\"border-left:none;border-right:none;width:100px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <a href=\"#\" onclick=\"editSequence('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                                    <td style=\"border-left:none;width:100px\">\n");
          out.write("                                <div class=\"inlineDiv\">\n");
          out.write("                            <a href=\"#\" onclick=\"deleteSequence('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\" style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                </tr>\n");
          out.write("                ");
 } 
          out.write("\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            alternateTableRows('sequencesTable', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        </script>\n");
          out.write("<p>&nbsp;</p>\n");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_1 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_1.setPageNumber(pageNumber);
          _jspx_th_carbon_paginator_1.setNumberOfPages(numberOfPages);
          _jspx_th_carbon_paginator_1.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_1.setPageNumberParameterName("pageNumber");
          _jspx_th_carbon_paginator_1.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
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
          out.write("        ");
 } else { 
          out.write("\n");
          out.write("            <p>");
          if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        ");
 } 
          out.write("\n");
          out.write("        </div>\n");
          out.write("    <div id=\"tabs-2\">\n");
          out.write("        ");
 if ((dynamicSequences != null) && (dynamicSequences.length > 0)) { 
          out.write("\n");
          out.write("        <p>");
          if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        <br/>\n");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_2 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_2.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_2.setPageNumber(dynamicPageNumber);
          _jspx_th_carbon_paginator_2.setNumberOfPages(numberOfDynamicPages);
          _jspx_th_carbon_paginator_2.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_2.setPageNumberParameterName("dynamicPageNumber");
          _jspx_th_carbon_paginator_2.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.Resources");
          _jspx_th_carbon_paginator_2.setPrevKey("prev");
          _jspx_th_carbon_paginator_2.setNextKey("next");
          _jspx_th_carbon_paginator_2.setParameters("");
          int _jspx_eval_carbon_paginator_2 = _jspx_th_carbon_paginator_2.doStartTag();
          if (_jspx_th_carbon_paginator_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_2);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_2);
          out.write("\n");
          out.write("        <br/>\n");
          out.write("        <table class=\"styledLeft\" cellspacing=\"1\" id=\"dynamicSequencesTable\">\n");
          out.write("            <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <th>\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </th>\n");
          out.write("                    <th class=\"registryWriteOperation\" style=\"width:200px\" colspan=\"2\">\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    </th>\n");
          out.write("                </tr>\n");
          out.write("            </thead>\n");
          out.write("            <tbody>\n");
          out.write("            ");
 for (SequenceInfo sequence : dynamicSequences) { 
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td style=\"width:200px\">\n");
          out.write("                    ");
          out.print( sequence.getName() );
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td class=\"registryWriteOperation\" style=\"border-right:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"editRegistrySequence('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("                <td class=\"registryWriteOperation\" style=\"border-left:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"deleteRegistrySequence('");
          out.print( sequence.getName() );
          out.write("')\" class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("        <br>\n");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_3 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_3.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_3.setPageNumber(dynamicPageNumber);
          _jspx_th_carbon_paginator_3.setNumberOfPages(numberOfDynamicPages);
          _jspx_th_carbon_paginator_3.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_3.setPageNumberParameterName("dynamicPageNumber");
          _jspx_th_carbon_paginator_3.setResourceBundle("org.wso2.carbon.sequences.ui.i18n.Resources");
          _jspx_th_carbon_paginator_3.setPrevKey("prev");
          _jspx_th_carbon_paginator_3.setNextKey("next");
          _jspx_th_carbon_paginator_3.setParameters("");
          int _jspx_eval_carbon_paginator_3 = _jspx_th_carbon_paginator_3.doStartTag();
          if (_jspx_th_carbon_paginator_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_3);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_3);
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            alternateTableRows('dynamicSequencesTable', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        </script>\n");
          out.write("\n");
          out.write("        ");
 } else { 
          out.write("\n");
          out.write("            <p>");
          if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        ");
 } 
          out.write("\n");
          out.write("        </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("    ");

        EndpointTemplateAdminClient endpointClient
                = new EndpointTemplateAdminClient(this.getServletConfig(), session);
        EndpointTemplateInfo[] endpointTemplates = null;
        EndpointTemplateInfo[] dynamicEndpointTemplates = null;
        String endpointPageNumberStr = request.getParameter("pageNumberForEndpoint");
        String dynamicEndpointPageNumberStr = request.getParameter("dynamicPageNumberForEndpoint");
        int endpointPageNumber = 0;
        int dynamicEndpointPageNumber = 0;
        if (endpointPageNumberStr != null) {
            endpointPageNumber = Integer.parseInt(endpointPageNumberStr);
        }
        if (dynamicEndpointPageNumberStr != null) {
            dynamicEndpointPageNumber = Integer.parseInt(dynamicEndpointPageNumberStr);
        }
        int numberOfPagesEndpoint = 0;
        int numberOfDynamicPagesEndpoint = 0;

        endpointTemplates = endpointClient.getEndpointTemplates(pageNumber, TemplateEditorConstants.SEQUENCE_PER_PAGE);
        dynamicEndpointTemplates = endpointClient.getDynamicEndpointTemplates(dynamicPageNumber,
                TemplateEditorConstants.SEQUENCE_PER_PAGE);
        if(endpointTemplates == null){
            endpointTemplates = new EndpointTemplateInfo[0];
        }
        if(dynamicEndpointTemplates == null){
            dynamicEndpointTemplates = new EndpointTemplateInfo[0];
        }
        int epTemplateCount = endpointClient.getEndpointTemplatesCount();
        int dynamicTemplateCount = endpointClient.getDynamicEndpointTemplatesCount();

        if (epTemplateCount % TemplateEditorConstants.SEQUENCE_PER_PAGE == 0) {
            numberOfPagesEndpoint = epTemplateCount / TemplateEditorConstants.SEQUENCE_PER_PAGE;
        } else {
            numberOfPagesEndpoint = epTemplateCount / TemplateEditorConstants.SEQUENCE_PER_PAGE + 1;
        }

        if (dynamicTemplateCount % TemplateEditorConstants.SEQUENCE_PER_PAGE == 0) {
            numberOfDynamicPagesEndpoint = dynamicTemplateCount / TemplateEditorConstants.SEQUENCE_PER_PAGE;
        } else {
            numberOfDynamicPagesEndpoint = dynamicTemplateCount / TemplateEditorConstants.SEQUENCE_PER_PAGE + 1;
        }
    
          out.write("\n");
          out.write("\n");
          out.write("    <div id=\"tabs-3\">\n");
          out.write("        ");
 if ((endpointTemplates != null) && (endpointTemplates.length > 0)) { 
          out.write("\n");
          out.write("        <p>");
          if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        <br/>\n");
          out.write("        ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_4 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_4.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_4.setPageNumber(endpointPageNumber);
          _jspx_th_carbon_paginator_4.setNumberOfPages(numberOfPagesEndpoint);
          _jspx_th_carbon_paginator_4.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_4.setPageNumberParameterName("endpointPageNumber");
          _jspx_th_carbon_paginator_4.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
          _jspx_th_carbon_paginator_4.setPrevKey("prev");
          _jspx_th_carbon_paginator_4.setNextKey("next");
          _jspx_th_carbon_paginator_4.setParameters("");
          int _jspx_eval_carbon_paginator_4 = _jspx_th_carbon_paginator_4.doStartTag();
          if (_jspx_th_carbon_paginator_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_4);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_4);
          out.write("\n");
          out.write("        <br>\n");
          out.write("        <table class=\"styledLeft\" cellspacing=\"1\" id=\"endpointsTable\">\n");
          out.write("            <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </th>\n");
          out.write("                ");
          out.write("\n");
          out.write("                <th colspan=\"4\">\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </th>\n");
          out.write("            </tr>\n");
          out.write("            </thead>\n");
          out.write("            <tbody>\n");
          out.write("            ");
 for (EndpointTemplateInfo endpoint : endpointTemplates) { 
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          out.print( endpoint.getTemplateName() );
          out.write("\n");
          out.write("                </td>\n");
          out.write("                ");
          out.write("\n");
          out.write("\n");
          out.write("                <td style=\"border-left:none;border-right:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"editEndpoint('");
          out.print( endpoint.getTemplateName() );
          out.write("','");
          out.print( endpoint.getEndpointType() );
          out.write("','");
          out.print( endpoint.getParamColelctionString() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("                <td style=\"border-left:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"deleteEndpoint('");
          out.print( endpoint.getTemplateName() );
          out.write("','");
          out.print( endpoint.getEndpointType() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            alternateTableRows('endpointsTable', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        </script>\n");
          out.write("        <p>&nbsp;</p>\n");
          out.write("        ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_5 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_5.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_5.setPageNumber(endpointPageNumber);
          _jspx_th_carbon_paginator_5.setNumberOfPages(numberOfPagesEndpoint);
          _jspx_th_carbon_paginator_5.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_5.setPageNumberParameterName("endpointPageNumber");
          _jspx_th_carbon_paginator_5.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
          _jspx_th_carbon_paginator_5.setPrevKey("prev");
          _jspx_th_carbon_paginator_5.setNextKey("next");
          _jspx_th_carbon_paginator_5.setParameters("");
          int _jspx_eval_carbon_paginator_5 = _jspx_th_carbon_paginator_5.doStartTag();
          if (_jspx_th_carbon_paginator_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_5);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_5);
          out.write("\n");
          out.write("    ");
 } else { 
          out.write("\n");
          out.write("            <p>");
          if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        ");
 } 
          out.write("\n");
          out.write("    </div>\n");
          out.write("\n");
          out.write("    <div id=\"tabs-4\">\n");
          out.write("        ");
 if ((dynamicEndpointTemplates != null) && (dynamicEndpointTemplates.length > 0)) { 
          out.write("\n");
          out.write("        <p>");
          if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        <br/>\n");
          out.write("        ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_6 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_6.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_6.setPageNumber(dynamicEndpointPageNumber);
          _jspx_th_carbon_paginator_6.setNumberOfPages(numberOfDynamicPagesEndpoint);
          _jspx_th_carbon_paginator_6.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_6.setPageNumberParameterName("dynamicEndpointPageNumber");
          _jspx_th_carbon_paginator_6.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
          _jspx_th_carbon_paginator_6.setPrevKey("prev");
          _jspx_th_carbon_paginator_6.setNextKey("next");
          _jspx_th_carbon_paginator_6.setParameters("");
          int _jspx_eval_carbon_paginator_6 = _jspx_th_carbon_paginator_6.doStartTag();
          if (_jspx_th_carbon_paginator_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_6);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_6);
          out.write("\n");
          out.write("        <br>\n");
          out.write("        <table class=\"styledLeft\" cellspacing=\"1\" id=\"dynamicEndpointsTable\">\n");
          out.write("            <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </th>\n");
          out.write("                <th>\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </th>\n");
          out.write("                <th class=\"registryWriteOperation\" colspan=\"4\">\n");
          out.write("                    ");
          if (_jspx_meth_fmt_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                </th>\n");
          out.write("            </tr>\n");
          out.write("            </thead>\n");
          out.write("            <tbody>\n");
          out.write("            ");
 for (EndpointTemplateInfo endpoint : dynamicEndpointTemplates) { 
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    ");
          out.print( endpoint.getTemplateName() );
          out.write("\n");
          out.write("                </td>\n");
          out.write("                <td>\n");
          out.write("                    ");
          out.print( endpoint.getDescription() != null ? endpoint.getDescription() : "" );
          out.write("\n");
          out.write("                </td>\n");
          out.write("\n");
          out.write("                <td class=\"registryWriteOperation\" style=\"border-left:none;border-right:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"editRegistryEndpoint('");
          out.print( endpoint.getTemplateName() );
          out.write("','");
          out.print( endpoint.getEndpointType() );
          out.write("','");
          out.print( endpoint.getParamColelctionString() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/edit.gif);\">");
          if (_jspx_meth_fmt_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("                <td class=\"registryWriteOperation\" style=\"border-left:none;width:100px\">\n");
          out.write("                    <div class=\"inlineDiv\">\n");
          out.write("                        <a href=\"#\" onclick=\"deleteRegistryEndpoint('");
          out.print( endpoint.getTemplateName() );
          out.write("','");
          out.print( endpoint.getEndpointType() );
          out.write("')\"\n");
          out.write("                           class=\"icon-link\"\n");
          out.write("                           style=\"background-image:url(../admin/images/delete.gif);\">");
          if (_jspx_meth_fmt_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            ");
 } 
          out.write("\n");
          out.write("            </tbody>\n");
          out.write("        </table>\n");
          out.write("\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            alternateTableRows('dynamicEndpointsTable', 'tableEvenRow', 'tableOddRow');\n");
          out.write("        </script>\n");
          out.write("        <p>&nbsp;</p>\n");
          out.write("        ");
          //  carbon:paginator
          org.wso2.carbon.ui.taglibs.Paginator _jspx_th_carbon_paginator_7 = (org.wso2.carbon.ui.taglibs.Paginator) _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.get(org.wso2.carbon.ui.taglibs.Paginator.class);
          _jspx_th_carbon_paginator_7.setPageContext(_jspx_page_context);
          _jspx_th_carbon_paginator_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_paginator_7.setPageNumber(dynamicEndpointPageNumber);
          _jspx_th_carbon_paginator_7.setNumberOfPages(numberOfDynamicPagesEndpoint);
          _jspx_th_carbon_paginator_7.setPage("list_templates.jsp");
          _jspx_th_carbon_paginator_7.setPageNumberParameterName("dynamicEndpointPageNumber");
          _jspx_th_carbon_paginator_7.setResourceBundle("org.wso2.carbon.mediation.templates.ui.i18n.Resources");
          _jspx_th_carbon_paginator_7.setPrevKey("prev");
          _jspx_th_carbon_paginator_7.setNextKey("next");
          _jspx_th_carbon_paginator_7.setParameters("");
          int _jspx_eval_carbon_paginator_7 = _jspx_th_carbon_paginator_7.doStartTag();
          if (_jspx_th_carbon_paginator_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_7);
            return;
          }
          _jspx_tagPool_carbon_paginator_resourceBundle_prevKey_parameters_pageNumberParameterName_pageNumber_page_numberOfPages_nextKey_nobody.reuse(_jspx_th_carbon_paginator_7);
          out.write("\n");
          out.write("    ");
 } else { 
          out.write("\n");
          out.write("            <p>");
          if (_jspx_meth_fmt_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</p>\n");
          out.write("        ");
 } 
          out.write("\n");
          out.write("    </div>\n");
          out.write("\n");
          out.write("</div>\n");
          out.write("</div>\n");
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
    _jspx_th_fmt_message_0.setKey("sequence.dependency.mgt.warning");
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
    _jspx_th_fmt_message_1.setKey("force.delete");
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
    _jspx_th_fmt_message_2.setKey("endpoint.already.exists");
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
    _jspx_th_fmt_message_3.setKey("template.trace.enable.link");
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
    _jspx_th_fmt_message_4.setKey("sequence.stat.disable.error");
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
    _jspx_th_fmt_message_5.setKey("sequence.stat.enable.error");
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
    _jspx_th_fmt_message_6.setKey("sequence.trace.enable.link");
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
    _jspx_th_fmt_message_7.setKey("sequence.trace.disable.error");
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
    _jspx_th_fmt_message_8.setKey("template.trace.enable.link");
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
    _jspx_th_fmt_message_9.setKey("sequence.main.fault.cannot.delete");
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
    _jspx_th_fmt_message_10.setKey("sequence.delete.confirmation");
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
    _jspx_th_fmt_message_11.setKey("endpoint.delete.confirmation");
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
    _jspx_th_fmt_message_12.setKey("template.trace.enable.link");
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
    _jspx_th_fmt_message_13.setKey("sequence.main.fault.cannot.delete");
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
    _jspx_th_fmt_message_14.setKey("sequence.delete.confirmation");
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
    _jspx_th_fmt_message_15.setKey("endpoint.delete.confirmation");
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
    _jspx_th_fmt_message_16.setKey("mediation.templates.header");
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
    _jspx_th_fmt_message_17.setKey("sequence.button.add.text");
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
    _jspx_th_fmt_message_18.setKey("endpoint.button.add.text");
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
    _jspx_th_fmt_message_19.setKey("defined.templates");
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
    _jspx_th_fmt_message_20.setKey("dynamic.templates");
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
    _jspx_th_fmt_message_21.setKey("endpoint.templates");
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
    _jspx_th_fmt_message_22.setKey("dynamic.endpoint.templates");
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
    _jspx_th_fmt_message_23.setKey("sequences.defined.text");
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
    _jspx_th_fmt_message_24.setKey("sequence.name");
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
    _jspx_th_fmt_message_25.setKey("sequence.actions");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_26.setKey("sequence.stat.disable.link");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_27.setKey("sequence.stat.enable.link");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
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
    _jspx_th_fmt_message_28.setKey("sequence.stat.enable.link");
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
    _jspx_th_fmt_message_29.setKey("sequence.stat.disable.link");
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
    _jspx_th_fmt_message_30.setKey("sequence.trace.disable.link");
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
    _jspx_th_fmt_message_31.setKey("sequence.trace.enable.link");
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
    _jspx_th_fmt_message_32.setKey("sequence.trace.enable.link");
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
    _jspx_th_fmt_message_33.setKey("sequence.trace.disable.link");
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
    _jspx_th_fmt_message_34.setKey("sequence.edit.action");
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
    _jspx_th_fmt_message_35.setKey("sequence.delete.action");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_36.setKey("no.templates.static.text");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_37.setKey("sequences.dynamic.text");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_38.setKey("sequence.name");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_39.setKey("sequence.actions");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_40.setKey("sequence.edit.action");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_41.setKey("sequence.delete.action");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_42.setKey("no.templates.dynamic.text");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_43.setKey("endpoint.defined.text");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_44.setKey("endpoint.name");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_45.setKey("endpoint.actions");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_46.setKey("endpoint.edit.action");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }

  private boolean _jspx_meth_fmt_message_47(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_47.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_47.setKey("endpoint.delete.action");
    int _jspx_eval_fmt_message_47 = _jspx_th_fmt_message_47.doStartTag();
    if (_jspx_th_fmt_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
    return false;
  }

  private boolean _jspx_meth_fmt_message_48(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_48.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_48.setKey("no.templates.static.text");
    int _jspx_eval_fmt_message_48 = _jspx_th_fmt_message_48.doStartTag();
    if (_jspx_th_fmt_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
    return false;
  }

  private boolean _jspx_meth_fmt_message_49(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_49.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_49.setKey("endpoints.dynamic.text");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
    return false;
  }

  private boolean _jspx_meth_fmt_message_50(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_50.setKey("endpoint.name");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
    return false;
  }

  private boolean _jspx_meth_fmt_message_51(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_51.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_51.setKey("endpoint.description");
    int _jspx_eval_fmt_message_51 = _jspx_th_fmt_message_51.doStartTag();
    if (_jspx_th_fmt_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
    return false;
  }

  private boolean _jspx_meth_fmt_message_52(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_52 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_52.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_52.setKey("endpoint.actions");
    int _jspx_eval_fmt_message_52 = _jspx_th_fmt_message_52.doStartTag();
    if (_jspx_th_fmt_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
    return false;
  }

  private boolean _jspx_meth_fmt_message_53(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_53 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_53.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_53.setKey("endpoint.edit.action");
    int _jspx_eval_fmt_message_53 = _jspx_th_fmt_message_53.doStartTag();
    if (_jspx_th_fmt_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
    return false;
  }

  private boolean _jspx_meth_fmt_message_54(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_54 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_54.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_54.setKey("endpoint.delete.action");
    int _jspx_eval_fmt_message_54 = _jspx_th_fmt_message_54.doStartTag();
    if (_jspx_th_fmt_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
    return false;
  }

  private boolean _jspx_meth_fmt_message_55(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_55 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_55.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_55.setKey("no.templates.dynamic.text");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
    return false;
  }
}
