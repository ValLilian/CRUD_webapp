<%--
  Created by IntelliJ IDEA.
  User: sub2m
  Date: 22/12/2023
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>nom</td>
            <td>prenom</td>
            <td>email</td>
            <td>telephone</td>
        </tr>
        <c:forEach var="iec" items="${clients}">
            <tr>
                <td>${iec.id}</td>
                <td>${iec.nom}</td>
                <td>${iec.prenom}</td>
                <td>${iec.email}</td>
                <td>${iec.tel}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
