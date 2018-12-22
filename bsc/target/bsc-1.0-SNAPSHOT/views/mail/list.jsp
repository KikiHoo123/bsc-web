<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mail</title>
</head>
<body>
<sql:setDataSource var="bsc" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/bsc"
                   user="root"  password="root"/>

<sql:query dataSource="${bsc}"  var="result">
    SELECT * from user;
</sql:query>

<table border="1">
    <caption>私信表</caption>
    <tr>
        <td>id</td>
        <td>sender</td>
        <td>receiver</td>
        <td>time</td>
        <td>content</td>
    </tr>
    <c:forEach items="${mailList}" var="mail" >
        <tr>

            <td align = "center">${mail.id}</td>
            <td align = "center">${mail.user1.id}</td>
            <td align = "center">${mail.user2.id}</td>
            <td align = "center">${mail.time}</td>
            <td align = "center">${mail.content}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
