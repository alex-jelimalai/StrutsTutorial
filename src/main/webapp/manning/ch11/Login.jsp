<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
   	</head>

	<body>
		<h4><s:text name="login"/></h4> 
		<s:form action="Login">
    		<s:textfield key="username"/>
     		<s:password key="password"/>
    		<s:submit key="submit"/>
		</s:form>	
	  
		
	</body>
	
</html>
