<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Url Tag</title>
</head>

<body>
<h4>Url Tag</h4>

<hr/>
<h5>Url Tag Direct Usage</h5>


URL = <s:url value="IteratorTag.action"/><br/>

<a href='<s:url value="IteratorTag.action" />'> Click Me </a>

<hr/>

<h5>Url Tag Stashed in ActionContext</h5>

URL = <s:url action="IteratorTag" id="myUrl">
    <s:param name="id" value="2"/>
</s:url>
<a href='<s:property value="#myUrl" />'> Click Me </a>
<hr/>

</body>

</html>



