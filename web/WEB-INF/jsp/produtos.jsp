<%-- 
    Document   : produtos
    Created on : 06/11/2015, 19:17:50
    Author     : alexandre.hauffe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <c:forEach var="produto" items="${produtos}">
            <a href="/mavenproject/produto/${produto.id}">${produto.nome}</a>
        </c:forEach>
    </body>
</html>
