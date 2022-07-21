<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/15/2022
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Mail</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/edit" method="post" modelAttribute="email">
    <table>
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>languages:</td>
            <td><form:select path="language" items="${languageList}"/></td>
        </tr>
        <tr>
            <td>Pages size:</td>
            <td>Show
                <form:select path="pageSize" items="${pageSizeList}"/>
                email per page
            </td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td><form:checkbox path="spamsFilter"/> Enable spams filter</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Update</form:button></td>
        </tr>
    </table>
</form:form>
<a href="/list">
    <button>Cancel</button>
</a>
</body>
</html>
