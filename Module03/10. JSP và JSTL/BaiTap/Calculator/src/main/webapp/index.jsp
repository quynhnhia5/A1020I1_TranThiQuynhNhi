<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2021
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/index" method="post">
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
