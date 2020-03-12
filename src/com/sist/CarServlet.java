package com.sist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choiceCar")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//변수를 받을 때 getParameter() 메서드 사용함. ==> 하나의 값을 받을 때 사용.
		//String name = request.getParameter("name");
		
		//여러개의 값을 받을 때 getParameterValues("배열이름");메서드를 사용함-> 반환타입은 스트링배열
		String[] cars = request.getParameterValues("car"); 
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body bgcolor='black'>");//배경색
		out.println("<table><tr>");
		for(int i =0; i<cars.length; i++) {
			out.println("<td>"); //1열
			out.println("<img src='"+cars[i]+"' width='200' height='100'>");
			out.println("</td>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

}
