<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
<body
	style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg');">

	<h1>Transfer Funds</h1>
	<form:form method="POST" action="/BankingSystemGroupD/doTransfer"
		modelAttribute="transfer">
		<form:hidden path="account_id" value="${account_id}" />
		<table>
			<tr>
				<td>Add Amount here :</td>
				<td><form:input path="amount" /> <form:errors path="amount"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Transfer To (Enter Account No here) :</td>
				<td><form:input path="account_no" />
					<form:errors path="account_no"></form:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Transfer Funds" /></td>
			</tr>
		</table>
	</form:form>
	<br />
</body>