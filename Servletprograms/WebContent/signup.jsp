<%@page import="com.pojo.Userbean"%>
<%@page import="java.util.List"%>
<%@page import="com.daoImp.InsertDaoImp"%>
<%@page import="com.dao.InsertDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Page</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body
	style="background: url(image/city3.jpg); background-size: cover; background-attachment: fixed:">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 style="margin-top: 10px;" class="center-align">Register
							here!!</h3>
						<div class="form center-align">
							<form action="RegisterDemo" method="post">
								<input type="text" name="user_name"
									placeholder="enter user name"> <input type="password"
									name="user_password" placeholder="enter user password">
								<input type="email" name="user_email"
									placeholder="enter user email">
								<button type="submit" class="btn">Submit</button>
							</form>

							<hr>
							<div align="center">
								<table border="1">
									<tr>
										<th>Name</th>
										<th>Password</th>
										<th>Email</th>
									</tr>
									<%
									InsertDao id = new InsertDaoImp();
									List<Userbean> list = id.getValues();
									for (Userbean p : list) {
									%>
									<tr>
										<td><%=p.getName()%></td>
										<td><%=p.getPassword()%></td>
										<td><%=p.getEmail()%></td>
									</tr>
									<%
									}
									%>
								</table>
							</div>
						</div>
						<div class="loader"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>