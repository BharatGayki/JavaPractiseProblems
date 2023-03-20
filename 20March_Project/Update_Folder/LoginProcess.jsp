<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="com.mysql.management.util.Str" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 20-03-2023
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    String name = request.getParameter("ename");
    String pass = request.getParameter("epass");
    String role = request.getParameter("button");



    try {
        Class.forName("com.mysql.jdbc.Driver");//Driver Loaded
        System.out.println("driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office_desk", "root", "Pass@123");
        System.out.println("Databased loaded succesfully");

        ///////////////////////////////////////////////
        PreparedStatement ps = con.prepareStatement("insert into details values (?,?,?)");///detail table stores login page data
        ps.setString(1,name);
        ps.setString(2,pass);
        ps.setString(3,role);
        ResultSet r1 =  ps.executeQuery();

    }catch (Exception e){
        System.out.println(e);
    }

    System.out.println(name);
    System.out.println(pass);

    response.sendRedirect("Success.html");


%>






</body>
</html>
