package org.apache.jsp.hive_002dexplorer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.analytics.hive.ui.client.HiveScriptStoreClient;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import org.apache.poi.hssf.record.formula.functions.True;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class hiveexplorer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String wrapTextInVisibleWidth(String line) {
        int max = 100;
        if (null != line) {
            line = line.trim();
            if (line.length() <= max) {
                return line;
            } else {
                String newLine = "";
                String[] spaceSplit = line.split(" ");
                int count = 0;
                for (String word : spaceSplit) {
                    if (count + word.length() <= max) {
                        newLine += word + " ";
                        count += word.length() + 1;
                    } else {
                        newLine += "\n\t" + word + " ";
                        count = (word + " ").length();
                    }
                }
                return newLine;
            }
        } else {
            return null;
        }


    }

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
          out.write('\n');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("hive.explorer");
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
          out.write("<script src=\"../editarea/edit_area_full.js\" type=\"text/javascript\"></script>\n");
          out.write("<script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/hive-explorer-styles.css\">\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    YAHOO.util.Event.onDOMReady(function() {\n");
          out.write("        editAreaLoader.init({\n");
          out.write("                    id : \"allcommands\"\n");
          out.write("                    ,syntax: \"sql\"\n");
          out.write("                    ,start_highlight: true\n");
          out.write("                });\n");
          out.write("    });\n");
          out.write("</script>\n");
          out.write("\n");

    String scriptName = "";
    String scriptContent = "";
    String cron = "";
    String mode = request.getParameter("mode");

    String isSchedulingCanceled = "false";
    if("true".equals(request.getParameter("schedulingCanceled"))){
        isSchedulingCanceled  = "true";
    }
    int max = 40;
    boolean scriptNameExists = false;
    if (request.getParameter("scriptName") != null && !request.getParameter("scriptName").equals("")) {
        scriptName = request.getParameter("scriptName");
    }
    if (null != mode && mode.equalsIgnoreCase("edit")) {
        scriptNameExists = true;
    } else {
        scriptNameExists = false;
        mode = "";
    }
    String requestUrl = request.getHeader("Referer");
    boolean isFromScheduling = false;
    if (requestUrl != null && requestUrl.contains("scheduletask.jsp")) {
        isFromScheduling = true;
    }
    if (scriptNameExists && !isFromScheduling) {
        try {
            String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
            ConfigurationContext configContext =
                    (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
            String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
            HiveScriptStoreClient client = new HiveScriptStoreClient(cookie, serverURL, configContext);
            scriptContent = client.getScript(scriptName);
            cron = client.getCronExpression(scriptName);
            if (scriptContent != null && !scriptContent.equals("")) {
                scriptContent = scriptContent.replace("'", "\'");
//                Pattern regex = Pattern.compile("[^\"']+|\"([^\"]*)\"|'([^']*)'");
//                Matcher regexMatcher = regex.matcher(scriptContent);
//                String formattedScript = "";
//                while (regexMatcher.find()) {
//                    String temp = "";
//                    if (regexMatcher.group(1) != null) {
//                        // Add double-quoted string without the quotes
//                        temp = regexMatcher.group(1);
//                        temp = "\"" + temp + "\"";
//                    } else if (regexMatcher.group(2) != null) {
//                        // Add single-quoted string without the quotes
//                        temp = regexMatcher.group(2);
//                        temp = "\'" + temp + "\'";
//                    } else {
//                        temp = regexMatcher.group();
//                    }
//                    formattedScript += temp + " ";
//                }

//                String[] queries = formattedScript.split(";");
//                scriptContent = "";
//                for (String aquery : queries) {
//                    aquery = aquery.trim();
//                    if (!aquery.equals("")) {
//                        aquery = aquery.replaceAll("%%\n", ";");
//                        aquery = aquery.replaceAll("%%", ";");
//                        aquery = wrapTextInVisibleWidth(aquery);
//                        String[] temp = aquery.split(",");
//
//                        if (null != temp) {
//                            aquery = "";
//                            int count = 0;
//                            for (String aSubQuery : temp) {
//                                aSubQuery = aSubQuery.trim();
//                                if (!aSubQuery.equals("")) {
//                                    count += aSubQuery.length() + 1;
//                                    if (count > max) {
//                                        aquery += aSubQuery + "," + "\n\t";
//                                        count = 0;
//                                    } else {
//                                        aquery += aSubQuery + ",";
//                                    }
//                                }
//                            }
//                            aquery = aquery.trim();
//                            if (aquery.endsWith(",")) aquery = aquery.substring(0, aquery.length() - 1);
//                            scriptContent = scriptContent + aquery + ";" + "\n";
//                        }
//                    }
//                }
            }
        } catch (Exception e) {
            String errorString = e.getMessage();
            CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);

          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    location.href = \"../admin/error.jsp\";\n");
          out.write("    alert('");
          out.print(errorString);
          out.write("');\n");
          out.write("</script>\n");

            return;
        }
    }
    if (isFromScheduling) {
        Object content = session.getAttribute("scriptContent" + scriptName);
        if (null != content) {
            scriptContent = content.toString();
        } else {
            scriptContent = "";
        }
        if (null != request.getParameter("cron")) {
            cron = request.getParameter("cron").toString();
        }
        if (scriptContent != null && !scriptContent.equals("")) {
            scriptContent = scriptContent.replace("'", "\'");

//            Pattern regex = Pattern.compile("[^\"']+|\"([^\"]*)\"|'([^']*)'");
//            Matcher regexMatcher = regex.matcher(scriptContent);
//            String formattedScript = "";
//            while (regexMatcher.find()) {
//                String temp = "";
//                if (regexMatcher.group(1) != null) {
//                    // Add double-quoted string without the quotes
//                    temp = regexMatcher.group(1);
//                    temp = "\"" + temp + "\"";
//                } else if (regexMatcher.group(2) != null) {
//                    // Add single-quoted string without the quotes
//                    temp = regexMatcher.group(2);
//                    temp = "\'" + temp + "\'";
//                } else {
//                    temp = regexMatcher.group();
//                }
//                formattedScript += temp + " ";
//            }
//            scriptContent = formattedScript;
//            System.out.println("After formatting Script content: ");
//            System.out.println(scriptContent);
//            String[] queries = formattedScript.split(";");
//            scriptContent = "";
//            for (String aquery : queries) {
//                aquery = aquery.trim();
//                if (!aquery.equals("")) {
//                    aquery = aquery.replaceAll("%%\n", ";");
//                    aquery = aquery.replaceAll("%%", ";");
//                    aquery = wrapTextInVisibleWidth(aquery);
//                    String[] temp = aquery.split(",");
//
//                    if (null != temp) {
//                        aquery = "";
//                        int count = 0;
//                        for (String aSubQuery : temp) {
//                            aSubQuery = aSubQuery.trim();
//                            if (!aSubQuery.equals("")) {
//                                count += aSubQuery.length() + 1;
//                                if (count > max) {
//                                    aquery += aSubQuery + "," + "\n\t";
//                                    count = 0;
//                                } else {
//                                    aquery += aSubQuery + ",";
//                                }
//                            }
//                        }
//                        aquery = aquery.trim();
//                        if (aquery.endsWith(",")) aquery = aquery.substring(0, aquery.length() - 1);
//                        scriptContent = scriptContent + aquery + ";" + "\n";
//                    }
//                }
//            }
        }
    }



          out.write('\n');
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    var cron = '");
          out.print(cron);
          out.write("';\n");
          out.write("    var scriptName = '");
          out.print(scriptName);
          out.write("';\n");
          out.write("    var saveWithoutPrompt = '");
          out.print(isSchedulingCanceled);
          out.write("';\n");
          out.write("    var allQueries = '';\n");
          out.write("    function executeQuery() {\n");
          out.write("        document.getElementById('hiveResult').innerHTML = '';\n");
          out.write("        var allQueries = editAreaLoader.getValue(\"allcommands\");\n");
          out.write("        allQueries = trim(allQueries);\n");
          out.write("        if (allQueries != '') {\n");
          out.write("            document.getElementById('middle').style.cursor = 'wait';\n");
          out.write("            openProgressBar();\n");
          out.write("            window.location.hash = \"scriptResults\";\n");
          out.write("            new Ajax.Request('../hive-explorer/queryresults.jsp', {\n");
          out.write("                        method: 'post',\n");
          out.write("                        parameters: {queries:allQueries,\n");
          out.write("                            scriptName: scriptName},\n");
          out.write("                        onSuccess: function(transport) {\n");
          out.write("                            document.getElementById('middle').style.cursor = '';\n");
          out.write("                            closeProgrsssBar();\n");
          out.write("                            var allPage = transport.responseText;\n");
          out.write("                            var divText = '<div id=\"returnedResults\">';\n");
          out.write("                            var closeDivText = '</div>';\n");
          out.write("                            var temp = allPage.indexOf(divText, 0);\n");
          out.write("                            var startIndex = temp + divText.length;\n");
          out.write("                            var endIndex = allPage.indexOf(closeDivText, temp);\n");
          out.write("                            var queryResults = allPage.substring(startIndex, endIndex);\n");
          out.write("                            document.getElementById('hiveResult').innerHTML = queryResults;\n");
          out.write("                        },\n");
          out.write("                        onFailure: function(transport) {\n");
          out.write("                            closeProgrsssBar();\n");
          out.write("                            document.getElementById('middle').style.cursor = '';\n");
          out.write("                            CARBON.showErrorDialog(transport.responseText);\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("\n");
          out.write("        } else {\n");
          out.write("            document.getElementById('middle').style.cursor = '';\n");
          out.write("            var message = \"Empty query can not be executed\";\n");
          out.write("            CARBON.showErrorDialog(message);\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function trim(text) {\n");
          out.write("        return text.replace(/^\\s+|\\s+$/g, \"\");\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function saveScript() {\n");
          out.write("        allQueries = editAreaLoader.getValue(\"allcommands\");\n");
          out.write("        scriptName = document.getElementById('scriptName').value;\n");
          out.write("        allQueries = trim(allQueries);\n");
          out.write("        if (allQueries != \"\") {\n");
          out.write("            if (scriptName != \"\") {\n");
          out.write("                if (cron != \"\" || saveWithoutPrompt == \"true\") {\n");
          out.write("                    checkExistingNameAndSaveScript();\n");
          out.write("                }\n");
          out.write("                else {\n");
          out.write("                    document.getElementById('saveWithCron').value = 'true';\n");
          out.write("                    CARBON.showConfirmationDialog(\"Do you want to schedule the script?\", function() {\n");
          out.write("                        scheduleTask();\n");
          out.write("                    }, function() {\n");
          out.write("                        checkExistingNameAndSaveScript();\n");
          out.write("                    }, function() {\n");
          out.write("\n");
          out.write("                    });\n");
          out.write("                }\n");
          out.write("\n");
          out.write("            } else {\n");
          out.write("                var message = \"Please enter script name to save\";\n");
          out.write("                CARBON.showErrorDialog(message);\n");
          out.write("            }\n");
          out.write("\n");
          out.write("        } else {\n");
          out.write("            var message = \"Empty query can not be saved\";\n");
          out.write("            CARBON.showErrorDialog(message);\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function cancelScript() {\n");
          out.write("        location.href = \"../hive-explorer/listscripts.jsp\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function scheduleTask() {\n");
          out.write("        var allQueries = editAreaLoader.getValue(\"allcommands\");\n");
          out.write("        document.getElementById('scriptContent').value = allQueries;\n");
          out.write("        document.getElementById('commandForm').action = \"../hive-explorer/scheduletask.jsp?mode=\" + '");
          out.print(mode);
          out.write("' + '&cron=' + '");
          out.print(cron);
          out.write("';\n");
          out.write("        document.getElementById('commandForm').submit();\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function checkExistingNameAndSaveScript() {\n");
          out.write("        var mode = '");
          out.print(mode);
          out.write("';\n");
          out.write("        if (mode != 'edit') {\n");
          out.write("            new Ajax.Request('../hive-explorer/ScriptNameChecker', {\n");
          out.write("                        method: 'post',\n");
          out.write("                        parameters: {scriptName:scriptName},\n");
          out.write("                        onSuccess: function(transport) {\n");
          out.write("                            var result = transport.responseText;\n");
          out.write("                            if (result.indexOf('true') != -1) {\n");
          out.write("                                var message = \"The script name: \" + scriptName + 'already exists in the database. Please enter a different script name.';\n");
          out.write("                                CARBON.showErrorDialog(message);\n");
          out.write("                            } else {\n");
          out.write("                                sendRequestToSaveScript();\n");
          out.write("                            }\n");
          out.write("                        },\n");
          out.write("                        onFailure: function(transport) {\n");
          out.write("                            return true;\n");
          out.write("                        }\n");
          out.write("                    });\n");
          out.write("        } else {\n");
          out.write("            sendRequestToSaveScript();\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function sendRequestToSaveScript() {\n");
          out.write("        new Ajax.Request('../hive-explorer/SaveScriptProcessor', {\n");
          out.write("                    method: 'post',\n");
          out.write("                    parameters: {queries:allQueries, scriptName:scriptName,\n");
          out.write("                        cronExp:cron},\n");
          out.write("                    onSuccess: function(transport) {\n");
          out.write("                        var result = transport.responseText;\n");
          out.write("                        if (result.indexOf('Success') != -1) {\n");
          out.write("                            CARBON.showInfoDialog(result, function() {\n");
          out.write("                                location.href = \"../hive-explorer/listscripts.jsp\";\n");
          out.write("                            }, function() {\n");
          out.write("                                location.href = \"../hive-explorer/listscripts.jsp\";\n");
          out.write("                            });\n");
          out.write("\n");
          out.write("                        } else {\n");
          out.write("                            CARBON.showErrorDialog(result);\n");
          out.write("                        }\n");
          out.write("                    },\n");
          out.write("                    onFailure: function(transport) {\n");
          out.write("                        CARBON.showErrorDialog(result);\n");
          out.write("                    }\n");
          out.write("                });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function openProgressBar() {\n");
          out.write("        var content = '<div id=\"overlay\"><div id=\"box\"><div class=\"ui-dialog-title-bar\">' +\n");
          out.write("                'Executing Hive Queries<a href=\"#\" title=\"Close\" class=\"ui-dialog-titlebar-close\" onclick=\"closeProgrsssBar();\">' +\n");
          out.write("                '<span style=\"display: none\">x</span></a>' +\n");
          out.write("                '</div><div class=\"dialog-content\"><img src=\"../resources/images/ajax-loader.gif\" />' +\n");
          out.write("                ' Executing Hive Queries...</div></div></div>';\n");
          out.write("        document.getElementById('dynamic').innerHTML = content;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function closeProgrsssBar() {\n");
          out.write("        document.getElementById('dynamic').innerHTML = '';\n");
          out.write("    }\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    $(document).ready(function() {\n");
          out.write("        document.getElementById('allcommands').focus();\n");
          out.write("    });\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("    <div id=\"dynamic\"></div>\n");
          out.write("    ");

        if (scriptNameExists) {
    
          out.write("\n");
          out.write("    <h2>Script Editor");
          out.print(" - " + scriptName);
          out.write("\n");
          out.write("        ");

        } else {
        
          out.write("\n");
          out.write("        <h2>Script Editor</h2>\n");
          out.write("        ");

            }
        
          out.write("\n");
          out.write("    </h2>\n");
          out.write("\n");
          out.write("    <div id=\"workArea\">\n");
          out.write("\n");
          out.write("        <form id=\"commandForm\" name=\"commandForm\" action=\"\" method=\"POST\">\n");
          out.write("            <table class=\"styledLeft noBorders\">\n");
          out.write("                <thead>\n");
          out.write("                <tr>\n");
          out.write("                    <th><span style=\"float: left; position: relative; margin-top: 2px;\">\n");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span>\n");
          out.write("                    </th>\n");
          out.write("                </tr>\n");
          out.write("                </thead>\n");
          out.write("                <tbody>\n");
          out.write("                <tr>\n");
          out.write("                    <td style=\"padding: 10px 0 0 20px;\">\n");
          out.write("                        <a class=\"icon-link\" style=\"background: url('images/tasks-icon.gif') no-repeat;float:right;\"\n");
          out.write("                           href=\"javascript: scheduleTask();\">Schedule\n");
          out.write("                            Script</a>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                ");

                    if (!scriptNameExists) {
                
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <table class=\"normal-nopadding\">\n");
          out.write("                            <tbody>\n");
          out.write("                            <tr>\n");
          out.write("                                <td class=\"leftCol-small\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" <span\n");
          out.write("                                        class=\"required\">*</span>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" id=\"scriptName\" name=\"scriptName\" size=\"60\"\n");
          out.write("                                           value=\"");
          out.print(scriptName);
          out.write("\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            </tbody>\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                ");

                } else { 
          out.write("\n");
          out.write("                <input type=\"hidden\" value=\"");
          out.print(scriptName);
          out.write("\" name=\"scriptName\" id=\"scriptName\">\n");
          out.write("                ");
 }
                
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                    ");
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <table class=\"normal-nopadding\">\n");
          out.write("                            <tbody>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <textarea id=\"allcommands\" name=\"allcommands\" rows=\"25\"\n");
          out.write("                                              style=\"width:99%\">");
          out.print(scriptContent);
          out.write("\n");
          out.write("                                    </textarea>\n");
          out.write("                                </td>\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <input class=\"button\" type=\"button\" onclick=\"executeQuery()\"\n");
          out.write("                                           value=\"");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" />\n");
          out.write("                                    <input class=\"button\" type=\"button\" onclick=\"saveScript()\"\n");
          out.write("                                           value=\"");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"/>\n");
          out.write("                                    <input type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" onclick=\"cancelScript()\"\n");
          out.write("                                           class=\"button\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("\n");
          out.write("                            </tbody>\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <table class=\"normal-nopadding\">\n");
          out.write("                            <tbody>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            </tbody>\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td class=\"middle-header\">\n");
          out.write("                        <a name=\"scriptResults\"> ");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(" </a>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <div id=\"hiveResult\" class=\"scrollable\" style=\"width:99%\">\n");
          out.write("                                ");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("                <input type=\"hidden\" name=\"scriptContent\" id=\"scriptContent\"/>\n");
          out.write("                <input type=\"hidden\" name=\"saveWithCron\" id=\"saveWithCron\"/>\n");
          out.write("            </table>\n");
          out.write("            </td>\n");
          out.write("            </tr>\n");
          out.write("            </tbody>\n");
          out.write("            </table>\n");
          out.write("\n");
          out.write("        </form>\n");
          out.write("\n");
          out.write("\n");
          out.write("    </div>\n");
          out.write("</div>\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    ");
          out.write("\n");
          out.write("    //  editAreaLoader.setValue('allcommands', commands.replace(/#*#/g, '\\'').replace(/$*$/g, '\\\"'));\n");
          out.write("    ");
          out.write("\n");
          out.write("</script>\n");
          out.write("\n");

    String saveWithCron = request.getParameter("saveWithCron");
    if (null != saveWithCron && !saveWithCron.equals("")) {

          out.write("\n");
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    saveScript();\n");
          out.write("</script>\n");

    }

          out.write('\n');
          out.write('\n');
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
    _jspx_th_fmt_message_0.setKey("script");
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
    _jspx_th_fmt_message_1.setKey("script.name");
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
    _jspx_th_fmt_message_2.setKey("execute");
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
    _jspx_th_fmt_message_3.setKey("save");
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
    _jspx_th_fmt_message_4.setKey("cancel");
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
    _jspx_th_fmt_message_5.setKey("script.results");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }
}
