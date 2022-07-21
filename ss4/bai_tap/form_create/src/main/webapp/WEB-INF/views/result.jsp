<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/16/2022
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin</title>
</head>
<body>
    <h1>Thông tin người khai</h1>
    <p>Họ và tên: ${medical.name}</p>
    <p>Năm sinh: ${medical.yearOfBirth}</p>
    <p>Giới tính: ${medical.gender}</p>
    <p>Quốc tịch: ${medical.national}</p>
    <p>Số hộ chiếu hoặc CMND hoặc giấy thông hành hợp pháp khác: ${medical.idCard}</p>
    <p>Thông tin đi lại: ${medical.move}</p>
    <p>Số hiệu phương tiện: ${medical.idCar}</p>
    <p>Số ghế: ${medical.numberChair}</p>
    <p>Ngày khởi hành: ${medical.dayStart}-${medical.monthStart}-${medical.yearStart}</p>
    <p>Ngày kết thúc: ${medical.dayEnd}-${medical.monthEnd}-${medical.yearEnd}</p>
    <p>Thông tin đi lại trong vòng 14 ngày: ${medical.information14Day}</p>
    <a href="/edit?idCard=${medical.idCard}"><button>Cập nhật</button></a>
</body>
</html>
