<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/14/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Calculator</h1>
<form action="" method="post">
    <table>
        <tr>
            <td>
                <input type="number" name="number1">
            </td>
            <td>
                <input type="number" name="number2">
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" name="+">Addition(+)</button>
            </td>
            <td>
                <button type="submit" name="-">Subtraction(-)</button>
            </td>
            <td>
                <button type="submit" name="*">Multiplication(*)</button>
            </td>
            <td>
                <button type="submit" name="/">Division(/)</button>
            </td>
        </tr>
    </table>
</form>

<h3>Result:</h3>
</body>
</html>
