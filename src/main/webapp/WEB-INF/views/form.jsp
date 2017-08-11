<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/11/2017
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}
<form action="formhandler" method="post">


   Name: <input type="text" name="name"><br>
    Email: <input type="text" name="email"><br>
    <input type="submit" name="submit" value="Submit">
</body>
</html>
