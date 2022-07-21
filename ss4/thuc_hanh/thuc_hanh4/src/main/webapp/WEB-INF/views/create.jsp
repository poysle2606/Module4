<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/18/2022
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><h1>TỜ KHAI Y TẾ</h1></center>
<form:form action="/list" method="post" modelAttribute="medical">
    <div>
        <form:hidden path="id"/>
    </div>
    <div>
        <label for="name">Họ và tên:</label>
        <form:input path="name" id="name"/>
    </div>
    <div>
        <label for="year">Năm sinh:</label>
        <form:select path="yearOfBirth" id="year" items="${yearOfBirth}"/>
    </div>

    <div>
        <label for="move">Thông tin đi lại:</label>
        <form:radiobuttons path="move" id="move" items="${move}"/>
    </div>
    <div>
        <label for="dayStart">Ngày khởi hành</label>
        <form:select path="dayStart" id="dayStart" items="${dayStart}"/>
    </div>
    <div>
        <label for="monthStart">Tháng khởi hành</label>
        <form:select path="monthStart" id="monthStart" items="${monthStart}"/>
    </div>
    <div>
        <label for="yearStart">Năm khởi hành</label>
        <form:select path="yearStart" id="yearStart" items="${yearStart}"/>
    </div>
    <div>
        <label for="dayEnd">Ngày kết thúc</label>
        <form:select path="dayEnd" id="dayEnd" items="${dayEnd}"/>
    </div>
    <div>
        <label for="monthEnd">Tháng kết thúc</label>
        <form:select path="monthEnd" id="monthEnd" items="${monthEnd}"/>
    </div>
    <div>
        <label for="yearEnd">Năm kết thúc</label>
        <form:select path="yearEnd" id="yearEnd" items="${yearEnd}"/>
    </div>

    <div>
        <label for="information14Days"></label>
        <form:textarea path="information14Days" id="information14Days"/>
    </div>

    <a href="/list">
        <button>Create</button>
    </a>

</form:form>
</body>
</html>
