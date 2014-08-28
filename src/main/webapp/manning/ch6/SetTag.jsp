<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Set Tag</title>
</head>

<body>
<h4>Set Tag</h4>
<hr/>
<s:set name="username" value="user.username"/>
Hello, <s:property value="#username"/>. How are you?
<hr/>
This line demonstrates the set of an attribute to application scope
<hr/>
<s:set name="portfolio" scope="application" value="user.portfolioName"/>
Your portfolio is <s:property value="#application['portfolio']"/>.
<hr/>
</body>

</html>



