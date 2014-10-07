<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Portfolio Account Update</title>
    <s:head/>
	</head>

	<body>
	super=<s:text name="user.super"/>
		<h4><s:text name="account.update.greeting"/></h4> 
		<s:form action="UpdateAccount">
    	  <s:label key="user.username" />
    	  <s:hidden name="user.username" />
    	  <s:hidden name="id" />
     	  <s:textfield key="user.firstName"/>
     	  <s:textfield key="user.lastName"  />
    	  <s:password key="user.password"  showPassword="true"/>
    	  <s:textfield key="user.email" />
     	  <s:checkbox key="user.receiveJunkMail"   />
    	  <s:submit key="submit"/>
		</s:form>	 
		
	</body>
	
</html>
