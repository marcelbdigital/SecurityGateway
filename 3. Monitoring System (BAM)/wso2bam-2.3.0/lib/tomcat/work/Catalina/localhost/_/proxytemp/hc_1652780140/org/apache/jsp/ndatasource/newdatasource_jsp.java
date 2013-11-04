package org.apache.jsp.ndatasource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.wso2.carbon.ndatasource.ui.NDataSourceClientConstants;
import org.wso2.carbon.ndatasource.ui.config.DSXMLConfiguration;
import org.wso2.carbon.ndatasource.ui.config.RDBMSDSXMLConfiguration;
import org.wso2.carbon.ndatasource.ui.stub.core.services.xsd.WSDataSourceMetaInfo_WSDataSourceDefinition;
import org.wso2.carbon.ndatasource.ui.stub.core.services.xsd.WSDataSourceMetaInfo;
import org.wso2.carbon.ndatasource.ui.stub.core.services.xsd.WSDataSourceInfo;
import org.wso2.carbon.ndatasource.ui.stub.core.xsd.JNDIConfig;
import org.wso2.carbon.ndatasource.ui.stub.core.xsd.JNDIConfig_EnvEntry;
import org.wso2.carbon.ndatasource.ui.NDataSourceAdminServiceClient;
import org.wso2.carbon.ndatasource.ui.NDataSourceHelper;
import org.wso2.carbon.ndatasource.ui.config.RDBMSDSXMLConfiguration;
import org.wso2.carbon.ndatasource.ui.config.RDBMSDSXMLConfiguration.DataSourceProperty;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public final class newdatasource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"global-params.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"dscommon.js\"></script>\n");
      out.write("<!--Yahoo includes for dom event handling-->\n");
      out.write("<script src=\"../yui/build/yahoo-dom-event/yahoo-dom-event.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!--EditArea javascript syntax hylighter -->\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"../editarea/edit_area_full.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../ajax/js/prototype.js\"></script>\n");
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_bundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _jspx_tagPool_fmt_bundle_basename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      _jspx_th_fmt_bundle_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_bundle_0.setParent(null);
      _jspx_th_fmt_bundle_0.setBasename("org.wso2.carbon.ndatasource.ui.i18n.Resources");
      int _jspx_eval_fmt_bundle_0 = _jspx_th_fmt_bundle_0.doStartTag();
      if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_bundle_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_bundle_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_bundle_0.doInitBody();
        }
        do {
          out.write('\n');

	String dsProvider = "default"; 	
	WSDataSourceInfo dataSourceInfo = null;
	WSDataSourceMetaInfo dataSourceMetaInfo = null;
	WSDataSourceMetaInfo_WSDataSourceDefinition dataSourceDefinition = null;
		
	String dataSourceName = request.getParameter("dsName");
	String description = request.getParameter("description");
	boolean editMode = (("true".equals(request.getParameter("edit"))) ? true : false );
	String type = "RDBMS";
	boolean isSystem = false;
	String dataSourceclassName = null;
	String dsproviderPropertiesEditMode = null;
	String givenDataSourceProps = null;
	String driverClassName = null;
	String url = null;
	String username = null;
	String password = null;
	String jndiConfigName = null;
	String givenJNDIProps = null;
	String jndiPropertiesEditMode = null;
	boolean isUseDataSourceFactory = false;
	Boolean defaultAutoCommit = false;
	Boolean defaultReadOnly = false;
	String defaultTransactionIsolation = null;
	String defaultCatalog = null;
	Integer maxActive = null;
	Integer minIdle = null;
	Integer maxIdle = null;
	Integer initialSize = null;
	Integer maxWait = null;
	Boolean testOnBorrow = false;
	Boolean testOnReturn = false;
	Boolean testWhileIdle = false;
	String validationquery = null;
	String validatorClassName = null;
	Integer timeBetweenEvictionRunsMillis = null;
	Integer numTestsPerEvictionRun = null;
	Integer minEvictableIdleTimeMillis = null;
	Boolean accessToUnderlyingConnectionAllowed = false;
	Boolean removeAbandoned = false;
	Integer removeAbandonedTimeout = null;
	Boolean logAbandoned = false;
	String connectionProperties = null;
	String initSQL = null;
	String jdbcInterceptors = null;
	Long validationInterval = null;
	Boolean fairQueue = false;
	Boolean jmxEnabled = false;
	Integer abandonWhenPercentageFull = null;
	Long maxAge = null;
	Boolean useEquals =false;
	Integer suspectTimeout = null; 
	Boolean alternateUsernameAllowed = false;
	
	if (dataSourceName != null && !dataSourceName.equals("")) {
		NDataSourceAdminServiceClient client = NDataSourceAdminServiceClient.getInstance(config, session);
		dataSourceInfo = client.getDataSource(dataSourceName);
	} else {
		dataSourceName = "";
	}
	//edit mode
	if (dataSourceInfo != null && editMode) {
		dataSourceMetaInfo = dataSourceInfo.getDsMetaInfo();
		dataSourceDefinition = dataSourceMetaInfo.getDefinition();
		type = dataSourceMetaInfo.getDefinition().getType();
		type = (type == null) ? "" : type;
		isSystem = dataSourceMetaInfo.getSystem();
		description = dataSourceMetaInfo.getDescription();
				
		String configuration = dataSourceDefinition.getDsXMLConfiguration();
				
		if (type.equals("RDBMS")) {
			RDBMSDSXMLConfiguration rdbmsCon = (RDBMSDSXMLConfiguration)NDataSourceHelper.unMarshal(type, configuration);
			dataSourceclassName = rdbmsCon.getDataSourceClassName();
			if (dataSourceclassName != null && !("".equals(dataSourceclassName))) {
				dsProvider = "External Data Source";
				dsproviderPropertiesEditMode = "true";
				List <DataSourceProperty> dataSourceProperties = rdbmsCon.getDataSourceProps();
				Iterator<DataSourceProperty> iterator = dataSourceProperties.iterator();
				DataSourceProperty currentProperty = iterator.next();
				givenDataSourceProps = currentProperty.getName() + "," + currentProperty.getValue();
				while (iterator.hasNext()) {
					currentProperty = iterator.next();
					givenDataSourceProps = givenDataSourceProps + "::" + currentProperty.getName() + "," + currentProperty.getValue();
				}
			} else {
				dsProvider = "default";
				driverClassName = rdbmsCon.getDriverClassName();
				url = rdbmsCon.getUrl();
				username = rdbmsCon.getUsername();
				password = rdbmsCon.getPassword().getValue();
			}
			//datasource properties
			defaultAutoCommit = rdbmsCon.getDefaultAutoCommit();
			defaultReadOnly = rdbmsCon.getDefaultReadOnly();
			defaultTransactionIsolation = rdbmsCon.getDefaultTransactionIsolation();
			defaultCatalog = rdbmsCon.getDefaultCatalog();
			maxActive = rdbmsCon.getMaxActive();
			minIdle = rdbmsCon.getMinIdle();
			maxIdle = rdbmsCon.getMaxIdle();
			initialSize = rdbmsCon.getInitialSize();
			maxWait = rdbmsCon.getMaxWait();
			testOnBorrow = rdbmsCon.getTestOnBorrow();
			testOnReturn = rdbmsCon.getTestOnReturn();
			testWhileIdle = rdbmsCon.getTestWhileIdle();
			validationquery = rdbmsCon.getValidationQuery();
			validatorClassName = rdbmsCon.getValidatorClassName();;
			timeBetweenEvictionRunsMillis = rdbmsCon.getTimeBetweenEvictionRunsMillis();
			numTestsPerEvictionRun = rdbmsCon.getNumTestsPerEvictionRun();
			minEvictableIdleTimeMillis = rdbmsCon.getMinEvictableIdleTimeMillis();
			accessToUnderlyingConnectionAllowed = rdbmsCon.getAccessToUnderlyingConnectionAllowed();
			removeAbandoned = rdbmsCon.getRemoveAbandoned();
			removeAbandonedTimeout = rdbmsCon.getRemoveAbandonedTimeout();
			logAbandoned = rdbmsCon.getLogAbandoned();
			connectionProperties = rdbmsCon.getConnectionProperties();
			initSQL = rdbmsCon.getInitSQL();
			jdbcInterceptors = rdbmsCon.getJdbcInterceptors();
			validationInterval = rdbmsCon.getValidationInterval();
			fairQueue = rdbmsCon.getFairQueue(); 
			jmxEnabled = rdbmsCon.getJmxEnabled();
			abandonWhenPercentageFull = rdbmsCon.getAbandonWhenPercentageFull();
			maxAge = rdbmsCon.getMaxAge();
			useEquals = rdbmsCon.getUseEquals();
			suspectTimeout = rdbmsCon.getSuspectTimeout();
			alternateUsernameAllowed = rdbmsCon.getAlternateUsernameAllowed(); 
		}
	
		//load JNDI configuration 
		JNDIConfig jndiConfig = dataSourceMetaInfo.getJndiConfig();
		if (jndiConfig != null) {
			jndiConfigName = jndiConfig.getName();
			isUseDataSourceFactory = jndiConfig.getUseDataSourceFactory();
			JNDIConfig_EnvEntry[] envEntries = jndiConfig.getEnvironment();
			if (envEntries != null && envEntries.length > 0) {
				if (envEntries[0] != null){
					jndiPropertiesEditMode = "true";
					givenJNDIProps = envEntries[0].getName() + "," + envEntries[0].getValue();
				}
				for (int i = 1; i < envEntries.length; i++) {
					givenJNDIProps = givenJNDIProps + "::" + envEntries[i].getName() + "," + envEntries[i].getValue();
				} 
			}  
		}
	}
	
	//Data Source Provider is changed 
	if (request.getParameter("dsProvider") != null) {
		dsProvider = request.getParameter("dsProvider");
	}
	dsProvider = (dsProvider == null) ? "default" : dsProvider;
	
	description = (description == null) ? "" : description;
	dataSourceclassName = (dataSourceclassName == null) ? "" : dataSourceclassName;
	driverClassName = (driverClassName == null) ? "" : driverClassName;
	url = (url == null) ? "" : url;
	username = (username == null) ? "" : username;
	password = (password == null) ? "" : password;
	jndiConfigName = (jndiConfigName == null) ? "" : jndiConfigName;
	defaultCatalog = (defaultCatalog == null) ? "" : defaultCatalog;
	validationquery = (validationquery == null) ? "" : validationquery;
	validatorClassName = (validatorClassName == null) ? "" : validatorClassName;
	connectionProperties = (connectionProperties == null) ? "" : connectionProperties;
	initSQL = (initSQL == null) ? "" : initSQL;
	jdbcInterceptors = (jdbcInterceptors == null) ? "" : jdbcInterceptors;
	defaultAutoCommit = (defaultAutoCommit == null) ? false : defaultAutoCommit;
	defaultReadOnly = (defaultReadOnly == null) ? false : defaultReadOnly;
	testOnBorrow = (testOnBorrow == null) ? false : testOnBorrow;
	testOnReturn = (testOnReturn == null) ? false : testOnReturn;
	testWhileIdle = (testWhileIdle == null) ? false : testWhileIdle;
	accessToUnderlyingConnectionAllowed = (accessToUnderlyingConnectionAllowed == null) ? false : accessToUnderlyingConnectionAllowed;
	removeAbandoned = (removeAbandoned == null) ? false : removeAbandoned;
	logAbandoned = (logAbandoned == null) ? false : logAbandoned;
	fairQueue = (fairQueue == null) ? false : fairQueue;
	jmxEnabled = (jmxEnabled == null) ? false : jmxEnabled;
	alternateUsernameAllowed = (alternateUsernameAllowed == null) ? false : alternateUsernameAllowed;
	useEquals = (useEquals == null) ? false : useEquals;
	
          out.write('\n');
if (editMode) { 
          out.write('\n');
          out.write('	');
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_0 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_0.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_0.setLabel("edit.data.source");
          _jspx_th_carbon_breadcrumb_0.setResourceBundle("org.wso2.carbon.ndatasource.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_0.setTopPage(false);
          _jspx_th_carbon_breadcrumb_0.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_0 = _jspx_th_carbon_breadcrumb_0.doStartTag();
          if (_jspx_th_carbon_breadcrumb_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_0);
          out.write('\n');
          out.write(' ');
} else { 
          out.write("\n");
          out.write(" \t");
          //  carbon:breadcrumb
          org.wso2.carbon.ui.taglibs.Breadcrumb _jspx_th_carbon_breadcrumb_1 = (org.wso2.carbon.ui.taglibs.Breadcrumb) _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.get(org.wso2.carbon.ui.taglibs.Breadcrumb.class);
          _jspx_th_carbon_breadcrumb_1.setPageContext(_jspx_page_context);
          _jspx_th_carbon_breadcrumb_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
          _jspx_th_carbon_breadcrumb_1.setLabel("new.data.source");
          _jspx_th_carbon_breadcrumb_1.setResourceBundle("org.wso2.carbon.ndatasource.ui.i18n.Resources");
          _jspx_th_carbon_breadcrumb_1.setTopPage(false);
          _jspx_th_carbon_breadcrumb_1.setRequest(request);
          int _jspx_eval_carbon_breadcrumb_1 = _jspx_th_carbon_breadcrumb_1.doStartTag();
          if (_jspx_th_carbon_breadcrumb_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_1);
            return;
          }
          _jspx_tagPool_carbon_breadcrumb_topPage_resourceBundle_request_label_nobody.reuse(_jspx_th_carbon_breadcrumb_1);
          out.write('\n');
          out.write(' ');
} 
          out.write("\n");
          out.write(" <script type=\"text/javascript\">\n");
          out.write(" function addJNDIProps() {\n");
          out.write("    //check to see if there are empty fields left\n");
          out.write("    var theTable = document.getElementById('jndiPropertyTable');\n");
          out.write("    var inputs = theTable.getElementsByTagName('input');\n");
          out.write("    for(var i=0; i<inputs.length; i++){\n");
          out.write("        if(inputs[i].value == \"\"){\n");
          out.write("            CARBON.showErrorDialog(\"");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("            return;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("    addServiceParamRow(\"\", \"\", \"jndiPropertyTable\", \"deleteJNDIPropRow\");\n");
          out.write("    if(document.getElementById('jndiPropertyTable').style.display == \"none\"){\n");
          out.write("        document.getElementById('jndiPropertyTable').style.display = \"\";\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function addDataSourceProperties() {\n");
          out.write("\t//check to see if there are empty fields left\n");
          out.write("    var theTable = document.getElementById('dsPropertyTable');\n");
          out.write("    var inputs = theTable.getElementsByTagName('input');\n");
          out.write("    for(var i=0; i<inputs.length; i++){\n");
          out.write("        if(inputs[i].value == \"\"){\n");
          out.write("            CARBON.showErrorDialog(\"");
          if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\");\n");
          out.write("            return;\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("    addServiceParamRow(\"\", \"\", \"dsPropertyTable\", \"deleteDataSourcePropRow\");\n");
          out.write("    if(document.getElementById('dsPropertyTable').style.display == \"none\"){\n");
          out.write("        document.getElementById('dsPropertyTable').style.display = \"\";\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function populateDataSourceProperties() {\n");
          out.write("\t//edit mode\n");
          out.write("\tvar str = '");
          out.print(givenDataSourceProps);
          out.write("'; \n");
          out.write("\tif (str == 'null' && document.getElementById('dsproviderProperties') != null) {\n");
          out.write("\t\tstr = document.getElementById('dsproviderProperties').value;\n");
          out.write("\t}\n");
          out.write("\tif (str != '' && str != 'null') {\n");
          out.write("\t\tvar params;\n");
          out.write("        params = str.split(\"::\");\n");
          out.write("        var i, param;\n");
          out.write("        for (i = 0; i < params.length; i++) {\n");
          out.write("            param = params[i].split(\",\");\n");
          out.write("            addServiceParamRow(param[0], param[1], \"dsPropertyTable\", \"deleteDataSourcePropRow\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function populateJNDIProperties() {\n");
          out.write("\t//edit mode\n");
          out.write("\tvar str = '");
          out.print(givenJNDIProps);
          out.write("'; \n");
          out.write("\tif (str == 'null' && document.getElementById('jndiProperties') != null) {\n");
          out.write("\t\tstr = document.getElementById('jndiProperties').value;\n");
          out.write("\t}\n");
          out.write("\tif (str != '' && str != 'null') {\n");
          out.write("\t\tvar params;\n");
          out.write("        params = str.split(\"::\");\n");
          out.write("        var i, param;\n");
          out.write("        for (i = 0; i < params.length; i++) {\n");
          out.write("            param = params[i].split(\",\");\n");
          out.write("            addServiceParamRow(param[0], param[1], \"jndiPropertyTable\", \"deleteJNDIPropRow\");\n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("}\n");
          out.write("\n");
          out.write("function deleteJNDIPropRow(index) {\n");
          out.write("    CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" , function() {\n");
          out.write("        document.getElementById('jndiPropertyTable').deleteRow(index);\n");
          out.write("        if (document.getElementById('jndiPropertyTable').rows.length == 1) {\n");
          out.write("            document.getElementById('jndiPropertyTable').style.display = 'none';\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function deleteDataSourcePropRow(index) {\n");
          out.write("    CARBON.showConfirmationDialog(\"");
          if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\" , function() {\n");
          out.write("        document.getElementById('dsPropertyTable').deleteRow(index);\n");
          out.write("        if (document.getElementById('dsPropertyTable').rows.length == 1) {\n");
          out.write("            document.getElementById('dsPropertyTable').style.display = 'none';\n");
          out.write("        }\n");
          out.write("    });\n");
          out.write("}\n");
          out.write("\n");
          out.write("function extractDataSourceProps() {\n");
          out.write("\tvar i;\n");
          out.write("    var str = '';\n");
          out.write("    var dsPropertyTable = document.getElementById(\"dsPropertyTable\");\n");
          out.write("    for(var j= 1;j<dsPropertyTable.rows.length;j++){\n");
          out.write("        var parmName = dsPropertyTable.rows[j].getElementsByTagName(\"input\")[0].value;\n");
          out.write("        var parmValue = dsPropertyTable.rows[j].getElementsByTagName(\"input\")[1].value;\n");
          out.write("        if(parmName == \"\" || parmValue == \"\"){\n");
          out.write("        \treturn;\n");
          out.write("        }\n");
          out.write("        if (j == 1) {\n");
          out.write("            str += parmName + ',' + parmValue;\n");
          out.write("        }else{\n");
          out.write("            str += '::' + parmName + ',' + parmValue;                \n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("    document.dscreationform.dsproviderProperties.value = str;\n");
          out.write("  }\n");
          out.write("\n");
          out.write("function extractJndiProps() {\n");
          out.write("    var i;\n");
          out.write("    var str = '';\n");
          out.write("    var jndiPropertyTable = document.getElementById(\"jndiPropertyTable\");\n");
          out.write("    for(var j= 1;j<jndiPropertyTable.rows.length;j++){\n");
          out.write("        var parmName = jndiPropertyTable.rows[j].getElementsByTagName(\"input\")[0].value;\n");
          out.write("        var parmValue = jndiPropertyTable.rows[j].getElementsByTagName(\"input\")[1].value;\n");
          out.write("        if(parmName == \"\" || parmValue == \"\"){\n");
          out.write("            return;\n");
          out.write("        }\n");
          out.write("        if (j == 1) {\n");
          out.write("            str += parmName + ',' + parmValue;\n");
          out.write("        }else{\n");
          out.write("            str += '::' + parmName + ',' + parmValue;                \n");
          out.write("        }\n");
          out.write("    }\n");
          out.write("\n");
          out.write("    document.dscreationform.jndiProperties.value = str;\n");
          out.write("}\n");
          out.write("\n");
          out.write("function changeDataSourceProvider (obj, document) {\n");
          out.write("\tvar selectedDSProvider =  obj[obj.selectedIndex].value;\n");
          out.write("\tvar dsName = document.getElementById(\"dsName\").value;\n");
          out.write("\tvar description = document.getElementById(\"description\").value;\n");
          out.write("\tvar editMode = document.getElementById(\"editMode\").value\n");
          out.write("\tvar query = 'dsProvider='+selectedDSProvider;\n");
          out.write("\t\n");
          out.write("\tif (dsName != null && dsName != \"\") {\n");
          out.write("\t\tquery = query + '&dsName='+dsName;\n");
          out.write("\t}\n");
          out.write("\tif (description != null && description != \"\"){\n");
          out.write("\t\tquery = query + '&description='+description;\n");
          out.write("\t}\n");
          out.write("\tif (editMode != null && editMode == \"true\") {\n");
          out.write("\t\tquery = query + '&edit='+editMode;\n");
          out.write("\t}\n");
          out.write("\tlocation.href = 'newdatasource.jsp?'+query;\t\n");
          out.write("}\n");
          out.write("\n");
          out.write("function dsSave(namemsg, invalidnamemsg, drivermsg, urlmsg, customdsmsg, form) {\n");
          out.write("\t\n");
          out.write("\tdocument.getElementById('configContent').value = editAreaLoader.getValue(\"configuration\");\n");
          out.write("\n");
          out.write("    if (!isDSValid(namemsg, invalidnamemsg, drivermsg, urlmsg, customdsmsg)) {\n");
          out.write("        return false;\n");
          out.write("    }\n");
          out.write("    \n");
          out.write("    if (document.getElementById(\"jndiPropertyTable\") != null) {\n");
          out.write("    \textractJndiProps();\n");
          out.write("    } \n");
          out.write("    \n");
          out.write("    if (document.getElementById(\"dsPropertyTable\") != null) {\n");
          out.write("    \textractDataSourceProps();\n");
          out.write("    }\n");
          out.write("      \n");
          out.write("    form.submit();\n");
          out.write("    return true;\n");
          out.write("}\n");
          out.write("\n");
          out.write("function showConfigEditor() {\n");
          out.write("\tdocument.getElementById(\"rdbmsConfigUI\").style.display = 'none';\n");
          out.write("\tdocument.getElementById(\"configEditor\").style.display = \"\";\n");
          out.write("\tdocument.getElementById(\"showConfigTR\").style.display = 'none';\n");
          out.write("}\n");
          out.write("\n");
          out.write("function changeConfigView(obj, document) {\n");
          out.write("\tvar selectedDsType =  obj[obj.selectedIndex].value;\n");
          out.write("\tif (selectedDsType == 'rdbms') {\n");
          out.write("\t\tdocument.getElementById(\"rdbmsConfigUI\").style.display = '';\n");
          out.write("\t\tdocument.getElementById(\"configEditor\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"customDSTypeRow\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"configView\").value = \"false\";\n");
          out.write("\t\tdocument.getElementById(\"dsType\").value = \"RDBMS\";\n");
          out.write("\t} else {\n");
          out.write("\t\teditAreaLoader.init({\n");
          out.write("\t        id : \"configuration\"        // textarea id\n");
          out.write("\t        ,syntax: \"xml\"            // syntax to be uses for highgliting\n");
          out.write("\t        ,start_highlight: true        // to display with highlight mode on start-up\n");
          out.write("\t        ,allow_resize: \"both\"\n");
          out.write("\t        ,min_height:250\n");
          out.write("\t    });\n");
          out.write("\t\tdocument.getElementById(\"rdbmsConfigUI\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"configEditor\").style.display = \"\";\n");
          out.write("\t\tdocument.getElementById(\"customDSTypeRow\").style.display = \"\";\n");
          out.write("\t\tdocument.getElementById(\"configView\").value = \"true\";\n");
          out.write("\t\tdocument.getElementById(\"dsType\").value = \"Custom\";\n");
          out.write("\t}\n");
          out.write("}\n");
          out.write("\n");
          out.write("function loadConfigView() {\n");
          out.write("\tvar editMode = document.getElementById(\"editMode\").value;\n");
          out.write("\tvar dsType = document.getElementById(\"dsType\").value;\n");
          out.write("\tif (editMode == 'false' || dsType == 'RDBMS') {\n");
          out.write("\t\tdocument.getElementById(\"configEditor\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"rdbmsConfigUI\").style.display = '';\n");
          out.write("\t\tdocument.getElementById(\"customDSTypeRow\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"configView\").value = \"false\";\n");
          out.write("\t} else {\n");
          out.write("\t\teditAreaLoader.init({\n");
          out.write("\t        id : \"configuration\"        // textarea id\n");
          out.write("\t        ,syntax: \"xml\"            // syntax to be uses for highgliting\n");
          out.write("\t        ,start_highlight: true        // to display with highlight mode on start-up\n");
          out.write("\t        ,allow_resize: \"both\"\n");
          out.write("\t        ,min_height:250\n");
          out.write("\t    });\n");
          out.write("\t\tdocument.getElementById(\"rdbmsConfigUI\").style.display = 'none';\n");
          out.write("\t\tdocument.getElementById(\"configEditor\").style.display = \"\";\n");
          out.write("\t\tdocument.getElementById(\"customDSTypeRow\").style.display = \"\";\n");
          out.write("\t\tdocument.getElementById(\"configView\").value = \"true\";\n");
          out.write("\t}\n");
          out.write("}\n");
          out.write("\n");
          out.write("\n");
          out.write("</script>\n");
          out.write("<form method=\"post\" name=\"dscreationform\" id=\"dscreationform\"\n");
          out.write("      action=\"savedatasource.jsp\" >\n");
          out.write("\n");
          out.write("<div id=\"middle\">\n");
          out.write("<h2>\n");
if (editMode) { 
          out.write("\n");
          out.write("      ");
if (isSystem) { 
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("      ");
} else { 
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("      ");
} 
          out.write("\n");
          out.write("      ");
} else { 
          out.write("\n");
          out.write("       ");
          if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write('\n');
} 
          out.write("\n");
          out.write("</h2>\n");
          out.write("\n");
          out.write("<div id=\"workArea\">\n");
          out.write("<table class=\"styledLeft noBorders\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"border-bottom:none\">\n");
          out.write("<thead>\n");
          out.write("    <tr>\n");
          out.write("        <th colspan=\"3\">\n");
          out.write("        ");
if (editMode) { 
          out.write("\n");
          out.write("        \t");
if (isSystem) { 
          out.write("\n");
          out.write("        \t\t");
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        \t");
} else { 
          out.write("\n");
          out.write("        \t\t");
          if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        \t");
} 
          out.write("\n");
          out.write("        ");
} else { 
          out.write("\n");
          out.write("        \t");
          if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
} 
          out.write("\n");
          out.write("        </th>\n");
          out.write("    </tr>\n");
          out.write("</thead>\n");
          out.write("<tbody>\n");
          out.write("<tr>\n");
          out.write("<td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("\t<td align=\"left\">\n");
          out.write("\t\t <select id=\"dsTypeSelector\" name=\"dsTypeSelector\"\n");
          out.write("                        onchange=\"changeConfigView(this,document)\">\n");
          out.write("                    ");
 if (type.equals(NDataSourceClientConstants.RDBMS_DTAASOURCE_TYPE) 
                    		|| !editMode) { 
          out.write("\n");
          out.write("\t                    <option value=\"rdbms\" selected=\"selected\">RDBMS</option>\n");
          out.write("\t                    <option value=\"Custom\">Custom</option>\n");
          out.write("                    ");
 } else { 
          out.write("\n");
          out.write("\t                    <option value=\"rdbms\">RDBMS</option>\n");
          out.write("\t                    <option value=\"Custom\" selected=\"selected\">Custom</option>\n");
          out.write("                    ");
 } 
          out.write("\n");
          out.write("         </select>\n");
          out.write("\t\t<input type=\"hidden\" id=\"dsType\" name=\"dsType\" value=\"");
          out.print(type );
          out.write("\"/>\n");
          out.write("\t\t<input type=\"hidden\" id=\"configView\" name=\"configView\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr id=\"customDSTypeRow\" style=\"display:none\">\n");
          out.write("\t<td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("\t<td>\n");
          out.write("\t\t");
if(!editMode) { 
          out.write("\n");
          out.write("\t\t\t<input id=\"customDsType\" name=\"customDsType\"/>\n");
          out.write("\t\t");
} else { 
          out.write("\n");
          out.write("\t\t\t<input id=\"customDsType\" name=\"customDsType\" value=\"");
          out.print(type );
          out.write("\"/>\n");
          out.write("\t\t");
} 
          out.write("\n");
          out.write("\t</td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("\t<td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("    \t <input type=\"hidden\" id=\"isSystem\" name=\"isSystem\" value=\"");
          out.print(isSystem );
          out.write("\"/>\n");
          out.write("    \t ");
if (editMode) { 
          out.write("\n");
          out.write("            <input id=\"dsName\" name=dsName class=\"longInput\" value=\"");
          out.print(dataSourceName );
          out.write("\" readonly>\n");
          out.write("        ");
} else { 
          out.write("\n");
          out.write("        \t<input id=\"dsName\" name=dsName class=\"longInput\" value=\"");
          out.print(dataSourceName );
          out.write("\">\n");
          out.write("        ");
} 
          out.write("\n");
          out.write("        <input type=\"hidden\" id=\"editMode\" name=\"editMode\" value=\"");
          out.print(editMode );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("    <td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"description\" name=\"description\" class=\"longInput\" value=\"");
          out.print(description );
          out.write("\" />\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("</tbody>\n");
          out.write("</table>\n");
          out.write("<table id=\"rdbmsConfigUI\" class=\"styledLeft noBorders\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"border-top:none;display:none\">\n");
          out.write("<tbody>\n");
          out.write("<tr>\n");
          out.write("    <td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <select id=\"datasourceProvider\" name=\"datasourceProvider\"\n");
          out.write("                        onchange=\"changeDataSourceProvider(this,document)\">\n");
          out.write("                    ");
 if (dsProvider.equals("default")) { 
          out.write("\n");
          out.write("                    <option value=\"default\" selected=\"selected\">default</option>\n");
          out.write("                    ");
 } else { 
          out.write("\n");
          out.write("                    <option value=\"default\">default</option>\n");
          out.write("                    ");
 } 
          out.write("\n");
          out.write("                    ");
 if(dsProvider.equals("External Data Source")) { 
          out.write("\n");
          out.write("                   \t<option value=\"External Data Source\" selected=\"selected\">External Data Source</option>\n");
          out.write("                   \t");
 } else { 
          out.write("\n");
          out.write("                   \t<option value=\"External Data Source\">External Data Source</option>\n");
          out.write("                   \t");
 } 
          out.write("\n");
          out.write("         </select>\n");
          out.write("         <input type=\"hidden\" id=\"dsProviderType\" name=\"dsProviderType\" value=\"");
          out.print(dsProvider );
          out.write("\" />\n");
          out.write("         <input type=\"hidden\" id=\"dsproviderProperties\" name=\"dsproviderProperties\" class=\"longInput\"/>\n");
          out.write("         <input type=\"hidden\" id=\"dsproviderPropertiesHidden\" name=\"dsproviderPropertiesHidden\" class=\"longInput\" value=\"");
          out.print(dsproviderPropertiesEditMode );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
 if ("default".equals(dsProvider)) { 
          out.write("\n");
          out.write("<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"driver\" name=\"driver\" class=\"longInput\" value=\"");
          out.print(driverClassName );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"url\" name=\"url\" class=\"longInput\" value=\"");
          out.print(url );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"username\" name=\"username\" class=\"longInput\" value=\"");
          out.print(username );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"password\" name=\"password\" type=\"password\" class=\"longInput\" value=\"");
          out.print(password );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
 } else if ("External Data Source".equals(dsProvider)){ 
          out.write("\n");
          out.write("<tr>\n");
          out.write("    <td>");
          if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<span class='required'>*</span></td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <input id=\"dsclassname\" name=\"dsclassname\" class=\"longInput\" value=\"");
          out.print(dataSourceclassName );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("\t<td>\n");
          out.write("       ");
          if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </td>\n");
          out.write("    <td >\n");
          out.write("\t\t<div id=\"nameValueAdd\">\n");
          out.write("\t\t");
if (!isSystem) { 
          out.write("\n");
          out.write("\t\t\t<a class=\"icon-link\"\n");
          out.write("\t           href=\"#addNameLink\"\n");
          out.write("\t           onclick=\"addDataSourceProperties();\"\n");
          out.write("\t           style=\"background-image: url(../admin/images/add.gif);\">");
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("\t    ");
} 
          out.write("\n");
          out.write("\t    \t<div style=\"clear:both;\"></div>\n");
          out.write("\t    </div>\n");
          out.write("\t    <div>\n");
          out.write("\t         <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"styledLeft\"\n");
          out.write("\t                          id=\"dsPropertyTable\"\n");
          out.write("\t                          style=\"display:none;\">\n");
          out.write("\t                <thead>\n");
          out.write("\t                    <tr>\n");
          out.write("\t                        <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                        <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                        <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                    </tr>\n");
          out.write("\t                </thead>\n");
          out.write("\t         \t\t<tbody>\n");
          out.write("\t         \t\t</tbody>\n");
          out.write("\t          </table>\n");
          out.write("\t          \n");
          out.write("\t     </div>\n");
          out.write("\t</td>\n");
          out.write("</tr>\n");
 } 
          out.write("\n");
          out.write("<!-- JNDI NEW -->\n");
          out.write("<tr>\n");
          out.write("    <td colspan=\"2\" class=\"middle-header\">\n");
          out.write("    \t<a onclick=\"showJNDIConfigurations()\" class=\"icon-link\" style=\"background-image:url(images/plus.gif);\"\n");
          out.write("                         href=\"#jndiConfig\" id=\"jndiconfigheader\"></a>\n");
          out.write("    \t");
          if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr id=\"jndiconfig\" style=\"display:none\">\n");
          out.write("    <td colspan=\"2\">\n");
          out.write("        <table id=\"showJNDIConfigurations\" width=\"100%\">\n");
          out.write("        \t<tr>\n");
          out.write("    <td style=\"width:170px;\">");
          if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("    \t<input id=\"jndiname\" name=\"jndiname\" class=\"longInput\" value=\"");
          out.print(jndiConfigName );
          out.write("\" />\n");
          out.write("    \t<input type=\"hidden\" id=\"jndiPropertiesHidden\" name=\"jndiPropertiesHidden\" class=\"longInput\" value=\"");
          out.print(jndiPropertiesEditMode );
          out.write("\"/>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr>\n");
          out.write("\t<td><label for=\"useDataSourceFactory\">");
          if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("\t<td>");
 if ("External Data Source".equals(dsProvider)) { 
          out.write("\n");
          out.write("\t<input type=\"checkbox\" id=\"useDataSourceFactory\" name=\"useDataSourceFactory\" disabled=\"disabled\"/>\n");
          out.write("\t");
} else if (isUseDataSourceFactory) {
          out.write("\n");
          out.write("\t\t<input type=\"checkbox\" id=\"useDataSourceFactory\" name=\"useDataSourceFactory\" checked/>\n");
          out.write("\t");
} else {
          out.write("\n");
          out.write("\t\t<input type=\"checkbox\" id=\"useDataSourceFactory\" name=\"useDataSourceFactory\"/>\n");
          out.write("\t");
 } 
          out.write("\n");
          out.write("\t<input type=\"hidden\" id=\"jndiProperties\" name=\"jndiProperties\" class=\"longInput\"/></td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("\t<td>\n");
          out.write("       ");
          if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </td>\n");
          out.write("    <td >\n");
          out.write("\t\t<div id=\"nameValueAdd\">\n");
          out.write("\t\t");
if (!isSystem) { 
          out.write("\n");
          out.write("\t\t\t<a class=\"icon-link\"\n");
          out.write("\t           href=\"#addNameLink\"\n");
          out.write("\t           onclick=\"addJNDIProps();\"\n");
          out.write("\t           style=\"background-image: url(../admin/images/add.gif);\">");
          if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</a>\n");
          out.write("\t    ");
} 
          out.write("\n");
          out.write("\t    \t<div style=\"clear:both;\"></div>\n");
          out.write("\t    </div>\n");
          out.write("\t    <div>\n");
          out.write("\t         <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"styledLeft\"\n");
          out.write("\t                          id=\"jndiPropertyTable\"\n");
          out.write("\t                          style=\"display:none;\">\n");
          out.write("\t                <thead>\n");
          out.write("\t                    <tr>\n");
          out.write("\t                        <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                        <th style=\"width:40%\">");
          if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                        <th style=\"width:20%\">");
          if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</th>\n");
          out.write("\t                    </tr>\n");
          out.write("\t                </thead>\n");
          out.write("\t         \t\t<tbody></tbody>\n");
          out.write("\t          </table>\n");
          out.write("\t    </div>\n");
          out.write("\t    \n");
          out.write("\t  </td>\n");
          out.write("</tr>\n");
          out.write("        \t\n");
          out.write("        </table>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("\n");
          out.write("<tr>\n");
          out.write("    <td colspan=\"2\" class=\"middle-header\">\n");
          out.write("    \t<a onclick=\"showPropConfigurations()\" class=\"icon-link\" style=\"background-image:url(images/plus.gif);\"\n");
          out.write("                         href=\"#dsProperties\" id=\"dsProperties\"></a>\n");
          out.write("    \t");
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("<tr id=\"dsPropFields\" style=\"display:none\">\n");
          out.write("    <td colspan=\"2\">\n");
          out.write("        <table id=\"showPropConfigurations\">\n");
          out.write("        \t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"defaultAutoCommit\" name=\"defaultAutoCommit\">\n");
          out.write("\t\t\t        \t");
 if (defaultAutoCommit) {
          out.write("\n");
          out.write("\t\t\t        \t \t<option value=\"false\">");
          if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             \t<option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} else { 
          out.write("\n");
          out.write("\t\t\t             \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             \t<option value=\"true\" >");
          if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} 
          out.write("\n");
          out.write("\t\t\t \t\t</select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"defaultReadOnly\" name=\"defaultReadOnly\">\n");
          out.write("\t\t\t        \t");
 if (defaultReadOnly) {
          out.write("\n");
          out.write("\t\t\t        \t\t<option value=\"false\">");
          if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} else { 
          out.write("\n");
          out.write("\t\t\t             \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\" >");
          if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"defaultTransactionIsolation\" name=\"defaultTransactionIsolation\">\n");
          out.write("\t\t\t        \t");
if ("NONE".equals(defaultTransactionIsolation)) { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"NONE\" selected=\"true\">NONE</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"NONE\">NONE</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t            ");
if ("READ_COMMITTED".equals(defaultTransactionIsolation)) { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"READ_COMMITTED\" selected=\"true\">READ_COMMITTED</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"READ_COMMITTED\">READ_COMMITTED</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t            ");
if ("READ_UNCOMMITTED".equals(defaultTransactionIsolation)) { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"READ_UNCOMMITTED\" selected=\"true\">READ_UNCOMMITTED</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"READ_UNCOMMITTED\">READ_UNCOMMITTED</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t            ");
if ("REPEATABLE_READ".equals(defaultTransactionIsolation)) { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"REPEATABLE_READ\" selected=\"true\">REPEATABLE_READ</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t             \t<option value=\"REPEATABLE_READ\">REPEATABLE_READ</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t            ");
if ("SERIALIZABLE".equals(defaultTransactionIsolation)) { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"SERIALIZABLE\" selected=\"true\">SERIALIZABLE</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t             \t<option value=\"SERIALIZABLE\">SERIALIZABLE</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <input id=\"defaultCatalog\" name=\"defaultCatalog\" type=\"text\" value=\"");
          out.print(defaultCatalog );
          out.write("\"/>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (maxActive != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxActive\" name=\"maxActive\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(maxActive );
          out.write("\"/>\n");
          out.write("\t\t\t         ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxActive\" name=\"maxActive\" onclick=\"clearStatus('maxActive')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t         ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (maxIdle != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxIdle\" name=\"maxIdle\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(maxIdle );
          out.write("\"/>\n");
          out.write("\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxIdle\" name=\"maxIdle\" onclick=\"clearStatus('maxIdle')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (minIdle != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"minIdle\" name=\"minIdle\" onclick=\"clearStatus('minIdle')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(minIdle );
          out.write("\"/>\n");
          out.write("\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"minIdle\" name=\"minIdle\" onclick=\"clearStatus('minIdle')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (initialSize != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"initialSize\" name=\"initialSize\" onclick=\"clearStatus('initialSize')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(initialSize );
          out.write("\"/>\n");
          out.write("\t\t\t         ");
} else { 
          out.write("\n");
          out.write("\t\t\t         \t<input id=\"initialSize\" name=\"initialSize\" onclick=\"clearStatus('initialSize')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t         ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("<label>");
          if (_jspx_meth_fmt_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</label></td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (maxWait != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxWait\" name=\"maxWait\" onclick=\"clearStatus('maxWait')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(maxWait );
          out.write("\"/>\n");
          out.write("\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"maxWait\" name=\"maxWait\" onclick=\"clearStatus('maxWait')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"testOnBorrow\" name=\"testOnBorrow\">\n");
          out.write("\t\t\t        \t");
if (testOnBorrow) { 
          out.write("\n");
          out.write("\t\t\t        \t\t<option value=\"false\">");
          if (_jspx_meth_fmt_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t        \t\t<option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t        \t");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t\t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\">");
          if (_jspx_meth_fmt_message_56((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t    \t</select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_57((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"testOnReturn\" name=\"testOnReturn\">\n");
          out.write("\t\t\t        \t");
if (testOnReturn) { 
          out.write("\n");
          out.write("\t\t\t        \t\t<option value=\"false\">");
          if (_jspx_meth_fmt_message_58((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_59((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_60((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\">");
          if (_jspx_meth_fmt_message_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"testWhileIdle\" name=\"testWhileIdle\">\n");
          out.write("\t\t\t        \t");
if (testWhileIdle) { 
          out.write("\n");
          out.write("\t\t\t        \t\t<option value=\"false\">");
          if (_jspx_meth_fmt_message_63((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_64((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_65((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            \t<option value=\"true\">");
          if (_jspx_meth_fmt_message_66((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_67((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    <input id=\"validationquery\" name=\"validationquery\" type=\"text\" value=\"");
          out.print(validationquery );
          out.write("\"/>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_68((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    <input id=\"validatorClassName\" name=\"validatorClassName\" type=\"text\" value=\"");
          out.print(validatorClassName );
          out.write("\"/>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_69((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (timeBetweenEvictionRunsMillis != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"timeBetweenEvictionRunsMillis\" name=\"timeBetweenEvictionRunsMillis\" onclick=\"clearStatus('timeBetweenEvictionRunsMillis')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(timeBetweenEvictionRunsMillis );
          out.write("\"/>\n");
          out.write("\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"timeBetweenEvictionRunsMillis\" name=\"timeBetweenEvictionRunsMillis\" onclick=\"clearStatus('timeBetweenEvictionRunsMillis')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_70((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (numTestsPerEvictionRun != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"numTestsPerEvictionRun\" name=\"numTestsPerEvictionRun\" onclick=\"clearStatus('numTestsPerEvictionRun')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(numTestsPerEvictionRun );
          out.write("\"/>\n");
          out.write("\t\t\t         ");
} else { 
          out.write("\n");
          out.write("\t\t\t         \t<input id=\"numTestsPerEvictionRun\" name=\"numTestsPerEvictionRun\" onclick=\"clearStatus('numTestsPerEvictionRun')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t         ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_71((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (minEvictableIdleTimeMillis != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"minEvictableIdleTimeMillis\" name=\"minEvictableIdleTimeMillis\" onclick=\"clearStatus('minEvictableIdleTimeMillis')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(minEvictableIdleTimeMillis );
          out.write("\"/>\n");
          out.write("\t\t\t         ");
} else { 
          out.write("\n");
          out.write("\t\t\t         \t<input id=\"minEvictableIdleTimeMillis\" name=\"minEvictableIdleTimeMillis\" onclick=\"clearStatus('minEvictableIdleTimeMillis')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t         ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td style=\"width:230px;\">");
          if (_jspx_meth_fmt_message_72((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"accessToUnderlyingConnectionAllowed\" name=\"accessToUnderlyingConnectionAllowed\">\n");
          out.write("\t\t\t        \t");
if (accessToUnderlyingConnectionAllowed) { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_73((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_74((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t\t        \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_75((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_76((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t       </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_77((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"removeAbandoned\" name=\"removeAbandoned\">\n");
          out.write("\t\t\t        \t");
if (removeAbandoned) { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_78((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_79((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            \t<option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_80((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_81((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_82((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    \t");
if (removeAbandonedTimeout != null) { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"removeAbandonedTimeout\" name=\"removeAbandonedTimeout\" onclick=\"clearStatus('removeAbandonedTimeout')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"");
          out.print(removeAbandonedTimeout );
          out.write("\"/>\n");
          out.write("\t\t\t        ");
} else { 
          out.write("\n");
          out.write("\t\t\t        \t<input id=\"removeAbandonedTimeout\" name=\"removeAbandonedTimeout\" onclick=\"clearStatus('removeAbandonedTimeout')\" type=\"text\"\n");
          out.write("\t\t\t               value=\"( int )\"/>\n");
          out.write("\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_83((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"logAbandoned\" name=\"logAbandoned\">\n");
          out.write("\t\t\t        \t");
if (logAbandoned) { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_84((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_85((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_86((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_87((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t             ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr> \n");
          out.write("\t\t\t    <td>");
          if (_jspx_meth_fmt_message_88((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t    <input id=\"connectionProperties\" name=\"connectionProperties\" type=\"text\" value=\"");
          out.print(connectionProperties );
          out.write("\"/>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td style=\"width:230px;\">");
          if (_jspx_meth_fmt_message_89((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t<input id=\"initSQL\" name=\"initSQL\" type=\"text\" value=\"");
          out.print(initSQL );
          out.write("\"/>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_90((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t<input id=\"jdbcInterceptors\" name=\"jdbcInterceptors\" type=\"text\" value=\"");
          out.print(jdbcInterceptors );
          out.write("\"/>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_91((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t");
if (validationInterval != null) { 
          out.write("\n");
          out.write("        \t\t\t\t<input id=\"validationInterval\" name=\"validationInterval\" onclick=\"clearStatus('validationInterval')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"");
          out.print(validationInterval );
          out.write("\"/>\n");
          out.write("               \t\t");
} else { 
          out.write("\n");
          out.write("               \t\t\t<input id=\"validationInterval\" name=\"validationInterval\" onclick=\"clearStatus('validationInterval')\" type=\"text\"\n");
          out.write("              \t\t\t\t value=\"( long )\"/>\n");
          out.write("               \t\t");
} 
          out.write("\n");
          out.write("    \t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_92((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"fairQueue\" name=\"fairQueue\">\n");
          out.write("\t\t\t        \t");
if (fairQueue) { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_93((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_94((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_95((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_96((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_97((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"jmxEnabled\" name=\"jmxEnabled\">\n");
          out.write("\t\t\t        \t");
if (jmxEnabled) { 
          out.write("\n");
          out.write("\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_98((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_99((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_100((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_101((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_102((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t");
if (abandonWhenPercentageFull != null) { 
          out.write("\n");
          out.write("        \t\t\t\t<input id=\"abandonWhenPercentageFull\" name=\"abandonWhenPercentageFull\" onclick=\"clearStatus('abandonWhenPercentageFull')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"");
          out.print(abandonWhenPercentageFull );
          out.write("\"/>\n");
          out.write("               \t\t");
} else { 
          out.write("\n");
          out.write("               \t\t\t<input id=\"abandonWhenPercentageFull\" name=\"abandonWhenPercentageFull\" onclick=\"clearStatus('abandonWhenPercentageFull')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"( int )\"/>\n");
          out.write("               \t\t ");
} 
          out.write("\n");
          out.write("    \t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_103((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t");
if (maxAge != null) { 
          out.write("\n");
          out.write("        \t\t\t\t<input id=\"maxAge\" name=\"maxAge\" onclick=\"clearStatus('maxAge')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"");
          out.print(maxAge );
          out.write("\"/>\n");
          out.write("               \t\t");
} else { 
          out.write("\n");
          out.write("               \t\t\t<input id=\"maxAge\" name=\"maxAge\" onclick=\"clearStatus('maxAge')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"( long )\"/>\n");
          out.write("               \t\t");
} 
          out.write("\n");
          out.write("    \t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_104((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"useEquals\" name=\"useEquals\">\n");
          out.write("\t\t\t        \t");
if (useEquals) {
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_105((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_106((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_107((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_108((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t        ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_109((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    \t\t\t<td align=\"left\">\n");
          out.write("    \t\t\t\t");
if (suspectTimeout != null) { 
          out.write("\n");
          out.write("        \t\t\t\t<input id=\"suspectTimeout\" name=\"suspectTimeout\" onclick=\"clearStatus('suspectTimeout')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"");
          out.print(suspectTimeout );
          out.write("\"/>\n");
          out.write("               \t\t");
} else { 
          out.write("\n");
          out.write("               \t\t\t<input id=\"suspectTimeout\" name=\"suspectTimeout\" onclick=\"clearStatus('suspectTimeout')\" type=\"text\"\n");
          out.write("               \t\t\t\tvalue=\"( int )\"/>\n");
          out.write("               \t\t");
} 
          out.write("\n");
          out.write("    \t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t<tr>\n");
          out.write("    \t\t\t<td>");
          if (_jspx_meth_fmt_message_110((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t    <td align=\"left\">\n");
          out.write("\t\t\t        <select id=\"alternateUsernameAllowed\" name=\"alternateUsernameAllowed\">\n");
          out.write("\t\t\t        \t");
if (alternateUsernameAllowed) { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\">");
          if (_jspx_meth_fmt_message_111((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\" selected=\"true\">");
          if (_jspx_meth_fmt_message_112((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} else { 
          out.write("\n");
          out.write("\t\t\t\t            <option value=\"false\" selected=\"true\">");
          if (_jspx_meth_fmt_message_113((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t\t            <option value=\"true\">");
          if (_jspx_meth_fmt_message_114((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</option>\n");
          out.write("\t\t\t            ");
} 
          out.write("\n");
          out.write("\t\t\t        </select>\n");
          out.write("\t\t\t    </td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("        </table>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("</tbody>\n");
          out.write("</table>\n");
          out.write("<table id=\"configEditor\" class=\"styledLeft noBorders\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"border-top:none;display:none;\">\n");
          out.write("\t<tr>\n");
          out.write("    <td style=\"width:170px\">");
          if (_jspx_meth_fmt_message_115((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("    <td align=\"left\">\n");
          out.write("        <textarea id=\"configuration\" name=\"configuration\" \n");
          out.write("        style=\"background-color:lavender; width:99%;height:470px;*height:500px;\n");
          out.write("                      font-family:verdana;\n");
          out.write("                      font-size:11px;\n");
          out.write("                      color: darkblue;\n");
          out.write("                      border:solid 1px #9fc2d5;\n");
          out.write("                      overflow-x:auto;\n");
          out.write("                      overflow-y:auto\">");
if (dataSourceDefinition != null) { 
          out.print(NDataSourceHelper.prettifyXML((dataSourceDefinition.getDsXMLConfiguration().trim())) );
          out.write("\n");
          out.write("        ");
} 
          out.write("</textarea>\n");
          out.write("        <textarea id=\"configContent\" name=\"configContent\" style=\"display:none\"></textarea>\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("<table class=\"styledLeft noBorders\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
          out.write("<tr>    \n");
          out.write("   <td class=\"buttonRow\" colspan=\"3\">\n");
          out.write("   \t\t");
if(type.equals("RDBMS")) { 
          out.write("\n");
          out.write("   \t\t<div id=\"connectionTestMsgDiv\" style=\"display: none;\"></div>\n");
          out.write("   \t\t<input class=\"button\" id=\"testConnectionButton\" name=\"testConnectionButton\" type=\"button\" value=\"Test Connection\" onclick=\"var val = isDSValid('");
          if (_jspx_meth_fmt_message_116((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_117((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("',\n");
          out.write("   \t\t'");
          if (_jspx_meth_fmt_message_118((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_119((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("'); if (val) {testConnection()};return false;\"/>\n");
          out.write("   \t\t<script type=\"text/javascript\">\n");
          out.write("            function displayMsg(msg) {\n");
          out.write("            \tvar successMsg  =  new RegExp(\"true\");\n");
          out.write("            \tif (msg.search(successMsg)==-1) //if match failed\n");
          out.write("            \t{\n");
          out.write("            \t\tCARBON.showErrorDialog(msg);\n");
          out.write("            \t} else {\n");
          out.write("            \t\tCARBON.showInfoDialog(\"Connection is healthy\");\n");
          out.write("            \t}\n");
          out.write("\n");
          out.write("            }\n");
          out.write("\n");
          out.write("            function testConnection() {\n");
          out.write("            \tif (document.getElementById(\"jndiPropertyTable\") != null) {\n");
          out.write("                \textractJndiProps();\n");
          out.write("                } \n");
          out.write("                if (document.getElementById(\"dsPropertyTable\") != null) {\n");
          out.write("                \textractDataSourceProps();\n");
          out.write("                }\n");
          out.write("            \tvar query = document.getElementById('dsName').value;\n");
          out.write("            \tvar dsProvider = document.getElementById('dsProviderType').value;\n");
          out.write("            \tvar datasourceType = document.getElementById('dsType').value;\n");
          out.write("            \tvar datasourceCustomType = document.getElementById('customDsType').value;\n");
          out.write("            \tif (dsProvider == 'default') {\n");
          out.write("            \t\tvar driver = document.getElementById('driver').value;\n");
          out.write("            \t\tvar url = document.getElementById('url').value;\n");
          out.write("            \t\tvar username = document.getElementById('username').value;\n");
          out.write("            \t\tvar password = document.getElementById('password').value;\n");
          out.write("            \t} else {\n");
          out.write("            \t\tvar dsclassname = document.getElementById('dsclassname').value;\n");
          out.write("            \t\tvar dsproviderProperties = document.getElementById('dsproviderProperties').value;\n");
          out.write("            \t}\n");
          out.write("            \tdsProvider = escape(dsProvider);\n");
          out.write("                var url = 'validateconnection-ajaxprocessor.jsp?&dsName=' + document.getElementById('dsName').value+'&driver='+driver+\n");
          out.write("           \t'&url='+url+'&username='+username+'&password='+password+'&dsType=' + datasourceType+'&customDsType='+datasourceCustomType+'&dsProviderType='+dsProvider+\n");
          out.write("    \t'&dsclassname='+dsclassname+'&dsclassname='+dsclassname+'&dsproviderProperties='+dsproviderProperties;\n");
          out.write("                jQuery('#connectionTestMsgDiv').load(url, displayMsg);\n");
          out.write("                return false;\n");
          out.write("            }\n");
          out.write("        </script>\n");
          out.write("   \t\t");
} 
          out.write("\n");
          out.write("        ");
if (!isSystem) { 
          out.write("\n");
          out.write("        <input class=\"button\" type=\"button\"\n");
          out.write("               value=\"");
          if (_jspx_meth_fmt_message_120((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"\n");
          out.write("               onclick=\"var val = ValidateProperties(); if (val) {dsSave('");
          if (_jspx_meth_fmt_message_121((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_122((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_123((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_124((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("','");
          if (_jspx_meth_fmt_message_125((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("',document.dscreationform)}; return false;\"/>\n");
          out.write("        \n");
          out.write("        <input class=\"button\" type=\"reset\" value=\"");
          if (_jspx_meth_fmt_message_126((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"\n");
          out.write("               onclick=\"document.location.href='index.jsp'\"/>\n");
          out.write("        ");
} else {
          out.write("\n");
          out.write("        <input class=\"button\" type=\"reset\" value=\"");
          if (_jspx_meth_fmt_message_127((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_bundle_0, _jspx_page_context))
            return;
          out.write("\"\n");
          out.write("               onclick=\"document.location.href='index.jsp'\"/>\n");
          out.write("        ");
} 
          out.write("\n");
          out.write("    </td>\n");
          out.write("</tr>\n");
          out.write("</table>\n");
          out.write("<script type=\"text/javascript\">\n");
          out.write("\tdocument.getElementById('configuration').innerHTML = format_xml(document.getElementById('configuration').value);\n");
          out.write("\tpopulateDataSourceProperties();\n");
          out.write("\tpopulateJNDIProperties();\n");
          out.write("\tdisableForm();\n");
          out.write("\tloadConfigView();\n");
          out.write("</script>\n");
          out.write("</div>\n");
          out.write("</div>\n");
          out.write("</form>\n");
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
    _jspx_th_fmt_message_0.setKey("empty.key.or.value");
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
    _jspx_th_fmt_message_1.setKey("empty.key.or.value");
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
    _jspx_th_fmt_message_2.setKey("confirm.property.deletion");
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
    _jspx_th_fmt_message_3.setKey("confirm.property.deletion");
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
    _jspx_th_fmt_message_4.setKey("view.data.source");
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
    _jspx_th_fmt_message_5.setKey("edit.data.source");
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
    _jspx_th_fmt_message_6.setKey("new.data.source");
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
    _jspx_th_fmt_message_7.setKey("view.data.source");
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
    _jspx_th_fmt_message_8.setKey("edit.data.source");
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
    _jspx_th_fmt_message_9.setKey("new.data.source");
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
    _jspx_th_fmt_message_10.setKey("dsType");
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
    _jspx_th_fmt_message_11.setKey("customDSType");
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
    _jspx_th_fmt_message_12.setKey("name");
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
    _jspx_th_fmt_message_13.setKey("description");
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
    _jspx_th_fmt_message_14.setKey("datasource.provider");
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
    _jspx_th_fmt_message_15.setKey("driver");
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
    _jspx_th_fmt_message_16.setKey("url");
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
    _jspx_th_fmt_message_17.setKey("user.name");
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
    _jspx_th_fmt_message_18.setKey("password");
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
    _jspx_th_fmt_message_19.setKey("datasource.className");
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
    _jspx_th_fmt_message_20.setKey("datasource.properties");
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
    _jspx_th_fmt_message_21.setKey("jndi.properties.add");
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
    _jspx_th_fmt_message_22.setKey("prop.name");
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
    _jspx_th_fmt_message_23.setKey("prop.value");
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
    _jspx_th_fmt_message_24.setKey("prop.action");
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
    _jspx_th_fmt_message_25.setKey("datasource.jndi.config");
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
    _jspx_th_fmt_message_26.setKey("jndi.name");
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
    _jspx_th_fmt_message_27.setKey("jndi.use.data.source.factory");
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
    _jspx_th_fmt_message_28.setKey("jndi.properties");
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
    _jspx_th_fmt_message_29.setKey("jndi.properties.add");
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
    _jspx_th_fmt_message_30.setKey("prop.name");
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
    _jspx_th_fmt_message_31.setKey("prop.value");
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
    _jspx_th_fmt_message_32.setKey("prop.action");
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
    _jspx_th_fmt_message_33.setKey("data.source.configuration.parameters");
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
    _jspx_th_fmt_message_34.setKey("default.auto.commit");
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
    _jspx_th_fmt_message_35.setKey("false");
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
    _jspx_th_fmt_message_36.setKey("true");
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
    _jspx_th_fmt_message_37.setKey("false");
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
    _jspx_th_fmt_message_38.setKey("true");
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
    _jspx_th_fmt_message_39.setKey("default.read.only");
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
    _jspx_th_fmt_message_40.setKey("false");
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
    _jspx_th_fmt_message_41.setKey("true");
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
    _jspx_th_fmt_message_42.setKey("false");
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
    _jspx_th_fmt_message_43.setKey("true");
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
    _jspx_th_fmt_message_44.setKey("default.transaction.isolation");
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
    _jspx_th_fmt_message_45.setKey("default.catalogn");
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
    _jspx_th_fmt_message_46.setKey("max.active");
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
    _jspx_th_fmt_message_47.setKey("max.idle");
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
    _jspx_th_fmt_message_48.setKey("min.idle");
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
    _jspx_th_fmt_message_49.setKey("initial.size");
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
    _jspx_th_fmt_message_50.setKey("max.wait");
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
    _jspx_th_fmt_message_51.setKey("measurement.milliseconds");
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
    _jspx_th_fmt_message_52.setKey("test.on.borrow");
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
    _jspx_th_fmt_message_53.setKey("false");
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
    _jspx_th_fmt_message_54.setKey("true");
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
    _jspx_th_fmt_message_55.setKey("false");
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
    _jspx_th_fmt_message_56.setKey("true");
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
    _jspx_th_fmt_message_57.setKey("test.on.return");
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
    _jspx_th_fmt_message_58.setKey("false");
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
    _jspx_th_fmt_message_59.setKey("true");
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
    _jspx_th_fmt_message_60.setKey("false");
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
    _jspx_th_fmt_message_61.setKey("true");
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
    _jspx_th_fmt_message_62.setKey("test.while.idle");
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
    _jspx_th_fmt_message_63.setKey("false");
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
    _jspx_th_fmt_message_64.setKey("true");
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
    _jspx_th_fmt_message_65.setKey("false");
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
    _jspx_th_fmt_message_66.setKey("true");
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
    _jspx_th_fmt_message_67.setKey("validation.query");
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
    _jspx_th_fmt_message_68.setKey("validation.class.name");
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
    _jspx_th_fmt_message_69.setKey("time.between.eviction.runs.millis");
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
    _jspx_th_fmt_message_70.setKey("num.tests.per.eviction.run");
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
    _jspx_th_fmt_message_71.setKey("min.evictable.idle.time.millis");
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
    _jspx_th_fmt_message_72.setKey("access.to.underlying.connection.allowed");
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
    _jspx_th_fmt_message_73.setKey("false");
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
    _jspx_th_fmt_message_74.setKey("true");
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
    _jspx_th_fmt_message_75.setKey("false");
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
    _jspx_th_fmt_message_76.setKey("true");
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
    _jspx_th_fmt_message_77.setKey("remove.abandoned");
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
    _jspx_th_fmt_message_78.setKey("false");
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
    _jspx_th_fmt_message_79.setKey("true");
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
    _jspx_th_fmt_message_80.setKey("false");
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
    _jspx_th_fmt_message_81.setKey("true");
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
    _jspx_th_fmt_message_82.setKey("remove.abandoned.timeout");
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
    _jspx_th_fmt_message_83.setKey("log.abandoned");
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
    _jspx_th_fmt_message_84.setKey("false");
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
    _jspx_th_fmt_message_85.setKey("true");
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
    _jspx_th_fmt_message_86.setKey("false");
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
    _jspx_th_fmt_message_87.setKey("true");
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
    _jspx_th_fmt_message_88.setKey("connection.properties");
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
    _jspx_th_fmt_message_89.setKey("init.sql");
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
    _jspx_th_fmt_message_90.setKey("jdbc.interceptors");
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
    _jspx_th_fmt_message_91.setKey("validation.interval");
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
    _jspx_th_fmt_message_92.setKey("fair.queue");
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
    _jspx_th_fmt_message_93.setKey("false");
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
    _jspx_th_fmt_message_94.setKey("true");
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
    _jspx_th_fmt_message_95.setKey("false");
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
    _jspx_th_fmt_message_96.setKey("true");
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
    _jspx_th_fmt_message_97.setKey("jmx.enabled");
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
    _jspx_th_fmt_message_98.setKey("false");
    int _jspx_eval_fmt_message_98 = _jspx_th_fmt_message_98.doStartTag();
    if (_jspx_th_fmt_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
    return false;
  }

  private boolean _jspx_meth_fmt_message_99(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_99 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_99.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_99.setKey("true");
    int _jspx_eval_fmt_message_99 = _jspx_th_fmt_message_99.doStartTag();
    if (_jspx_th_fmt_message_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
    return false;
  }

  private boolean _jspx_meth_fmt_message_100(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_100 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_100.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_100.setKey("false");
    int _jspx_eval_fmt_message_100 = _jspx_th_fmt_message_100.doStartTag();
    if (_jspx_th_fmt_message_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
    return false;
  }

  private boolean _jspx_meth_fmt_message_101(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_101 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_101.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_101.setKey("true");
    int _jspx_eval_fmt_message_101 = _jspx_th_fmt_message_101.doStartTag();
    if (_jspx_th_fmt_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
    return false;
  }

  private boolean _jspx_meth_fmt_message_102(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_102 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_102.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_102.setKey("abandon.when.percentage.full");
    int _jspx_eval_fmt_message_102 = _jspx_th_fmt_message_102.doStartTag();
    if (_jspx_th_fmt_message_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
    return false;
  }

  private boolean _jspx_meth_fmt_message_103(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_103 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_103.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_103.setKey("max.age");
    int _jspx_eval_fmt_message_103 = _jspx_th_fmt_message_103.doStartTag();
    if (_jspx_th_fmt_message_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
    return false;
  }

  private boolean _jspx_meth_fmt_message_104(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_104 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_104.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_104.setKey("use.equals");
    int _jspx_eval_fmt_message_104 = _jspx_th_fmt_message_104.doStartTag();
    if (_jspx_th_fmt_message_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
    return false;
  }

  private boolean _jspx_meth_fmt_message_105(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_105 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_105.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_105.setKey("false");
    int _jspx_eval_fmt_message_105 = _jspx_th_fmt_message_105.doStartTag();
    if (_jspx_th_fmt_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
    return false;
  }

  private boolean _jspx_meth_fmt_message_106(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_106 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_106.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_106.setKey("true");
    int _jspx_eval_fmt_message_106 = _jspx_th_fmt_message_106.doStartTag();
    if (_jspx_th_fmt_message_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
    return false;
  }

  private boolean _jspx_meth_fmt_message_107(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_107 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_107.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_107.setKey("false");
    int _jspx_eval_fmt_message_107 = _jspx_th_fmt_message_107.doStartTag();
    if (_jspx_th_fmt_message_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
    return false;
  }

  private boolean _jspx_meth_fmt_message_108(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_108 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_108.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_108.setKey("true");
    int _jspx_eval_fmt_message_108 = _jspx_th_fmt_message_108.doStartTag();
    if (_jspx_th_fmt_message_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
    return false;
  }

  private boolean _jspx_meth_fmt_message_109(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_109 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_109.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_109.setKey("suspect.timeout");
    int _jspx_eval_fmt_message_109 = _jspx_th_fmt_message_109.doStartTag();
    if (_jspx_th_fmt_message_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
    return false;
  }

  private boolean _jspx_meth_fmt_message_110(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_110 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_110.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_110.setKey("alternate.username.allowed");
    int _jspx_eval_fmt_message_110 = _jspx_th_fmt_message_110.doStartTag();
    if (_jspx_th_fmt_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
    return false;
  }

  private boolean _jspx_meth_fmt_message_111(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_111 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_111.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_111.setKey("false");
    int _jspx_eval_fmt_message_111 = _jspx_th_fmt_message_111.doStartTag();
    if (_jspx_th_fmt_message_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
    return false;
  }

  private boolean _jspx_meth_fmt_message_112(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_112 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_112.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_112.setKey("true");
    int _jspx_eval_fmt_message_112 = _jspx_th_fmt_message_112.doStartTag();
    if (_jspx_th_fmt_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
    return false;
  }

  private boolean _jspx_meth_fmt_message_113(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_113 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_113.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_113.setKey("false");
    int _jspx_eval_fmt_message_113 = _jspx_th_fmt_message_113.doStartTag();
    if (_jspx_th_fmt_message_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
    return false;
  }

  private boolean _jspx_meth_fmt_message_114(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_114 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_114.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_114.setKey("true");
    int _jspx_eval_fmt_message_114 = _jspx_th_fmt_message_114.doStartTag();
    if (_jspx_th_fmt_message_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
    return false;
  }

  private boolean _jspx_meth_fmt_message_115(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_115 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_115.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_115.setKey("configuration");
    int _jspx_eval_fmt_message_115 = _jspx_th_fmt_message_115.doStartTag();
    if (_jspx_th_fmt_message_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
    return false;
  }

  private boolean _jspx_meth_fmt_message_116(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_116 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_116.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_116.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_116.setKey("ds.name.cannotfound.msg");
    int _jspx_eval_fmt_message_116 = _jspx_th_fmt_message_116.doStartTag();
    if (_jspx_th_fmt_message_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
    return false;
  }

  private boolean _jspx_meth_fmt_message_117(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_117 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_117.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_117.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_117.setKey("ds.name.invalid.msg");
    int _jspx_eval_fmt_message_117 = _jspx_th_fmt_message_117.doStartTag();
    if (_jspx_th_fmt_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
    return false;
  }

  private boolean _jspx_meth_fmt_message_118(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_118 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_118.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_118.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_118.setKey("ds.driver.cannotfound.msg");
    int _jspx_eval_fmt_message_118 = _jspx_th_fmt_message_118.doStartTag();
    if (_jspx_th_fmt_message_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
    return false;
  }

  private boolean _jspx_meth_fmt_message_119(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_119 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_119.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_119.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_119.setKey("ds.url.cannotfound.msg");
    int _jspx_eval_fmt_message_119 = _jspx_th_fmt_message_119.doStartTag();
    if (_jspx_th_fmt_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
    return false;
  }

  private boolean _jspx_meth_fmt_message_120(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_120 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_120.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_120.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_120.setKey("save");
    int _jspx_eval_fmt_message_120 = _jspx_th_fmt_message_120.doStartTag();
    if (_jspx_th_fmt_message_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
    return false;
  }

  private boolean _jspx_meth_fmt_message_121(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_121 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_121.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_121.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_121.setKey("ds.name.cannotfound.msg");
    int _jspx_eval_fmt_message_121 = _jspx_th_fmt_message_121.doStartTag();
    if (_jspx_th_fmt_message_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
    return false;
  }

  private boolean _jspx_meth_fmt_message_122(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_122 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_122.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_122.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_122.setKey("ds.name.invalid.msg");
    int _jspx_eval_fmt_message_122 = _jspx_th_fmt_message_122.doStartTag();
    if (_jspx_th_fmt_message_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
    return false;
  }

  private boolean _jspx_meth_fmt_message_123(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_123 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_123.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_123.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_123.setKey("ds.driver.cannotfound.msg");
    int _jspx_eval_fmt_message_123 = _jspx_th_fmt_message_123.doStartTag();
    if (_jspx_th_fmt_message_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
    return false;
  }

  private boolean _jspx_meth_fmt_message_124(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_124 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_124.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_124.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_124.setKey("ds.url.cannotfound.msg");
    int _jspx_eval_fmt_message_124 = _jspx_th_fmt_message_124.doStartTag();
    if (_jspx_th_fmt_message_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
    return false;
  }

  private boolean _jspx_meth_fmt_message_125(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_125 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_125.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_125.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_125.setKey("custom.ds.type.name.cannotfound.msg");
    int _jspx_eval_fmt_message_125 = _jspx_th_fmt_message_125.doStartTag();
    if (_jspx_th_fmt_message_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
    return false;
  }

  private boolean _jspx_meth_fmt_message_126(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_126 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_126.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_126.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_126.setKey("cancel");
    int _jspx_eval_fmt_message_126 = _jspx_th_fmt_message_126.doStartTag();
    if (_jspx_th_fmt_message_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
    return false;
  }

  private boolean _jspx_meth_fmt_message_127(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_bundle_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_127 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_127.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_127.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_bundle_0);
    _jspx_th_fmt_message_127.setKey("back");
    int _jspx_eval_fmt_message_127 = _jspx_th_fmt_message_127.doStartTag();
    if (_jspx_th_fmt_message_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
    return false;
  }
}
