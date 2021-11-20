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
    <title>calculator</title>

</head>
<body>
<form action="/calculator" method="post">
    <h3>Simple Calculator</h3>
    First operand: <input type="text" name="num1"><br><br>
    Operator: <select name="btnHandle">
    <option value="+" >Addition</option>
    <option value="-" >Subtraction</option>
    <option value="*" >Multiple</option>
    <option value="/">Divide</option>
</select><br><br>
    Second operand: <input type="text" name="num2"><br><br>
    <button >Calculate</button>
    <%--  <input type="submit" value="Calculate">--%>
</form>
</body>
</html>
