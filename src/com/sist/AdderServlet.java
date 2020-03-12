package com.sist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdderServlet")
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /*
     * 요청과 관련된 API : javax.servlet.http.HttpServletRequest 클래스
     * 응답과 관련된 API : javax.servlet.http.HttpServletResponse 클래스
     * 1. 클라이언트가 서블릿에 요청을 하면 먼저 톰캣 서버가 해당 요청을 받음.
     * 2. 그런 다음 사용자의 요청이나 응답에 대한 HttpServletRequest 객체와 
     * 		HttpServletResponse 객체를 만들게 됨.
     * 3. 그러고 난 후, Servlet의 doGet() 메서드나 doPost() 메서드를 호출하면서 
     * 		이 객체들을 전달.
     * 4. 톰캣이 사용자의 요청에 대한 정보를 모든 HttpServletRequest 객체의 속성으로 
     * 		담아 메서드로 전달함. 따라서 각 HttpServletRequest에서 제공하는 메서드들은
     * 		매개변수로 넘어온 객체들을 이용하여 사용자가 전송한 데이터를 받아오거나 응답할 수 있음.
     * 
     * 	서블릿에서 클라이언트의 요청을 얻는 방법
     * - HttpServletRequest 클래스에서 <form> 태그로 전송된 데이터를 받아오는데 사용하는 메서드.
     * 	* getParameter(String name) => <form> 태그의 name 속성에 들어간 변수명을 받아서 
     * 									사용 함. 반환형은 String 타입.
     *  * getParameterValues(String name) => 같은 name에 대하여 여러 개의 값을 얻을 때 사용.
     *  									  반환형은 String[] 타입. 
     *  
     *  서블릿에서 요청 받은 내용을 처리하여 클라이언트에 보내는 방법
     *  1.HttpServletResponse 클래스를 이용하여 응답을 함.
     *  2.doGet()이나 doPost() 메서드 안에서 처리함.
     *  3.javax.servlet.http.HttpServletResponse 객체를 이용함.
     *  4.setContentType() 메서드를 이용하여 클라이언트에게 전송할 데이터의 종류(MIME-TYPE)를 지정함.
     *  5.클라이언트(웹 브라우저)와 서블릿의 통신은 자바 I/O의 스트림을 이용함.
     *  
     *   
     *  서블릿 생명 주기(Life Cycle)//////
	 * Servlet 객체 생성 → init() 메서드 호출 → service(), doGet(), doPost() 메서드 호출 → destroy() 메서드 호출
	 *   (최초 한 번)        (최초 한 번)                   (요청 시 매번)                    (마지막 한 번)
	 * 
	 * - 서버(서블릿)에서 웹 브라우저로 데이터를 전송할 때에는 어떤 종류의 데이터를 전송하는지 웹 브라우저에게 알려 주어야 함.
	 *   => 이유 : 웹 브라우저가 전송 받을 데이터의 종류를 미리 알고 있으면 더 빠르게 처리할 수 있기 때문임.
	 * - 데이터 종류(MIME-TYPE) : 톰캣 컨테이너에서 미리 제공하는 여러 가지 전송 데이터 종류를 하나 지정하여 웹 브라우저로 전송.
	 *                         이처럼 톰캣 컨테이네에서 미리 설정해 놓은 데이터의 종류들을 말함.
	 *                         웹 브라우저는 기본적으로 HTML만 인식하므로 서블릿에서 전송하는 대부분의 데이터는
	 *                         MIME-TYPE을 "text/html"로 설정을 함.
	 * - 서블릿이 클라이언트(웹 브라우저)에 응답하는 과정.
	 *   * setContentType()을 이용해서 MIME-TYPE을 지정함.
	 *   * 데이터를 출력할 PrintWriter 객체를 생성함.
	 *   * 출력 데이터를 HTML 형식으로 만듬.
	 *   * PrintWriter 객체의 print()나 println() 메서드를 이용해 데이터를 출력함.
	 *   
	 *   
     *  웹 브라우저에서 서블릿으로 데이터를 전송하는 전송 방식(2가지)
     *  1. get방식
     *  	- 서블릿에 데이터를 전송할 때는 데이터가  url 뒤에 name=value 형태로 전송이 됨.
     *  	- 여러 개의 데이터를 전송할 때는 '&'로 구분하여 전송이 됨.
     *  	- 보안이 취약함.
     *  	- 전송할 수 있는 데이터는 최대 255자.
     *  	- 기본 전송 방식이고 사용이 쉬움.
     *   	- 웹 브라우저에 직접 입력해서 전송할 수도 있음.
     *   	- 서블릿에서는 doGet() 메서드에서 전송된 데이터를 처리함.
     *   	
     *  2. post방식
     *  	- 서블릿에 데이터를 전송할 때는 TCP/IP 프로코콜 데이터의 head 영역에 숨겨진 채 전송이 됨.
     *  	- 보안에 유리함.
     *  	- 전송 데이터의 용량이 무제한임.
     *  	- 처리 속도가 get 방식보다 느림.
     *  	- 서블릿에서는 doPost() 메서드에서 전송된 데이터를 처리함.
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// method="get" 인 데이터를 처리하는 메서드
		// request : 첫번째 매개변수- 사용자(클라이언트)의 요쳥에 대한 정보를 처리 
		// response : 두번째 매개변수- 요청정보에 대한 처리결과를 클라이언트에 응답 처리.
		
		// 단계1. 클라이언트의 데이터 받기 - 사용자가 전송한 데이터 받기
		int su1 = Integer.parseInt(request.getParameter("num1"));
		int su2 = Integer.parseInt(request.getParameter("num2"));
		
		// 웹브라우저에 응답
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<h2>두 수의 합==> "+(su1+su2)+"</h2>");
		
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
