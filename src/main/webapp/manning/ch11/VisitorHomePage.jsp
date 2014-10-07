<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>PortfolioHomePage</title>
    <s:head/>
	</head>

	<body>
		<h4><s:text name="visitorHomePage.greeting"/></h4>
		
	
     <hr/>

	 
	  <h5><s:text name="visitorHomePage.viewPortfolio"/> </h5>
	  
	  <s:form action="ViewPortfolioJSP" >
			<s:doubleselect name="username" list='users' listKey="username" listValue="username" doubleName="id"  doubleList="portfolios" doubleListKey="id" doubleListValue="name"  key="visitorHomePage.selectPortfolio" />  
			<s:submit key="visitorHomePage.submit"/>
      </s:form>	
	
	  <hr/>
	  
	 

	</body>
	
</html>
