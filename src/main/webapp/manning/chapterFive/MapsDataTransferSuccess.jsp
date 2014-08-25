<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Maps Data Transfer Success</title>
</head>

<body>
<h5>Congratulations! You have transferred data into and out of a Map property.</h5>


<h3>Maiden Names 'hellen'  = <s:property value="maidenNames.hellen" /> </h3>
<h3>Maiden Names 'martha'  = <s:property value="maidenNames.martha" /> </h3>
<h3>MyUsers 'jimmy' username  = <s:property value="myUsers.jimmy.username" /> </h3>
<h3>MyUsers 'jimmy' birthday  = <s:property value="myUsers.jimmy.birthday" /> </h3>
<h3>MyOrderedUsers '1' birthday  = <s:property value="myOrderedUsers['1'].birthday" /> </h3>


</body>

</html>
