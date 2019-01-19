<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 17. 1. 2019
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Tutorial Page</title>
  </head>
  <body>

  <h1>Hello World!</h1>
  <p>Body Text. This is my webapp JSP page</p>

  <%
    Date date = new Date();
    out.print("<h2>"+ date.toString() + "</h2>");
  %>

  </body>
</html>
