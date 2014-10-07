<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Image Upload Form</title>
	</head>

	<body>
		<h4><s:text name="portfolio.upload.greeting"/></h4> 
				<s:form action="ImageUpload" method="post" enctype="multipart/form-data">
    			<s:file name="pic" /> 
    					<s:hidden name="id" value="%{#parameters.id}"/>
    		<s:submit key="submit"/>
		</s:form>	
	  
		
	</body>
	
</html>
