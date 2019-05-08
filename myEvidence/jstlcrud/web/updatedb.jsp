<%-- 
    Document   : updatedb
    Created on : May 7, 2019, 1:02:26 AM
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
        <title>Updatedb Page</title>
    </head>
    <body>
        <s:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/jstlcrud"
                         user="root" password="1234"/>

        <s:update dataSource="${dbsource}" var="result">
            update product set pname = ? , qty = ? where id = '${param.id}'
            <s:param value="${param.pname}"></s:param>
            <s:param value="${param.qty}"></s:param>
        </s:update>

        <c:if test="${result>=1}">
            <c:redirect url="insert.jsp">
                <c:param name="succMsg" value="successfull data update"/>
            </c:redirect>
        </c:if>
    </body>
</html>
