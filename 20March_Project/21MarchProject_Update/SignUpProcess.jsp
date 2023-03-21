<%@ page import="com.mysql.jdbc.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 21-03-2023
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String name = request.getParameter("sname");
String pass = request.getParameter("spass");
String role = "Admin";

try{
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver_Connected");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/office_desk", "root", "Pass@123");
    System.out.println("Databased loaded succesfully");

    PreparedStatement ps = con.prepareStatement("insert into admininfo(AdminId,Adminpass,Role) values (?,?,?)");

    ps.setString(1,name);
    ps.setString(2,pass);
    ps.setString(3,role);
    ps.executeUpdate();

}
catch (Exception e){
    System.out.println(e);
}

    response.sendRedirect("LoginPage.html");










%>
</body>
</html>
