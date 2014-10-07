<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Portfolio Creation</title>
    <s:head/>
	</head>

	<body>
		<h4><s:text name="portfolio.create.greeting"/></h4> 
		<s:form action="CreatePortfolio">
    	  <s:textfield name="name" key="portfolioName"/>
    	  <s:submit key="submit"/>
		</s:form>	
	  
		
	</body>
	
</html>
