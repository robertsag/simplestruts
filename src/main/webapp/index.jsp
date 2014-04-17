<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<body>
<h2>Press Submit to see MAGIC!!!</h2>
<html:form action="simple" method="post">
	Name: <html:text property="name" /> <br>
	Company: <html:text property="company" /> <br>
	Age: <html:text property="age" /><html:errors property="age"/> <br> 
	<html:submit/>
</html:form>
</body>
</html>
