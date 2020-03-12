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
		<h2>회원 로그인</h2>
		<form action="login" method="post"> <!-- method="get"니까 post로 받을땐 method="post"해주기~~-->
			<table border="1" cellspacing="0" width="250">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required/></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd" required/></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" required/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="로그인"/> &nbsp;&nbsp;
					<input type="reset" value="취소"/> 
					</td>
				</tr>
			</table>
		
		</form>
	</div>
</body>
</html>