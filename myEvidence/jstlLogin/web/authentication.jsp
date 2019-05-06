<%-- 
    Document   : authentication
    Created on : May 6, 2019, 6:33:33 AM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authentication Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="login.jsp">
                <c:param name="errMsg" value="Please Enter valid username and password"/>
            </c:redirect>
        </c:if>

        <c:if test="${!empty param.username and !empty param.password}">
            <s:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin"
                             user="root" password="1234"/>

            <s:query dataSource="${db}" var="sq">
                select count(*) as konta from users
                where username = '${param.usernaem}'
                and password ='${param.password}'
            </s:query>

            <c:forEach items="${sq.rows}" var="rs">
                <c:choose>
                    <c:when test="${rs.konta > 0}">
                        <c:set scope="session" var="loginUser" value="${param.usernaem}"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="login.jsp">
                            <c:param name="errMsg" value="Username/ password do not match"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
