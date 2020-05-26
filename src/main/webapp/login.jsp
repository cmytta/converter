<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="js/changetype.js"></script>
<title>Document</title>
</head>
<header>
	<div class="header">
		<div class="navmenu">
			<div class="left-menue">
				<a href="">ÐšÐ¾Ð½Ð²ÐµÑ€Ñ‚ÐµÑ€</a>
			</div>
			<div class="right-menue">
				<a href="reg.jsp">Registration</a> <a href=""></a>
			</div>
		</div>
	</div>
</header>
<body>
	<form action="SignIn" method="POST" class="login">
		<input type="text" name="login" placeholder="Login" required>
		<input type="password" name="password" placeholder="Password" required>
		<input type="submit" value="Log In">
		<c:if test="${wrongLoginOrPassword}">
			<p style="color: red;">Wrong login or password!</p>
		</c:if>
		<c:if test="${succesfullRegistr}">
			<p style="color: green;">You successfully signed up!</p>
		</c:if>
	</form>
</body>
</html>