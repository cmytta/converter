<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<script type="text/javascript" src="js/changetype.js"></script>
	<title>Document</title>
</head>
<header>
	<div class="header">
		<div class="navmenu">
			<div class="left-menue">
				<a href="/conv/">ÐšÐ¾Ð½Ð²ÐµÑ€Ñ‚ÐµÑ€</a>
			</div>
			<div class="right-menue">
				<a href="/conv/Profile">${sessionScope.sessionLogin}</a> <a href="/conv/LogOut">Log out</a>
			</div>
		</div>
	</div>
</header>

<body>
	<div class="all-content">
		<div class="profile">
			<table>
				<thead>
					<tr>
						<th>First Parametr</th>
						<th>Second Parametr</th>
						<th>First Value</th>
						<th>Second Value</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="convert" items="${convert}">
						<tr>
							<td>${convert.fParametr}</td>
							<td>${convert.sParametr}</td>
							<td>${convert.fValue}</td>
							<td>${convert.sValue}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>
</body>

</html>