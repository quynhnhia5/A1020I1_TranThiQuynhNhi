<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2021
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/greeting">
    <input type="text" name="name">
    <input type="submit">
</form>
<h1>Hello ${name}</h1>
</body>
</html>
