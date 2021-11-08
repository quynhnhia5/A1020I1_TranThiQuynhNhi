<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/29/2021
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

    <a href="/employee?action=create" class="btn btn-success">Thêm mới</a>

    <table id="employee" class="table">
        <thead>
        <tr>
            <th scope="col">Mã Nhân Viên</th>
            <th scope="col">Họ tên</th>
            <th scope="col">Ngày sinh</th>
            <th scope="col">Số CMND</th>
            <th scope="col">Lương</th>
            <th scope="col">Số Điện Thoại</th>
            <th scope="col">Email </th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">Vị trí</th>
            <th scope="col">Trình độ</th>
            <th scope="col">Bộ phận làm việc</th>
            <th scope="col">Tên</th>
            <th scope="col"></th>
            <th scope="col"></th>


        </tr>
        </thead>
        <tbody>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td> ${employee.employee_id}</td>
                <td> ${employee.employee_name}</td>
                <td> ${employee.employee_birthday}</td>
                <td> ${employee.employee_id_card}</td>
                <td> ${employee.employee_salary}</td>
                <td> ${employee.employee_phone}</td>
                <td> ${employee.employee_email}</td>
                <td> ${employee.employee_address}</td>
                <td> ${employee.position_id}</td>
                <td> ${employee.education_degree_id}</td>
                <td> ${employee.division_id}</td>
                <td> ${employee.username}</td>
                <td> <a href="/employee?action=edit&id=${employee.employee_id}"></a></td>
                <td>
                    <button type="button" class="btn btn-danger" onclick="setValueForm('${employee.employee_id}')"
                            data-toggle="modal" data-target="#modalDelete">
                        xóa
                    </button>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>



    <!-- Modal confirm delete -->
    <div class="modal fade" id="modalDelete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <form method="post" action="/employee?action=delete">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <input name="employee_id" id="employee_id" hidden>
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
        $('#employee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 2
        })
    })

</script>
<script>
    function setValueForm(employee_id) {
        document.getElementById("employee_id").value = employee_id;
    }
</script>
</body>
</html>
