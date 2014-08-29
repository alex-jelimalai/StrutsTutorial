<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>If/Else Tags</title>
</head>

<body>
<h4>If/Else Tags</h4>
<h5>The condition checks if the user is 35 years old</h5>
<s:if test="user.age > 35">This user is too old.</s:if>
<s:elseif test="user.age < 35">This user is too young</s:elseif>
<s:else>This user is just right</s:else>

</body>

</html>



