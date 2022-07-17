<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/14/2022
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="" method="post">
    <table>
        <tr>
            <td>Nhập số tiền muốn đổi:</td>
            <td><input type="number" name="usd" required value="${usd}"></td>
        </tr>
        <tr>
            <td>Mệnh giá:</td>
            <td><input disabled type="text" value="22000"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Submit</button>
            </td>
        </tr>
    </table>

   <h3>Result: ${result}</h3>
</form>
</body>
</html>
