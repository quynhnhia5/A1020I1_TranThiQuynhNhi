<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/25/2021
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link href="/assert/bootstrap413/css/style.css">--%>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
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
    .header img{
        width: 80px;
        height: 80px;
        line-height: 80px;

    }
    .nav{
        width: 100%;
        height: 50px;
        background-color: #0d6056;
    }
    .nav .row{
        width: 100%;
        height: 50px;
        line-height: 50px;
    }
    .nav .nav-item-first{
        padding-left: 100px;
    }
    .nav a {
        color: rgb(236, 231, 231);
    }
    .nav .search{
        margin-left: 50px;
    }
    .nav .search input{
        width:250px;
        height: 35px;
        margin-top: 7px;
        line-height: 30px;
        border-radius: 10px;
    }
</style>
</head>
<body>
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
    <div class="nav">
        <div class="row">
            <div class="col-lg-8">
                <div class="row">
                    <div class="col-lg-3 nav-item-first">
                        <a href="">Home</a>
                    </div>
                    <div class="col-lg-2">
                        <a href="/employee">Employee</a>
                    </div>
                    <div class="col-lg-2">
                        <a href="/customer">Customer</a>
                    </div>
                    <div class="col-lg-2">
                        <a href="">Service</a>
                    </div>
                    <div class="col-lg-3">
                        <a href="">Contract</a>
                    </div>

                </div>
            </div>
            <div class="col-lg-4">
                <div class="row search">
                    <form action="/employee" method="get">
                        <input name="action" value="search" hidden>
                        <input type="text" name="nameSearch">
<%--                        <input type="text" name="priceSearch">--%>
                        <button class="btn btn-success">Tìm kiếm</button>
                    </form>
<%--                    <input type="text" placeholder="search">--%>
                </div>
            </div>
        </div>
    </div>

</div>
<div class="container">
    <div class="img"><img src="/assert/img/bg" alt=""></div>
</div>





<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>

</body>
</html>
