<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Sign On</title>
    </head>
    <body>
        <h1><s:text name="loginForm.title"/></h1>
        Action Errors:    <s:actionerror/>
        Action Messages : <s:actionmessage/>

        Field Errors : 	<s:fielderror/><!-- all field -->
        <!--s:fielderror fieldName="password"/-->
        <s:form action="Login_processLogin" validate="true">
            <s:textfield key="username"/>
            <s:password key="password"/>
            <s:submit label="Login"/>
        </s:form>
    </body>
</html>
