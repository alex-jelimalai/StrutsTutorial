<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    	<title>Viewing Portfolio</title>
	</head>
	<body>
		<h5><s:text name="portfolio.view.greeting"/></h5>
		<s:iterator value="portfolio.pics">
		<img src='../images/<s:property />' width="300" height="200"/>
		</s:iterator>
		<h6><s:text name="portfolio.view.tagline">
					<s:param value="portfolio.owner.firstName"/>
					<s:param value="portfolio.owner.lastName"/>
				</s:text></h6>
		<a href="<s:url action='PortfolioHomePage'/>"><s:text name="admin.link"/></a>
		<s:text name="timestamp">
		   <s:param value="currentDate"/>
		</s:text>
		</body>
	
</html>
