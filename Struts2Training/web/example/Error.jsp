<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
<body>
<h1>Error Page</h1>
<h3 style="color: red">Exception Occured : <s:property
	value="exception" /></h3>
<br />
<hr />
<h3>Stack Trace</h3>
<p style="background-color: yellow"><s:property
	value="exceptionStack" /></p>
</body>
</html>