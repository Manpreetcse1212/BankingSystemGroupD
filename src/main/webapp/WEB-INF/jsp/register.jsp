<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
<body
	style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg');">

	<h1>Create</h1>
	<form:form method="POST" modelAttribute="login" action="saveUser">
		<table align="center" width="500px" height="250px">
			<tr>
				<td>Customer Name:</td>
				<td><form:input path="customerName" /><br> <form:errors
						path="customerName"></form:errors></td>
			</tr>
			<tr>
				<td>Father Name:</td>
				<td><form:input path="fatherName" /><br> <form:errors
						path="fatherName"></form:errors></td>
			</tr>
			<tr>
				<td>
				<td>Gender:</td>
				</td>
				<td><form:input path="gender" /><br> <form:errors
						path="gender"></form:errors></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /><br> <form:errors
						path="email"></form:errors></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /><br> <form:errors
						path="address"></form:errors></td>
			</tr>
			<tr>
				<td>Postal code:</td>
				<td><form:input path="postalcode" /><br> <form:errors
						path="postalcode"></form:errors></td>
			</tr>
			<tr>
				<td>Province:</td>
				<td><form:input path="province" /><br> <form:errors
						path="province"></form:errors></td>
			</tr>
			<tr>
				<td>Account No:</td>
				<td><form:input path="accountno" /><br> <form:errors
						path="accountno"></form:errors></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><form:input path="username" /><br> <form:errors
						path="username"></form:errors></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password" /><br> <form:errors
						path="password"></form:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create" /></td>
			</tr>
		</table>
	</form:form>
</body>