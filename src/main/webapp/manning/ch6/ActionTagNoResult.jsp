<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Action Tag</title>
	</head>

	<body>
		<h3>Action Tag</h3>
		<hr/>
		<h4>This line is before the ActionTag invokes the secondary action.</h4>
		<s:action name="TargetAction"/>
		<h4>Secondary action has fired now.  So, we can access data stored by that action.</h4>
		<h5>The request attribute set by the secondary action is:</h5> <pre> <s:property value="#request.dataFromSecondAction"/></pre>
		<hr/>
	</body>
	
</html>



