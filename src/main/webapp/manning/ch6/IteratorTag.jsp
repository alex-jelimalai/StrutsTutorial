<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>
        Example of iterator
    </title>
</head>
<body>
<h4>Iterator Tag</h4>

<h3>Existing User Portfolios:</h3>

<hr/>
<s:iterator value="users" status="itStatus">
    <li>
        <s:property value="#itStatus.count"/>
        <s:property value="portfolioName"/>
    </li>
</s:iterator>

<p>Info in the counter</p>
<s:iterator value="users" status="itStatus">
    <li>
        Index: <s:property value="#itStatus.index"/> ,
        Count: <s:property value="#itStatus.count"/> ,
        Is Even: <s:property value="#itStatus.even"/> ,
        Is First: <s:property value="#itStatus.first"/> ,
        Is Last: <s:property value="#itStatus.last"/> ,
        Is Odd: <s:property value="#itStatus.odd"/> ,
        Modulus: <s:property value="#itStatus.modulus(3)"/> ,
    </li>
</s:iterator>
</body>
</html>