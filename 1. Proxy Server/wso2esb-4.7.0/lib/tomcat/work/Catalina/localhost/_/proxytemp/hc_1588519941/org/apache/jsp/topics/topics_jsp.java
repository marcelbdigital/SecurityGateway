package org.apache.jsp.topics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.event.stub.internal.TopicManagerAdminServiceStub;
import org.wso2.carbon.event.stub.internal.xsd.TopicNode;
import org.wso2.carbon.ui.CarbonUIUtil;
import java.util.Stack;

public final class topics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/resource_util.js\"></script>\r\n");
      out.write("<!--Yahoo includes for dom event handling-->\r\n");
      out.write("<script src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Yahoo includes for animations-->\r\n");
      out.write("<script src=\"../yui/build/animation/animation-min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../yui/build/yahoo/yahoo-min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../yui/build/utilities/utilities.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Yahoo includes for menus-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../yui/build/menu/assets/skins/sam/menu.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/container/container_core-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/menu/menu-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Local js includes-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/treecontrol.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/tree-styles.css\" media=\"all\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"css/dsxmleditor.css\" media=\"all\" rel=\"stylesheet\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/topics.css\"/>\r\n");
      out.write("\r\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.event.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\" src=\"../admin/js/breadcrumbs.js\"></script>\r\n");
          out.write("\r\n");
          out.write("    ");

        String message = request.getParameter("message");
        if (message != null) {
    
          out.write("<h3>");
          out.print(message);
          out.write("\r\n");
          out.write("</h3>");

    }

          out.write("\r\n");
          out.write("    ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../resources/resources-i18n-ajaxprocessor.jsp", out, false);
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\" src=\"../carbon/admin/js/breadcrumbs.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\" src=\"../carbon/admin/js/cookies.js\"></script>\r\n");
          out.write("    <script type=\"text/javascript\" src=\"../carbon/admin/js/main.js\"></script>\r\n");
          out.write("\r\n");
          out.write("    ");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("add");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.event.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write("\r\n");
          out.write("    <div id=\"middle\">\r\n");
          out.write("        <div id=\"workArea\">\r\n");
          out.write("            <h2>Topic Browser</h2>\r\n");
          out.write("\r\n");
          out.write("            <table style=\"width:100%;margin-bottom:20px;\" class=\"yui-skin-sam\">\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td class=\"tree-top\"><h3>Topics</h3></td>\r\n");
          out.write("                </tr>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td valign=\"top\" style=\"width:200px;\" class=\"leftBox\">\r\n");
          out.write("                        <div class=\"treeControl\" id=\"topicTree\">\r\n");
          out.write("                            ");

                                ConfigurationContext configContext = (ConfigurationContext) config.getServletContext()
                                        .getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
                                //Server URL which is defined in the server.xml
                                String serverURL = CarbonUIUtil.getServerURL(config.getServletContext(),
                                                                             session) + "TopicManagerAdminService.TopicManagerAdminServiceHttpsSoap12Endpoint";
                                TopicManagerAdminServiceStub stub = new TopicManagerAdminServiceStub(configContext, serverURL);

                                String cookie = (String) session.getAttribute(org.wso2.carbon.utils.ServerConstants.ADMIN_SERVICE_COOKIE);

                                ServiceClient client = stub._getServiceClient();
                                Options option = client.getOptions();
                                option.setManageSession(true);
                                option.setProperty(org.apache.axis2.transport.http.HTTPConstants.COOKIE_STRING, cookie);


                                TopicNode topicNode = stub.getAllTopics();


                                Stack stack = new Stack();
                                stack.add(topicNode);

                                while (!stack.isEmpty()) {
                                    Object obj = stack.pop();
                                    if (obj instanceof String) {
                            
          out.print(obj);

                        } else {
                        
          out.write("\r\n");
          out.write("                            <ul>");

                                stack.add("</ul>\n");
                                TopicNode node = (TopicNode) obj;
                                TopicNode[] children = node.getChildren();
                                if (children != null && children.length > 0) {
                                    for (TopicNode child : children) {
                                        if (child != null) {
                                            stack.push(child);
                                        }
                                    }
                                }
                            
          out.write("\r\n");
          out.write("                                <li><a class=\"minus\" onclick=\"treeColapse(this)\">&nbsp;</a>\r\n");
          out.write("                                    <a class=\"treeNode\" onclick=\"hideTheRestAndShowMe(this)\"\r\n");
          out.write("                                       href=\"#\"\r\n");
          out.write("                                       title=\"");
          out.print(node.getTopicName());
          out.write('"');
          out.write('>');
          out.print(node.getNodeName());
          out.write("\r\n");
          out.write("                                    </a>\r\n");
          out.write("\r\n");
          out.write("                                    <a class=\"addSubtopicStyle\"\r\n");
          out.write("                                       onclick=\"showAddTopicWindow('");
          out.print(node.getTopicName());
          out.write("')\">Add\r\n");
          out.write("                                                                                                Subtopic</a>\r\n");
          out.write("                                    <a class=\"topicSubscribeStyle\"\r\n");
          out.write("                                       onclick=\"javascript:location.href='add_subscription.jsp?topic=");
          out.print(node.getTopicName());
          out.write("'\">Subscribe</a>\r\n");
          out.write("                                    <a class=\"topicDetailsStyle\"\r\n");
          out.write("                                       onclick=\"showManageTopicWindow('");
          out.print(node.getTopicName());
          out.write("')\">Details</a>\r\n");
          out.write("                                    ");
if(!node.getTopicName().equals("/")){
          out.write("\r\n");
          out.write("                                    <a class=\"topicDeleteStyle\"\r\n");
          out.write("                                       onclick=\"deleteTopic('");
          out.print(node.getTopicName());
          out.write("')\">Delete</a> ");

                                    }
                                    
          out.write("\r\n");
          out.write("                                    </p>\r\n");
          out.write("                                            ");


                                    }
                        }
                        
          out.write("\r\n");
          out.write("                            </ul>\r\n");
          out.write("                            <span id=\"domChecker\"></span>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </td>\r\n");
          out.write("                        ");
          out.write("\r\n");
          out.write("                </tr>\r\n");
          out.write("            </table>\r\n");
          out.write("        </div>\r\n");
          out.write("    </div>\r\n");
          out.write("\r\n");
          out.write("    <script type=\"text/javascript\">\r\n");
          out.write("        function hideTheRestAndShowMe(me) {\r\n");
          out.write("            jQuery(\".addSubtopicStyle\").hide();\r\n");
          out.write("            jQuery(\".topicDetailsStyle\").hide();\r\n");
          out.write("            jQuery(\".topicSubscribeStyle\").hide();\r\n");
          out.write("            jQuery(\".topicDeleteStyle\").hide();\r\n");
          out.write("            jQuery(me).next().show();\r\n");
          out.write("            jQuery(me).next().next().show();\r\n");
          out.write("            jQuery(me).next().next().next().show();\r\n");
          out.write("            jQuery(me).next().next().next().next().show();\r\n");
          out.write("        }\r\n");
          out.write("        jQuery(document).ready(function() {\r\n");
          out.write("            jQuery(\".addSubtopicStyle\").hide();\r\n");
          out.write("            jQuery(\".topicDetailsStyle\").hide();\r\n");
          out.write("            jQuery(\".topicSubscribeStyle\").hide();\r\n");
          out.write("            jQuery(\".topicDeleteStyle\").hide();\r\n");
          out.write("        });\r\n");
          out.write("    </script>\r\n");
          out.write("\r\n");
          out.write("    ");
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
}
