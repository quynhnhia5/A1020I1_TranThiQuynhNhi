<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/20/2021
  Time: 6:53 PM
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
    <form action="/customer?action=create" method="post">
        <div class="form-group">
            <label for="customer_type_id">Loại Khách</label>
            <input type="text" class="form-control" id="customer_type_id" name="customer_type_id">
        </div>
        <div class="form-group">
            <label for="customer_name">Tên Khách Hàng</label>
            <input type="text" class="form-control" id="customer_name" name="customer_name">
        </div>
        <div class="form-group">
            <label for="customer_birthday">Ngày sinh</label>
            <input type="text" class="form-control" id="customer_birthday" name="customer_birthday">
        </div>
        <div class="form-group">
            <label for="customer_gender">giới tính</label>
            <input type="text" class="form-control" id="customer_gender" name="customer_gender">
        </div>
        <div class="form-group">
            <label for="customer_is_card">Số CMND </label>
            <input type="text" class="form-control" id="customer_is_card" name="customer_is_card">
        </div>
        <div class="form-group">
            <label for="customer_phone">Số Điện Thoại</label>
            <input type="text" class="form-control" id="customer_phone" name="customer_phone">
        </div>
        <div class="form-group">
            <label for="customer_email">Email</label>
            <input type="text" class="form-control" id="customer_email" name="customer_email">
        </div>
        <div class="form-group">
            <label for="customer_address">Địa Chỉ</label>
            <input type="text" class="form-control" id="customer_address" name="customer_address">
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
