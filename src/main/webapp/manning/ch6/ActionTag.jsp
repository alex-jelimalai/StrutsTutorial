<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Action Tag</title>
</head>

<body>
<h3>Action Tag</h3>
<hr/>
<h4>This line is from the ActionTag action's result.</h4>
<s:action name="TargetAction" executeResult="true"/>
<hr/>
</body>

</html>



