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
				<a href="login.jsp">Log In</a> <a href=""></a>
			</div>
		</div>
	</div>
</header>
<body>
	<form action="SignUp" method="POST" class="login">
		<input type="text" name="login" placeholder="Login" required>
		<input type="password" name="password" placeholder="Password" required>
		<input type="password" name="password2" placeholder="Repeat Password"
			required> <input type="submit" value="Log In">
		<c:if test="${invalidLogin}">
			<p style="color: red;">Login must be at least 5 characters ;(</p>
		</c:if>
		<c:if test="${invalidPassword}">
			<p style="color: red;">Password must be at least 6 characters ;)</p>
		</c:if>
		<c:if test="${passwordMismatch}">
			<p style="color: red;">Password mismatch(.)_(-)</p>
		</c:if>
		<c:if test="${userExist}">
			<p style="color: red;">User with this login already exists :0</p>
		</c:if>
	</form>
</body>
</html>