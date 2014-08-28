<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>ViewPortfolio</title>
	</head>

	<body>
	
	
		<h4>Select a portfolio to view.</h4> 	
	  	<s:iterator value="users" status="itStatus">
	  		<li>
	  			<s:property value="#itStatus.count" />
	  			<a href="<s:url action='ViewPortfolio'/>">
	  				<s:property value="portfolioName"/>
	  			</a>
	  		</li>
		</s:iterator>
		
	</body>
	
</html>
