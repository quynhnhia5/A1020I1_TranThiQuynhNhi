<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/28/2021
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="/customer?action=edit" method="post">
        <div class="form-group">
            <label for="customer_type_id">Loại Khách</label>
            <input type="text" class="form-control" id="customer_type_id" name="customer_type_id" value="${requestScope.customer.customerType.customer_type_id}">
        </div>
        <div class="form-group">
            <label for="customer_name">Tên Khách Hàng</label>
            <input type="text" class="form-control" id="customer_name" name="customer_name" value="${requestScope.customer.customer_name}">
        </div>
        <div class="form-group">
            <label for="customer_birthday">Ngày sinh</label>
            <input type="text" class="form-control" id="customer_birthday" name="customer_birthday" value="${requestScope.customer.customer_birthday}">
        </div>
        <div class="form-group">
            <label for="customer_gender">giới tính</label>
            <input type="text" class="form-control" id="customer_gender" name="customer_gender" value="${requestScope.customer.customer_gender}">
        </div>
        <div class="form-group">
            <label for="customer_is_card">Số CMND </label>
            <input type="text" class="form-control" id="customer_is_card" name="customer_is_card" value="${requestScope.customer.customer_is_card}">
        </div>
        <div class="form-group">
            <label for="customer_phone">Số Điện Thoại</label>
            <input type="text" class="form-control" id="customer_phone" name="customer_phone" value="${requestScope.customer.customer_phone}">
        </div>
        <div class="form-group">
            <label for="customer_email">Email</label>
            <input type="text" class="form-control" id="customer_email" name="customer_email" value="${requestScope.customer.customer_email}">
        </div>
        <div class="form-group">
            <label for="customer_address">Địa Chỉ</label>
            <input type="text" class="form-control" id="customer_address" name="customer_address" value="${requestScope.customer.customer_address}">
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
