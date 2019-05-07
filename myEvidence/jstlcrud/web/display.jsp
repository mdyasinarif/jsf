<%-- 
    Document   : display
    Created on : May 7, 2019, 12:17:41 AM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Page</title>
    </head>
    <body>
        <s:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/jstlcrud"
                         user="root" password="1234"/>
        
        <s:query dataSource="${dbsource}" var="result" >
            select * from product
        </s:query>
        
    <center>
        <form>
            <table border="1" width="40%">
                <caption> Product List</caption>
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Product Quantity</th>
                    <th colspan="2">Action</th>
                </tr>
                
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><c:out value="${row.id}"></c:out></td>
                        <td><c:out value="${row.pname}"></c:out></td>
                        <td><c:out value="${row.qty}"></c:out></td>
                        <td><a href="update.jsp?id=<c:out value="${row.id}"/>">Update</a></td>
                        <td><a href="delete.jsp?id=<c:out value="${row.id}"/>">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <a href="index.jsp">Go Home</a>
    </center>
    </body>
</html>
