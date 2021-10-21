<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/20/2021
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/user?action=edit" method="post">
        <div class="form-group">
            <label for="id">Mã Người dùng</label>
            <input type="text" class="form-control" id="id" name="id" value="${requestScope.user.id}">
        </div>
        <div class="form-group">
            <label for="name">Tên Người Dùng</label>
            <input type="text" class="form-control" id="name" name="name" value="${requestScope.user.name}">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" class="form-control" id="email" name="email" value="${requestScope.user.email}">
        </div>
        <div class="form-group">
            <label for="country">Quốc Gia</label>
            <input type="text" class="form-control" id="country" name="country" value="${requestScope.user.country}">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
