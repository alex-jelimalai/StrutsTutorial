<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Multivalued request parameters with lists</title></head>

<body>
<s:form action="ListsDataTransferTest">
    <s:textfield name="middleNames[0]" label="middleNames"/>
    <s:textfield name="middleNames[1]" label="middleNames"/>
    <s:textfield name="middleNames[2]" label="middleNames"/>

    <s:textfield name="lastNames" label="lastNames"/>
    <s:textfield name="lastNames" label="lastNames"/>
    <s:textfield name="lastNames" label="lastNames"/>

    <s:textfield name="weights[0]" label="weights"/>
    <s:textfield name="weights[1]" label="weights"/>
    <s:textfield name="weights[2]" label="weights"/>

    <s:textfield name="users[0].username" label="Usernames"/>
    <s:textfield name="users[1].username" label="Usernames"/>
    <s:textfield name="users[2].username" label="Usernames"/>

    <s:submit/>
</s:form>
</body>
</html>