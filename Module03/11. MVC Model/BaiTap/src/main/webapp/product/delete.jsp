<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/13/2021
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>price: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td>description: </td>
                <td><input type="text" name="description" id="description"></td>
            </tr>
            <tr>
                <td>producer: </td>
                <td><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete"></td>
                <td><a href="/product">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
