<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.sun.jdi.LongValue" %><%--
  Created by IntelliJ IDEA.
  User: G
  Date: 2024-01-25
  Time: 오후 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    LocalDateTime now = LocalDateTime.now();
%>
<html>
<head>
    <title>Keep the integrity</title>
</head>
<body>
    <h1>회원가입 페이지<%=now%></h1>

    <hr>
    <form action="/join.do" method="POST">
        <input type="text" placeholder="username" name="username">
        <input type="text" placeholder="password" name="password">
        <input type="text" placeholder="email" name="email">
        <button>회원가입</button>
    </form>
</body>
</html>
