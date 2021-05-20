<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>
<body>
<h1><s:text name="EmployeeForm.title"></s:text></h1>
<s:actionerror/>
<s:fielderror/>
<s:property value="exception"/>
<s:form action="Employee_register">
    <s:textfield key="empno"/>
    <s:textfield key="name"/>
    <s:textfield key="salary"/>
    <s:submit value="Register"></s:submit>
</s:form>
</body>
</html>
