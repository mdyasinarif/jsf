<%-- 
    Document   : auth
    Created on : May 8, 2019, 3:55:32 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aut Page</title>
    </head>
    <body>
        <c:if test="${empty param.username or empty param.password}">
            <c:redirect url="index.jsp">
                <c:param name="errMsg" value="Please Enter UserName and Password"/>
            </c:redirect>
        </c:if>
        <c:if test="${!empty param.username and !empty param.password}">
            <s:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/logincurd"
                             user="root" password="1234"/>
            <s:query dataSource="${db}" var="sql">
                select count(*) as guru from login
                where username = '${param.username}'
                and password = '${param.password}'
            </s:query>

            <c:forEach items="${sql.rows}" var="r">
                <c:choose>
                    <c:when test="${r.guru > 0}">
                        <c:redirect url="login.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="index.jsp">
                            <c:param name="errMsg" value="Please Enter valid UserName and Password"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>

            </c:forEach>
        </c:if>

    </body>
</html>
