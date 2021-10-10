<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/4/2021
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      h3{
        font-size: 26px;
        margin: auto;
        text-align: center;
      }
      table{
        width: 500px;
        height: 500px;
        border: 1px solid black;
        margin: auto;
        text-align: center;
      }
      th{
        font-weight: bold;
      }
      img{
        width: 100px;
        height: 100px;
      }
    </style>
  </head>
  <body>
  <h3>danh sách khách hàng</h3>
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach items="${list}" var="customer">
      <tr>
        <td>${customer.name}</td>
        <td>${customer.dateOfBirth}</td>
        <td>${customer.address}</td>
        <td><img src="${customer.img}" alt="img"></td>

      </tr>
    </c:forEach>
  </table>
  </body>
</html>
