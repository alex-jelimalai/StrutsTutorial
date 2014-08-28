<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Bean Tag</title>
</head>

<body>
<h4>Bean Tag</h4>

<s:bean name="manning.ch6.utils.JokeBean">
    <s:param name="jokeType">adult</s:param>
    <s:property value="startAJoke()"/>
</s:bean>

</body>

</html>



