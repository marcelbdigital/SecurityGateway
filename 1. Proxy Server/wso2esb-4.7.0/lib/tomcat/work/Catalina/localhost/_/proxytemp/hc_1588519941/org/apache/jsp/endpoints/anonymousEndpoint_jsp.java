package org.apache.jsp.endpoints;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointService;
import org.wso2.carbon.endpoint.ui.endpoints.EndpointStore;
import javax.xml.stream.XMLStreamException;

public final class anonymousEndpoint_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String forwardTo = "";
    String anonymousEndpointXML = (String) session.getAttribute("anonEpXML");
    if (anonymousEndpointXML != null && !"".equals(anonymousEndpointXML)) {
        try {
            OMElement endpointElement = AXIOMUtil.stringToOM(anonymousEndpointXML);
            EndpointService epService = EndpointStore.getInstance().getEndpointService(endpointElement);
            forwardTo = epService.getUIPageName() + "Endpoint.jsp";
        } catch (XMLStreamException e) {

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    CARBON.showErrorDialog(\"Invalid Endpoint Configuration\");\n");
      out.write("</script>\n");

            forwardTo = (String) session.getAttribute("anonOriginator");
        }
        forwardTo = forwardTo + "?toppage=false&" + request.getQueryString();
    } else {
        forwardTo = "../endpoints/index.jsp" + "?toppage=false&" + request.getQueryString();
    }


      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.location.href = '");
      out.print(forwardTo);
      out.write("';\n");
      out.write("</script>\n");
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
