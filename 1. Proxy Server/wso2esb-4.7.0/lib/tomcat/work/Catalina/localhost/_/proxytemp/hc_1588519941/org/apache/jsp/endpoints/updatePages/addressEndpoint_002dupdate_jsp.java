package org.apache.jsp.endpoints.updatePages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axiom.om.OMElement;
import org.apache.synapse.config.xml.endpoints.TemplateSerializer;
import org.apache.synapse.endpoints.Template;
import org.wso2.carbon.endpoint.ui.endpoints.address.AddressEndpoint;
import org.wso2.carbon.endpoint.ui.util.ListEndpointDesignerHelper;

public final class addressEndpoint_002dupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    boolean isEditingListEndpoint = session.getAttribute("isEditingListEndpoint") != null ? true : false;
    boolean isFromTemplateEditor = session.getAttribute("endpointTemplate") != null ? true : false;

    String endpointName = request.getParameter("endpointName");
    String address = request.getParameter("url");
    String formatOption = request.getParameter("format");
    String optimizeOption = request.getParameter("optimize");
    String description = request.getParameter("endpointDescription").trim();
    String errorCode = request.getParameter("suspendErrorCode");
    String suspendDuration = request.getParameter("suspendDuration");
    String suspendMaxDuration = request.getParameter("suspendMaxDuration");
    String factor = request.getParameter("factor");
    String retryErrorCode = request.getParameter("retryErroCode");
    String retriesOnTimeOut = request.getParameter("retryTimeOut");
    String retryDelay = request.getParameter("retryDelay");
    String disabledErrorCodes = request.getParameter("disabledErrorCodes");
    String action = request.getParameter("actionSelect");
    String actionDuration = null;
    if (action != null && !action.equals("neverTimeout")) {
        actionDuration = request.getParameter("actionDuration");
    }
    String wsAddressing = request.getParameter("wsAddressing");
    String useSeprateListner = null;
    if (wsAddressing != null) {
        useSeprateListner = request.getParameter("sepListener");
    }
    String wsSecurity = request.getParameter("wsSecurity");
    String secPolicy = null;
    if (wsSecurity != null) {
        secPolicy = request.getParameter("wsSecPolicyKeyID");
    }
    String wsRM = request.getParameter("wsRM");
    String rmPolicy = null;
    if (wsRM != null) {
        rmPolicy = request.getParameter("wsrmPolicyKeyID");
    }
    String properties = request.getParameter("endpointProperties");

    AddressEndpoint addressEndpoint = new AddressEndpoint();

    if (isEditingListEndpoint) {
        addressEndpoint = (AddressEndpoint) ListEndpointDesignerHelper.getEditingEndpoint(request, session);
    }
    if (endpointName != null) {
        addressEndpoint.setEndpointName(endpointName);
    }
    if (address != null) {
        addressEndpoint.setAddress(address);
    }
    if ("soap11".equals(formatOption)) {
        addressEndpoint.setSoap11(true);
    } else if ("soap12".equals(formatOption)) {
        addressEndpoint.setSoap12(true);
    } else if ("POX".equals(formatOption)) {
        addressEndpoint.setPox(true);
    } else if ("REST".equals(formatOption)) {
        addressEndpoint.setRest(true);
    } else if ("GET".equals(formatOption)) {
        addressEndpoint.setGet(true);
    } else {
        addressEndpoint.setSoap11(false);
        addressEndpoint.setSoap12(false);
        addressEndpoint.setPox(false);
        addressEndpoint.setRest(false);
        addressEndpoint.setGet(false);
    }

    if ("SWA".equals(optimizeOption)) {
        addressEndpoint.setSwa(true);
    } else if ("MTOM".equals(optimizeOption)) {
        addressEndpoint.setMtom(true);
    } else {
        addressEndpoint.setSwa(false);
        addressEndpoint.setMtom(false);
    }

    if (description != null && !"".equals(description)) {
        addressEndpoint.setDescription(description);
    } else {
        addressEndpoint.setDescription("");
    }
    if (errorCode != null) {
        addressEndpoint.setErrorCodes(errorCode);
    }
    if (suspendDuration != null) {
        addressEndpoint.setSuspendDurationOnFailure(suspendDuration);
    }
    if (suspendMaxDuration != null) {
        addressEndpoint.setMaxSusDuration(suspendMaxDuration);
    }
    if (factor != null) {
        addressEndpoint.setSusProgFactor(factor);
    }
    if (retryErrorCode != null) {
        addressEndpoint.setTimedOutErrorCodes(retryErrorCode);
    }
    if (retriesOnTimeOut != null) {
        addressEndpoint.setRetryTimeout(retriesOnTimeOut);
    }
    if (retryDelay != null) {
        addressEndpoint.setRetryDelay(retryDelay);
        addressEndpoint.setRetryDelay(retryDelay);
    }
    if (disabledErrorCodes != null) {
        addressEndpoint.setRetryDisabledErrorCodes(disabledErrorCodes);
    }
    if (action != null) {
        if (action.equals("discardMessage")) {
            addressEndpoint.setTimeoutAction("discard");
        } else if (action.equals("executeFaultSequence")) {
            addressEndpoint.setTimeoutAction("fault");
        } else {
            addressEndpoint.setTimeoutAction("100");
        }
    }
    if (actionDuration != null) {
        addressEndpoint.setTimeoutActionDur(actionDuration);
    }
    if (wsAddressing != null) {
        addressEndpoint.setWsadd(true);
    } else {
        addressEndpoint.setWsadd(false);
    }
    if (useSeprateListner != null) {
        addressEndpoint.setSepList(true);
    } else {
        addressEndpoint.setSepList(false);
    }
    if (wsSecurity != null) {
        addressEndpoint.setWssec(true);
    } else {
        addressEndpoint.setWssec(false);
    }
    if (secPolicy != null) {
        addressEndpoint.setSecPolKey(secPolicy);
    } else {
        addressEndpoint.setSecPolKey(null);
    }
    if (wsRM != null) {
        addressEndpoint.setWsrm(true);
    } else {
        addressEndpoint.setWsrm(false);
    }
    if (rmPolicy != null) {
        addressEndpoint.setRmPolKey(rmPolicy);
    } else {
        addressEndpoint.setRmPolKey(null);
    }
    if (properties != null) {
        addressEndpoint.setProperties(properties);
    } else {
        addressEndpoint.setProperties(null);
    }

    OMElement endpointElement = addressEndpoint.serialize(null);
    String epConfig = endpointElement.toString();
    String configuration = null;

    if (isFromTemplateEditor) {
        String templateName = request.getParameter("templateName");
        Template template = new Template();
        if (templateName != null) {
            template.setName(templateName);
        }
        if (epConfig != null) {
            template.setElement(endpointElement);
        } else {
            template.setElement(addressEndpoint.getEmptyEndpointElement());
        }

        String paramCount = request.getParameter("propertyCount");
        int count = Integer.parseInt(paramCount);
        for (int i = 0; i < count; i++) {
            String paramName = request.getParameter("propertyName" + i);
            if (paramName != null && !"".equals(paramName.trim()) &&
                (!"name".equals(paramName.trim()) && !"uri".equals(paramName.trim()))) {
                template.addParameter(paramName);
            }
        }

        OMElement serializedTemplateElement = new TemplateSerializer().serializeEndpointTemplate(template,
                                                                                            null);
        configuration = serializedTemplateElement.toString();
    } else {
        configuration = epConfig;
    }

    if (!isEditingListEndpoint) {
        session.setAttribute("endpointConfiguration", configuration);
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
}
