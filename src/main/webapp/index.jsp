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
				<a href="/conv/">ÐšÐ¾Ð½Ð²ÐµÑ€Ñ‚ÐµÑ€</a>
			</div>
			<div class="right-menue">
				<a href="/conv/Profile">${sessionScope.sessionLogin}</a> <a
					href="/conv/LogOut">Log out</a>
			</div>
		</div>
	</div>
</header>
<body>
	<div class="convert">
		<form action="Convert" method="GET" name="calculate">
			<div class="select1div">
				<select class="mainselect" name="select1" onchange="xobot()"
					id="select1">
					<option disabled selected value hidden>-- select an option
						--</option>
					<option
						<c:if test="${selectParam.equals('masa')}"> selected="1"</c:if>
						value="masa">Масса</option>
					<option
						<c:if test="${selectParam.equals('4astota')}"> selected="1"</c:if>
						value="4astota">Частота</option>
				</select>
			</div>
			<div class="boxes">
				<div class="box1">
					<input step="0.001" name="text1" class="text1" type="number"
						<c:if test="${selectParam == null}" >readonly</c:if>
						value="${value1}">
					<c:choose>
						<c:when test="${selectParam.equals('masa')}">
							<select class="select" name="param1">
								<option value="tonn1"
									<c:if test="${valueName1.equals(\"tonn1\")}" >selected</c:if>>Тонна</option>
								<option value="kilo1"
									<c:if test="${valueName1.equals(\"kilo1\")}" >selected</c:if>>Килограмм</option>
								<option value="gramm1"
									<c:if test="${valueName1.equals(\"gramm1\")}" >selected</c:if>>Грамм</option>
								<option value="stone1"
									<c:if test="${valueName1.equals(\"stone1\")}" >selected</c:if>>Стон</option>
								<option value="foont1"
									<c:if test="${valueName1.equals(\"foont1\")}" >selected</c:if>>Фунт</option>
							</select>
						</c:when>
						<c:when test="${selectParam.equals('4astota')}">
							<select class="select" name="param1">
								<option value="hz1"
									<c:if test="${valueName1.equals(\"hz1\")}" >selected</c:if>>Герц</option>
								<option value="khz1"
									<c:if test="${valueName1.equals(\"khz1\")}" >selected</c:if>>Килогерц</option>
								<option value="mghz1"
									<c:if test="${valueName1.equals(\"mghz1\")}" >selected</c:if>>Мегагерц</option>
								<option value="gigahz1"
									<c:if test="${valueName1.equals(\"gigahz1\")}" >selected</c:if>>Гигагерц</option><
							</select>
						</c:when>
					</c:choose>
				</div>
				<div class="box2">
					<input class="text2" type="number" readonly value="${value2}">
					<c:choose>
						<c:when test="${selectParam.equals('masa')}">
							<select class="select" name="param2">
								<option value="tonn2"
									<c:if test="${valueName2.equals(\"tonn2\")}" >selected</c:if>>Тонна</option>
								<option value="kilo2"
									<c:if test="${valueName2.equals(\"kilo2\")}" >selected</c:if>>Килограмм</option>
								<option value="gramm2"
									<c:if test="${valueName2.equals(\"gramm2\")}" >selected</c:if>>Грамм</option>
								<option value="stone2"
									<c:if test="${valueName2.equals(\"stone2\")}" >selected</c:if>>Стон</option>
								<option value="foont2"
									<c:if test="${valueName2.equals(\"foont2\")}" >selected</c:if>>Фунт</option>
							</select>
						</c:when>
						<c:when test="${selectParam.equals('4astota')}">
							<select class="select" name="param2">
								<option value="hz2"
									<c:if test="${valueName2.equals(\"hz2\")}" >selected</c:if>>Герц</option>
								<option value="khz2"
									<c:if test="${valueName2.equals(\"khz2\")}" >selected</c:if>>Килогерц</option>
								<option value="mghz2"
									<c:if test="${valueName2.equals(\"mghz2\")}" >selected</c:if>>Мегагерц</option>
								<option value="gigahz2"
									<c:if test="${valueName2.equals(\"gigahz2\")}" >selected</c:if>>Гигагерц</option>
							</select>
						</c:when>
					</c:choose>
				</div>
			</div>
			<div class="buttondiv">
				<input class="sbutton" type="submit" value="Convert">
			</div>
		</form>
	</div>
</body>
</html>