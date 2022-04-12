<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="https://www.w3schools.com/html/styles.css">
</head>
<body>
	<h1>Banking System</h1>
	
	<a href="viewbalance/${sessionScope.user_id}">Check Balance</a>
	<br><br>
	<a href="paybills">Paybills</a>
	<br><br>
	<a href="viewtransfer/${sessionScope.user_id}">Transfer funds</a>
	<br><br>
	<a href="withdrawfunds">Withdraw funds</a>
	<br><br>
	<a href="addfunds">Add funds</a>
	<br><br>
	<a href="interactransfer">INTERAC Transfer</a>
	<br><br>
	
</body>
</html>