<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/17/2021
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="condiment" items="${condiment}">
    <li>${condiment}</li>
</c:forEach>
</body>
</html>
