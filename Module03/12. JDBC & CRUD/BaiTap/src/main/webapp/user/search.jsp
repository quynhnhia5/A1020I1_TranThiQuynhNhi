<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/21/2021
  Time: 12:46 PM
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
<div class="container">
    <form action="/user?action=search" method="post">
    <a href="" class="btn btn-success">Trở về Trang chủ</a>

    <table id="user" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Mã Người Dùng</th>
            <th scope="col">Tên Người Dùng</th>
            <th scope="col">Email</th>
            <th scope="col">Quốc Gia</th>
            <th scope="col">Xóa</th>
            <th scope="col">Cập Nhật</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${UserCountryList}">
            <tr>
                <td> ${list.id}</td>
                <td> ${list.name}</td>
                <td> ${list.email}</td>
                <td> ${list.country}</td>
                <td> <a href="/user?action=delete&id=${user.id}">Delete</a></td>
                <td> <a href="/user?action=edit&id=${user.id}">Edit</a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
    </form>

</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#user').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        })
    })
</script>
</body>
</html>
