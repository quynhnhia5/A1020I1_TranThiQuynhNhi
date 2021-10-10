<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/4/2021
  Time: 8:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/Display">
    <input type="text" placeholder="mô tả của sản phẩm" name="Product_Description"><br><br>
    <input type="text" placeholder="Gía niêm yết của sản phẩm" name="List_Price"><br><br>
    <input type="text" placeholder="Tỷ lệ chiếc khấu (phần trăm)" name="Discount_Percent"><br><br>
    <input type="submit" value="Tính chiếc khấu" name="Calculate_Discount">
  </form>
  </body>
</html>
