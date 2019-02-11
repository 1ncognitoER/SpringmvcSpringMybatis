<%--
  Created by IntelliJ IDEA.
  User: 1ncognitoER
  Date: 2017-10-19
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>index</title>
    <script type="text/javascript" src="js/jquery-3.2.0.js"></script>
</head>
<body>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
    <caption>斗破苍穹</caption>
    <tr style="background-color: aqua;">
        <th>序号</th>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>等级</th>
    </tr>
    <c:forEach items="${personsList}" var="pe" varStatus="pl">
        <tr align="center">
            <td>${pl.index+1}</td>
            <td><input type="text" value="${pe.to_id}"></td>
            <td><input type="text" value="${pe.to_name}"></td>
            <td><input type="text" value="${pe.to_age}"></td>
            <td><input type="text" value="${pe.to_content}"></td>
        </tr>
    </c:forEach>
</table>
<a href="selectAll.do">查询所有信息</a>
</body>
</html>
