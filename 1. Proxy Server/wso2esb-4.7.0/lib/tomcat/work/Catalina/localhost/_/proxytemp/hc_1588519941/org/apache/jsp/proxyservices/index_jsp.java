package org.apache.jsp.proxyservices;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.CarbonError;
import org.wso2.carbon.proxyadmin.ui.client.ProxyServiceAdminClient;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.utils.ServerConstants;
import java.util.ResourceBundle;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.wso2.carbon.utils.xml.XMLPrettyPrinter;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyData;
import org.wso2.carbon.proxyadmin.stub.types.carbon.MetaData;
import org.wso2.carbon.proxyadmin.stub.types.carbon.Entry;
import org.wso2.carbon.proxyadmin.stub.types.carbon.ProxyServicePolicyInfo;
import org.wso2.carbon.proxyadmin.ui.client.ProxyAdminClientUtils;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public void removeSessionAttributes(HttpSession session) {
        // if proxy attribute is present in the session then remove it
        if (session.getAttribute("proxy") != null) {
            session.removeAttribute("proxy");
        }
        // if epMode attribute is present in the session then remove it
        if (session.getAttribute("epMode") != null) {
            session.removeAttribute("epMode");
        }
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_bundle_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_bundle_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_fmt_bundle_basename.release();
    _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.release();
    _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../resources/resources-i18n-ajaxprocessor.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../yui/build/container/container_core-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../resources/js/resource_util.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/registry.css\"/>\n");
      out.write("<script type=\"text/javascript\" src=\"../sequences/js/registry-browser.js\"></script>\n");

    ResourceBundle bundle = ResourceBundle.getBundle("org.wso2.carbon.proxyadmin.ui.i18n.Resources",
            request.getLocale());

    String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
    ConfigurationContext configContext =
            (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
    String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
    ProxyServiceAdminClient client = new ProxyServiceAdminClient(
            configContext, backendServerURL, cookie, request.getLocale());

    String region = request.getParameter("region");
    String item = request.getParameter("item");
    String ordinal = request.getParameter("ordinal");
    Integer pageNum;
    // if we are coming from the menu that means we are creating a new proxy service
    if ("true".equals(request.getParameter("startwiz"))) {
        session.removeAttribute("proxy");
        session.removeAttribute("pageNum");
    }
    boolean switchimmed = "true".equals(request.getParameter("sourceView"));

    /* These four values should be populated from the registry values */
    String faultRegKey = "";
    String inRegKey = "";
    String outRegkey = "";
    String eprRegKey = "";

    ProxyData pd = (ProxyData)session.getAttribute("proxy");
    // error object
    CarbonError carbonError;
    String[] tps, definedEPs, definedSeqs;
    try {
        if (pd == null) {
            String name = request.getParameter("serviceName");
            if (name != null && !"".equals(name)) {
                pd = client.getProxy(name);
            }
        }
        MetaData metaData = client.getMetaData();
        // defined endpoints
        definedEPs = (metaData.getEndpointsAvailable()) ?
                ProxyAdminClientUtils.sortNames(metaData.getEndpoints()) : null;

        // available transports
        tps = (metaData.getTransportsAvailable()) ?
                ProxyAdminClientUtils.sortNames(metaData.getTransports()) : null;
        // defined sequences
        definedSeqs = (metaData.getSequencesAvailable()) ?
                ProxyAdminClientUtils.sortNames(metaData.getSequences()) : null;

    } catch (Exception e) {
        // if proxy attribute is present in the session then remove it
        if (session.getAttribute("proxy") != null) {
            session.removeAttribute("proxy");
        }
        CarbonUIMessage.sendCarbonUIMessage(bundle.getString("unable.to.get.metadata"),
                CarbonUIMessage.ERROR, request);
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.href = '../service-mgt/index.jsp';\n");
      out.write("        </script>\n");
      out.write("        ");

        return;
    }

    boolean nameDisabled = false;
    pageNum = (Integer)session.getAttribute("pageNum");
    if (pageNum == null || pageNum < 0 || pageNum > 2) {
        pageNum = 0;
    }
    session.removeAttribute("pageNum");

    String name = (pd != null) ? pd.getName() : "";
    String securityEnabled = (pd != null && pd.getEnableSecurity()) ? "true" : "false";
    String policyKeys = "";
    if (pd != null && pd.getPolicies() != null) {
        ProxyServicePolicyInfo[] policies = pd.getPolicies();
        if (policies.length > 0 && policies[0] != null) {
            boolean first = true;
            for (ProxyServicePolicyInfo pi : policies) {
                if (!first) {
                    policyKeys +=",";
                }
                policyKeys += pi.getKey().trim();
                first = false;
            }
        }
    }


    String header = request.getParameter("header");
    if (header != null && header.toUpperCase().equals(bundle.getString("header.modify").toUpperCase())) {
        nameDisabled = true;
        /* if this is a modify request we set the pageNum to 0 */
        String fromDesign = request.getParameter("fromdesign");
        if (fromDesign == null || fromDesign.equals("")) {
            pageNum = 0;
        }
    }
    header = (header != null && !"".equals(header)) ? header : bundle.getString("header.add");

    // generates transports check boxes
    String tbody = "";
    String[] proxyTransports = null;
    if (pd != null) {
        proxyTransports = pd.getTransports();
        if (proxyTransports != null && proxyTransports.length > 0 && proxyTransports[0] != null) {
            for (String proxyTransport : proxyTransports) {
                tbody += "<tr><td>" + proxyTransport + "</td><td><input name=\"" + proxyTransport + "\" type=\"checkbox\" value=\"" + proxyTransport + "\" checked/></td></tr>";
            }
        }
    }
    if (tps != null && tps.length > 0) {
        for (String tp : tps) {
            if (proxyTransports != null && proxyTransports.length > 0 && proxyTransports[0] != null) {
                if (tbody.indexOf(("\"" + tp) + "\"") == -1) {
                    tbody += "<tr><td>" + tp + "</td><td><input name=\"" + tp + "\" type=\"checkbox\" value=\"" + tp + "\"unchecked/></td></tr>";
                }
            } else {
                // selects http/https ransports since no transport is specified in the proxy service
                tbody += "<tr><td>" + tp + "</td><td><input name=\"" + tp + "\" type=\"checkbox\" value=\"" + tp + "\"";
                        if(tp.startsWith("http")) {
                            tbody += "checked";
                        }
                tbody += "/></td></tr>";
            }
        }
    }

    // the variables holding which option of sequences or endpoints to be selected
    String whichEP, whichFaultSeq, whichInSeq, whichOutSeq;
    whichEP = whichFaultSeq = whichInSeq = whichOutSeq = "None";

    if (pd != null) {
        if (pd.getEndpointKey() != null && !"".equals(pd.getEndpointKey())) {
            whichEP = "Reg";
        } else if (pd.getEndpointXML() != null && !"".equals(pd.getEndpointXML())) {
            whichEP = "Anon";
        }

        if (pd.getFaultSeqKey() != null && !"".equals(pd.getFaultSeqKey())) {
            whichFaultSeq = "Reg";
        } else if (pd.getFaultSeqXML() != null && !"".equals(pd.getFaultSeqXML())) {
            whichFaultSeq = "Anon";
        }

        if (pd.getOutSeqKey() != null && !"".equals(pd.getOutSeqKey())) {
            whichOutSeq = "Reg";
        } else if (pd.getOutSeqXML() != null && !"".equals(pd.getOutSeqXML())) {
            whichOutSeq = "Anon";
        }

        if (pd.getInSeqKey() != null && !"".equals(pd.getInSeqKey())) {
            whichInSeq = "Reg";
        } else if (pd.getInSeqXML() != null && !"".equals(pd.getInSeqXML())) {
            whichInSeq = "Anon";
        }
    }

    // adds defined endpoints
    String epOptions = "<option name=\"None\" value=\"None\">" + bundle.getString("select.ep.none") + "</option>";
    if (definedEPs != null && definedEPs.length > 0) {
        for (String definedEP : definedEPs) {
            epOptions += "<option name=\"" + definedEP + "\" value=\"" + definedEP + "\">" + definedEP + "</option>";
        }
    }

    // if pd is given and its endpoint is in the list of available endpoints then make it selected
    String key;
    if (pd != null && ((key = pd.getEndpointKey()) != null && !"".equals(key))) {
        if (epOptions.indexOf("\"" + key + "\"") != -1) {
            whichEP = "Imp";
            key = "\"" + key + "\"";
            epOptions = epOptions.replaceFirst(key, key + " selected");
        }
    }

    // if pd is given and its endpoint is in the registry then set the key in eprRegKey text box
    if ("Reg".equals(whichEP)) {
        eprRegKey = pd.getEndpointKey();
    }

    // adds defined sequences
    String seqOptions = "";
    if (definedSeqs != null) {
        for (String definedSeq : definedSeqs) {
            seqOptions += "<option name=\"" + definedSeq + "\" value=\"" + definedSeq + "\">" + definedSeq + "</option>";
        }
    }

    // sets sequences lists of all flows to the defined set of sequences
    String faultSeqOptions, inSeqOptions, outSeqOptions;
    faultSeqOptions = inSeqOptions = outSeqOptions = seqOptions;

    // if pd is given and its fault sequence is in the list of available sequences then make it selected
    if (pd != null && ((key = pd.getFaultSeqKey()) != null && !"".equals(key))) {
        if (faultSeqOptions.indexOf("\"" + key + "\"") != -1) {
            whichFaultSeq = "Imp";
            key = "\"" + key + "\"";
            faultSeqOptions = faultSeqOptions.replaceFirst(key, key + " selected");
        }
    }
    faultSeqOptions = "<option name=\"None\" value=\"None\">" + bundle.getString("select.faultseq.none") + "</option>" + faultSeqOptions;

    // if pd is given and its fault sequence is in the registry then set the key in faultRegKey text box
    if ("Reg".equals(whichFaultSeq)){
        faultRegKey = pd.getFaultSeqKey();
    }

    // if pd is given and its out sequence is in the list of available sequences then make it selected
    if (pd != null && ((key = pd.getOutSeqKey()) != null && !"".equals(key))) {
        if (outSeqOptions.indexOf("\"" + key + "\"") != -1) {
            whichOutSeq = "Imp";
            key = "\"" + key + "\"";
            outSeqOptions = outSeqOptions.replaceFirst(key, key + " selected");
        }
    }
    outSeqOptions = "<option name=\"None\" value=\"None\">" + bundle.getString("select.outseq.none") + "</option>" + outSeqOptions;

    // if pd is given and its out sequence is in the registry then set the key in outRegKey text box
    if ("Reg".equals(whichOutSeq)){
        outRegkey = pd.getOutSeqKey();
    }

    // if pd is given and its in sequence is in the list of available sequences then make it selected
    if (pd != null && ((key = pd.getInSeqKey()) != null && !"".equals(key))) {
        if (inSeqOptions.indexOf("\"" + key + "\"") != -1) {
            whichInSeq = "Imp";
            key = "\"" + key + "\"";
            inSeqOptions = inSeqOptions.replaceFirst(key, key + " selected");
        }
    }
    inSeqOptions = "<option name=\"None\" value=\"None\">" + bundle.getString("select.inseq.none") + "</option>" + inSeqOptions;

    // if pd is given and its in sequence is in the registry then set the key in inRegKey text box
    if ("Reg".equals(whichInSeq)){
        inRegKey = pd.getInSeqKey();
    }

    // sets start on load option
    String startOnLoadBox = "<input type=\"checkbox\" name=\"startOnLoad\"/>";
    // if the given proxy data mentions not to start on load then add a checked attribute
    if (pd != null && !pd.getStartOnLoad()) {
        startOnLoadBox = "<input type=\"checkbox\" checked name=\"startOnLoad\"/>";
    }

    // sets additional service params on load if the given proxy data contains any
    Entry[] entries;
    String givenParams = "";
    if (pd != null && (entries = pd.getServiceParams()) != null && entries.length > 0 && entries[0] != null) {
        givenParams = entries[0].getKey() + "," + entries[0].getValue().replace("\n","");
        for (int i = 1; i < entries.length; i++) {
            if (entries[i] != null) {
                givenParams += "::" + entries[i].getKey() + "," + entries[i].getValue();
            }
        }
    }

	givenParams = givenParams.replaceAll("\\\\", "\\\\\\\\");
	
    // sets pinned servers
    String pinnedServers = "";
    String [] servers;
    if (pd != null && (servers = pd.getPinnedServers()) != null && servers.length > 0 && servers[0] != null) {
        pinnedServers = servers[0];
        for (int i = 1; i < servers.length; i++) {
            pinnedServers += "," + servers[i];
        }
    }

    String description = "";
    if (pd != null && pd.getDescription() != null) {
        description = pd.getDescription();
    }

    String serviceGroup = "";
    if (pd != null && pd.getServiceGroup() != null) {
        serviceGroup = pd.getServiceGroup();
    }

    // sets anonymous endpoint options
    String anonEpAddEdit = bundle.getString("create");
    String anonEpXML;
    if (pd != null && (anonEpXML = pd.getEndpointXML()) != null && !"".equals(anonEpXML)) {
        anonEpAddEdit = bundle.getString("anon.edit");
    } else {
        anonEpXML = "";
    }
    session.setAttribute("anonEpXML", anonEpXML);

    // sets anonymous sequence options
    String anonInAddEdit, anonOutAddEdit, anonFaultAddEdit;
    anonInAddEdit = anonOutAddEdit = anonFaultAddEdit = bundle.getString("create");

    String anonInXML, anonOutXML, anonFaultXML;
    anonInXML = anonOutXML = anonFaultXML = "";
    if (pd != null && (anonInXML = pd.getInSeqXML()) != null && !"".equals(anonInXML)) {
        anonInAddEdit = bundle.getString("anon.edit");
        anonInXML = anonInXML.replaceAll(">", "&gt");
        anonInXML = anonInXML.replaceAll("<", "&lt");
    } else {
        anonInXML = "";
    }
    session.setAttribute("anonInXML", anonInXML);

    if (pd != null && (anonOutXML = pd.getOutSeqXML()) != null && !"".equals(anonOutXML)) {
        anonOutAddEdit = bundle.getString("anon.edit");
        anonOutXML = anonOutXML.replaceAll(">", "&gt");
        anonOutXML = anonOutXML.replaceAll("<", "&lt");
    } else {
        anonOutXML = "";
    }
    session.setAttribute("anonOutXML", anonOutXML);

    if (pd != null && (anonFaultXML = pd.getFaultSeqXML()) != null && !"".equals(anonFaultXML)) {
        anonFaultAddEdit = bundle.getString("anon.edit");
        anonFaultXML = anonFaultXML.replaceAll(">", "&gt");
        anonFaultXML = anonFaultXML.replaceAll("<", "&lt");
    } else {
        anonFaultXML = "";
    }
    session.setAttribute("anonFaultXML", anonFaultXML);

    String tracing, statistics;
    tracing = statistics = "off";
    if (pd != null) {
        statistics = (pd.getEnableStatistics()) ? "on" : "off";
        tracing = (pd.getEnableTracing()) ? "on" : "off";
    }

    String publishWsdl = "none";
    String wsdlText = "";
    if (pd != null) {

        if ((wsdlText = pd.getWsdlDef()) != null && !"".equals(wsdlText)) {
            publishWsdl = "inline";
            // create a one line string with no unnecessary whitespaces
            wsdlText = wsdlText.replaceAll("\n|\r|\\f|\\t", "");
            wsdlText = wsdlText.replaceAll("> +<", "><");
            InputStream xmlIn = new ByteArrayInputStream(wsdlText.getBytes());
            XMLPrettyPrinter xmlPrettyPrinter = new XMLPrettyPrinter(xmlIn);
            wsdlText = xmlPrettyPrinter.xmlFormat();
            wsdlText = wsdlText.replaceAll("\n", "<br>");
        } else if ((wsdlText = pd.getWsdlKey()) != null && !"".equals(wsdlText)) {
            publishWsdl = "reg";
        } else if ((wsdlText = pd.getWsdlURI()) != null && !"".equals(wsdlText)) {
            publishWsdl = "uri";
        }
        if(wsdlText != null){        
            wsdlText = wsdlText.replaceAll("\\\\", "\\\\\\\\");    
        }
    }

    // sets additional WSDL resources on load if the given proxy data contains any
    Entry[] resources;
    String givenWsdlResources = "";
    if (pd != null && (resources = pd.getWsdlResources()) != null && resources.length > 0 && resources[0] != null) {
        givenWsdlResources = resources[0].getKey() + "," + resources[0].getValue();
        for (int i = 1; i < resources.length; i++) {
            givenWsdlResources += "::" + resources[i].getKey() + "," + resources[i].getValue();
        }
        givenWsdlResources = givenWsdlResources.replaceAll("\\\\", "\\\\\\\\" );
    }

    String saveOrModify = "add";
    boolean topPage = true;
    if (bundle.getString("header.add").equals(header)) {
        saveOrModify = "add";
        topPage = true;
    } else if (bundle.getString("header.modify").equals(header)) {
        saveOrModify = "modify";
        topPage = false;
    }

    removeSessionAttributes(session);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.proxyadmin.ui.i18n.Resources");
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
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("service.proxy.menu.text");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.proxyadmin.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(topPage);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          _jspx_th_carbon_breadcrumb_0.setHidden(switchimmed ? true : false);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_hidden_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write('\n');
          out.write('\n');
          //  carbon:jsi18n
          org.wso2.carbon.ui.taglibs.JSi18n _jspx_th_carbon_jsi18n_0 = (org.wso2.carbon.ui.taglibs.JSi18n) _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.get(org.wso2.carbon.ui.taglibs.JSi18n.class);
          _jspx_th_carbon_jsi18n_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_jsi18n_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_jsi18n_0.setResourceBundle("org.wso2.carbon.proxyadmin.ui.i18n.JSResources");
          _jspx_th_carbon_jsi18n_0.setRequest(request);
          _jspx_th_carbon_jsi18n_0.setI18nObjectName("proxyi18n");
          int _jspx_eval_carbon_jsi18n_0 = _jspx_th_carbon_jsi18n_0.doStartTag();
          if (_jspx_th_carbon_jsi18n_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
            return;
          }
          _jspx_tagPool_carbon_jsi18n_resourceBundle_request_i18nObjectName_nobody.reuse(_jspx_th_carbon_jsi18n_0);
          out.write("\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("    //when the DOM is ready execute the methord\n");
          out.write("    YAHOO.util.Event.onDOMReady(init);\n");
          out.write("    var anonEpAction = '");
          out.print(anonEpAddEdit);
          out.write("';\n");
          out.write("    var anonInAction = '");
          out.print(anonInAddEdit);
          out.write("';\n");
          out.write("    var anonOutAction = '");
          out.print(anonOutAddEdit);
          out.write("';\n");
          out.write("    var anonFaultAction = '");
          out.print(anonFaultAddEdit);
          out.write("';\n");
          out.write("    var pageNum = ");
          out.print(pageNum.intValue());
          out.write(";\n");
          out.write("    \n");
          out.write("    function init() {\n");
          out.write("        \n");
          out.write("        setSelected('faultSeqOp', '");
          out.print(whichFaultSeq);
          out.write("');\n");
          out.write("        setSelected('inSeqOp', '");
          out.print(whichInSeq);
          out.write("');\n");
          out.write("        setSelected('outSeqOp', '");
          out.print(whichOutSeq);
          out.write("');\n");
          out.write("        setSelected('epOp', '");
          out.print(whichEP);
          out.write("');\n");
          out.write("        generateServiceParamTable();\n");
          out.write("        generateWsdlResourceTable();\n");
          out.write("        hideSeqOps('in');\n");
          out.write("        hideSeqOps('out');\n");
          out.write("        hideSeqOps('fault');\n");
          out.write("        showHideSeqOpsOnLoad();\n");
          out.write("        hideEpOps();\n");
          out.write("        showHideEpOpsOnLoad();\n");
          out.write("        showPageOnLoad();\n");
          out.write("        showHidePublishWsdlOptionsOnLoad();\n");
          out.write("        if (");
          out.print(switchimmed);
          out.write(") {\n");
          out.write("          sourceView();\n");
          out.write("          return;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showHidePublishWsdlOptionsOnLoad() {\n");
          out.write("        var publishWsdl = '");
          out.print(publishWsdl);
          out.write("';\n");
          out.write("        if (publishWsdl == 'none') {\n");
          out.write("            getElement('publishWsdlCombo').selectedIndex = 0;\n");
          out.write("            showHidePublishWsdlOptions();\n");
          out.write("        } else if (publishWsdl == 'inline') {\n");
          out.write("            getElement('publishWsdlCombo').selectedIndex = 1;\n");
          out.write("            var text = '");
          out.print(wsdlText);
          out.write("';\n");
          out.write("            text = text.replace(/^<br>/,\"\");\n");
          out.write("            text = text.replace(/<br>/g,\"\\r\\n\");\n");
          out.write("            getElement('wsdlInlineText').value = text;\n");
          out.write("            showHidePublishWsdlOptions();\n");
          out.write("        } else if (publishWsdl == 'reg') {\n");
          out.write("            getElement('publishWsdlCombo').selectedIndex = 3;\n");
          out.write("            getElement('wsdlRegText').value = '");
          out.print(wsdlText);
          out.write("';\n");
          out.write("            showHidePublishWsdlOptions();\n");
          out.write("        } else if (publishWsdl == 'uri') {\n");
          out.write("            getElement('publishWsdlCombo').selectedIndex = 2;\n");
          out.write("            getElement('wsdlUriText').value = '");
          out.print(wsdlText);
          out.write("';\n");
          out.write("            showHidePublishWsdlOptions();\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showPageOnLoad() {\n");
          out.write("        hideElem('saveBtn');\n");
          out.write("        if (pageNum == 0) {\n");
          out.write("            hideElem('backBtn');\n");
          out.write("        } else if (pageNum == 2) {\n");
          out.write("            hideElem('nextBtn');\n");
          out.write("            showElem('saveBtn');\n");
          out.write("            getElement('saveBtn').disabled = false;\n");
          out.write("        }\n");
          out.write("        hideElem('page0');\n");
          out.write("        hideElem('page1');\n");
          out.write("        hideElem('page2');\n");
          out.write("        hideElem('step0');\n");
          out.write("        hideElem('step1');\n");
          out.write("        hideElem('step2');\n");
          out.write("        showElem('step' + pageNum);\n");
          out.write("        showElem('page' + pageNum);\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showNextPage() {\n");
          out.write("        var result;\n");
          out.write("        if ((result = validatePage(pageNum)) != 'successful') {\n");
          out.write("            CARBON.showErrorDialog(result);\n");
          out.write("            return;\n");
          out.write("        }\n");
          out.write("        if (pageNum <= 1) {\n");
          out.write("            hideElem('page' + pageNum);\n");
          out.write("            hideElem('step' + pageNum);\n");
          out.write("            var n = ++pageNum;\n");
          out.write("            showElem('page' + n);\n");
          out.write("            showElem('step' + n);\n");
          out.write("            showElem('backBtn');\n");
          out.write("            if (pageNum == 2) {\n");
          out.write("                hideElem('nextBtn');\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        if (pageNum == 2) {\n");
          out.write("            showElem('saveBtn');\n");
          out.write("            getElement('saveBtn').disabled = false;\n");
          out.write("        } else {\n");
          out.write("            hideElem('saveBtn');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function validatePage(num) {\n");
          out.write("        var elem;\n");
          out.write("        var isOneSpecified = false;\n");
          out.write("\n");
          out.write("        if ((elem = getElement('psName')).value == null || elem.value == '') {\n");
          out.write("            return 'Empty proxy service name';\n");
          out.write("        }\n");
          out.write("        if (num == 0) {\n");
          out.write("            var wsdl = getElement('publishWsdlCombo');\n");
          out.write("            if (wsdl != null) {\n");
          out.write("                var mode = wsdl[wsdl.selectedIndex].value;\n");
          out.write("                if (mode == 'uri') {\n");
          out.write("                    var wsdlUri = getElement('wsdlUriText');\n");
          out.write("                    if (wsdlUri && wsdlUri.value != \"\") {\n");
          out.write("                        var regx = RegExp(\"((jms|mailto|http|https|ftp|file):/.*)|file:.*\");\n");
          out.write("                        if (!(wsdlUri.value.match(regx))) {\n");
          out.write("                            return proxyi18n[\"invalid.wsdl.uri\"];\n");
          out.write("                        }\n");
          out.write("                    } else if (wsdlUri.value == '') {\n");
          out.write("                        return proxyi18n[\"invalid.wsdl.uri\"];                        \n");
          out.write("                    }\n");
          out.write("                } else if (mode == 'reg') {\n");
          out.write("                    var wsdlKey = getElement('wsdlRegText');\n");
          out.write("                    if (wsdlKey && wsdlKey.value == '') {\n");
          out.write("                        return proxyi18n['wsdl.not.selected'];\n");
          out.write("                    }\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        } else if (num == 1) {\n");
          out.write("\n");
          out.write("            if (getElement('epOpImp').checked && getElement('importEp').value != 'None') {\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            }\n");
          out.write("            if (getElement('inSeqOpImp').checked && getElement('inImportSeq').value != 'None') {\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            }\n");
          out.write("            if (getElement('inSeqOpAnon').checked ) {\n");
          out.write("                if (getElement('inAnonAddEdit').innerHTML == '");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                    return proxyi18n[\"anonymous.in.sequence.is.not.specified\"];\n");
          out.write("                }\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            } else if (getElement('inSeqOpReg').checked) {\n");
          out.write("                elem = getElement('proxy.in.registry');\n");
          out.write("                if (elem && elem.value == \"\") {\n");
          out.write("                    return proxyi18n[\"an.in.sequence.is.not.selected.from.the.registry\"];\n");
          out.write("                }\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            if (getElement('epOpAnon').checked) {\n");
          out.write("                if (getElement('epAnonAddEdit').innerHTML == '");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                    return proxyi18n[\"anonymous.endpoint.is.not.specified\"];\n");
          out.write("                }\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            } else if (getElement('epOpReg').checked) {\n");
          out.write("                elem = getElement('proxy.epr.registry');\n");
          out.write("                if (elem && elem.value == \"\") {\n");
          out.write("                    return proxyi18n[\"an.endpoint.is.not.selected.from.the.registry\"];\n");
          out.write("                }\n");
          out.write("                isOneSpecified = true;\n");
          out.write("            }\n");
          out.write("            if (!isOneSpecified) {\n");
          out.write("                return proxyi18n[\"a.valid.in.sequence.or.a.valid.endpoint.is.needed.to.create.a.proxy.service\"];\n");
          out.write("            }\n");
          out.write("        } else if (num == 2) {\n");
          out.write("            if (getElement('outSeqOpAnon').checked && getElement('outAnonAddEdit').innerHTML == '");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' ) {\n");
          out.write("                return proxyi18n[\"anonymous.out.sequence.is.not.added\"];\n");
          out.write("            } else if (getElement('outSeqOpReg').checked) {\n");
          out.write("                elem = getElement('proxy.out.registry');\n");
          out.write("                if (elem && elem.value == \"\") {\n");
          out.write("                    return proxyi18n[\"an.out.sequence.is.not.selected.from.the.registry\"];\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            if (getElement('faultSeqOpAnon').checked && getElement('faultAnonAddEdit').innerHTML == '");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("' ) {\n");
          out.write("                return proxyi18n[\"anonymous.fault.sequence.is.not.added\"];\n");
          out.write("            }  else if (getElement('faultSeqOpReg').checked) {\n");
          out.write("                elem = getElement('proxy.fault.registry');\n");
          out.write("                if (elem && elem.value == \"\") {\n");
          out.write("                    return proxyi18n[\"a.fault.sequence.is.not.selected.from.the.registry\"];\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        return 'successful';\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showBackPage() {\n");
          out.write("        hideElem('saveBtn');\n");
          out.write("        getElement('saveBtn').disabled = true;\n");
          out.write("        if (pageNum > 0) {\n");
          out.write("            hideElem('page' + pageNum);\n");
          out.write("            hideElem('step' + pageNum);\n");
          out.write("            var n = --pageNum;\n");
          out.write("            showElem('page' + n);\n");
          out.write("            showElem('step' + n);\n");
          out.write("            showElem('nextBtn');\n");
          out.write("            if  (pageNum == 0) {\n");
          out.write("                hideElem('backBtn');\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function setSelected(type, option) {\n");
          out.write("        var element;\n");
          out.write("        element = getElement(type + option);\n");
          out.write("        element.setAttribute('checked', 'checked');\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function saveData() {\n");
          out.write("        var result;\n");
          out.write("        if ((result = validatePage(2)) == 'successful') {\n");
          out.write("            populateServiceParams();\n");
          out.write("            populateWsdlResources();\n");
          out.write("            document.designForm.action = \"designToData.jsp?submit=");
          out.print(saveOrModify);
          out.write("&anonEpAction=\" + anonEpAction + \"&header=");
          out.print(header);
          out.write("&forwardTo=../service-mgt/index.jsp&pageNum=\" + pageNum + \"&originator=index.jsp&anonInAction\" + anonInAction + \"&anonOutAction=\" + anonOutAction + \"&anonFaultAction=\" + anonFaultAction;\n");
          out.write("            document.designForm.submit();\n");
          out.write("        } else {\n");
          out.write("            CARBON.showErrorDialog(result);\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function cancelData() {\n");
          out.write("        window.location.href=\"../service-mgt/index.jsp\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function sourceView() {\n");
          out.write("        populateServiceParams();\n");
          out.write("        populateWsdlResources();\n");
          out.write("        document.designForm.action = \"designToData.jsp?return=source.jsp&header=");
          out.print(header);
          out.write("&anonEpAction=\" + anonEpAction + \"&pageNum=\" + pageNum + \"&originator=index.jsp&anonInAction\" + anonInAction + \"&anonOutAction=\" + anonOutAction + \"&anonFaultAction=\" + anonFaultAction;\n");
          out.write("        document.designForm.submit();\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function populateWsdlResources() {\n");
          out.write("        var i;\n");
          out.write("        var str = '';\n");
          out.write("        if (wsdlResourcesCount > 0) {\n");
          out.write("            str += wsdlResources[0]['location'] + ',' + wsdlResources[0]['key'];\n");
          out.write("            for (i = 1; i < wsdlResources.length; i++) {\n");
          out.write("                str += '::' + wsdlResources[i]['location'] + ',' + wsdlResources[i]['key'];\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        document.designForm.wsdlResourceList.value = str;\n");
          out.write("\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function generateWsdlResourceTable() {\n");
          out.write("        var str = '");
          out.print(givenWsdlResources);
          out.write("';\n");
          out.write("        if (str != '') {\n");
          out.write("            var params;\n");
          out.write("            params = str.split(\"::\");\n");
          out.write("            var i, param;\n");
          out.write("            for (i = 0; i < params.length; i++) {\n");
          out.write("                param = params[i].split(\",\");\n");
          out.write("                addWsdlResourceRow(param[0], param[1]);\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    // sets the values of the headerTable as the value of serviceParams (i.e. comma separated list of name:value pairs)\n");
          out.write("    function populateServiceParams() {\n");
          out.write("        var i;\n");
          out.write("        var str = '';\n");
          out.write("        var headerTable = document.getElementById(\"headerTable\");\n");
          out.write("        for(var j= 1;j<headerTable.rows.length;j++){\n");
          out.write("            var parmName = headerTable.rows[j].getElementsByTagName(\"input\")[0].value;\n");
          out.write("            var parmValue = headerTable.rows[j].getElementsByTagName(\"input\")[1].value;\n");
          out.write("            if(parmName == \"\" || parmValue == \"\"){\n");
          out.write("                return;\n");
          out.write("            }\n");
          out.write("            if (j == 1) {\n");
          out.write("                str += parmName + ',' + parmValue;\n");
          out.write("            }else{\n");
          out.write("                str += '::' + parmName + ',' + parmValue;                \n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        document.designForm.serviceParams.value = str;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function generateServiceParamTable() {\n");
          out.write("        var str = '");
          out.print(givenParams);
          out.write("';\n");
          out.write("        if (str != '') {\n");
          out.write("            var params;\n");
          out.write("            params = str.split(\"::\");\n");
          out.write("            var i, param;\n");
          out.write("            for (i = 0; i < params.length; i++) {\n");
          out.write("                param = params[i].split(\",\");\n");
          out.write("                addServiceParamRow(param[0], param[1]);\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function  anonEpAddEdit() {\n");
          out.write("        populateServiceParams();\n");
          out.write("        populateWsdlResources();\n");
          out.write("        document.designForm.action = \"designToData.jsp?return=anonEpHandler.jsp&header=");
          out.print(header);
          out.write("&anonEpAction=\" + anonEpAction + \"&pageNum=\" + pageNum + \"&originator=index.jsp&anonInAction\" + anonInAction + \"&anonOutAction=\" + anonOutAction + \"&anonFaultAction=\" + anonFaultAction;\n");
          out.write("        document.designForm.submit();\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function anonEpClear() {\n");
          out.write("        anonEpAction = \"");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\";\n");
          out.write("        hideElem('epAnonClear');\n");
          out.write("        getElement('epAnonAddEdit').innerHTML = anonEpAction;\n");
          out.write("        getElement('epAnonAddEdit').style.backgroundImage=\"url(../admin/images/add.gif)\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function anonSeqClear(sequence) {\n");
          out.write("        if (sequence == 'in') {\n");
          out.write("            anonInAction = \"");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\";\n");
          out.write("            getElement('inAnonAddEdit').innerHTML = anonInAction;\n");
          out.write("        } else if (sequence == 'out') {\n");
          out.write("            anonOutAction = \"");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\";\n");
          out.write("            getElement('outAnonAddEdit').innerHTML = anonOutAction;\n");
          out.write("        } else if (sequence == 'fault') {\n");
          out.write("            anonFaultAction = \"");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\";\n");
          out.write("            getElement('faultAnonAddEdit').innerHTML = anonFaultAction;\n");
          out.write("        }\n");
          out.write("        hideElem(sequence + 'AnonClear');\n");
          out.write("        getElement(sequence + 'AnonAddEdit').style.backgroundImage=\"url(../admin/images/add.gif);\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function hideOtherEpOp(other) {\n");
          out.write("        hideElem(other);\n");
          out.write("        if (other == 'importEp') {\n");
          out.write("            showElem('epAnonAddEdit');\n");
          out.write("            if (anonEpAction == 'Edit') {\n");
          out.write("                showElem('epAnonClear');\n");
          out.write("            } else if (anonEpAction == 'Add') {\n");
          out.write("                hideElem('epAnonClear');\n");
          out.write("            }\n");
          out.write("        } else if (other == 'epAnonAddEdit') {\n");
          out.write("            hideElem('epAnonClear');\n");
          out.write("            showElem('importEp');\n");
          out.write("        }\n");
          out.write("        hideElem('eprRegistry');\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function hideEpOps() {\n");
          out.write("        hideElem('epAnonAddEdit');\n");
          out.write("        hideElem('epAnonClear');\n");
          out.write("        hideElem('importEp');\n");
          out.write("        hideElem('eprRegistry');\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showHideEpOpsOnLoad() {\n");
          out.write("        if ('");
          out.print(whichEP);
          out.write("' == 'Anon') {\n");
          out.write("            hideOtherEpOp('importEp');\n");
          out.write("        } else if ('");
          out.print(whichEP);
          out.write("' == 'Imp') {\n");
          out.write("            hideOtherEpOp('epAnonAddEdit');\n");
          out.write("        } else if ('");
          out.print(whichEP);
          out.write("' == 'Reg') {\n");
          out.write("            hideElem('importEp');\n");
          out.write("            hideElem('epAnonAddEdit');\n");
          out.write("            hideElem('epAnonClear');\n");
          out.write("            showElem('eprRegistry');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function anonSeqAddEdit(sequence) {\n");
          out.write("        populateServiceParams();\n");
          out.write("        populateWsdlResources();\n");
          out.write("        document.designForm.action = \"designToData.jsp?return=anonSequenceHandler.jsp&anonEpAction=\" + anonEpAction + \"&header=");
          out.print(header);
          out.write("&pageNum=\" + pageNum + \"&originator=index.jsp&sequence=\" + sequence + \"&anonInAction\" + anonInAction + \"&anonOutAction=\" + anonOutAction + \"&anonFaultAction=\" + anonFaultAction;\n");
          out.write("        document.designForm.submit();\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function hideSeqOps(sequence) {\n");
          out.write("        hideElem(sequence + 'ImportSeq');\n");
          out.write("        hideElem(sequence + 'AnonAddEdit');\n");
          out.write("        hideElem(sequence + 'AnonClear');\n");
          out.write("        hideElem(sequence + 'Registry');\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function hideOtherSeqOp(sequence, other) {\n");
          out.write("        hideElem(sequence + other);\n");
          out.write("        if (other == \"ImportSeq\") {\n");
          out.write("            showElem(sequence + 'AnonAddEdit');\n");
          out.write("        } else if (other == \"AnonAddEdit\") {\n");
          out.write("            showElem(sequence + 'ImportSeq');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showHideSeqOpsOnLoad() {\n");
          out.write("        if ('");
          out.print(whichInSeq);
          out.write("' == 'Anon') {\n");
          out.write("            showElem('inAnonAddEdit');\n");
          out.write("            if (anonInAction == '");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                showElem('inAnonClear');\n");
          out.write("            } else {\n");
          out.write("                hideElem('inAnonClear');\n");
          out.write("            }\n");
          out.write("        } else if ('");
          out.print(whichInSeq);
          out.write("' == \"Imp\") {\n");
          out.write("            showElem('inImportSeq');\n");
          out.write("        } else if ('");
          out.print(whichInSeq);
          out.write("' == \"Reg\") {\n");
          out.write("            showElem('inRegistry');\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        if ('");
          out.print(whichOutSeq);
          out.write("' == 'Anon') {\n");
          out.write("            showElem('outAnonAddEdit');\n");
          out.write("            if (anonOutAction == '");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                showElem('outAnonClear');\n");
          out.write("            } else {\n");
          out.write("                hideElem('outAnonClear');\n");
          out.write("            }\n");
          out.write("        } else if ('");
          out.print(whichOutSeq);
          out.write("' == \"Imp\") {\n");
          out.write("            showElem('outImportSeq');\n");
          out.write("        } else if ('");
          out.print(whichOutSeq);
          out.write("' == \"Reg\") {\n");
          out.write("            showElem('outRegistry');\n");
          out.write("        }\n");
          out.write("\n");
          out.write("        if ('");
          out.print(whichFaultSeq);
          out.write("' == 'Anon') {\n");
          out.write("            showElem('faultAnonAddEdit');\n");
          out.write("            if (anonFaultAction == '");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                showElem('faultAnonClear');\n");
          out.write("            } else {\n");
          out.write("                hideElem('faultAnonClear');\n");
          out.write("            }\n");
          out.write("        } else if ('");
          out.print(whichFaultSeq);
          out.write("' == \"Imp\") {\n");
          out.write("            showElem('faultImportSeq');\n");
          out.write("        } else if ('");
          out.print(whichFaultSeq);
          out.write("' == \"Reg\") {\n");
          out.write("            showElem('faultRegistry');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function getElement(id) {\n");
          out.write("        return document.getElementById(id);\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function validate() {\n");
          out.write("        var result;\n");
          out.write("        if ((result = validatePage(2)) != 'successful') {\n");
          out.write("            pageNum = 2;\n");
          out.write("            return result;\n");
          out.write("        }\n");
          out.write("        return 'successful';\n");
          out.write("    }\n");
          out.write("    \n");
          out.write("    function addServiceParams() {\n");
          out.write("        //check to see if there are empty fields left\n");
          out.write("        var theTable = document.getElementById('headerTable');\n");
          out.write("        var inputs = theTable.getElementsByTagName('input');\n");
          out.write("        for(var i=0; i<inputs.length; i++){\n");
          out.write("            if(inputs[i].value == \"\"){\n");
          out.write("                CARBON.showErrorDialog(\"");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("                return;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        addServiceParamRow(\"\", \"\");\n");
          out.write("        if(document.getElementById('headerTable').style.display == \"none\"){\n");
          out.write("            document.getElementById('headerTable').style.display = \"\";\n");
          out.write("        }\n");
          out.write("       /* var headerName = document.getElementById('headerName').value;\n");
          out.write("        var headerValue = document.getElementById('headerValue').value;\n");
          out.write("        // trim the input values\n");
          out.write("        headerName = headerName.replace(/^\\s*//*, \"\").replace(/\\s*$/, \"\");\n");
          out.write("        headerValue = headerValue.replace(/^\\s*//*, \"\").replace(/\\s*$/, \"\");\n");
          out.write("        if (headerName != '' && headerValue != '') {\n");
          out.write("            if (isParamAlreadyExist(headerName)) {\n");
          out.write("                CARBON.showWarningDialog(\"");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("                return;\n");
          out.write("            }\n");
          out.write("            addServiceParamRow(headerName, headerValue);\n");
          out.write("        } else {\n");
          out.write("            CARBON.showWarningDialog(\"");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("        }*/\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteServiceParamRow(index) {\n");
          out.write("        CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" , function() {\n");
          out.write("            document.getElementById('headerTable').deleteRow(index);\n");
          out.write("            if (document.getElementById('headerTable').rows.length == 1) {\n");
          out.write("                document.getElementById('headerTable').style.display = 'none';\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function deleteWsdlResourceRow(index) {\n");
          out.write("        CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" , function() {\n");
          out.write("            document.getElementById('wsdlResourceTable').deleteRow(index);\n");
          out.write("            wsdlResources.splice(index-1, 1);\n");
          out.write("            wsdlResourcesCount--;\n");
          out.write("            if (wsdlResourcesCount == 0) {\n");
          out.write("                document.getElementById('wsdlResourceTable').style.display = 'none';\n");
          out.write("            }\n");
          out.write("        });\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function addWsdlResources() {\n");
          out.write("        // todo handle validation before adding resource, i.e. see if the above textbox or textarea is empty\n");
          out.write("        var location = getElement('locationText').value;\n");
          out.write("        var key = getElement('wsdl.resource.key').value;\n");
          out.write("        // trim the input values\n");
          out.write("        location = location.replace(/^\\s*/, \"\").replace(/\\s*$/, \"\");\n");
          out.write("        key = key.replace(/^\\s*/, \"\").replace(/\\s*$/, \"\");\n");
          out.write("        if (location != '' && key != '') {\n");
          out.write("            if (isWsdlResourceAlreadyExists(location)) {\n");
          out.write("                CARBON.showWarningDialog(\"");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("                return;\n");
          out.write("            }\n");
          out.write("            addWsdlResourceRow(location, key);\n");
          out.write("        } else {\n");
          out.write("            CARBON.showWarningDialog(\"");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    var wsdlResources = Array();\n");
          out.write("    var wsdlResourcesCount = 0;\n");
          out.write("\n");
          out.write("    /**\n");
          out.write("     * Adds a new row to the <code>wsdlResourceTable</code>.\n");
          out.write("     * @param location\n");
          out.write("     * @param key\n");
          out.write("     */\n");
          out.write("    function addWsdlResourceRow(location, key) {\n");
          out.write("        addRow(location, key, 'wsdlResourceTable', 'deleteWsdlResourceRow');\n");
          out.write("\n");
          out.write("        wsdlResources[wsdlResourcesCount] = new Array(2);\n");
          out.write("        wsdlResources[wsdlResourcesCount]['location'] = location;\n");
          out.write("        wsdlResources[wsdlResourcesCount]['key'] = key;\n");
          out.write("\n");
          out.write("        wsdlResourcesCount++;\n");
          out.write("\n");
          out.write("        document.getElementById('locationText').value=\"\";\n");
          out.write("        document.getElementById('wsdl.resource.key').value=\"\";\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function isWsdlResourceAlreadyExists(location) {\n");
          out.write("        var i;\n");
          out.write("        for (i = 0; i < wsdlResourcesCount; i++) {\n");
          out.write("            if (wsdlResources[i]['location'] == location) {\n");
          out.write("                return true;\n");
          out.write("            }\n");
          out.write("        }\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function showHidePublishWsdlOptions() {\n");
          out.write("        var index;\n");
          out.write("        if ((index = document.getElementById('publishWsdlCombo').selectedIndex) == 0) {\n");
          out.write("            hideElem('wsdlInline');\n");
          out.write("            hideElem('wsdlUri');\n");
          out.write("            hideElem('wsdlReg');\n");
          out.write("            hideElem('wsdlResourceTr');\n");
          out.write("        } else if (index == 1) {\n");
          out.write("            showElem('wsdlInline');\n");
          out.write("            hideElem('wsdlUri');\n");
          out.write("            hideElem('wsdlReg');\n");
          out.write("            showElem('wsdlResourceTr');\n");
          out.write("        } else if (index == 2) {\n");
          out.write("            hideElem('wsdlInline');\n");
          out.write("            showElem('wsdlUri');\n");
          out.write("            hideElem('wsdlReg');\n");
          out.write("            showElem('wsdlResourceTr');\n");
          out.write("        } else if (index == 3) {\n");
          out.write("            hideElem('wsdlInline');\n");
          out.write("            hideElem('wsdlUri');\n");
          out.write("            showElem('wsdlReg');\n");
          out.write("            showElem('wsdlResourceTr');\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function radioClicked(seqence, name) {\n");
          out.write("        if (name != null) {\n");
          out.write("            showElem(seqence + name);\n");
          out.write("            if (name == \"Registry\") {\n");
          out.write("                hideElem(seqence + \"ImportSeq\");\n");
          out.write("                hideElem(seqence + \"AnonAddEdit\");\n");
          out.write("                hideElem(seqence + \"AnonClear\");\n");
          out.write("            } else if (name == \"ImportSeq\") {\n");
          out.write("                hideElem(seqence + \"Registry\");\n");
          out.write("                hideElem(seqence + \"AnonAddEdit\");\n");
          out.write("                hideElem(seqence + \"AnonClear\");\n");
          out.write("            } else if (name == \"AnonAddEdit\") {\n");
          out.write("                hideElem(seqence + \"Registry\");\n");
          out.write("                hideElem(seqence + \"ImportSeq\");\n");
          out.write("                if (seqence == 'in' && anonInAction == '");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                    showElem('inAnonClear');\n");
          out.write("                } else if (seqence == 'out' && anonOutAction == '");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                    showElem('outAnonClear');\n");
          out.write("                } else if (seqence == 'fault' && anonFaultAction == '");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                    showElem('faultAnonClear');\n");
          out.write("                }\n");
          out.write("            }\n");
          out.write("        } else {\n");
          out.write("            hideElem(seqence + \"Registry\");\n");
          out.write("            hideElem(seqence + \"ImportSeq\");\n");
          out.write("            hideElem(seqence + \"AnonAddEdit\");\n");
          out.write("            hideElem(seqence + \"AnonClear\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function eprRadioClicked(name) {\n");
          out.write("        if (name == \"importEp\") {\n");
          out.write("            showElem(\"importEp\");\n");
          out.write("            hideElem(\"eprRegistry\");\n");
          out.write("            hideElem(\"epAnonAddEdit\");\n");
          out.write("            hideElem('epAnonClear');\n");
          out.write("        } else if (name == \"eprRegistry\") {\n");
          out.write("            showElem(\"eprRegistry\");\n");
          out.write("            hideElem(\"epAnonAddEdit\");\n");
          out.write("            hideElem('epAnonClear');\n");
          out.write("            hideElem(\"importEp\");\n");
          out.write("        } else if (name == \"epAnonAddEdit\") {\n");
          out.write("            showElem(\"epAnonAddEdit\");\n");
          out.write("            if (anonEpAction == '");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("') {\n");
          out.write("                showElem('epAnonClear');\n");
          out.write("            }\n");
          out.write("            hideElem(\"eprRegistry\");\n");
          out.write("            hideElem(\"importEp\");\n");
          out.write("        } else if (name == \"epOpNone\") {\n");
          out.write("            hideElem(\"epAnonAddEdit\");\n");
          out.write("            hideElem('epAnonClear');\n");
          out.write("            hideElem(\"eprRegistry\");\n");
          out.write("            hideElem(\"importEp\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    function testWsdlUri() {\n");
          out.write("        var inputBox = document.getElementById('wsdlUriText');\n");
          out.write("        var wsdlUri = inputBox.value;\n");
          out.write("        if (wsdlUri == '') {\n");
          out.write("            CARBON.showWarningDialog(proxyi18n[\"invalid.wsdl.uri\"]);\n");
          out.write("        } else {\n");
          out.write("            jQuery.get(\"testConnection-ajaxprocessor.jsp\", {'url' : wsdlUri},\n");
          out.write("                    function(data,status) {\n");
          out.write("                       if (data.replace(/^\\s+|\\s+$/g, '') != 'success') {\n");
          out.write("                           CARBON.showErrorDialog(proxyi18n[\"invalid.wsdl.uri2\"]);\n");
          out.write("                       } else {\n");
          out.write("                           CARBON.showInfoDialog(proxyi18n[\"wsdl.uri.ok\"]);\n");
          out.write("                       }\n");
          out.write("                    });\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("    function changePSN(){\n");
          out.write("        var proxyServiceName1 = document.getElementById(\"proxyServiceName1\");\n");
          out.write("        var proxyServiceName2 = document.getElementById(\"proxyServiceName2\");\n");
          out.write("        var psName = document.getElementById(\"psName\").value;\n");
          out.write("        proxyServiceName1.innerHTML = psName;\n");
          out.write("        proxyServiceName2.innerHTML = psName;\n");
          out.write("\n");
          out.write("    }\n");
          out.write("</script>\n");
          out.write("\n");
          out.write("<div id=\"middle\"  ");
          out.print(switchimmed ? "style=visibility: hidden" : "");
          out.write(">\n");
          out.write("<h2>");
          out.print(header);
          out.write(" Proxy Service</h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\">\n");
          out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../proxyservices/css/proxyservices.css\"/>\n");
          out.write("<script type=\"text/javascript\" src=\"../proxyservices/js/proxyservices.js\"></script>\n");
          out.write("<form id=\"form1\" name=\"designForm\" method=\"post\" action=\"\">\n");
          out.write("<table cellspacing=\"0\" class=\"styledLeft\">\n");
          out.write("<thead>\n");
          out.write("    <tr>\n");
          out.write("        <th colspan=\"2\">\n");
          out.write("            <span style=\"float: left; position: relative; margin-top: 2px;\">");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</span><a style=\"background-image: url(images/source-view.gif);\" class=\"icon-link\" onclick=\"sourceView()\" href=\"#\">");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("        </th>\n");
          out.write("    </tr>\n");
          out.write("</thead>\n");
          out.write("<tbody>\n");
          out.write("<tr>\n");
          out.write("<td>\n");
          out.write("<table width=\"100%\" class=\"normal\">\n");
          out.write("<tr>\n");
          out.write("    <td colspan=\"3\">\n");
          out.write("        <div id=\"step0\">\n");
          out.write("            <h2>");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("            <table class=\"normal\">\n");
          out.write("                <tbody>\n");
          out.write("                <tr>\n");
          out.write("                <td class=\"leftCol-small\"> ");
 if (nameDisabled) { 
          out.write("<strong>");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(":</strong>");
 } else { 
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class=\"required\">*</span>");
 } 
          out.write(" \n");
          out.write("                </td>\n");
          out.write("                <td align=\"left\">\n");
          out.write("                    ");
 if (!nameDisabled) { 
          out.write("\n");
          out.write("                    <input id=\"psName\" name=\"psName\" type=\"text\" value=\"");
          out.print(name);
          out.write("\" onchange=\"changePSN()\"  onkeypress=\"return validateText(event)\"/>\n");
          out.write("                    ");
 } else { 
          out.write("\n");
          out.write("                        <strong>");
          out.print(name);
          out.write("</strong>\n");
          out.write("                    ");
 } 
          out.write("\n");
          out.write("                </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("            </table>\n");
          out.write("        </div>\n");
          out.write("        <div id=\"step1\">\n");
          out.write("            <h2>");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("            <strong>");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(": <span id=\"proxyServiceName1\">");
          out.print(name);
          out.write("</span></strong>\n");
          out.write("            <p>\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </p>\n");
          out.write("        </div>\n");
          out.write("        <div id=\"step2\">\n");
          out.write("            <h2>");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</h2>\n");
          out.write("            <strong>");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(": <span id=\"proxyServiceName2\">");
          out.print(name);
          out.write("</span></strong>\n");
          out.write("            <p>\n");
          out.write("                ");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            </p>\n");
          out.write("        </div>\n");
          out.write("        <input id=\"psName\" name=\"psName\" type=\"hidden\" value=\"");
          out.print(name);
          out.write("\">\n");
          out.write("        <input name=\"proxy.secured\" type=\"hidden\" value=\"");
          out.print(securityEnabled);
          out.write("\"/>\n");
          out.write("        <input name=\"proxy.policies\" type=\"hidden\" value=\"");
          out.print(policyKeys);
          out.write("\" />\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("<td>\n");
          out.write("\n");
          out.write("<div>\n");
          out.write("    <input type=\"hidden\" name=\"statState\" value=\"");
          out.print(statistics);
          out.write("\">\n");
          out.write("    <input type=\"hidden\" name=\"traceState\" value=\"");
          out.print(tracing);
          out.write("\">\n");
          out.write("</div>\n");
          out.write("<div id=\"page0\">\n");
          out.write("    <table class=\"styledInner\" cellspacing=\"0\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td style=\"padding: 0px !important;\">\n");
          out.write("                    <div id=\"generalContent\">\n");
          out.write("                        <table cellpadding=\"0\" cellspacing=\"0\" class=\"styledInner\" width=\"100%\" style=\"margin-left:0px;\">\n");
          out.write("                            <tr>\n");
          out.write("\t\t\t\t<td colspan=\"3\">\n");
          out.write("\t\t\t\t<table class=\"normal-nopadding\">\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("                                <td width=\"20%\">");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                <td >\n");
          out.write("                                    <select id=\"publishWsdlCombo\" name=\"publishWsdlCombo\" onchange=\"showHidePublishWsdlOptions();\">\n");
          out.write("                                        <option id=\"publishWsdlNone\" selected=\"selected\" value=\"None\">");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                        <option id=\"publishWsdlInline\" value=\"inline\">");
          if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                        <option id=\"publishWsdlUri\" value=\"uri\">");
          if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                        <option id=\"publishWsdlReg\" value=\"reg\">");
          if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("                                    </select>\n");
          out.write("                                </td>\n");
          out.write("\n");
          out.write("                            </tr>\n");
          out.write("                            <tr id=\"wsdlInline\">\n");
          out.write("                                <td></td>\n");
          out.write("                                <td >");
          if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<br/><br/>\n");
          out.write("                                    <textarea name=\"wsdlInlineText\" id=\"wsdlInlineText\" rows=\"20\" style=\"width: 99%;\"></textarea>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr id=\"wsdlUri\">\n");
          out.write("                                <td></td>\n");
          out.write("                                <td >\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<br/><br/>\n");
          out.write("                                    <input type=\"text\" name=\"wsdlUriText\" id=\"wsdlUriText\">\n");
          out.write("                                    <input type=\"button\" class=\"button\" onclick=\"testWsdlUri()\" value=\"Test URI\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr id=\"wsdlReg\">\n");
          out.write("                                <td>");
          if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t\t<td >\n");
          out.write("\t\t\t\t<table cellspacing=\"0\"><tr><td class=\"nopadding\">\n");
          out.write("                                    <input type=\"text\" name=\"wsdlRegText\"\n");
          out.write("                                           id=\"wsdlRegText\" value=\"\"\n");
          out.write("                                           readonly=\"readonly\"/>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("                <td class=\"nopadding\">\n");
          out.write("                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                       style=\"padding-left:30px\"\n");
          out.write("                       onclick=\"showRegistryBrowser('wsdlRegText','/_system/config');\">");
          if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("                <td class=\"nopadding\">\n");
          out.write("                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                       style=\"padding-left:30px\"\n");
          out.write("                       onclick=\"showRegistryBrowser('wsdlRegText','/_system/governance');\">");
          if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr id=\"wsdlResourceTr\">\n");
          out.write("\n");
          out.write("                                ");
          out.write("\n");
          out.write("                                <td style=\"vertical-align:top!important\">\n");
          out.write("                                    \n");
          out.write("                                </td>\n");
          out.write("                                <td >\n");
          out.write("                                    <input type=\"hidden\" id=\"wsdlResourceList\" name=\"wsdlResourceList\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    <br/><br/>\n");
          out.write("                                    <table class=\"styledInner\">\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td style=\"border: solid 1px #ccc !important;\">\n");
          out.write("                                                <div id=\"wsdlResourceAdd\">\n");
          out.write("                                                    <table class=\"normal-nopadding\" cellspacing=\"0\">\n");
          out.write("                                                        <tr>\n");
          out.write("                                                            <td class=\"nopadding\">\n");
          out.write("                                                                <table>\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <td class=\"nopadding\">\n");
          out.write("                                                                            ");
          if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                                            <input type=\"text\" id=\"locationText\"/></td>\n");
          out.write("                                                                        <td class=\"nopadding\">\n");
          out.write("\n");
          out.write("                                                                            ");
          if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                                            <input type=\"text\" readonly=\"readonly\"\n");
          out.write("                                                                                   value=\"\" id=\"wsdl.resource.key\"\n");
          out.write("                                                                                   name=\"wsdl.resource.key\"/>\n");
          out.write("                                                                        </td>\n");
          out.write("                                                                        <td class=\"nopadding\"\n");
          out.write("                                                                            style=\"padding-top: 10px !important\">\n");
          out.write("                                                                            <a href=\"#\"\n");
          out.write("                                                                               class=\"registry-picker-icon-link\"\n");
          out.write("                                                                               onclick=\"showRegistryBrowser('wsdl.resource.key','/_system/config');\">");
          if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                                        </td>\n");
          out.write("                                                                        <td class=\"nopadding\"\n");
          out.write("                                                                            style=\"padding-top: 10px !important\">\n");
          out.write("                                                                            <a href=\"#\"\n");
          out.write("                                                                               class=\"registry-picker-icon-link\"\n");
          out.write("                                                                               onclick=\"showRegistryBrowser('wsdl.resource.key','/_system/governance');\">");
          if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                                        </td>\n");
          out.write("\n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                </table>\n");
          out.write("                                                            </td>\n");
          out.write("                                                        </tr>\n");
          out.write("                                                        <tr>\n");
          out.write("                                                            <td class=\"nopadding\">\n");
          out.write("                                                                <a class=\"icon-link\"\n");
          out.write("                                                                   href=\"#addNameLink\"\n");
          out.write("                                                                   onclick=\"addWsdlResources();\"\n");
          out.write("                                                                   style=\"background-image: url(../admin/images/add.gif);\">");
          if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                                                </a>\n");
          out.write("                                                            </td>\n");
          out.write("                                                        </tr>\n");
          out.write("                                                    </table>\n");
          out.write("\n");
          out.write("                                                </div>\n");
          out.write("                                                <div>\n");
          out.write("                                                    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"styledLeft\"\n");
          out.write("                                                           id=\"wsdlResourceTable\"\n");
          out.write("                                                           style=\"display:none;\">\n");
          out.write("                                                        <thead>\n");
          out.write("                                                        <tr>\n");
          out.write("                                                            <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                            <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                            <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                        </tr>\n");
          out.write("                                                        </thead>\n");
          out.write("                                                        <tbody></tbody>\n");
          out.write("                                                    </table>\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </table>\n");
          out.write("                                </td>\n");
          out.write("                                        ");
          out.write("\n");
          out.write("                            </tr>\n");
          out.write("                </table>\n");
          out.write("                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                            <td colspan=\"3\">\n");
          out.write("                                <table class=\"normal-nopadding\">\n");
          out.write("                                <tr>\n");
          out.write("                                <td width=\"20%\">\n");
          out.write("                                    ");
          if (_jspx_meth_fmt_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                                <td >\n");
          out.write("                                    <div id=\"nameValueAdd\">\n");
          out.write("                                        <a class=\"icon-link\"\n");
          out.write("                                                   href=\"#addNameLink\"\n");
          out.write("                                                   onclick=\"addServiceParams();\"\n");
          out.write("                                                   style=\"background-image: url(../admin/images/add.gif);\">");
          if (_jspx_meth_fmt_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                        <div style=\"clear:both;\"></div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div>\n");
          out.write("                                        <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"styledLeft\"\n");
          out.write("                                               id=\"headerTable\"\n");
          out.write("                                               style=\"display:none;\">\n");
          out.write("                                            <thead>\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                    <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_56((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                    <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_57((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("                                                </tr>\n");
          out.write("                                            </thead>\n");
          out.write("                                            <tbody></tbody>\n");
          out.write("                                        </table>\n");
          out.write("                                    </div>\n");
          out.write("                                </td>\n");
          out.write("                                </tr>\n");
          out.write("                                </table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <table class=\"normal-nopadding\">\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td width=\"20%\">");
          if (_jspx_meth_fmt_message_58((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                            <td><input id=\"serviceGroup\" name=\"serviceGroup\" type=\"text\"\n");
          out.write("                                                       value=\"");
          out.print(serviceGroup);
          out.write("\"/>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <table class=\"normal-nopadding\">\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td width=\"20%\">\n");
          out.write("                                                ");
          if (_jspx_meth_fmt_message_59((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                            <td>");
          out.print(startOnLoadBox);
          out.write("\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <table class=\"normal-nopadding\">\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td width=\"20%\">");
          if (_jspx_meth_fmt_message_60((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                            <td><input id=\"pnnedServers\" name=\"pinnedServers\" type=\"text\"\n");
          out.write("                                                       value=\"");
          out.print(pinnedServers);
          out.write("\"/>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <table class=\"normal-nopadding\">\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td width=\"20%\">");
          if (_jspx_meth_fmt_message_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                                            <td><input id=\"description\" name=\"description\" type=\"text\"\n");
          out.write("                                                       value=\"");
          out.print(description);
          out.write("\"/>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    </table>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("    <br/>\n");
          out.write("    <table width=\"100%\" class=\"styledInner\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-left: 0px;\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td style=\"padding: 0px !important;\">\n");
          out.write("                    <div id=\"transportContent\">\n");
          out.write("                        <table id=\"transportsTable\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"styledInner\" style=\"margin-left: 0px;\">\n");
          out.write("\t\t\t<tr><td><table class=\"normal-nopadding\" style=\"width: auto\">\n");
          out.write("                            ");
          out.print(tbody);
          out.write("\n");
          out.write("\t\t\t</table>\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("                        </table>\n");
          out.write("                       \n");
          out.write("                    </div>\n");
          out.write("                    <input type=\"hidden\" name=\"serviceParams\"/>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("</div>\n");
          out.write("<div id=\"page1\">\n");
          out.write("    <table width=\"100%\" class=\"styledInner\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_63((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <!-- in sequence -->\n");
          out.write("                    <div id=\"inSeq\">\n");
          out.write("                        <div id=\"inSeqDesign\">\n");
          out.write("                            <table id=\"inSeqOptionTable\" class=\"normal\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"inSeqOpNone\" type=\"radio\" name=\"inSeqOp\" value=\"none\"\n");
          out.write("                                               onclick=\"radioClicked('in', null);\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"inSeqOpNone\">");
          if (_jspx_meth_fmt_message_64((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"inSeqOpAnon\" type=\"radio\" name=\"inSeqOp\" value=\"anon\"\n");
          out.write("                                               onclick=\"radioClicked('in', 'AnonAddEdit');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"inSeqOpAnon\">");
          if (_jspx_meth_fmt_message_65((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        ");
 if (anonInAddEdit.equalsIgnoreCase(bundle.getString("create"))) {
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"inAnonAddEdit\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('in');\">");
          out.print(anonInAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 } else {
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"inAnonAddEdit\" style=\"background-image: url(../admin/images/edit.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('in');\">");
          out.print(anonInAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 } 
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\">&nbsp;</td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" style=\"background-image: url(../admin/images/delete.gif);\"\n");
          out.write("                                           id=\"inAnonClear\" onclick=\"anonSeqClear('in');\">");
          if (_jspx_meth_fmt_message_66((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"inSeqOpReg\" type=\"radio\" name=\"inSeqOp\" value=\"registry\"\n");
          out.write("                                               onclick=\"radioClicked('in', 'Registry');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"inSeqOpReg\">");
          if (_jspx_meth_fmt_message_67((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <table id=\"inRegistry\">\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <input type=\"text\" name=\"proxy.in.registry\"\n");
          out.write("                                                           id=\"proxy.in.registry\" value=\"");
          out.print(inRegKey);
          out.write("\"\n");
          out.write("                                                           style=\"width:300px\"\n");
          out.write("                                                           readonly=\"readonly\"/>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.in.registry','/_system/config');\">");
          if (_jspx_meth_fmt_message_68((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.in.registry','/_system/governance');\">");
          if (_jspx_meth_fmt_message_69((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        </table>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"inSeqOpImp\" type=\"radio\" name=\"inSeqOp\" value=\"import\"\n");
          out.write("                                               onclick=\"radioClicked('in', 'ImportSeq');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"inSeqOpImp\">");
          if (_jspx_meth_fmt_message_70((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <select id=\"inImportSeq\" name=\"inImportSeq\">\n");
          out.write("                                            ");
          out.print(inSeqOptions);
          out.write("\n");
          out.write("                                        </select>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            </table>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("<br/>\n");
          out.write("    <table width=\"100%\" class=\"styledInner\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_71((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <!-- endpoint-->\n");
          out.write("                    <div id=\"endpoint\">\n");
          out.write("                        <div id=\"endpointDesign\">\n");
          out.write("                            <table id=\"epOptionTable\" class=\"normal\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"epOpNone\" type=\"radio\" name=\"epOp\" value=\"none\" onclick=\"eprRadioClicked('epOpNone');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"epOpNone\">");
          if (_jspx_meth_fmt_message_72((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"epOpAnon\" type=\"radio\" name=\"epOp\" value=\"anon\"\n");
          out.write("                                               onclick=\"eprRadioClicked('epAnonAddEdit');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"epOpAnon\">");
          if (_jspx_meth_fmt_message_73((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                    ");
 if (anonEpAddEdit.equalsIgnoreCase(bundle.getString("create"))) { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"epAnonAddEdit\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("                                           onclick=\"anonEpAddEdit();\">");
          out.print(anonEpAddEdit);
          out.write("</a>\n");
          out.write("                                    ");
 } else { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"epAnonAddEdit\" style=\"background-image: url(../admin/images/edit.gif);\"\n");
          out.write("                                           onclick=\"anonEpAddEdit();\">");
          out.print(anonEpAddEdit);
          out.write("</a>\n");
          out.write("                                    ");
 } 
          out.write("    \n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\">&nbsp;</td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" style=\"background-image: url(../admin/images/delete.gif);\"\n");
          out.write("                                           id=\"epAnonClear\" onclick=\"anonEpClear();\">");
          if (_jspx_meth_fmt_message_74((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"epOpReg\" type=\"radio\" name=\"epOp\" value=\"registry\"\n");
          out.write("                                               onclick=\"eprRadioClicked('eprRegistry');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"epOpReg\">");
          if (_jspx_meth_fmt_message_75((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <table id=\"eprRegistry\">\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <input type=\"text\" name=\"proxy.epr.registry\"\n");
          out.write("                                                           id=\"proxy.epr.registry\" value=\"");
          out.print(eprRegKey);
          out.write("\"\n");
          out.write("                                                           style=\"width:300px\"\n");
          out.write("                                                           readonly=\"readonly\" />\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.epr.registry','/_system/config')\">");
          if (_jspx_meth_fmt_message_76((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.epr.registry','/_system/governance')\">");
          if (_jspx_meth_fmt_message_77((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        </table>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"epOpImp\" type=\"radio\" name=\"epOp\" value=\"import\"\n");
          out.write("                                               onclick=\"eprRadioClicked('importEp');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"epOpImp\">");
          if (_jspx_meth_fmt_message_78((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <select id=\"importEp\" name=\"importEp\">\n");
          out.write("                                            ");
          out.print(epOptions);
          out.write("\n");
          out.write("                                        </select>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                </tr>\n");
          out.write("                            </table>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("</div>                                      \n");
          out.write("<div id=\"page2\">\n");
          out.write("    <table width=\"100%\" class=\"styledInner\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_79((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <div id=\"outSeq\">\n");
          out.write("                        <div id=\"outSeqDesign\">\n");
          out.write("                            <table id=\"outSeqOptionTable\" class=\"normal\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"outSeqOpNone\" type=\"radio\" name=\"outSeqOp\" value=\"none\"\n");
          out.write("                                               onclick=\"radioClicked('out', null);\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"epOpImp\">");
          if (_jspx_meth_fmt_message_80((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\"></td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"outSeqOpAnon\" type=\"radio\" name=\"outSeqOp\" value=\"anon\"\n");
          out.write("                                               onclick=\"radioClicked('out', 'AnonAddEdit');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"outSeqOpAnon\">");
          if (_jspx_meth_fmt_message_81((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        ");
 if (anonOutAddEdit.equalsIgnoreCase(bundle.getString("create"))) { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"outAnonAddEdit\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('out');\">");
          out.print(anonOutAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 } else { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"outAnonAddEdit\" style=\"background-image: url(../admin/images/edit.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('out');\">");
          out.print(anonOutAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 } 
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\">&nbsp;</td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" style=\"background-image: url(../admin/images/delete.gif);\"\n");
          out.write("                                           id=\"outAnonClear\" onclick=\"anonSeqClear('out');\">");
          if (_jspx_meth_fmt_message_82((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"outSeqOpReg\" type=\"radio\" name=\"outSeqOp\" value=\"registry\"\n");
          out.write("                                               onclick=\"radioClicked('out', 'Registry');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"outSeqOpReg\">");
          if (_jspx_meth_fmt_message_83((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <table id=\"outRegistry\" class=\"normal-nopadding\">\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <input type=\"text\" name=\"proxy.out.registry\"\n");
          out.write("                                                           id=\"proxy.out.registry\" value=\"");
          out.print(outRegkey);
          out.write("\"\n");
          out.write("                                                           style=\"width:300px\"\n");
          out.write("                                                           readonly=\"readonly\"/>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.out.registry','/_system/config')\">");
          if (_jspx_meth_fmt_message_84((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.out.registry','/_system/governance')\">");
          if (_jspx_meth_fmt_message_85((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        </table>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"outSeqOpImp\" type=\"radio\" name=\"outSeqOp\" value=\"import\"\n");
          out.write("                                               onclick=\"radioClicked('out', 'ImportSeq');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"outSeqOpImp\">");
          if (_jspx_meth_fmt_message_86((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <select id=\"outImportSeq\" name=\"outImportSeq\">\n");
          out.write("                                            ");
          out.print(outSeqOptions);
          out.write("\n");
          out.write("                                        </select>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            </table>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("<br/>\n");
          out.write("    <table width=\"100%\" class=\"styledInner\">\n");
          out.write("        <thead>\n");
          out.write("            <tr>\n");
          out.write("                <th>");
          if (_jspx_meth_fmt_message_87((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("            </tr>\n");
          out.write("        </thead>\n");
          out.write("        <tbody>\n");
          out.write("            <tr>\n");
          out.write("                <td>\n");
          out.write("                    <div id=\"faultSeq\">\n");
          out.write("                        <div id=\"faultSeqDesign\">\n");
          out.write("                            <table id=\"faultSeqOptionTable\" class=\"normal\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"faultSeqOpNone\" type=\"radio\" name=\"faultSeqOp\" value=\"none\"\n");
          out.write("                                               onclick=\"radioClicked('fault', null);\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"faultSeqOpNone\"> ");
          if (_jspx_meth_fmt_message_88((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"faultSeqOpAnon\" type=\"radio\" name=\"faultSeqOp\" value=\"anon\"\n");
          out.write("                                               onclick=\"hideOtherSeqOp('fault', 'ImportSeq');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"faultSeqOpAnon\">");
          if (_jspx_meth_fmt_message_89((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        ");
 if (anonFaultAddEdit.equalsIgnoreCase(bundle.getString("create"))) { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"faultAnonAddEdit\" style=\"background-image: url(../admin/images/add.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('fault');\">");
          out.print(anonFaultAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 } else { 
          out.write("\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" id=\"faultAnonAddEdit\" style=\"background-image: url(../admin/images/edit.gif);\"\n");
          out.write("                                           onclick=\"anonSeqAddEdit('fault');\">");
          out.print(anonFaultAddEdit);
          out.write("</a>\n");
          out.write("                                        ");
 }
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td class=\"nopadding\">&nbsp;</td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <a href=\"#\" class=\"icon-link\" style=\"background-image: url(../admin/images/delete.gif);\"\n");
          out.write("                                           id=\"faultAnonClear\" onclick=\"anonSeqClear('fault');\">");
          if (_jspx_meth_fmt_message_90((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"faultSeqOpReg\" type=\"radio\" name=\"faultSeqOp\" value=\"registry\"\n");
          out.write("                                               onclick=\"radioClicked('fault', 'Registry');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"faultSeqOpReg\">");
          if (_jspx_meth_fmt_message_91((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <table id=\"faultRegistry\">\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <input type=\"text\" name=\"proxy.fault.registry\"\n");
          out.write("                                                           id=\"proxy.fault.registry\" value=\"");
          out.print(faultRegKey);
          out.write("\"\n");
          out.write("                                                           style=\"width:300px\"\n");
          out.write("                                                           readonly=\"readonly\"/>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.fault.registry','/_system/config')\">");
          if (_jspx_meth_fmt_message_92((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td class=\"nopadding\">\n");
          out.write("                                                    <a href=\"#\" class=\"registry-picker-icon-link\"\n");
          out.write("                                                       style=\"padding-left:40px\"\n");
          out.write("                                                       onclick=\"showRegistryBrowserWithoutLocalEntries('proxy.fault.registry','/_system/governance')\">");
          if (_jspx_meth_fmt_message_93((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        </table>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                                <tr>\n");
          out.write("                                    <td class=\"nopadding\">\n");
          out.write("                                        <input id=\"faultSeqOpImp\" type=\"radio\" name=\"faultSeqOp\" value=\"import\"\n");
          out.write("                                               onclick=\"radioClicked('fault', 'ImportSeq');\"/>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\"><label for=\"faultSeqOpImp\">");
          if (_jspx_meth_fmt_message_94((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("                                    <td style=\"vertical-align:middle;\" class=\"nopadding\">\n");
          out.write("                                        <select id=\"faultImportSeq\" name=\"faultImportSeq\">\n");
          out.write("                                            ");
          out.print(faultSeqOptions);
          out.write("\n");
          out.write("                                        </select>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            </table>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        </tbody>\n");
          out.write("    </table>\n");
          out.write("</div>\n");
          out.write("</td></tr></table>\n");
          out.write("</td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("    <td class=\"buttonRow\">\n");
          out.write("        <input id=\"backBtn\" type=\"button\" value=\"<");
          if (_jspx_meth_fmt_message_95((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\" onclick=\"showBackPage();\"/>\n");
          out.write("        <input id=\"saveBtn\" type=\"submit\" value=\"");
          if (_jspx_meth_fmt_message_96((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\" onclick=\"saveData();return false;\" disabled=\"disabled\"/>\n");
          out.write("        <input id=\"nextBtn\" type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_97((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write(">\" class=\"button\" onclick=\"showNextPage();\"/>\n");
          out.write("        <input id=\"cancelBtn\" type=\"button\" value=\"");
          if (_jspx_meth_fmt_message_98((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" class=\"button\" onclick=\"cancelData();return false\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("</tbody>\n");
          out.write("</table>\n");
          out.write("</form>\n");
          out.write("</div>\n");
          out.write("</div>\n");
          out.write("\n");
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
    _jspx_th_fmt_message_0.setKey("create");
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
    _jspx_th_fmt_message_1.setKey("create");
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
    _jspx_th_fmt_message_2.setKey("create");
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
    _jspx_th_fmt_message_3.setKey("create");
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
    _jspx_th_fmt_message_4.setKey("create");
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
    _jspx_th_fmt_message_5.setKey("create");
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
    _jspx_th_fmt_message_6.setKey("create");
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
    _jspx_th_fmt_message_7.setKey("create");
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
    _jspx_th_fmt_message_8.setKey("anon.edit");
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
    _jspx_th_fmt_message_9.setKey("anon.edit");
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
    _jspx_th_fmt_message_10.setKey("anon.edit");
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
    _jspx_th_fmt_message_11.setKey("empty.key.or.value");
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
    _jspx_th_fmt_message_12.setKey("parameter.already.exists");
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
    _jspx_th_fmt_message_13.setKey("empty.key.or.value");
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
    _jspx_th_fmt_message_14.setKey("confirm.parameter.deletion");
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
    _jspx_th_fmt_message_15.setKey("confirm.wsdlresource.deletion");
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
    _jspx_th_fmt_message_16.setKey("resource.already.exists");
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
    _jspx_th_fmt_message_17.setKey("empty.location.or.key");
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
    _jspx_th_fmt_message_18.setKey("anon.edit");
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
    _jspx_th_fmt_message_19.setKey("anon.edit");
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
    _jspx_th_fmt_message_20.setKey("anon.edit");
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
    _jspx_th_fmt_message_21.setKey("anon.edit");
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
    _jspx_th_fmt_message_22.setKey("design");
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
    _jspx_th_fmt_message_23.setKey("switch.to.source.view");
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
    _jspx_th_fmt_message_24.setKey("proxy.service.page0");
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
    _jspx_th_fmt_message_25.setKey("proxy.service.name");
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
    _jspx_th_fmt_message_26.setKey("proxy.service.name");
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
    _jspx_th_fmt_message_27.setKey("proxy.service.page1");
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
    _jspx_th_fmt_message_28.setKey("proxy.service.name");
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
    _jspx_th_fmt_message_29.setKey("proxy.service.page1.desc");
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
    _jspx_th_fmt_message_30.setKey("proxy.service.page2");
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
    _jspx_th_fmt_message_31.setKey("proxy.service.name");
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
    _jspx_th_fmt_message_32.setKey("proxy.service.page2.desc");
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
    _jspx_th_fmt_message_33.setKey("general.settings");
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
    _jspx_th_fmt_message_34.setKey("publishing.wsdl");
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
    _jspx_th_fmt_message_35.setKey("select.inseq.none");
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
    _jspx_th_fmt_message_36.setKey("specify.in.line");
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
    _jspx_th_fmt_message_37.setKey("specify.source.url");
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
    _jspx_th_fmt_message_38.setKey("pick.from.registry");
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
    _jspx_th_fmt_message_39.setKey("wsdl.inline");
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
    _jspx_th_fmt_message_40.setKey("wsdl.uri");
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
    _jspx_th_fmt_message_41.setKey("wsdl.refkey");
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
    _jspx_th_fmt_message_42.setKey("conf.registry");
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
    _jspx_th_fmt_message_43.setKey("gov.registry");
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
    _jspx_th_fmt_message_44.setKey("wsdl.resource");
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
    _jspx_th_fmt_message_45.setKey("wsdl.resource.location");
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
    _jspx_th_fmt_message_46.setKey("wsdl.resource.key");
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
    _jspx_th_fmt_message_47.setKey("conf.registry");
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
    _jspx_th_fmt_message_48.setKey("gov.registry");
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
    _jspx_th_fmt_message_49.setKey("wsdl.resource.add");
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
    _jspx_th_fmt_message_50.setKey("location");
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
    _jspx_th_fmt_message_51.setKey("key");
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
    _jspx_th_fmt_message_52.setKey("param.action");
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
    _jspx_th_fmt_message_53.setKey("service.parameters");
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
    _jspx_th_fmt_message_54.setKey("service.parameters.add");
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
    _jspx_th_fmt_message_55.setKey("param.name");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
    return false;
  }

  private boolean _jspx_meth_fmt_message_56(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_56.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_56.setKey("param.value");
    int _jspx_eval_fmt_message_56 = _jspx_th_fmt_message_56.doStartTag();
    if (_jspx_th_fmt_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
    return false;
  }

  private boolean _jspx_meth_fmt_message_57(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_57.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_57.setKey("param.action");
    int _jspx_eval_fmt_message_57 = _jspx_th_fmt_message_57.doStartTag();
    if (_jspx_th_fmt_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
    return false;
  }

  private boolean _jspx_meth_fmt_message_58(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_58 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_58.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_58.setKey("service.group");
    int _jspx_eval_fmt_message_58 = _jspx_th_fmt_message_58.doStartTag();
    if (_jspx_th_fmt_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
    return false;
  }

  private boolean _jspx_meth_fmt_message_59(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_59 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_59.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_59.setKey("dont.load.service.on.startup");
    int _jspx_eval_fmt_message_59 = _jspx_th_fmt_message_59.doStartTag();
    if (_jspx_th_fmt_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
    return false;
  }

  private boolean _jspx_meth_fmt_message_60(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_60 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_60.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_60.setKey("pinned.servers.separated.by.comma.or.space");
    int _jspx_eval_fmt_message_60 = _jspx_th_fmt_message_60.doStartTag();
    if (_jspx_th_fmt_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
    return false;
  }

  private boolean _jspx_meth_fmt_message_61(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_61 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_61.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_61.setKey("description");
    int _jspx_eval_fmt_message_61 = _jspx_th_fmt_message_61.doStartTag();
    if (_jspx_th_fmt_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
    return false;
  }

  private boolean _jspx_meth_fmt_message_62(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_62.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_62.setKey("transport.settings");
    int _jspx_eval_fmt_message_62 = _jspx_th_fmt_message_62.doStartTag();
    if (_jspx_th_fmt_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
    return false;
  }

  private boolean _jspx_meth_fmt_message_63(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_63 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_63.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_63.setKey("in.sequence.options");
    int _jspx_eval_fmt_message_63 = _jspx_th_fmt_message_63.doStartTag();
    if (_jspx_th_fmt_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
    return false;
  }

  private boolean _jspx_meth_fmt_message_64(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_64.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_64.setKey("select.inseq.none");
    int _jspx_eval_fmt_message_64 = _jspx_th_fmt_message_64.doStartTag();
    if (_jspx_th_fmt_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
    return false;
  }

  private boolean _jspx_meth_fmt_message_65(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_65 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_65.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_65.setKey("define.inline");
    int _jspx_eval_fmt_message_65 = _jspx_th_fmt_message_65.doStartTag();
    if (_jspx_th_fmt_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
    return false;
  }

  private boolean _jspx_meth_fmt_message_66(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_66 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_66.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_66.setKey("clear");
    int _jspx_eval_fmt_message_66 = _jspx_th_fmt_message_66.doStartTag();
    if (_jspx_th_fmt_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
    return false;
  }

  private boolean _jspx_meth_fmt_message_67(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_67 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_67.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_67.setKey("pick.from.registry");
    int _jspx_eval_fmt_message_67 = _jspx_th_fmt_message_67.doStartTag();
    if (_jspx_th_fmt_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
    return false;
  }

  private boolean _jspx_meth_fmt_message_68(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_68 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_68.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_68.setKey("conf.registry");
    int _jspx_eval_fmt_message_68 = _jspx_th_fmt_message_68.doStartTag();
    if (_jspx_th_fmt_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
    return false;
  }

  private boolean _jspx_meth_fmt_message_69(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_69.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_69.setKey("gov.registry");
    int _jspx_eval_fmt_message_69 = _jspx_th_fmt_message_69.doStartTag();
    if (_jspx_th_fmt_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
    return false;
  }

  private boolean _jspx_meth_fmt_message_70(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_70 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_70.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_70.setKey("use.existing.sequence");
    int _jspx_eval_fmt_message_70 = _jspx_th_fmt_message_70.doStartTag();
    if (_jspx_th_fmt_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
    return false;
  }

  private boolean _jspx_meth_fmt_message_71(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_71.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_71.setKey("endpoint.options");
    int _jspx_eval_fmt_message_71 = _jspx_th_fmt_message_71.doStartTag();
    if (_jspx_th_fmt_message_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
    return false;
  }

  private boolean _jspx_meth_fmt_message_72(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_72 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_72.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_72.setKey("select.inseq.none");
    int _jspx_eval_fmt_message_72 = _jspx_th_fmt_message_72.doStartTag();
    if (_jspx_th_fmt_message_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
    return false;
  }

  private boolean _jspx_meth_fmt_message_73(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_73 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_73.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_73.setKey("define.inline");
    int _jspx_eval_fmt_message_73 = _jspx_th_fmt_message_73.doStartTag();
    if (_jspx_th_fmt_message_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
    return false;
  }

  private boolean _jspx_meth_fmt_message_74(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_74 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_74.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_74.setKey("clear");
    int _jspx_eval_fmt_message_74 = _jspx_th_fmt_message_74.doStartTag();
    if (_jspx_th_fmt_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
    return false;
  }

  private boolean _jspx_meth_fmt_message_75(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_75 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_75.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_75.setKey("pick.from.registry");
    int _jspx_eval_fmt_message_75 = _jspx_th_fmt_message_75.doStartTag();
    if (_jspx_th_fmt_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
    return false;
  }

  private boolean _jspx_meth_fmt_message_76(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_76.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_76.setKey("conf.registry");
    int _jspx_eval_fmt_message_76 = _jspx_th_fmt_message_76.doStartTag();
    if (_jspx_th_fmt_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
    return false;
  }

  private boolean _jspx_meth_fmt_message_77(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_77 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_77.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_77.setKey("gov.registry");
    int _jspx_eval_fmt_message_77 = _jspx_th_fmt_message_77.doStartTag();
    if (_jspx_th_fmt_message_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
    return false;
  }

  private boolean _jspx_meth_fmt_message_78(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_78 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_78.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_78.setKey("use.existing.endpoint");
    int _jspx_eval_fmt_message_78 = _jspx_th_fmt_message_78.doStartTag();
    if (_jspx_th_fmt_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
    return false;
  }

  private boolean _jspx_meth_fmt_message_79(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_79 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_79.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_79.setKey("out.sequence.options");
    int _jspx_eval_fmt_message_79 = _jspx_th_fmt_message_79.doStartTag();
    if (_jspx_th_fmt_message_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
    return false;
  }

  private boolean _jspx_meth_fmt_message_80(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_80 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_80.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_80.setKey("select.inseq.none");
    int _jspx_eval_fmt_message_80 = _jspx_th_fmt_message_80.doStartTag();
    if (_jspx_th_fmt_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
    return false;
  }

  private boolean _jspx_meth_fmt_message_81(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_81 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_81.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_81.setKey("define.inline");
    int _jspx_eval_fmt_message_81 = _jspx_th_fmt_message_81.doStartTag();
    if (_jspx_th_fmt_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
    return false;
  }

  private boolean _jspx_meth_fmt_message_82(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_82 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_82.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_82.setKey("clear");
    int _jspx_eval_fmt_message_82 = _jspx_th_fmt_message_82.doStartTag();
    if (_jspx_th_fmt_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
    return false;
  }

  private boolean _jspx_meth_fmt_message_83(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_83 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_83.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_83.setKey("pick.from.registry");
    int _jspx_eval_fmt_message_83 = _jspx_th_fmt_message_83.doStartTag();
    if (_jspx_th_fmt_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
    return false;
  }

  private boolean _jspx_meth_fmt_message_84(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_84 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_84.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_84.setKey("conf.registry");
    int _jspx_eval_fmt_message_84 = _jspx_th_fmt_message_84.doStartTag();
    if (_jspx_th_fmt_message_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
    return false;
  }

  private boolean _jspx_meth_fmt_message_85(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_85 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_85.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_85.setKey("gov.registry");
    int _jspx_eval_fmt_message_85 = _jspx_th_fmt_message_85.doStartTag();
    if (_jspx_th_fmt_message_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
    return false;
  }

  private boolean _jspx_meth_fmt_message_86(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_86 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_86.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_86.setKey("use.existing.sequence");
    int _jspx_eval_fmt_message_86 = _jspx_th_fmt_message_86.doStartTag();
    if (_jspx_th_fmt_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
    return false;
  }

  private boolean _jspx_meth_fmt_message_87(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_87 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_87.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_87.setKey("fault.sequence.options");
    int _jspx_eval_fmt_message_87 = _jspx_th_fmt_message_87.doStartTag();
    if (_jspx_th_fmt_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
    return false;
  }

  private boolean _jspx_meth_fmt_message_88(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_88 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_88.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_88.setKey("select.inseq.none");
    int _jspx_eval_fmt_message_88 = _jspx_th_fmt_message_88.doStartTag();
    if (_jspx_th_fmt_message_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
    return false;
  }

  private boolean _jspx_meth_fmt_message_89(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_89 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_89.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_89.setKey("define.inline");
    int _jspx_eval_fmt_message_89 = _jspx_th_fmt_message_89.doStartTag();
    if (_jspx_th_fmt_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
    return false;
  }

  private boolean _jspx_meth_fmt_message_90(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_90 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_90.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_90.setKey("clear");
    int _jspx_eval_fmt_message_90 = _jspx_th_fmt_message_90.doStartTag();
    if (_jspx_th_fmt_message_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
    return false;
  }

  private boolean _jspx_meth_fmt_message_91(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_91 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_91.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_91.setKey("pick.from.registry");
    int _jspx_eval_fmt_message_91 = _jspx_th_fmt_message_91.doStartTag();
    if (_jspx_th_fmt_message_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
    return false;
  }

  private boolean _jspx_meth_fmt_message_92(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_92 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_92.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_92.setKey("conf.registry");
    int _jspx_eval_fmt_message_92 = _jspx_th_fmt_message_92.doStartTag();
    if (_jspx_th_fmt_message_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
    return false;
  }

  private boolean _jspx_meth_fmt_message_93(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_93 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_93.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_93.setKey("gov.registry");
    int _jspx_eval_fmt_message_93 = _jspx_th_fmt_message_93.doStartTag();
    if (_jspx_th_fmt_message_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
    return false;
  }

  private boolean _jspx_meth_fmt_message_94(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_94 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_94.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_94.setKey("use.existing.sequence");
    int _jspx_eval_fmt_message_94 = _jspx_th_fmt_message_94.doStartTag();
    if (_jspx_th_fmt_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
    return false;
  }

  private boolean _jspx_meth_fmt_message_95(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_95 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_95.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_95.setKey("back");
    int _jspx_eval_fmt_message_95 = _jspx_th_fmt_message_95.doStartTag();
    if (_jspx_th_fmt_message_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
    return false;
  }

  private boolean _jspx_meth_fmt_message_96(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_96 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_96.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_96.setKey("finish");
    int _jspx_eval_fmt_message_96 = _jspx_th_fmt_message_96.doStartTag();
    if (_jspx_th_fmt_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
    return false;
  }

  private boolean _jspx_meth_fmt_message_97(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_97 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_97.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_97.setKey("next");
    int _jspx_eval_fmt_message_97 = _jspx_th_fmt_message_97.doStartTag();
    if (_jspx_th_fmt_message_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
    return false;
  }

  private boolean _jspx_meth_fmt_message_98(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_98 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_98.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_98.setKey("cancel");
    int _jspx_eval_fmt_message_98 = _jspx_th_fmt_message_98.doStartTag();
    if (_jspx_th_fmt_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
    return false;
  }
}
