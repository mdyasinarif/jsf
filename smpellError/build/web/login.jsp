<%-- 
    Document   : login
    Created on : May 11, 2019, 1:40:55 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please Login!</h1>
    <from id="loginForm" method="post" action="j_security_check">
        UserName : <input type="username" name="username" id="j_username"/>
        Password : <input type="password" name="password" id="j_password"/>
        <button type="submit">login</button>
    </from>
    </body>
</html>
