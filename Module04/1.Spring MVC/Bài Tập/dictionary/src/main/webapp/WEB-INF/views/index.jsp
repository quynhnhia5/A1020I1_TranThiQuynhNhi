<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/15/2021
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/converter" method="post">
    Nhập tỉ giá:
    <input type="text" name="rate" value="22000"><br>
    Nhập số USD MUỐN CHUYỂN:
    <input type="text" name="usd" value="0"><br>
    <button type="submit">Converter</button>
</form>
</body>
</html>
