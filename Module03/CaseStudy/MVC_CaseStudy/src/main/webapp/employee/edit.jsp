<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2021
  Time: 12:43 PM
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
    <form action="/employee?action=edit" method="post">
        <div class="form-group">
            <label for="employee_id">Mã nhân viên</label>
            <input type="text" class="form-control" id="employee_id" name="employee_id" value="${requestScope.employee.employee_id}">
        </div>
        <div class="form-group">
            <label for="employee_name">Họ Tên</label>
            <input type="text" class="form-control" id="employee_name" name="employee_name"  value="${requestScope.employee.employee_name}">
        </div>
        <div class="form-group">
            <label for="employee_birthday">Ngày sinh</label>
            <input type="text" class="form-control" id="employee_birthday" name="employee_birthday"   value="${requestScope.employee.employee_birthday}">
        </div>
        <div class="form-group">
            <label for="employee_id_card">Số CMND</label>
            <input type="text" class="form-control" id="employee_id_card" name="employee_id_card" value="${requestScope.employee.employee_id_card}">
        </div>
        <div class="form-group">
            <label for="employee_salary">Lương</label>
            <input type="text" class="form-control" id="employee_salary" name="employee_salary" value="${requestScope.employee.employee_salary}">
        </div>
        <div class="form-group">
            <label for="employee_phone">Số Điện Thoại</label>
            <input type="text" class="form-control" id="employee_phone" name="employee_phone" value="${requestScope.employee.employee_phone}">
        </div>
        <div class="form-group">
            <label for="employee_email">Email </label>
            <input type="text" class="form-control" id="employee_email" name="employee_email" value="${requestScope.employee.employee_email}">
        </div>
        <div class="form-group">
            <label for="employee_address">Địa chỉ</label>
            <input type="text" class="form-control" id="employee_address" name="employee_address" value="${requestScope.employee.employee_address}">
        </div>

        <div class="form-group">
            <label for="position_id">Vị trí</label>
            <select class="form-control" id="position_id" name="position_id" required>
                <c:forEach var="position" items="${listPosition}">
                    <c:choose>
                        <c:when test="${position.position_id == employee.position_id}">
                            <option selected value="${position.position_id}">${position.position_name}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${position.position_id}">${position.position_name}</option>
                        </c:otherwise>
                    </c:choose>

                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="education_degree_id">Trình độ</label>
            <select class="form-control" id="education_degree_id" name="education_degree_id" required>
                <c:forEach var="education_degree" items="${listEducationDegree}">
                    <c:choose>
                        <c:when test="${education_degree.education_degree_id == employee.education_degree_id}">
                            <option selected value="${education_degree.education_degree_id}">${education_degree.education_degree_name}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${education_degree.education_degree_id}">${education_degree.education_degree_name}</option>
                        </c:otherwise>
                    </c:choose>

                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="division_id">Bộ phận làm việc</label>
            <select class="form-control" id="division_id" name="division_id" required>
                <c:forEach var="division" items="${listDivision}">
                    <c:choose>
                        <c:when test="${division.division_id == employee.division_id}">
                            <option selected value="${division.division_id}">${division.division_name}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${division.division_id}">${division.division_name}</option>
                        </c:otherwise>
                    </c:choose>

                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="username">Tên đăng nhập</label>
            <select class="form-control" id="username" name="username" required>
                <c:forEach var="user" items="${ListUser}">
                    <c:choose>
                        <c:when test="${user.username == employee.username}">
                            <option selected value="${user.username}">${user.username}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${user.username}">${user.username}</option>
                        </c:otherwise>
                    </c:choose>

                </c:forEach>
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
