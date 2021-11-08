<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2021
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
      integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<style>
    body{
        background: url('./img/background-login.jpeg');
        background-size: cover;
        background-position-y: -80px;
        font-size: 16px;
    }
    #wrapper{
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    #form-login{
        max-width: 400px;
        background: rgba(0,0,0,0.8);
        flex-grow: 1;
        padding: 30px 30px 40px;
        box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
    }
    .form-heading{
        font-size: 25px;
        color: #f5f5f5;
        text-align: center;
        margin-bottom: 30px;
    }
    .form-group{
        border-bottom: 1px solid#fff;
        margin-top: 15px;
        margin-bottom: 20px;
        display: flex;
    }
    .form-group i{
        color: #fff;
        font-size: 14px;
        padding-top: 5px;
        padding-right: 10px;
    }

    .form-input{
        background: transparent;
        border: 0;
        outline: 0;  /*rê chuộc vào hiện ra cái khung mờ*/
        color: #f5f5f5;/*khi đánh vào input nó sẽ có màu f5*/
        flex-grow: 1;/*giới hạn cái form nhập hết chữ*/


    }
    #eye i{
        padding-right: 0;
        cursor: pointer;

    }
    .form-input::placeholder{
        color: #f5f5f5; /*trước khi người dùng gõ chữ vào thì chữ tên đăng nhập hiện ra màu trắng*/
    }
    .form-submit{
        background: transparent;
        border: 1px solid #f5f5f5;
        color: #fff;
        width: 100%;
        text-transform: uppercase;
        padding: 6px 10px;
        transition: 0.25s ease-in-out;/*hiệu ứng rê chuộc sẽ có trong vòng 25s*/
        margin-top: 30px;
    }
    .form-submit:hover{
        border: 1px solid #54a0ff;/*khi rê chuộc vào thì cái boder nó hiện ra màu 54*/
    }
    .form-register{
        height: 30px;
        margin-top: 30px;
        background: transparent;
        color: white;
    }
    .register:hover{
        border: 1px solid black;
    }
    .form-register .register{
        height: 36px;
        margin-top: 0;
        background: whitesmoke;
        color: black;

    }
    .form-register a {
        color: cornflowerblue;
        font-size: 16px;
        margin-left: 50px;
    }
    .form-register a:hover{
        color: brown;
    }
</style>
<body>
<div id="wrapper">
    <form id="form-login" action="/login" method="post">
        <h1 class="form-heading">Form đăng nhập</h1>
        <div class="form-group">

            <i class="far fa-user"></i>
            <input type="text" class="form-input" placeholder="Tên đăng nhập" name="username">
        </div>
        <div class="form-group">
            <i class="fas fa-key"></i>
            <input type="password" class="form-input" placeholder="Mật khẩu" id="password" name="password">
            <div id="eye">
                <i class="far fa-eye"></i>
            </div>
        </div>
        <input type="submit" name="action"  class="form-submit" value="Đăng nhập" />
        <div class="form-register">
            <input type="submit" class="register" value="Tạo tài khoảng mới">
            <a href="">Trở về trang chủ</a>
        </div>
    </form>
</div>


<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
