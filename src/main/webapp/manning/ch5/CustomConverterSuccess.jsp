<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Custom Converter Success</title>
</head>

<body>
<hr/>
<h5>Congratulations! You have used a custom converter to create a Circle object
    from a string and back to a string. </h5>

<p> You created a circle with radius equal to <s:property value="circle.radius"/></p>

Just to check the outgoing data conversion, here's the circle back in the string syntax <s:property value="circle"/>
<hr/>
</body>

</html>
