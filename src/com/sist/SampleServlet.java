package com.sist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청과 응답에 관한 한글 처리 
		//톰캣 서버의 default 문자 처리 방식은 ISO-8859-1 방식이다.(UTF-8이 아니ㅣ기 때문에 한글설정 안해주면 무~조건~ 깨짐)
		//따라서 개발자가 한글 인코딩을 처리하지 않으면 한글이 깨진다.
		//get 방식과 post 방식의 한글 처리가 다름.
		//get 방식의 한글 처리는 server.xml 파일에서 <connector>에 URIEncoding="UTF-8"로 설정 해야한다. ==> 톰캣 7.0버전에서 사용가능.
		//post 방식의 한글 처리는 doPost() 메서드 안에 request.setCharacterEncoding("UTF-8")로 설정 해야한다.
		
		String userName = request.getParameter("name");
		String userAge = request.getParameter("age");
		 
		//웹 브라우저에 출력해보자
		response.setContentType("text/html; charset= UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println(" 이 름 : "+userName+"<br/>");
		out.println(" 나 이 : "+userAge+"<br/>");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
