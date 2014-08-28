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
	     </ul> 
	     <br/>
	     <br/>
	     <h5>Demos of Struts 2 Tags</h5>
	     <ul> 
	      <li><a href="<s:url action='ActionTag'/>">&lt;action&gt; Tag (Includes Secondary Result)</a></li>
	      <li><a href="<s:url action='ActionTagNoResult'/>">&lt;action&gt; Tag (Doesn't Include Secondary Result)</a></li>
	      <li><a href="<s:url action='BeanTagWithVar'/>">&lt;bean&gt; Tag Using 'var' Attribute to Put Bean in ActionContext</a></li>		
	      <li><a href="<s:url action='BeanTagWithValueStack'/>">&lt;bean&gt; Tag Using ValueStack</a></li>		
	      <li><a href="<s:url action='DebugTag'/>">&lt;debug&gt; Tag</a></li>
	      <li><a href="<s:url action='IfElseTags'/>">&lt;if&gt;, &lt;elseif&gt;, and &lt;else&gt; Tags</a></li>	
	      <li><a href="<s:url action='InternationalizationTags'/>">&lt;i18n&gt; and &lt;text&gt; Tags</a></li>	
	      <li><a href="<s:url action='IteratorTag'/>">&lt;iterator&gt; Tag</a></li>	
	      <li><a href="<s:url action='PropertyTag'/>">&lt;property&gt; Tag</a></li>	
	      <li><a href="<s:url action='PushTag'/>">&lt;push&gt; Tag</a></li>	
	      <li><a href="<s:url action='SetTag'/>">&lt;set&gt; Tag</a></li>	
	      <li><a href="<s:url action='UrlTag'/>">&lt;url&gt; Tag</a></li>		      
	  	</ul> 	
	</body>
	
</html>
