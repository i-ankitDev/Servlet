<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="ErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Page</title>
</head>
<body>
<% int number1 = Integer.parseInt(request.getParameter("n1")); 
int number2 = Integer.parseInt(request.getParameter("n2"));
int division = number1/number2;
%>
<h1>Division is : <%=division %></h1>
</body>
</html>