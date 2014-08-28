<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Push Tag</title>
</head>

<body>
<h4>Push Tag</h4>
<hr/>
<s:push value="user">
    <h2>This is the "<s:property value="portfolioName"/>" portfolio</h2>
    It was created by none other than <s:property value="firstName"/> <s:property value="lastName"/>.
</s:push>
<hr/>

</body>

</html>



