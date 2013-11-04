package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.AxisFault;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.CarbonError;
import org.wso2.carbon.ui.CarbonUIMessage;
import javax.xml.namespace.QName;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      //  carbon:breadcrumb
      org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
      _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
      _jspx_th_carbon_breadcrumb_0.setParent(null);
      _jspx_th_carbon_breadcrumb_0.setLabel("error.occurred");
      _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.i18n.Resources");
      _jspx_th_carbon_breadcrumb_0.setTopPage(true);
      _jspx_th_carbon_breadcrumb_0.setRequest(request);
      int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
      if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
        return;
      }
      _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
      out.write('\n');
      out.write('\n');

    //First checks whether there is a CarbonUIMessage in the request
    CarbonUIMessage carbonMessage = (CarbonUIMessage) session.getAttribute(CarbonUIMessage.ID);

    if (carbonMessage == null) {
        carbonMessage = (CarbonUIMessage) request.getAttribute(CarbonUIMessage.ID);
    } else {
        session.removeAttribute(CarbonUIMessage.ID);
    }
    if (carbonMessage != null) {
        session.removeAttribute(CarbonUIMessage.ID);
        Exception e = carbonMessage.getException();
        boolean authFailure = false;
        boolean sessionTimedOut = false;
        if (e != null) {
            Throwable cause = e.getCause();
            if (e instanceof AxisFault) {
                AxisFault axisFault = (AxisFault) e;
                QName name = axisFault.getFaultCode();
                if (name != null && name.getLocalPart() != null && name.getLocalPart().equals(CarbonConstants.AUTHZ_FAULT_CODE)) {
                    authFailure = true;
                }
                if(e.getMessage().toLowerCase().indexOf("session timed out") != -1){
                     sessionTimedOut = true;
                }
            } else if ((cause != null) && (cause instanceof AxisFault)) {
                AxisFault axisFault = (AxisFault) cause;
                QName name = axisFault.getFaultCode();
                if (name != null && name.getLocalPart() != null && name.getLocalPart().equals(CarbonConstants.AUTHZ_FAULT_CODE)) {
                    authFailure = true;
                }
            }
        }


      out.write("\n");
      out.write("<div id=\"middle\">\n");
      out.write("    ");

        if (authFailure) {
    
      out.write("\n");
      out.write("    <h2><img src='../dialog/img/error.gif'/> Authorization Failure</h2>\n");
      out.write("    ");
 } else if(sessionTimedOut) {
           session.invalidate();
           return;
    } else { 
      out.write("\n");
      out.write("    <h2><img src='../dialog/img/error.gif'/> System Error Occurred</h2>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"workArea\">\n");
      out.write("        <table class=\"styledLeft\">\n");
      out.write("            <tbody>\n");
      out.write("            ");

                if (e != null) {
                    if (authFailure) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><b>Authorization Failure</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");

                        out.write("You are not authorized to perform this action.");
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><b>");
      out.print(carbonMessage.getMessage());
      out.write("</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");

	                    StringWriter sw = new StringWriter();
	                    PrintWriter pw = new PrintWriter(sw);
                    	if(carbonMessage.isShowStackTrace()){
                    	    pw.write("<b>The following error details are available. Please refer logs for more details.</b><br/>");
                            e.printStackTrace(pw);
                            String errorStr = sw.toString();
                            errorStr = errorStr.replaceAll("\n", "<br/>");
                            for (int i = 0; i < errorStr.length(); i++) {
                                out.write(errorStr.charAt(i));
                            }
                        }else{
                        	pw.write("<b>Please refer log for details.</b><br/>");
                        }
                        sw.close();
                        pw.close();
                        out.flush();
            	}
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><b>");
      out.print(carbonMessage.getMessage());
      out.write("\n");
      out.write("                </b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String errorMsg = request.getParameter("errorMsg");
    CarbonError error = null;
    boolean retrievedFromSession = false;
    error = (CarbonError) request.getAttribute(CarbonError.ID);
    if (error == null) {
        //look for error object in session
        error = (CarbonError) request.getSession().getAttribute(CarbonError.ID);
        retrievedFromSession = true;
    }
    if (error != null) {

      out.write("\n");
      out.write("<p>\n");
      out.write("    <label>Error occurred</label>\n");
      out.write("        ");


     ArrayList<String> list = (ArrayList<String>) error.getErrors();
     String[] errors = (String[])list.toArray(new String[list.size()]);
     for(int a = 0;a < errors.length;a++){

    
      out.write("\n");
      out.write("<li>");
      out.print(errors[a]);
      out.write("\n");
      out.write("</li>\n");

    }

      out.write("\n");
      out.write("</p>\n");

        if (retrievedFromSession) {
            request.getSession().setAttribute(CarbonError.ID, null);
        }
    }

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
