<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Website</title>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
</head>
<body
	style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg');">
	<h1>Create</h1>
	<center>
		<a href="/BankingSystemGroupD/register">Register New user</a>
	</center>

	<h1>Login</h1>
	<form:form method="post" action="loginUser" modelAttribute="login">
		<table align="center" width="500px" height="250px">
			<tr>
				<td>Username:</td>
				<td>
				<form:input path="username" /><br>
				<form:errors path="username"></form:errors>
				</td>
				
			</tr>
			<tr>
				<td>Password :</td>
				<td>
				<form:password path="password" /><br>
				<form:errors path="password"></form:errors>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>