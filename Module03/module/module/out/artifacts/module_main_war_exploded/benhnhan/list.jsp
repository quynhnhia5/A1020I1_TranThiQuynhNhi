<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2021
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<div class="container-fluid">

    <a href="/benhnhan?action=create" class="btn btn-success">Thêm mới</a>

    <table id="benhnhan" class="table">
        <thead>
        <tr>
            <th scope="col">Mã Bệnh Nhân</th>
            <th scope="col">Tên Bệnh Nhân</th>
            <th scope="col">Ngày Nhập Viện</th>
            <th scope="col">Ngày Ra Viện</th>
            <th scope="col">Lý Do Nhập Viện</th>
            <th scope="col">Mã Bệnh án </th>
            <th scope="col">sửa</th>
            <th scope="col">xóa</th>
        </tr>
        </thead>
        <tbody>
        <a:forEach var="benhnhan" items="${benhnhanList}">
            <tr>
                <td> ${benhnhan.maBenhNhan}</td>
                <td> ${benhnhan.tenBenhNhan}</td>
                <td> ${benhnhan.ngayNhapVien}</td>
                <td> ${benhnhan.ngayRaVien}</td>
                <td> ${benhnhan.lyDoNhapVien}</td>
                <td> ${benhnhan.maBenhAn}</td>
                <td> <a href="/benhnhan?action=edit&id=${benhnhan.maBenhNhan}">sửa</a></td>
                <td>
                    <button type="button" class="btn btn-danger" onclick="setValueForm('${benhnhan.maBenhNhan}')"
                            data-toggle="modal" data-target="#modalDelete">
                        xóa
                    </button>
                </td>

            </tr>
        </a:forEach>
        </tbody>
    </table>


    <!-- Modal confirm delete -->
    <div class="modal fade" id="modalDelete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <form method="post" action="/benhnhan?action=delete">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <input name="MaBenhNhan" id="MaBenhNhan" hidden>
                        Bạn có chắc muốn xoá ?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                        <button type="submit" class="btn btn-danger" >Xoá</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
<script>

    $(document).ready(function () {
        $('#benhnhan').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        })
    })

</script>
<script>
    function setValueForm(MaBenhNhan) {
        document.getElementById("MaBenhNhan").value = MaBenhNhan;
    }
</script>
</body>
</html>