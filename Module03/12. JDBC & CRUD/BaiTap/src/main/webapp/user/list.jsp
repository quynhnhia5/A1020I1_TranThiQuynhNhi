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
<div class="container">

    <a href="/user?action=create" class="btn btn-success">Thêm mới</a>
    <input type="text" class="bg-light" placeholder="Tìm kiếm" style="margin-left: 700px" name="countrySearch">
    <a href="/user?action=search" class="btn btn-success">Search</a>

    <h3><%= request.getAttribute("msgDelete")!=null?request.getAttribute("msgDelete"):"" %></h3>

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
        <c:forEach var="user" items="${userList}">
            <tr>
                <td> ${user.id}</td>
                <td> ${user.name}</td>
                <td> ${user.email}</td>
                <td> ${user.country}</td>
                <td> <a href="/user?action=delete&id=${user.id}">Delete</a></td>
                <td> <a href="/user?action=edit&id=${user.id}">Edit</a></td>

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
        $('#user').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        })
    })
</script>
</body>
</html>
