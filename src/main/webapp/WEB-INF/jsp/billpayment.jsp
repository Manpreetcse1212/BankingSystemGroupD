<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pay Mobile Bill</title>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
</head>
<body style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg');">

	<h2>Pay Mobile Bill (Bill Payment)</h2>

	<form:form method="post" action="doPayBills">
		<table align="center" width="500px" height="250px">
			<tr>
				<td>Add payee :</td>
				<td><form:input path="payee_name" /></td>
			</tr>
			<tr>
				<td>Account Number :</td>
				<td><form:input path="Account_no" /></td>
			</tr>
			<tr>
				<td>Amount :</td>
				<td><form:input path="amount" /></td>
			</tr>
			<tr>
				<td>Select Account Type :</td>
				<td><form:radiobuttons path="account_id"
						items="${account_types}" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Pay" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>