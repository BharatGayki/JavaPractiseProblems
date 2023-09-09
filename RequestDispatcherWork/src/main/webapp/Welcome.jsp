<%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 09-09-2023
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">Welcome to View Page.</h2>
<h3 align="center"><font color="darklight">UserName:- <%=request.getParameter("fname")%></font></h3>
<h3 align="center"><font color="darklight">Password:- <%=request.getParameter("pwd")%></font></h3>
</body>
</html>
