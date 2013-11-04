package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.synapse.endpoints.Template;
import org.wso2.carbon.mediation.templates.ui.EndpointTemplateAdminClient;
import org.wso2.carbon.mediation.templates.common.factory.TemplateInfoFactory;

public final class endpoint_005ftemplate_002dajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    EndpointTemplateAdminClient endpointClient
            = new EndpointTemplateAdminClient(this.getServletConfig(), session);
    String templateName = request.getParameter("templateName");
    String type = request.getParameter("edittingType");
    Template templateObj = null;

    //removr any specific session vars
    session.removeAttribute("templateEdittingMode");
    session.removeAttribute("templateRegKey");

    if (templateName == null) {
        templateObj = new Template();
        templateObj.setName("");
        session.setAttribute("endpointTemplate", templateObj);
    }else if (type == null){
        templateObj = endpointClient.getTempalate(templateName);
        session.setAttribute("endpointTemplate", templateObj);
    }else{
        templateObj = endpointClient.getTempalate(templateName);
        session.setAttribute("endpointTemplate", templateObj);
        session.setAttribute("templateEdittingMode","registry");
        session.setAttribute("templateRegKey", templateName);
        String endpointType = TemplateInfoFactory.getEndpointTypeFromTemplate(templateObj.getElement());
        
      out.write("\n");
      out.write("    ");
      out.print(endpointType);
      out.write(';');
      out.print(templateName);
      out.write("\n");
      out.write("    ");

    } /*else if (templateName == null) {
        templateObj = new Template();
        templateObj.setName("");
        session.setAttribute("endpointTemplate", templateObj);
    }*/



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
