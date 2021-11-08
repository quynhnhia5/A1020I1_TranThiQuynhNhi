<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/29/2021
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/employee?action=create" method="post">
        <div class="form-group">
            <label for="employee_id">Mã nhân viên</label>
            <input type="text" class="form-control" id="employee_id" name="employee_id">
        </div>
        <div class="form-group">
            <label for="employee_name">Họ Tên</label>
            <input type="text" class="form-control" id="employee_name" name="employee_name">
        </div>
        <div class="form-group">
            <label for="employee_birthday">Ngày sinh</label>
            <input type="text" class="form-control" id="employee_birthday" name="employee_birthday">
        </div>
        <div class="form-group">
            <label for="employee_id_card">Số CMND</label>
            <input type="text" class="form-control" id="employee_id_card" name="employee_id_card">
        </div>
        <div class="form-group">
            <label for="employee_salary">Lương</label>
            <input type="text" class="form-control" id="employee_salary" name="employee_salary">
        </div>
        <div class="form-group">
            <label for="employee_phone">Số Điện Thoại</label>
            <input type="text" class="form-control" id="employee_phone" name="employee_phone">
        </div>
        <div class="form-group">
            <label for="employee_email">Email </label>
            <input type="text" class="form-control" id="employee_email" name="employee_email">
        </div>
        <div class="form-group">
            <label for="employee_address">Địa chỉ</label>
            <input type="text" class="form-control" id="employee_address" name="employee_address">
        </div>


        <div class="form-group">
            <label for="position_id">Vị trí</label>
            <select class="custom-select" id="position_id" name="position_id">
                <optgroup label="Choose Position">
                    <option value="1" ${requestScope.position == 1 ? "selected":""}>lễ tân</option>
                    <option value="2" ${requestScope.position == 2 ? "selected":""}>phục vụ</option>
                    <option value="3" ${requestScope.position == 3 ? "selected":""}>chuyên viên</option>
                    <option value="4" ${requestScope.position == 4 ? "selected":""}>giám sát</option>
                    <option value="5" ${requestScope.position == 5 ? "selected":""}>quản lý</option>
                    <option value="6" ${requestScope.position == 6 ? "selected":""}>giám đốc</option>
                </optgroup>
            </select>
        </div>
        <div class="form-group">
            <label for="education_degree_id">Trình độ</label>
            <select class="custom-select" id="education_degree_id" name="education_degree_id">
                <optgroup label="Choose Position">
                    <option value="1" ${requestScope.education_degree == 1 ? "selected":""}>trung cấp</option>
                    <option value="2" ${requestScope.education_degree == 2 ? "selected":""}>cao đẵng</option>
                    <option value="3" ${requestScope.education_degree == 3 ? "selected":""}>đại học</option>
                    <option value="4" ${requestScope.education_degree == 4 ? "selected":""}>sau đại học</option>
                </optgroup>
            </select>
        </div>

        <div class="form-group">
            <label for="division_id">Bộ phận làm việc</label>
            <select class="custom-select" id="division_id" name="division_id">
                <optgroup label="Choose Position">
                    <option value="1" ${requestScope.division == 1 ? "selected":""}>sale-marketing</option>
                    <option value="2" ${requestScope.division == 2 ? "selected":""}>hành chính</option>
                    <option value="3" ${requestScope.division == 3 ? "selected":""}>phục vụ</option>
                    <option value="4" ${requestScope.division == 4 ? "selected":""}>quản lý</option>
                </optgroup>
            </select>
        </div>
        <div class="form-group">
            <label for="username">Tên đăng nhập</label>
            <select class="custom-select" id="username" name="username">
                <optgroup label="Choose Position">
                    <option value="1" ${requestScope.user == 1 ? "selected":""}>Hy</option>
                    <option value="2" ${requestScope.user == 2 ? "selected":""}>Nhinhi</option>
                    <option value="3" ${requestScope.user == 3 ? "selected":""}>oanh</option>
                    <option value="4" ${requestScope.user == 4 ? "selected":""}>vy</option>
<%--                    <option>${requestScope.user.username}</option>--%>
<%--                    <option>${requestScope.user.username}</option>--%>
<%--                    <option>${requestScope.user.username}</option>--%>
<%--                    <option>${requestScope.user.username}</option>--%>
                </optgroup>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<a href="/" class="btn btn-success">back</a>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
