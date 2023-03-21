<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 21-03-2023
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String id = request.getParameter("epid");
String pass = request.getParameter("epass");
String name = request.getParameter("ename");
String date = request.getParameter("doj");
String email = request.getParameter("email");


  try{
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver_Connected");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/office_desk", "root", "Pass@123");
    System.out.println("Databased loaded succesfully");

    PreparedStatement ps = con.prepareStatement("insert into employee_details(EmpId,Emppass,Empname,Empdate,Empmail) values (?,?,?,?,?)");

    ps.setString(1,id);
    ps.setString(2,pass);
    ps.setString(3,name);
    ps.setString(4,date);
    ps.setString(5,email);

    ps.executeUpdate();

  }
  catch (Exception e){
    System.out.println(e);
  }

  response.sendRedirect("Success.html");

%>
</body>
</html>
