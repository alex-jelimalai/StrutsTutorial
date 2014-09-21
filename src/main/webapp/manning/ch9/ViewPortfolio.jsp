<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    	<title>Viewing Portfolio</title>
	</head>
	<body>
		<h5>
			This is the <s:property value="portfolio.name"/> portfolio of the artist currently 
			known as <s:property value="portfolio.owner.username"/>
			
		</h5>
		<s:set value="portfolioService.fileSystemHome" name="path"/>
		<s:iterator value="portfolio.pics">
		<!--  We'll pull the directory off of the ValueStack. -->
		<img src='../images/<s:property />' width="300" height="200"/>
		</s:iterator>
		<a href="<s:url action='PortfolioHomePage'/>">Home</a>
	</body>
	
</html>
