<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Multivalued request parameters</title></head>

<body>
<s:form action="ArraysDataTransferTest">
    <s:textfield name="ages" label="Ages"/>
    <s:textfield name="ages" label="Ages"/>
    <s:textfield name="ages" label="Ages"/>

    <s:textfield name="names[0]" label="names"/>
    <s:textfield name="names[1]" label="names"/>
    <s:textfield name="names[2]" label="names"/>
    <s:submit/>
</s:form>
</body>
</html>