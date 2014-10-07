<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Portfolio Registration</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <s:head/>
	</head>

	<body>
		<h4><s:text name="registration.greeting"/></h4> 
		
		<s:actionerror />
		<s:form action="Register">
    	  <s:textfield key="username" />
    	  <s:password key="password" />
    	  <s:textfield key="firstName" />
    	  <s:textfield key="lastName"/>
     	  <s:textfield key="portfolioName" />  	
     	  <s:textfield key="email" />  	
     	  <s:textfield name="age" label="Age"/>
    	  <s:checkbox key="receiveJunkMail" fieldValue="true" />
    	  <s:submit/>
		</s:form>	
	  
		
	</body>
	
</html>
