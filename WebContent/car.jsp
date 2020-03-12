<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div align="center">
		<h2>좋아하는 자동차 선택하기</h2>
		<form action="choiceCar" method="post">
		<!-- checkbox는 여러개의값 넘어갈수있는디 getparameter는 하나의값만 받을수있음 -->
			<input type="checkbox" name="car" value="images/car1.gif">제네시스
			<input type="checkbox" name="car" value="images/car2.gif">소나타
			<input type="checkbox" name="car" value="images/car3.gif">그렌져
			<input type="checkbox" name="car" value="images/car4.gif">i30
			<input type="submit" value="선택">
		</form>
	</div>
</body>
</html>