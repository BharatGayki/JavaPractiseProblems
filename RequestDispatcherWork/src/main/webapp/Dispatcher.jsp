<%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 09-09-2023
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String st=request.getParameter("fname");
  String st1=request.getParameter("pwd");

  if(st==""&&st1=="")
  {

    request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
  }

  else{
    request.getServletContext().getRequestDispatcher("/Welcome.jsp").include(request, response);
  }
%>
</body>
</html>
