<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body style="background-color:pink !important">
	<h1>Banking System</h1>
	
<a href="viewbalance/${sessionScope.user_id}">Check Balance</a>
	<br>
	<a href="viewbills">Paybills</a>
	<br>
	<a href="viewtransfer/{sessionScope.user_id}">Transfer funds</a>
	<br>
	<a href="withdrawfunds">Withdraw funds</a>
	<br>
</body>
</html>