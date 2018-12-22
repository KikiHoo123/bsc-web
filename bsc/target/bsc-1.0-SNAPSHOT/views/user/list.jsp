<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
    <title>user</title>
</head>
<body>
<sql:setDataSource var="bsc" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/bsc"
                   user="root"  password="root"/>

<sql:query dataSource="${bsc}"  var="result">
    SELECT * from user;
</sql:query>
<table border="1">
    <caption>用户表</caption>
    <tr>
        <td>id</td>
        <td>number</td>
        <td>type</td>
        <td>password</td>
        <td>nickName</td>
        <td>photo</td>
        <td>academy</td>
        <td>introduction</td>
        <td>tel</td>
        <td>wechat</td>
        <td>qq</td>
        <td>noticeID</td>
        <td colspan="3">操作</td>
    </tr>
    <c:forEach items="${userList}" var="user" >
        <tr>

            <td align = "center">${user.id}</td>
            <td align = "center">${user.number}</td>
            <td align = "center">${user.type}</td>
            <td align = "center">${user.password}</td>
            <td align = "center">${user.nickName}</td>
            <td align = "center">${user.photo}</td>
            <td align = "center">${user.academy}</td>
            <td align = "center">${user.introduction}</td>
            <td align = "center">${user.tel}</td>
            <td align = "center">${user.wechat}</td>
            <td align = "center">${user.qq}</td>
            <td align = "center">${user.user_.id}</td>
            <td align = "center"><form><input type="button" name="details" value="详情">
                <%

                %><a href="details.jsp"></a></form></td>
            <td align = "center"><form><input type="button" name="alter" value="修改"></form></td>
            <td align = "center"><form><input type="button" name="delete" value="删除"></form></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
