<%-- 
    Document   : index
    Created on : May 8, 2019, 3:54:10 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        <h1>Please Login</h1>
        <form action="auth.jsp" method="get">
            UserName : <input type="text" name="username"/>
            Password : <input type="password" name="password"/>
            <input type="submit" value="Login"/>
        </form>
        <font color="red">
        <c:if test="${!empty parram.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>
    </center>
</body>
</html>

