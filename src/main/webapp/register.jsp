<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">
<h1>Create</h1>
<form method="POST" action="saveUser">
<form:form method="POST" modelAttribute="login" action="saveUser">
	<table align="center">
		<tr>
			<td>Customer Name:</td>
			<td><form:input path="customername" /></td>
		</tr>
		<tr>
			<td>Father Name:</td>
			<td><form:input path="fathername" /></td>
		</tr>
		<tr>
			<td><td>Gender:</td></td>
			<td><form:input path="gender" /></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>Postal code:</td>
			<td><form:input path="postalcode" /></td>
		</tr>
		<tr>
			<td>Province:</td>
			<td><form:input path="province" /></td>
		</tr>
		<tr>
			<td>Account No:</td>
			<td><form:input path="accountno" /></td>
		</tr>
		<tr>
			<td>Username:</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Create" /></td>
		</tr>
	</table>
</form:form>
	