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

    <fieldset>
        <legend>Personal information:</legend>

    First Name:<br>
        <input type="text" name="firstname"><br>

    Last Name:<br>
        <input type="text" name="lastname"><br>

    Email:<br>
        <input type="text" name="email"><br>

    Phone Number:<br>
        <input type="text" name="phonenumber"><br>

    Password:<br>
        <input type="password" name="password"><br><br>

        <input type="radio" name="age" value="senior citizen"> Senior Citizen<br>
        (Senior Citizens receive a 10% discount)<br><br>
        <input type="submit" name="submit" value="Submit">

        <input type="reset">

    </fieldset>

</form>
</body>
</html>
