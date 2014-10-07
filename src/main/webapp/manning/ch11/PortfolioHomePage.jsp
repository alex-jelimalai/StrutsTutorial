<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>PortfolioHomePage</title>
    <s:head/>
	</head>

	<body>
		<h4><s:text name="homepage.greeting"/></h4>

	  <hr>
		<h5><s:text name="site.entrance.text"/></h5>
		<h5><a href="<s:url action='VisitorHomePage'/>"><s:text name="visitor"/></a></h5>
		<h5><a href="<s:url action='ArtistHomePage'/>"><s:text name="user"/></a> </h5>		
	  <hr>
	  <s:form>
	     <s:radio name="request_locale" list="locales" value="locale"/>
	     <s:submit key="chooseLanguage"/>
	  </s:form>
	   <hr>
</body>
	
</html>
