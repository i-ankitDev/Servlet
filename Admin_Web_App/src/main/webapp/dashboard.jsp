<%@page import="com.admin.dto.UserDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.admin.dao.AdminDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DashBoard</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style type="text/css">
#btn {
	margin: 30px;
}
</style>
</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">S.No</th>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col">Date of Birth</th>
				<th scope="col">Gender</th>
				<th scope="col">Mobile Number</th>
				<th scope="col">Update</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<%
			AdminDao dao = new AdminDao();
			int i = 1;
			List<UserDetails> ud = dao.findAll();
			for (UserDetails u : ud) {
			%>
			<tr>
				<th scope="row"><%=i++%></th>
				<td><%=u.getId()%></td>
				<td><%=u.getName()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getPassword()%></td>
				<td><%=u.getDob()%></td>
				<td><%=u.getGender()%></td>
				<td><%=u.getMob()%></td>
				<td><a href="UpdateDetails.jsp?id=<%=u.getId()%>"><button>Edit</button></a></td>
				<td><a href="Delete?id=<%=u.getId()%>"><button>Delete</button></a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<a href="Logout"><button id="btn">Logout</button></a>
</body>
</html>