<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
<%@include file="/WEB-INF/css/styles.css"%></style>
</head>
<body style="background-image: url('https://paymentsystemreview.ca/wp-content/uploads/2019/12/the-canadian-banking-system.jpg');">


	<h1>Banking System</h1>
	<div style="background-image: url('https://coolbackgrounds.io/images/backgrounds/white/pure-white-background-85a2a7fd.jpg'); opacity: 0.5">
	<center>
	<h3>
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
	</h3></center>
	</div>
	</body>
</html>