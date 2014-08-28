<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Bean Tag</title>
</head>

<body>
<h4>Bean Tag</h4>

<s:bean name="org.apache.struts2.util.Counter" var="counter">
    <s:param name="last" value="100"/>
</s:bean>

<s:iterator value="#counter">
    <!-- Remember, the struts2 property tag defaults to the
    top of the stack if a 'value' attribute is not set. -->
    <li><s:property/></li>
</s:iterator>

</body>

</html>



