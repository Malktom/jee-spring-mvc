<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 10.07.2022
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border-collapse: collapse;
    }
    table, th, td {
        border: 1px solid grey;
    }
    th, td {
        text-align: center;
        padding: 6px;
    }
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
<body>
<p>Wartość przekazana max: ${size} </p>

<table>
    <tr>
        <th>x</th>
        <c:forEach varStatus="row" begin="1" end="${size}">
            <th>${loop.index}</th>
        </c:forEach>
    </tr>
    <c:forEach varStatus="loop1" begin="1" end="${size}">
        <tr>
            <th>${loop1.index}</th>

            <c:forEach varStatus="loop2" begin="1" end="${size}">

                <td>${loop1.count * loop2.count}</td>

            </c:forEach>
        </tr>
    </c:forEach>
</table>

</body>
</html>
<%--<table>--%>

<%--    <c:forEach var="size" begin="1" end="${size}">--%>
<%--        <tr>--%>
<%--        <td>--%>
<%--            <b>--%>
<%--                <c:out value="${size}" />--%>
<%--            </b>--%>
<%--        </td>--%>

<%--        <td>--%>
<%--        <c:forEach var="size" begin="1" end="${size}">--%>
<%--            <tr>*--%>
<%--                <c:out value="${size}" />--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--        </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>