<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: honey
  Date: 19.05.18
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="Center">Phone Book</h1>
    <table align="center" border="2">
        <tr>
            <th>ID</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Отчество</th>
            <th>Телефон</th>
            <th>E-mail</th>
        </tr>
        <c:forEach items = "${persons}" var = "person">
        <tr>
            <td>${person.id}</td>
            <td>${person.first}</td>
            <td>${person.second}</td>
            <td>${person.third}</td>
            <td>${person.phone}</td>
            <td>${person.email}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
