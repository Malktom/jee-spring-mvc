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
<body>
<p>Wartość przekazana max: ${size} </p>

<c:forEach var="size" begin="1" end="${size}">
    <tr>
        <td>
            <b>
                <c:out value="${size}" />
            </b>
        </td>

        <td>
            <c:forEach var="size" begin="1" end="${size}">
                <tr>
                <c:out value="${size}" />
                </tr>
            </c:forEach>
        </td>
    </tr>
</c:forEach>

</body>
</html>
