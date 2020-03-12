<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 페이지지시자....?  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>두 수 더하기 (배포서술자 - web.xml(여러개의파일을 매핑시킬때 사용) 파일에 등록)</h2>
	<form method="get" action="adder1">
	<!-- action: 여기서 servlet으로 넘어감... 경로가 들어가야함 com/sist/AdderServlet
	근데.. 왜 안저겅....ㅠㅠ?경로나오면 보안상 안좋아서! adder1: 별칭-->
		<p>첫 번째 수 : <input type="text" name="num1"/>
		<p>두 번째 수 : <input type="text" name="num2"/>
		<input type="submit" value="더하기">
	</form>
	
	<hr/>
	
	<h2>두 수 더하기 (애노테이션(1:1) 등록)</h2>
	<form method="get" action="adder2">
		<p>첫 번째 수 : <input type="text" name="num1"/>
		<p>두 번째 수 : <input type="text" name="num2"/>
		<input type="submit" value="더하기">
	</form>
	
	<!-- 
		서블릿 매핑방법 2가지
		1. 배포 서술자(web.xml) 등록
			- 매핑할 서블렛이 많은 경우 일괄 처리 용이
			- web.xml 파일에 등록.
		2. 애노테이션 등록
			- Servlet클래스의 url-mapping에 등록.
			- 1:1 방식으로 등록
			- 설정파일이 필요가 없음.
			
		*Servlet 매핑 목적
			- 처리 프로그램을  url에서 숨긴다.
				파일명과 폴더명(패키지)까지 숨긴다.
			- 보안을 목적으로 숨긴다.
	 -->
	
</body>
</html>