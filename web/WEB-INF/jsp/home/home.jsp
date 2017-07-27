<%-- 
    Document   : home
    Created on : 19-jul-2017, 22:37:47
    Author     : jacobh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
        <title>Rcuperacion de Parametros</title>
    </head>
    <body>
        <h1>Bievenido a HOme</h1>
        <ul>
            <li> ID = <c:out value="${id}" /></li>
            <li> ID2 = <c:out value="${id2}" /></li>
        </ul>
        </ul>
    </body>
</html>
