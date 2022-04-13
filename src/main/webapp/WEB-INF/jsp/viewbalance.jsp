<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
<body style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg'); ">
<h1>Account Details</h1>
<table border="2" width="70%" cellpadding="2" align="center" width="250px" height="220px" style="border:5px double black;">
	<tr>
		<th>Account No</th>
		<th>Balance</th>
		<th>Account Type</th>
		<th>User Id</th>
		<th>Account Id</th>
	</tr>
	<c:forEach var="balance" items="${balances}">
		<tr>
			<td>${balance.account_no}</td>
			<td>${balance.balance}</td>
			<td>${balance.account_type}</td>
			<td>${balance.userId}</td>
			<td>${balance.account_id}</td>
		</tr>
	</c:forEach>
</table>
<br />
</body>
