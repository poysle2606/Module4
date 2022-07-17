<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/15/2022
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính cá nhân</title>
</head>
<body>
<form action="/calculator" method="post">
    <table>
        <tr>
            <td rowspan="2">
                <input required type="number" name="number1" value="${number1}">
            </td>
            <td rowspan="2">
                <input required type="number" name="number2" value="${number2}">
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" name="operand" value="+">Cộng</button>
            </td>
            <td>
                <button type="submit" name="operand" value="-">Trừ</button>
            </td>
            <td>
                <button type="submit" name="operand" value="*">Nhân</button>
            </td>
            <td>
                <button type="submit" name="operand" value="/">Chia</button>
            </td>
        </tr>
    </table>

    <h3>Result: ${result}</h3>
</form>
</body>
</html>
