<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="EmployeeList.title" /></title>
</head>
<body>
<h1><s:text name="EmployeeList.title"></s:text></h1>
<a href="Employee_input.action">Register Employee</a>
<table border="1">
	<tr>
		<th><s:text name="empno" /></th>
		<th><s:text name="name" /></th>
		<th><s:text name="salary" /></th>
	</tr>
	<s:iterator value="employees">
		<tr>
			<td><s:property value="empno" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="salary" /></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>
