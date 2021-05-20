<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><t:getAsString name="pageTitle" /></title>
</head>
<body>
<table width="100%" border="1">
	<tr>
		<td><t:insertAttribute name="headerPage" /></td>
	</tr>
	<tr>
		<td><t:insertAttribute name="bodyPage" /></td>
	</tr>
	<tr>
		<td><t:insertAttribute name="footerPage" /></td>
	</tr>
</table>
</body>
</html>