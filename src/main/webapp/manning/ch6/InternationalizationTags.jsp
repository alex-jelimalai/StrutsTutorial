<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Internationalization Tags</title>
	</head>

	<body>
		<h4>Internationalization Tags</h4>	
			
		<s:i18n name="manning.ch6.myResourceBundle_tr">
		
			<!-- The text tag can be used to output a resource inline or,
			     if the 'id' attribute is used, the returned resource value 
			     will be stored in the action context for later use.-->
			
			In <s:text name="language"/>,
			<s:text name="girl" id="foreignWord"/> 
			
		</s:i18n>
		
		"<s:property value="#foreignWord"/>" means girl.
	</body>
	
</html>



