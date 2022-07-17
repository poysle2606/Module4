<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/15/2022
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>Login</h3>
<%--@elvariable id="login" type="codegym"--%>
<form:form action="login" method="post" modelAttribute="login">
<fieldset>
    <legend>Login</legend>
    <table>
        <tr>
            <td><form:label path="account"></form:label></td>
            <td><form:input path="account"/></td>
        </tr>
        <tr>
            <td><form:label path="password"></form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button>Login</form:button></td>
        </tr>
    </table>
</fieldset>

</form:form>
</body>
</html>
