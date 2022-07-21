<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/18/2022
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h1>Danh sách Tờ khai y tế</h1></center>
<h1 style="color: chartreuse">${mess}</h1>
<a href="/create"><button>Create</button></a>
<table class="table table-dark table-striped">
    <tr>
        <th>STT:</th>
        <th>Họ và tên:</th>
        <th>Năm sinh:</th>
        <th>Thông tin đi lại:</th>
        <th>Ngày khởi hành:</th>
        <th>Tháng khởi hành:</th>
        <th>Năm khởi hành:</th>
        <th>Ngày kết thúc:</th>
        <th>Tháng kết thúc:</th>
        <th>Năm kết thúc:</th>
    </tr>
    <c:forEach items="${medical}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.yearOfBirth}</td>
            <td>${list.move}</td>
            <td>${list.dayStart}</td>
            <td>${list.monthStart}</td>
            <td>${list.yearStart}</td>
            <td>${list.dayEnd}</td>
            <td>${list.monthEnd}</td>
            <td>${list.yearEnd}</td>
            <td><a href="/edit?id=${list.id}"><button>Edit</button></a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
