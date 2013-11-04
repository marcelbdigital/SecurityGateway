package org.apache.jsp.bam_002dmediator_002dconfig;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.mediator.bam.config.ui.DdlAjaxProcessorHelper;
import org.wso2.carbon.sequences.ui.util.SequenceEditorHelper;
import org.wso2.carbon.sequences.ui.util.ns.XPathFactory;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;

public final class dropdown_005fajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);

    DdlAjaxProcessorHelper ddlAjaxProcessorHelper = new DdlAjaxProcessorHelper(cookie, backendServerURL, configContext, request.getLocale());

    String action = request.getParameter("action");
    String serverProfilePath = request.getParameter("serverProfilePath");
    String serverIp = request.getParameter("ip");
    String serverPort = request.getParameter("port");
    String responseText = "";

    if(ddlAjaxProcessorHelper.isNotNullOrEmpty(action)){
        if(action.equals("getServerProfiles") && ddlAjaxProcessorHelper.isNotNullOrEmpty(serverProfilePath)){
            responseText = ddlAjaxProcessorHelper.getServerProfileNames(serverProfilePath);
            out.write(responseText);
        } else if(action.equals("testServer") && ddlAjaxProcessorHelper.isNotNullOrEmpty(serverIp)
                  && ddlAjaxProcessorHelper.isNotNullOrEmpty(serverPort)){
            responseText = ddlAjaxProcessorHelper.backendServerExists(serverIp, serverPort);
            out.write(responseText);
        } else {
            out.write(0);
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
