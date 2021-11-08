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
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<div class="container-fluid">

    <a href="/customer?action=create" class="btn btn-success">Thêm mới</a>

    <table id="customer" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Mã Khách Hàng</th>
            <th scope="col">Loại Khách</th>
            <th scope="col">Họ tên</th>
            <th scope="col">Ngày sinh</th>
            <th scope="col">giới tính</th>
            <th scope="col">Số CMND</th>
            <th scope="col">Số điện thoại</th>
            <th scope="col">Email</th>
            <th scope="col">Địa chỉ</th>


        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td> ${customer.customer_id}</td>
                <td> ${customer.customerType.customer_type_id}</td>
                <td> ${customer.customer_name}</td>
                <td> ${customer.customer_birthday}</td>
                <td> ${customer.customer_gender}</td>
                <td> ${customer.customer_is_card}</td>
                <td> ${customer.customer_phone}</td
                <td> ${customer.customer_email}</td>
                <td> ${customer.customer_address}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        })
    })
</script>
</body>
</html>
