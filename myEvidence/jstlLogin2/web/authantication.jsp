<%-- 
    Document   : authantication
    Created on : May 8, 2019, 2:16:53 AM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authancation Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter userName and Password"/>
            </c:redirect>
        </c:if>
        <c:if test="${!empty param.username and !empty param.password}">
            <s:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstlsohan"
                             user="root" password="1234"/>

            <s:query dataSource="${db}" var="sq">
                select count(*) as konta from login
                where username = '${param.username}'
                and password = '${param.password}'
            </s:query>
            
                <c:forEach items="${sq.rows}" var="r">
                    <c:choose>
                        <c:when test="${r.konta > 0}">
                            <c:redirect url="index.jsp"/>
                        </c:when>
                        <c:otherwise>
                            <c:redirect url="login.jsp">
                                <c:param name="errMsg" value="username/password do not March"/>
                            </c:redirect>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
        </c:if>

    </body>
</html>
