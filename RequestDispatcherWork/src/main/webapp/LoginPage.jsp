<%--
  Created by IntelliJ IDEA.
  User: Bharat
  Date: 09-09-2023
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<form method="post" action="Dispatcher.jsp">
<!-UserName--->
<div class="input-group flex-nowrap" >
    <div class="input-group-prepend">
        <span class="input-group-text" id="username">@</span>
    </div>
    <input type="text" class="form-control" name="fname" placeholder="Username" aria-label="Username" aria-describedby="addon-wrapping">
</div>
<br>
<!-UserName--->
<!-Password--->
<div class="input-group flex-nowrap">
    <div class="input-group-prepend">
        <span class="input-group-text" id="password">@</span>
    </div>
    <input type="text" class="form-control" name="pwd" placeholder="PassWord" aria-label="Username" aria-describedby="addon-wrapping">
</div>
<br>
<!-Password--->
<input class="btn btn-primary" type="submit" value="Submit">

</form>
</body>
</html>
