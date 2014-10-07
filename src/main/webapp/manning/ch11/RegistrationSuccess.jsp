<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Registration Success</title>
	</head>

	<body>
		<h5><s:text name="registration.success"/> </h5>
		<p><a href="<s:url action='secure/AdminPortfolio'/>"><s:text name="registration.success.toAccount"/></a></p> 	
	</body>
	
</html>
