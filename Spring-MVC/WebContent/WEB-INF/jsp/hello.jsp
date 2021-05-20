<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
<head><title>Contacts Security Demo</title></head>
<body>
<h1>Contacts Security Demo</h1>

<p>To demonstrate a public method on <code>ContactManager</code>,
here's a random <code>Contact</code>:
<p>
<code>
<c:out value="${contact}"/>
</code>
<p>Get started by clicking "Manage"...
<p><A HREF="<c:url value="secure/index.htm"/>">Manage</a>
<a href="<c:url value="secure/debug.jsp"/>">Debug</a>
</body>
</html>
