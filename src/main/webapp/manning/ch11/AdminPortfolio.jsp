<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Administrate Your Portfolio</title>
	</head>

	<body>
		<h4></h4>
		<ul>
     <li><a href="<s:url action='UpdateAccountForm'/>"><s:text name="update.account.link"/></a></li>	
     <li><a href="<s:url action='CreatePortfolioForm'/>"><s:text name="add.portfolio.link"/></a></li>	
 	  </ul> 	
 	
 	<hr/>
    <s:form action="EditPortfolio" >
			<s:select name="id" list='user.portfolios' listKey="id" listValue="name" key="admin.select.portfolio"  />  
			<s:submit key="submit"/>
    </s:form>	
      
	</body>
	
</html>
