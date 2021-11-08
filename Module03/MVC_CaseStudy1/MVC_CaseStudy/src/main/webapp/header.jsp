<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2021
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    .page{
        background-color: rgb(12, 15, 15);
        width: 100%;
        height: 100%;
        margin: 0;
        padding: 0;
    }
    .header{
        width: 100%;
        height: 80px;
        background-color: #ffffff;
    }
</style>
<body>
<%

    if(session.getAttribute("sessionuser")==null)
    {
%>
<div class="container-fluid page px-0">
<div class="header">
    <div class="row">
        <div class="col-lg-6">
            <img src="/assert/img/logo.jpg">
        </div>
        <div class="col-lg-6">
            <div class="login">
                <a href="login.jsp" class="login">Đăng nhập</a>

            </div>

        </div>
    </div>
</div>
</div>
<%
}
else
{
%>
<div class="container-fluid page px-0">
    <div class="header">
        <div class="row">
            <div class="col-lg-6">
                <img src="/assert/img/logo.jpg">
            </div>
            <div class="col-lg-6">
                <div class="login">
                    <li> <a> Wellcome: ${sessionuser }</a></li>
                    <li><a href="logoutController" >Thoát</a></li>

                </div>

            </div>
        </div>
    </div>
</div>



<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
