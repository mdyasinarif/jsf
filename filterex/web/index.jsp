<%-- 
    Document   : index
    Created on : May 6, 2019, 3:25:01 PM
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
        <form action="AdminServlet">
            Name : <input type="text" name="name"/>
            Password : <input type="password" name="password"/>
            
            <input type="submit" value="login">
        </form>
    </body>
</html>
