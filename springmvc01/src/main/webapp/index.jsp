<%--
  Created by IntelliJ IDEA.
  User: William
  Date: 2023/7/27
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/demo.action">当问服务器</a>
<h1>测试不同请求方法</h1>
<form action="${pageContext.request.contextPath}/req.action" method="get">
    <input type="submit" value="提交">
</form>
<h1>单个数据提交</h1>
<form action = "${pageContext.request.contextPath}/one.action">
    姓名：<input value="name"> <br>
    年龄：<input value="age"> <br>
    <input type="submit" value="提交">
</form>
<h1>对象数据提交</h1>
<form action = "${pageContext.request.contextPath}/two.action">
    姓名：<input value="name"> <br>
    年龄：<input value="age"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
