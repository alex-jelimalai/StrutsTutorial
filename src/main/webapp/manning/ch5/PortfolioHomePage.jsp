<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>PortfolioHomePage</title>
</head>

<body>
<h4>Welcome to the Struts 2 Portfolio!</h4>
<ul>
    <li><a href="<s:url action='LoginForm'/>">Login to an Existing Account</a></li>
    <li><a href="<s:url action='Registration'/>">Create an Account</a></li>
    <li><a href="<s:url action='DataTransferTestForm'/>">Data Transfer Test</a></li>
    <li><a href="<s:url action='ArraysDataTransferTestForm'/>">Arrays Data Transfer Test</a></li>
    <li><a href="<s:url action='ListsDataTransferTestForm'/>">Lists Data Transfer Test</a></li>
    <li><a href="<s:url action='MapsDataTransferTestForm'/>">Maps Data Transfer Test</a></li>
    <li><a href="<s:url action='CustomConverterTestForm'/>">Custom Converter Test</a></li>
</ul>
</body>

</html>
