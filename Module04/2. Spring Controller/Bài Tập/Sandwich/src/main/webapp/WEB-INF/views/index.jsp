<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/15/2021
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/save" method="post">
    <input type="checkbox" id="Lettuce" name="condiment" value="Lettuce">
    <label for="Lettuce"> Lettuce</label>
    <input type="checkbox" id="Tomato" name="condiment" value="Tomato">
    <label for="Tomato"> Tomato</label>
    <input type="checkbox" id="Mustard" name="condiment" value="Mustard">
    <label for="Mustard"> Mustard</label>
    <input type="checkbox" id="Sprouts" name="condiment" value="Sprouts">
    <label for="Sprouts"> Sprouts</label>
    <br>
    <button>save</button>
</form>

</body>
</html>
