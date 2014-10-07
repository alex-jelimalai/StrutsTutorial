<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Edit Portfolio</title>
    <s:head/>
	</head>

	<body>
		<h4><s:text name="portfolio.edit"/></h4> 
	  <s:form action="UpdatePortfolio">
    	  <s:textfield name="portfolio.name" key="portfolioName"/>
    	  <s:hidden name="id" value="%{portfolio.id}"/>
        <s:submit/>
		</s:form>	
		<hr/>
		<ul>
		<s:url action='AddImage' id="addImage">
		   <s:param name="id" value="%{portfolio.id}"/> 
		</s:url>
		   <li><a href="<s:property value='addImage'/>"><s:text name="portfolio.addImage.link"/></a></li>	
   </ul>
		
	</body>
	
</html>
