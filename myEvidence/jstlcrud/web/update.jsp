<%-- 
    Document   : update
    Created on : May 7, 2019, 12:38:44 AM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <s:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/jstlcrud"
                         user="root" password="1234"/>
        
        <s:query dataSource="${dbsource}" var="result">
            select * from product where id = ?
            <s:param value="${param.id}"></s:param>
        </s:query>
            
    <center>
        <form action="updatedb.jsp" method="post">
            <table>
                <caption>Update Product</caption>
                <tr>
                    <td>Product Name</td>
                    <td>Quantity</td>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><input type="hidden" name="id" value="${param.id}"/></td>
                        <td><input type="text" name="pname" value="${row.pname}"/></td>
                        <td><input type="text" name="qty" value="${row.qty}"/></td>
                        <td><input type="submit" value="Update"/></td>
                    </tr>
                </c:forEach>
            </table>
            <a href="index.jsp">Go Home<a/>
        </form>
    </center>
</body>
</html>
