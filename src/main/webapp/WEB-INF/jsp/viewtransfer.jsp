<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">
<h1>Account Details</h1>
<c:forEach var="transfer" items="${transfers}">
	<c:choose>
		<c:when test="${transfer.account_type eq 'Chequing'}">
			<h2>Chequing Account</h2>
			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Account No</th>
					<th>Balance</th>
					<th>User Id</th>
					<th></th>
				</tr>

				<tr>
					<td>${transfer.account_no}</td>
					<td>${transfer.balance}</td>
					<td>${transfer.account_type}</td>
					<td><a
						href="/BankingSystemGroupD/transferfund/${transfer.account_id}">Transfer
							Fund</a></td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h2>Savings Account</h2>
			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Account No</th>
					<th>Balance</th>
					<th>User Id</th>
					<th></th>
				</tr>

				<tr>
					<td>${transfer.account_no}</td>
					<td>${transfer.balance}</td>
					<td>${transfer.account_type}</td>
					<td><a
						href="/BankingSystemGroupD/transferfund/${transfer.account_id}">Transfer
							Fund</a></td>
				</tr>
			</table>
		</c:otherwise>
	</c:choose>
</c:forEach>
<br />
