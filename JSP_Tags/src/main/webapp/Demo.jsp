<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.time.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>
<%! int a = 50;
String name = "Ankit";

%>
<h1>Current date is :
<%
LocalDate date = LocalDate.now();
LocalTime time= LocalTime.now();
%>
<%=date %>
<%=time %>

</h1>
<h1>My Name is : <%=name %></h1>
</body>
</html>