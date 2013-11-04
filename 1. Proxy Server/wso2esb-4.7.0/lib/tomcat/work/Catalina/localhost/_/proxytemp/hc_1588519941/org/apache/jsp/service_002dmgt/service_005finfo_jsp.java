package org.apache.jsp.service_002dmgt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.service.mgt.ui.ServiceAdminClient;
import org.wso2.carbon.service.mgt.stub.types.carbon.ServiceMetaData;
import org.wso2.carbon.utils.ServerConstants;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.CarbonConstants;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.wso2.carbon.service.mgt.ui.ServiceManagementUIExtender;
import java.util.List;
import org.wso2.carbon.ui.CarbonUIMessage;
import java.util.Set;

public final class service_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/service-mgt/service_state_include.jsp");
  }

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

      out.write("<!--\r\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\r\n");
      out.write(" ~\r\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\r\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\r\n");
      out.write(" ~ in compliance with the License.\r\n");
      out.write(" ~ You may obtain a copy of the License at\r\n");
      out.write(" ~\r\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write(" ~\r\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\r\n");
      out.write(" ~ software distributed under the License is distributed on an\r\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\r\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\r\n");
      out.write(" ~ specific language governing permissions and limitations\r\n");
      out.write(" ~ under the License.\r\n");
      out.write(" -->\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

    response.setHeader("Cache-Control", "no-cache");

    String serviceName = request.getParameter("serviceName");
    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ServiceAdminClient client;
    ServiceMetaData service;
    try {
        client = new ServiceAdminClient(cookie, backendServerURL, configContext, request.getLocale());
        service = client.getServiceData(serviceName);
    } catch (Exception e) {
        response.setStatus(500);
        CarbonUIMessage uiMsg = new CarbonUIMessage(CarbonUIMessage.ERROR, e.getMessage(), e);
        session.setAttribute(CarbonUIMessage.ID, uiMsg);

      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../admin/error.jsp", out, false);
      out.write('\r');
      out.write('\n');

            return;
        }

      out.write("\r\n");
      out.write("\r\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.service.mgt.ui.i18n.Resources");
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
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("service.dashboard");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.service.mgt.ui.i18n.Resources");
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

    boolean statisticsComponentFound = CarbonUIUtil.isContextRegistered(config, "/statistics/");
    if (statisticsComponentFound) {
//        int responseTimeGraphWidth = 500;
//    responseTimeGraphWidth = Utils.getValue(session, request, responseTimeGraphWidth, "responseTimeGraphWidth");

          out.write("\r\n");
          out.write("        <script type=\"text/javascript\" src=\"../statistics/js/statistics.js\"></script>\r\n");
          out.write("        <script type=\"text/javascript\" src=\"../statistics/js/graphs.js\"></script>\r\n");
          out.write("\r\n");
          out.write("        <script type=\"text/javascript\" src=\"../admin/js/jquery.flot.js\"></script>\r\n");
          out.write("        <script type=\"text/javascript\" src=\"../admin/js/excanvas.js\"></script>\r\n");
          out.write("        <script type=\"text/javascript\" src=\"global-params.js\"></script>\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            initResponseTimeGraph('50');\r\n");
          out.write("        </script>\r\n");

    }

          out.write('\r');
          out.write('\n');
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javascript_include.jsp", out, false);
          out.write("\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("    function submitHiddenForm(action) {\r\n");
          out.write("        document.getElementById(\"hiddenField\").value = location.href + \"&ordinal=1\";\r\n");
          out.write("        document.dataForm.action = action;\r\n");
          out.write("        document.dataForm.submit();\r\n");
          out.write("    }\r\n");
          out.write("</script>\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("   function sendToURLMapper(myepr){\r\n");
          out.write("            jQuery.ajax({\r\n");
          out.write("                            type: \"POST\",\r\n");
          out.write("                            url: \"../urlmapper/index.jsp\",\r\n");
          out.write("                            data: \"type=add&carbonEndpoint=\" + myepr,\r\n");
          out.write("                            success: function(msg){\r\n");
          out.write("                               \r\n");
          out.write("                            }\r\n");
          out.write("                        });\r\n");
          out.write("    }   \r\n");
          out.write("</script> \r\n");
          out.write("<!--<script type=\"text/javascript\">\r\n");
          out.write(" /*function add(myepr){\r\n");
          out.write("        CARBON.showInputDialog(\"Enter Service Specification identifier :\\n\",function(inputVal){\r\n");
          out.write("            jQuery.ajax({\r\n");
          out.write("                type: \"POST\",\r\n");
          out.write("                url: \"../urlmapper/foo_ajaxprocessor.jsp\",\r\n");
          out.write("                data: \"type=add&carbonEndpoint=\" + myepr + \"&userEndpoint=\" + inputVal + \"&endpointType=Endpoint_1\",\r\n");
          out.write("                success: function(msg){\r\n");
          out.write("                     CARBON.showInputDialog( msg.trim() );\r\n");
          out.write("                }\r\n");
          out.write("            });\r\n");
          out.write("        });\r\n");
          out.write("    }*/\r\n");
          out.write("</script>-->\r\n");
          out.write("\r\n");
  String endPointStr = "";
    String[] eps = service.getEndPoints();
    for (String ep : eps) {
        endPointStr += ep + ",";
    }
    endPointStr = endPointStr.substring(0, endPointStr.length()-1);

          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"middle\">\r\n");
          out.write("<h2>");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(' ');
          out.write('(');
          out.print( serviceName);
          out.write(")</h2>\r\n");
          out.write("\r\n");
          out.write("<div id=\"workArea\">\r\n");
          out.write("\r\n");
          out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n");
          out.write("<tr>\r\n");
          out.write("    <td width=\"50%\">\r\n");
          out.write("        <table class=\"styledLeft\" id=\"serviceInfoTable\" style=\"margin-left: 0px;\" width=\"100%\">\r\n");
          out.write("            <thead>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <th colspan=\"2\" align=\"left\">");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("                </tr>\r\n");
          out.write("            </thead>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td width=\"30%\">");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getName());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getDescription());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getServiceGroupName());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getScope());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>\r\n");
          out.write("                    ");
          out.print(service.getServiceType());
          out.write("&nbsp;&nbsp;&nbsp;\r\n");
          out.write("                    <img src=\"../");
          out.print( service.getServiceType());
          out.write("/images/type.gif\"\r\n");
          out.write("                         title=\"");
          out.print( service.getServiceType());
          out.write("\"\r\n");
          out.write("                         alt=\"");
          out.print( service.getServiceType());
          out.write("\"/>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getServiceDeployedTime());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("                <td>");
          out.print(service.getServiceUpTime());
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        </table>\r\n");
          out.write("    </td>\r\n");
          out.write("\r\n");
          out.write("    <td width=\"10px\">&nbsp;</td>\r\n");
          out.write("\r\n");
          out.write("    <td>\r\n");
          out.write("        <div id=\"serviceClientDiv\" style=\"display:");
          out.print( service.getActive() ? "'';" : "none;" );
          out.write("\">\r\n");
          out.write("        <table class=\"styledLeft\" id=\"serviceClientTable\" style=\"margin-left: 0px;\" width=\"100%\">\r\n");
          out.write("            <thead>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <th colspan=\"2\" align=\"left\">");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("                </tr>\r\n");
          out.write("            </thead>\r\n");
          out.write("            ");

                if(!service.getDisableTryit()){
            
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td colspan=\"2\">\r\n");
          out.write("                    <a href=\"");
          out.print(service.getTryitURL());
          out.write("\" class=\"icon-link\" style=\"background-image:url(images/tryit.gif);\" target=\"_blank\">\r\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    </a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            ");

                }
            
          out.write("\r\n");
          out.write("            ");

                    if(CarbonUIUtil.isContextRegistered(config, "/wsdl2code/")){
            
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td colspan=\"2\">\r\n");
          out.write("                    <a href=\"../wsdl2code/index.jsp?generateClient=");
          out.print(service.getWsdlURLs()[0]);
          out.write("&toppage=false&endpoints=");
          out.print(endPointStr);
          out.write("\" class=\"icon-link\"\r\n");
          out.write("                       style=\"background-image:url(images/genclient.gif);\">\r\n");
          out.write("                        ");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                    </a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            ");

                }
            
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td width=\"50%\">\r\n");
          out.write("                    <a href=\"");
          out.print(service.getWsdlURLs()[0]);
          out.write("\" class=\"icon-link\"\r\n");
          out.write("                       style=\"background-image:url(images/wsdl.gif);\" target=\"_blank\">\r\n");
          out.write("                        WSDL1.1\r\n");
          out.write("                    </a>\r\n");
          out.write("                </td>\r\n");
          out.write("                <td width=\"50%\">\r\n");
          out.write("                    <a href=\"");
          out.print(service.getWsdlURLs()[1]);
          out.write("\" class=\"icon-link\"\r\n");
          out.write("                       style=\"background-image:url(images/wsdl.gif);\" target=\"_blank\">\r\n");
          out.write("                        WSDL2.0\r\n");
          out.write("                    </a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td colspan=\"2\">&nbsp;</td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td colspan=\"2\" align=\"left\">\r\n");
          out.write("                    <strong>");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</strong>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            ");

                String[] eprs = service.getEprs();
                String carbonEndpoint = "";
                if (eprs != null) {
                    for (String epr : eprs) {
                        if (epr != null) {
                        	if (epr.contains("http")||epr.contains("https")) {
                        		carbonEndpoint =epr;
                        	}
                            
          out.write("\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td colspan=\"2\">");
          out.print(epr);
          out.write("\r\n");
          out.write("                    </td>\r\n");
          out.write("                 \r\n");
          out.write("                </tr>\r\n");
          out.write("                   \r\n");
          out.write("                            <!--<tr>\r\n");
          out.write("                                <td  width=\"50%\">");
          out.write("\r\n");
          out.write("                                </td>\r\n");
          out.write("                               <td width=\"50%\">\r\n");
          out.write("                                    <a class=\"icon-link\"\r\n");
          out.write("                                       style=\"background-image:url(images/add.gif);\" onclick=\"add('");
          out.write("');\" title=\"Add Service Specific Url\">\r\n");
          out.write("                                        Add\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr> -->\r\n");
          out.write("                            ");

                        } else {
                                
          out.write("\r\n");
          out.write("                                 <tr>\r\n");
          out.write("                                    <td colspan=\"2\">\r\n");
          out.write("                                        <font color=\"red\">");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                                ");

                        }
                    }
          out.write("\r\n");
          out.write("                    <tr>\r\n");
          out.write("                    ");

                  
                        if(CarbonUIUtil.isContextRegistered(config, "/urlmapper/")){ 
          out.write("\r\n");
          out.write("                         \r\n");
          out.write("                              <td colspan=\"2\"><nobr>\r\n");
          out.write("                            <a class=\"icon-link\" style=\"background-image: url(images/url-rewrite.png);\"\r\n");
          out.write("    href=\"../urlmapper/index.jsp?carbonEndpoint=");
          out.print(carbonEndpoint);
          out.write("&apptype=service\"\r\n");
          out.write("                            >\r\n");
          out.write("                                URL Mappings\r\n");
          out.write("                            </a></nobr>\r\n");
          out.write("                        </td>\r\n");
          out.write("                           \r\n");
          out.write("                               ");
 
                      
                       			 }
               				   
          out.write("\r\n");
          out.write("                </tr> ");
 
                } else {
            
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td colspan=\"2\">\r\n");
          out.write("                    <font color=\"red\">");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</font>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            ");

                }
            
          out.write("\r\n");
          out.write("           \r\n");
          out.write("        </table>\r\n");
          out.write("        </div>\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("    <td colspan=\"3\">&nbsp;</td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");

    String colspan = "";
    if(CarbonUIUtil.isUserAuthorized(request, "/permission/admin/manage/modify/service")){
        colspan = " colspan=\"3\" ";

          out.write("\r\n");
          out.write("<td>\r\n");
          out.write("<table class=\"styledLeft\" id=\"serviceOperationsTable\" style=\"margin-left: 0px;\" width=\"100%\">\r\n");
          out.write("<thead>\r\n");
          out.write("    <tr>\r\n");
          out.write("        <th colspan=\"2\" align=\"left\">");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\r\n");
          out.write("    </tr>\r\n");
          out.write("</thead>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td colspan=\"2\">\r\n");
          out.write("        <nobr>\r\n");
          out.write("            ");

                request.setAttribute("serviceName", serviceName);
                request.setAttribute("isActive", String.valueOf(service.getActive()));
				request.setAttribute("serviceURL", service.getTryitURL().substring(0, service.getTryitURL().indexOf("?tryit")));
            
          out.write("\r\n");
          out.write("            <div id=\"serviceStateDiv\">\r\n");
          out.write("                ");
          out.write("<!--\n");
          out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
          out.write(" ~\n");
          out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\n");
          out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\n");
          out.write(" ~ in compliance with the License.\n");
          out.write(" ~ You may obtain a copy of the License at\n");
          out.write(" ~\n");
          out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\n");
          out.write(" ~\n");
          out.write(" ~ Unless required by applicable law or agreed to in writing,\n");
          out.write(" ~ software distributed under the License is distributed on an\n");
          out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
          out.write(" ~ KIND, either express or implied.  See the License for the\n");
          out.write(" ~ specific language governing permissions and limitations\n");
          out.write(" ~ under the License.\n");
          out.write(" -->\n");
          out.write("\n");
          out.write("\n");
          //  fmt:bundle
          org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_1 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
          _jspx_th_fmt_bundle_1.setPageContext(_jspx_page_context);
          _jspx_th_fmt_bundle_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_fmt_bundle_1.setBasename("org.wso2.carbon.service.mgt.ui.i18n.Resources");
          int _jspx_eval_fmt_bundle_1 = _jspx_th_fmt_bundle_1.doStartTag();
          if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_fmt_bundle_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_fmt_bundle_1.doInitBody();
            }
            do {
              out.write('\n');

    if (Boolean.valueOf((String) request.getAttribute("isActive"))) {

              out.write("\n");
              out.write("<span class=\"icon-text\" style=\"background-image:url(images/activate.gif);\">");
              if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("&nbsp; &nbsp;[</span>\n");
              out.write("<a href=\"#\" class=\"icon-link\" style=\"background-image:none !important; margin-left: 2px !important; padding-left: 2px !important;\" title=\"");
              if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("\" onclick=\"changeServiceState(false); return false;\">");
              if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("</a>\n");
              out.write("<span class=\"icon-text\" style=\"background-image:none !important; margin-left: 2px !important; padding-left: 2px !important;\">]</span>\n");
} else {
              out.write("\n");
              out.write("<span class=\"icon-text\" style=\"background-image:url(images/deactivate.gif);\">");
              if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("&nbsp; &nbsp;[</span><a href=\"#\" class=\"icon-link\" style=\"background-image:none !important; margin-left: 2px !important; padding-left: 2px !important;\" title=\"");
              if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("\" onclick=\"changeServiceState(true); return false;\">");
              if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_1, _jspx_page_context))
                return;
              out.write("</a>\n");
              out.write("<span class=\"icon-text\" style=\"background-image:none !important; margin-left: 2px !important; padding-left: 2px !important;\">]</span>\n");
}
              out.write('\n');
              int evalDoAfterBody = _jspx_th_fmt_bundle_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_fmt_bundle_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_fmt_bundle_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_1);
            return;
          }
          _jspx_tagPool_fmt_bundle_basename.reuse(_jspx_th_fmt_bundle_1);
          out.write('\n');
          out.write("\r\n");
          out.write("            </div>\r\n");
          out.write("        </nobr>\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery.noConflict();\r\n");
          out.write("            function changeServiceState(active) {\r\n");
          out.write("                var url = 'change_service_state_ajaxprocessor.jsp?serviceName=");
          out.print( request.getAttribute("serviceName"));
          out.write("&isActive=' + active;\r\n");
          out.write("                jQuery(\"#serviceStateDiv\").load(url, null, function (responseText, status, XMLHttpRequest) {\r\n");
          out.write("                    if (status != \"success\") {\r\n");
          out.write("                        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("                    } else {\r\n");
          out.write("                        if(active){\r\n");
          out.write("                            document.getElementById('serviceClientDiv').style.display = '';\r\n");
          out.write("                            document.getElementById('statsDiv').style.display = '';\r\n");
          out.write("                            refresh = setInterval(\"refreshStats()\", 6000);\r\n");
          out.write("                        } else {\r\n");
          out.write("                            document.getElementById('serviceClientDiv').style.display = 'none';\r\n");
          out.write("                            stopRefreshStats();\r\n");
          out.write("                            document.getElementById('statsDiv').style.display = 'none';\r\n");
          out.write("                        }\r\n");
          out.write("                    }\r\n");
          out.write("                });\r\n");
          out.write("            }\r\n");
          out.write("        </script>\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("    <td>\r\n");
          out.write("        ");

            if(CarbonUIUtil.isContextRegistered(config, "/securityconfig/")){
        
          out.write("\r\n");
          out.write("        <nobr>\r\n");
          out.write("        <a href=\"../securityconfig/index.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/security.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("&nbsp;&nbsp;&nbsp;\r\n");
          out.write("        ");
          out.print( service.getSecurityScenarioId() != null ?
                "<img src='images/secured.gif' title='Secured using "+  service.getSecurityScenarioId()  +"'/>":
                "<img src='images/unsecured.gif' title='Unsecured'/>");
          out.write("\r\n");
          out.write("         </a>\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("        </nobr>\r\n");
          out.write("    </td>\r\n");
          out.write("    <td>\r\n");
          out.write("        <a href=\"policy_editor_proxy.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/policies.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td>\r\n");
          out.write("        ");

            if(CarbonUIUtil.isContextRegistered(config, "/rm/")){
        
          out.write("\r\n");
          out.write("        <a href=\"\" onclick=\"submitHiddenForm('../rm/index.jsp?serviceName=");
          out.print(serviceName);
          out.write("');return false;\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/rm.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("         ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("    <td>\r\n");
          out.write("         ");

            if(CarbonUIUtil.isContextRegistered(config, "/transport-mgt/")){
        
          out.write("\r\n");
          out.write("        <a href=\"../transport-mgt/service_transport.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/transports.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("         ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td>\r\n");
          out.write("        ");

            if(CarbonUIUtil.isContextRegistered(config, "/caching/")){
        
          out.write("\r\n");
          out.write("        <a href=\"\" onclick=\"submitHiddenForm('../caching/index.jsp?serviceName=");
          out.print(serviceName);
          out.write("');return false;\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/caching.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("    <td>\r\n");
          out.write("         ");

            if(CarbonUIUtil.isContextRegistered(config, "/modulemgt/")){
        
          out.write("\r\n");
          out.write("        <a href=\"../modulemgt/service_modules.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/modules.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td>\r\n");
          out.write("         ");

            if(CarbonUIUtil.isContextRegistered(config, "/throttling/")){
        
          out.write("\r\n");
          out.write("        <a href=\"\" onclick=\"submitHiddenForm('../throttling/index.jsp?serviceName=");
          out.print(serviceName);
          out.write("');return false;\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/throttling.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("    <td>\r\n");
          out.write("         ");

            if(CarbonUIUtil.isContextRegistered(config, "/operation/")){
        
          out.write("\r\n");
          out.write("        <a href=\"../operation/index.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/operations.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("        ");

            }
        
          out.write("\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("<tr>\r\n");
          out.write("    <td>\r\n");
          out.write("        <span class=\"icon-text\" style=\"background-image:url(images/service.gif);\">MTOM&nbsp;&nbsp;</span>\r\n");
          out.write("        <select id=\"mtomSelector\" onchange=\"changeMtomState()\" style=\"margin-top:2px !important;\">\r\n");
          out.write("            ");

                if (service.getMtomStatus().equalsIgnoreCase("true")) {
            
          out.write("\r\n");
          out.write("            <option value=\"true\" selected=\"true\">True</option>\r\n");
          out.write("            ");

            } else {
            
          out.write("\r\n");
          out.write("            <option value=\"true\">");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\r\n");
          out.write("            ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("            ");

                if (service.getMtomStatus().equalsIgnoreCase("false")) {
            
          out.write("\r\n");
          out.write("            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\r\n");
          out.write("            ");

            } else {
            
          out.write("\r\n");
          out.write("            <option value=\"false\">");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\r\n");
          out.write("            ");
 } 
          out.write("\r\n");
          out.write("\r\n");
          out.write("            ");

                if (service.getMtomStatus().equalsIgnoreCase("optional")) {
            
          out.write("\r\n");
          out.write("            <option value=\"optional\" selected=\"true\">");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\r\n");
          out.write("            ");

            } else {
            
          out.write("\r\n");
          out.write("            <option value=\"optional\">");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\r\n");
          out.write("            ");
 } 
          out.write("\r\n");
          out.write("        </select>\r\n");
          out.write("\r\n");
          out.write("        <div id=\"mtomOutput\"></div>\r\n");
          out.write("        <script type=\"text/javascript\">\r\n");
          out.write("            jQuery.noConflict();\r\n");
          out.write("            function changeMtomState() {\r\n");
          out.write("                var state = document.getElementById('mtomSelector').value;\r\n");
          out.write("                var url = 'mtom_ajaxprocessor.jsp?serviceName=");
          out.print( request.getAttribute("serviceName"));
          out.write("&mtomState=' + state;\r\n");
          out.write("                jQuery(\"#mtomOutput\").load(url, null, function (responseText, status, XMLHttpRequest) {\r\n");
          out.write("                    if (status != \"success\") {\r\n");
          out.write("                        CARBON.showErrorDialog('");
          if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("                    } else {\r\n");
          out.write("                        CARBON.showInfoDialog('");
          if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("');\r\n");
          out.write("                    }\r\n");
          out.write("                });\r\n");
          out.write("            }\r\n");
          out.write("        </script>\r\n");
          out.write("    </td>\r\n");
          out.write("    <td>\r\n");
          out.write("        <a href=\"edit_service_params.jsp?serviceName=");
          out.print(serviceName);
          out.write("\"\r\n");
          out.write("           class=\"icon-link-nofloat\"\r\n");
          out.write("           style=\"background-image:url(images/edit2.gif);\">\r\n");
          out.write("            ");
          if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        </a>\r\n");
          out.write("    </td>\r\n");
          out.write("</tr>\r\n");
          out.write("\r\n");
          out.write("                        <tr>\r\n");

     // Add UI Extensions that may have  been provided by other UI components
     BundleContext bundleContext =  CarbonUIUtil.getBundleContext();
     if (bundleContext != null) {
         ServiceTracker tracker = new ServiceTracker(bundleContext,
                                                     ServiceManagementUIExtender.class.getName(),
                                                     null);
         tracker.open();
         ServiceManagementUIExtender extender = (ServiceManagementUIExtender) tracker.getService();

         if(extender != null){
             List<String> items = extender.getItems();
             for (String item: items) {

          out.write("\r\n");
          out.write("    `           <tr>\r\n");
          out.write("                  <td colspan=\"2\" align=\"left\">");
          out.print( item);
          out.write("</td>\r\n");
          out.write("                </tr>\r\n");

             }
             tracker.close();
         }
     }

    String serviceType = service.getServiceType();
    String serviceTypePath = "/" + serviceType + "/";
    String extraConfig = ".." + serviceTypePath + "extra_config.jsp?serviceName="+serviceName;
    Set resourcePaths = config.getServletContext().getResourcePaths(serviceTypePath);
    if (resourcePaths != null && resourcePaths.contains(serviceTypePath + "extra_config.jsp")) { //TODO: How to handle this

          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td colspan=\"2\">&nbsp;</td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td colspan=\"2\" align=\"left\"><strong>");
          if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</strong></td>\r\n");
          out.write("        </tr>\r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  extraConfig, out, false);
          out.write('\r');
          out.write('\n');

    }

          out.write("\r\n");
          out.write("</table>\r\n");
          out.write("</td>\r\n");
          out.write("<td>&nbsp;</td>\r\n");

    }

          out.write("\r\n");
          out.write("<td ");
          out.print(colspan);
          out.write(" >\r\n");
          out.write("    <div id=\"statsDiv\" style=\"display:");
          out.print( service.getActive() ? "'';" : "none;" );
          out.write("\">\r\n");
          out.write("    ");

        if(statisticsComponentFound && CarbonUIUtil.isUserAuthorized(request, "/permission/admin/monitor")){
    
          out.write("\r\n");
          out.write("    <div id=\"result\"></div>\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("        jQuery.noConflict();\r\n");
          out.write("        var refresh;\r\n");
          out.write("        function refreshStats() {\r\n");
          out.write("            var url = \"../statistics/service_stats_ajaxprocessor.jsp?serviceName=");
          out.print( serviceName);
          out.write("\";\r\n");
          out.write("            try {\r\n");
          out.write("            jQuery(\"#result\").load(url, null, function (responseText, status, XMLHttpRequest) {\r\n");
          out.write("                if (status != \"success\") {\r\n");
          out.write("                    stopRefreshStats();\r\n");
          out.write("                    document.getElementById('result').innerHTML = responseText;\r\n");
          out.write("                }\r\n");
          out.write("            });\r\n");
          out.write("            } catch (e){} // ignored\r\n");
          out.write("        }\r\n");
          out.write("        function stopRefreshStats() {\r\n");
          out.write("            if (refresh) {\r\n");
          out.write("                clearInterval(refresh);\r\n");
          out.write("            }\r\n");
          out.write("        }\r\n");
          out.write("        try {\r\n");
          out.write("        jQuery(document).ready(function() {\r\n");
          out.write("            refreshStats();\r\n");
          out.write("            if (document.getElementById('statsDiv').style.display == ''){\r\n");
          out.write("                refresh = setInterval(\"refreshStats()\", 6000);\r\n");
          out.write("            }\r\n");
          out.write("        });\r\n");
          out.write("        } catch (e){} // ignored\r\n");
          out.write("    </script>\r\n");
          out.write("    ");

        }
    
          out.write("\r\n");
          out.write("    </div>\r\n");
          out.write("</td>\r\n");
          out.write("</tr>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("<form name=\"dataForm\" method=\"post\" action=\"\">\r\n");
          out.write("    <input name=\"backURL\" type=\"hidden\" id=\"hiddenField\" value=\"\">\r\n");
          out.write("</form>\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("    alternateTableRows('serviceInfoTable', 'tableEvenRow', 'tableOddRow');\r\n");
          out.write("    alternateTableRows('serviceClientTable', 'tableEvenRow', 'tableOddRow');\r\n");
          out.write("    alternateTableRows('serviceOperationsTable', 'tableEvenRow', 'tableOddRow');\r\n");
          out.write("</script>\r\n");
          out.write("</div>\r\n");
          out.write("</div>\r\n");
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
    _jspx_th_fmt_message_0.setKey("service.dashboard");
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
    _jspx_th_fmt_message_1.setKey("service.details");
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
    _jspx_th_fmt_message_2.setKey("service.name");
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
    _jspx_th_fmt_message_3.setKey("service.description");
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
    _jspx_th_fmt_message_4.setKey("service.group.name");
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
    _jspx_th_fmt_message_5.setKey("deployment.scope");
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
    _jspx_th_fmt_message_6.setKey("service.type");
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
    _jspx_th_fmt_message_7.setKey("service.deployed.time");
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
    _jspx_th_fmt_message_8.setKey("service.up.time");
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
    _jspx_th_fmt_message_9.setKey("client.operations");
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
    _jspx_th_fmt_message_10.setKey("try.this.service");
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
    _jspx_th_fmt_message_11.setKey("generate.client");
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
    _jspx_th_fmt_message_12.setKey("endpoints");
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
    _jspx_th_fmt_message_13.setKey("transport.configuration.error");
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
    _jspx_th_fmt_message_14.setKey("transport.configuration.error2");
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
    _jspx_th_fmt_message_15.setKey("quality.of.service.configuration");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_16.setKey("active");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_17.setKey("deactivate.service");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_18.setKey("deactivate");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_19.setKey("inactive");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_20.setKey("activate.service");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_1);
    _jspx_th_fmt_message_21.setKey("activate");
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
    _jspx_th_fmt_message_22.setKey("could.not.change.service.state");
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
    _jspx_th_fmt_message_23.setKey("security");
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
    _jspx_th_fmt_message_24.setKey("policies");
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
    _jspx_th_fmt_message_25.setKey("reliable.messaging");
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
    _jspx_th_fmt_message_26.setKey("transports");
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
    _jspx_th_fmt_message_27.setKey("response.caching");
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
    _jspx_th_fmt_message_28.setKey("modules");
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
    _jspx_th_fmt_message_29.setKey("access.throttling");
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
    _jspx_th_fmt_message_30.setKey("operations");
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
    _jspx_th_fmt_message_31.setKey("true");
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
    _jspx_th_fmt_message_32.setKey("false");
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
    _jspx_th_fmt_message_33.setKey("false");
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
    _jspx_th_fmt_message_34.setKey("optional");
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
    _jspx_th_fmt_message_35.setKey("optional");
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
    _jspx_th_fmt_message_36.setKey("could.not.change.mtom.state.for.service");
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
    _jspx_th_fmt_message_37.setKey("changed.mtom.state.for.service");
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
    _jspx_th_fmt_message_38.setKey("parameters");
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
    _jspx_th_fmt_message_39.setKey("specific.configuration");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }
}
