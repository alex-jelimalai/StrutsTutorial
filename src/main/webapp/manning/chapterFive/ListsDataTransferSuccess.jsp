<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Lists Data Transfer Success</title>
</head>

<body>
<h5>Congratulations! You have transferred and converted data to and from List properties.</h5>

<h3>Last name number 3 = <s:property value="lastNames[2]"/></h3>

<h3>Middle name number 3 = <s:property value="middleNames[2]"/></h3>
<h3>Weight number 3  = <s:property value="weights[2]" /> </h3>
<h3>User.username number 3  = <s:property value="users[2].username" /> </h3>


</body>

</html>
