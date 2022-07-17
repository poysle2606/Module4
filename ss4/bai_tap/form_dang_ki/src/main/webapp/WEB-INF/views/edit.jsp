<!doctype html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<center><h2>CẬP NHẬT TỜ KHAI Y TẾ</h2></center>
<center><h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ
    LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h5></center>
<center><p style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm phaps luật Việt Nam và có thể sử lý hình
    sự</p></center>
<form:form modelAttribute="edit" action="/edit" method="post" class="row">
    <div class="col-12">
        <label for="name" class="form-label">Họ và tên(IN HOA)</label>
        <span class="text-danger">(*)</span>
        <form:input path="name" id="name" cssClass="form-control"/>
    </div>
    <div class="col-4">
        <label for="dayOfBirth" class="form-label">Năm sinh</label>
        <span class="text-danger">(*)</span>
        <form:select path="yearOfBirth" items="${yearOfBirth}" cssClass="form-control" id="dayOfBirth"/>
    </div>
    <div class="col-4">
        <label for="gender" class="form-label">Giới tính</label>
        <span class="text-danger">(*)</span>
        <form:select path="gender" items="${gender}" cssClass="form-control" id="gender"/>
    </div>
    <div class="col-4">
        <label for="national" class="form-label">Quốc tịch</label>
        <span class="text-danger">(*)</span>
        <form:select path="national" items="${national}" cssClass="form-control" id="national"/>
    </div>
    <div class="col-12">
        <label for="pages" class="form-label">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hớp pháp khác</label>
        <span class="text-danger">(*)</span>
        <form:input path="idCard" name="idCard" cssClass="form-control" id="pages"/>
    </div>
    <div class="col-12">
        <p>Thông tin đi lại</p>
        <span class="text-danger">(*)</span>
        <div class="form-check form-check-inline">
            <form:radiobuttons path="move" items="${move}"/>
        </div>

    </div>
    <div class="col-6">
        <label for="number1">Số hiệu phương tiện</label>
        <span class="text-danger">(*)</span>
        <form:input path="idCar" id="number1" cssClass="form-control"/>
    </div>
    <div class="col-6">
        <label for="char">Số ghế</label>
        <form:input path="numberChair" id="char" cssClass="form-control"/></div>
    <div class="col-6">
        <label for="dayStart">Ngày khởi hành</label>
        <span class="text-danger">(*)</span>
        <div class="col-12">
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="dayStart" items="${dayStart}" cssClass="form-control" id="dayStart"/>
            </div>
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="monthStart" items="${monthStart}" cssClass="form-control" id="dayStart"/>
            </div>
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="yearStart" items="${yearStart}" cssClass="form-control" id="dayStart"/>
            </div>
        </div>
    </div>
    <div class="col-6">
        <label for="dayStart">Ngày kết thúc</label>
        <span class="text-danger">(*)</span>
        <div class="col-12">
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="dayEnd" items="${dayEnd}" cssClass="form-control" id="dayStart"/>
            </div>
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="monthEnd" items="${monthEnd}" cssClass="form-control" id="dayStart"/>
            </div>
            <div class="col-4" style="float: left; width: 100%">
                <form:select path="yearEnd" items="${yearEnd}" cssClass="form-control" id="dayStart"/>
            </div>
        </div>
    </div>
    <div class="col-12">
        <label for="floatingTextarea">Trong vòng 14 ngày qua Anh/Chị có đến tỉnh/thành phố nào?</label>
        <span class="text-danger">(*)</span>
        <div for="floatingTextarea" class="form-floating">
            <form:textarea path="information14Day" id="floatingTextarea" cssClass="form-control"/>
        </div>
    </div>

    <a href="/result" style="margin: auto">
        <button>Gửi tờ khai</button>
    </a>
</form:form>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
