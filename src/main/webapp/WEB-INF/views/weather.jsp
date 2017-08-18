<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/17/2017
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Weather Foerecast</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">

</head>
<body>
Response status: ${status}<br>
Production center: ${prodCenter}<br><br><br>

<%--<ul>--%>
<%--//<li> ${day1}:  ${temp1}</li>--%>
<%--<li> ${day2}:  ${temp2}</li>--%>
<%--<li> ${day3}:  ${temp3}</li>--%>
<%--<li> ${day4}:  ${temp4}</li>--%>
<%--<li> ${day5}:  ${temp5}</li>--%>
<%--<li> ${day6}:  ${temp6}</li>--%>
<%--<li> ${day7}:  ${temp7}</li>--%>
<%--<li> ${day8}:  ${temp8}</li>--%>
<%--<li> ${day9}:  ${temp9}</li>--%>
<%--<li> ${day10}: ${temp10}</li>--%>
<%--</ul>--%>
<%----%>

<table>
    <tr>
        <th>Day</th>
        <th>Temp</th>
        <th>Night</th>
        <th>Temp</th>
    </tr>

    <tr>
        <td>${day1}</td>
        <td>${temp1}</td>
        <%--<td>${text1}</td>--%>
    </tr>

    <tr>
        <td>${day2}</td>
        <td>${temp2}</td>
    </tr>

    <tr>
        <td>${day3}</td>
        <td>${temp3}</td>
    </tr>

    <tr>
        <td>${day4}</td>
        <td>${temp4}</td>
    </tr>

    <tr>
        <td>${day5}</td>
        <td>${temp5}</td>
    </tr>

    <tr>
        <td>${day6}</td>
        <td>${temp6}</td>
    </tr>

    <tr>
        <td>${day7}</td>
        <td>${temp7}</td>
    </tr>

    <tr>
        <td>${day8}</td>
        <td>${temp8}</td>
    </tr>

    <tr>
        <td>${day9}</td>
        <td>${temp9}</td>
    </tr>

    <tr>
        <td>${day10}</td>
        <td>${temp10}</td>
    </tr>

    <tr>
        <td>${day11}</td>
        <td>${temp11}</td>
    </tr>

</table>

</body>
</html>
