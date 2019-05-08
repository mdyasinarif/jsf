<%-- 
    Document   : insertdb
    Created on : May 6, 2019, 11:50:32 PM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Operation</title>
    </head>
    <body>
        <c:if test="${empty param.pname or param.qty}">
            <font size="5" color="red">Please enter product and Quantity</font>
            <c:redirect><a href="insert.jsp"></a></c:redirect>
        </c:if>
        
        <s:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                         url="jdbc:mysql://localhost:3306/jstlcrud"
                         user="root" password="1234"/>
        
        <s:update dataSource="${dbsource}" var="result">
            insert into product (pname,qty) values(?,?)
            <s:param value="${param.pname}"/>
            <s:param value="${param.qty}"/>
        </s:update>
            
        <c:if test="${result >= 1}">
            <font size="5" color="green">Sessessfull Save</font>
            <a href="display.jsp"></a>
        </c:if>
            
    </body>
</html>
