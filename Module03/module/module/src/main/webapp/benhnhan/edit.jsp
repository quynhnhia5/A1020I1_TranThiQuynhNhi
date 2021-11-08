<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2021
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/benhnhan?action=edit" method="post">
        <div class="form-group">
            <label for="MaBenhNhan">Mã bệnh nhân</label>
            <input type="text" class="form-control" id="MaBenhNhan" name="MaBenhNhan" value="${requestScope.benhnhan.MaBenhNhan}">
        </div>
        <div class="form-group">
            <label for="TenBenhNhan">Tên Bệnh Nhân</label>
            <input type="text" class="form-control" id="TenBenhNhan" name="TenBenhNhan" value="${requestScope.benhnhan.TenBenhNhan}">
        </div>
        <div class="form-group">
            <label for="NgayNhapVien">Ngày nhập viện</label>
            <input type="text" class="form-control" id="NgayNhapVien" name="NgayNhapVien" value="${requestScope.benhnhan.NgayNhapVien}">
        </div>
        <div class="form-group">
            <label for="NgayRaVien">Ngày ra viện</label>
            <input type="text" class="form-control" id="NgayRaVien" name="NgayRaVien" value="${requestScope.benhnhan.NgayRaVien}">
        </div>
        <div class="form-group">
            <label for="LyDoNhapVien">Lý do nhập viện</label>
            <input type="text" class="form-control" id="LyDoNhapVien" name="LyDoNhapVien" value="${requestScope.benhnhan.LyDoNhapVien}">
        </div>


        <div class="form-group">
            <label for="MaBenhAn">Vị trí</label>
            <select class="form-control" id="MaBenhAn" name="MaBenhAn" required>
                <a:forEach var="position" items="${listPosition}">
                    <a:choose>
                        <a:when test="${position.position_id == employee.position_id}">
                            <option selected value="${position.position_id}">${position.position_name}</option>
                        </a:when>
                        <a:otherwise>
                            <option value="${position.position_id}">${position.position_name}</option>
                        </a:otherwise>
                    </a:choose>

                </a:forEach>
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
