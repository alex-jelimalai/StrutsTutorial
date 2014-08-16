<%@ taglib prefix="s" uri="/struts-tags" %>
<h4>Complete and submit the form to create your own portfolio.</h4>
<s:form action="ImageUpload" method="post" enctype="multipart/form-data">
    <s:file name="pic" label="Picture"/>
    <s:submit/>
</s:form>