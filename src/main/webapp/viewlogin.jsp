<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">

<h1>Create</h1>

<a href="register.jsp">Register New user</a>

<h1>Login</h1>
<form method="POST" action="loginUser">
	<table>
		<tr>
			<td>Username:</td>
			<td><input name="username" /></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input name="password" type="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login" /></td>
		</tr>
	</table>
</form>