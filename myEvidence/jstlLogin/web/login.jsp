<%-- 
    Document   : login
    Created on : May 6, 2019, 6:26:38 AM
    Author     : Md Yasin Arif
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
        <h1>Please Login!</h1>
        <form action="authentication.jsp">
            UserName : <input type="text" name="username"/>
            Password : <input type="password" name="password"/>
            <input type="submit" value="Login"/>
        </form>
        <font color="red">
        <c:if test="${!empty parram.errMsg}">
            <c:out value="${param.errMsg}"></c:out>
        </c:if>
        </font>
    </body>
</html>
<!--
create database jstllogin;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
);
 
INSERT INTO `users` (`id`,`username`,`password`) VALUES
 (1,'admin','123');
-->