<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>PortfolioHomePage</title>
    <s:head/>
	</head>

	<body>
		<h4><s:text name="artistHomePage.greeting"/></h4>
		
	  <hr>
	  <h5><s:text name="artistHomePage.accountManagement"/></h5>
	 	
		<ul>
      <li><a href="<s:url action='LoginForm'/>"><s:text name="artistHomePage.login"/></a></li>	
      <li><a href="<s:url action='Registration'/>"><s:text name="artistHomePage.register"/></a></li>	
    </ul> 
	  <hr>
	</body>
	
</html>
