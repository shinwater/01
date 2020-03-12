package com.sist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		response.setContentType("text/html; charset= UTF-8");//
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println(" 아 이 디 : "+id+"<br/>");
		out.println(" 비 밀 번 호 : "+pwd+"<br/>");
		out.println(" 이 름 : "+name+"<br/>");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
