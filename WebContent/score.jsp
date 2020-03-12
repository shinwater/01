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
	<form action="input" method="post">
		<p> 이 름 : <input type="text" name="name" required/></p>
		<p> 국 어 점 수 : <input type="text" name="kor" required/></p>
		<p> 영 어 점 수 : <input type="text" name="eng" required/></p>
		<p> 수 학 점 수 : <input type="text" name="math" required/></p>
		<input type="submit" value="성적출력"/>
		<input type="reset" value="다~시 작성"/>
	</form>
	</div>
</body>
</html>