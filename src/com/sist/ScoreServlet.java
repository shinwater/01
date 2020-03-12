package com.sist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ScoreServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		//입력폼 창에서 넘어온 데이터를 처리하자~
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int tot = kor+eng+math;
		float avg = tot/3.0f;
		/*
		 * String avg1 =String.format("%.2f",avg); //문자열로 반환
		 */
		char score;
		
		if(avg>=90) {
			score='A';
		}else if(avg>=80) {
			score='B';
		}else if(avg>=70) {
			score='C';
		}else if(avg>=60) {
			score='D';
		}else {
			score='F';
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<div align='center'>");
		out.println("<table border='1' cellspacing='0' width='250'>");
		out.println("<tr>");
		out.println("<th>이름 </th>");
		out.println("<td align='center'>"+name+"</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>국어점수 </th>");
		out.println("<td align='center'>"+kor+"</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>영어점수 </th>");
		out.println("<td align='center'>"+eng+"</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>수학점수 </th>");
		out.println("<td align='center'>"+math+"</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>총 점 </th>");
		out.println("<td align='center'>"+tot+"</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>평균 </th>");
		out.printf("<td align='center'> %.2f</th>",avg);
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학점 </th>");
		out.println("<td align='center'>"+score+"</th>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
