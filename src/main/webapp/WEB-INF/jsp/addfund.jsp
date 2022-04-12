<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">

<h1>Add Funds</h1>
<form:form method="POST" action="/BankingSystemGroupD/doAddFund">
	<table>
		<tr>
			<td>Add Amount here :</td>
			<td><form:input path="amount" /></td>
		</tr>
		<tr>
			<td>Select Account Type :</td>
			<td><form:radiobuttons path="account_id"
					items="${account_types}" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Add Funds" /></td>
		</tr>
	</table>
</form:form>
<br />
