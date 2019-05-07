<%-- 
    Document   : insert
    Created on : May 6, 2019, 11:35:31 PM
    Author     : Md Yasin Arif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
    </head>
    <body>
    <center>
        <form action="insertdb.jsp" method="post">
            <table>
                <th>Purchased product</th>
                <tr>
                    <td><label>Product Name</label></td>
                    <td><input type="text" name="pname"/></td>
                </tr>
                <tr>
                    <td><label>Product Quantity</label></td>
                    <td><input type="text" name="qty"/></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Reset"/></td>
                    <td><input type="submit" value="Save"</td>
                    
                </tr>
            </table>
        </form>
    
    
    </font>
    </center>
</body>
</html>
