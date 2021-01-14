package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet(
		urlPatterns = { 
				"/DemoServlet", 
				"/demo.do"
		})
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("서블릿 생성자");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("service");
//		doGet(request,response);
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 인자 처리
		// out객체가 없음 -> 따로 만들어줘야 한다
		response.setContentType("text/html; charset=UTF-8");// jsp에서 contentType역할
		PrintWriter out = response.getWriter();  // IO 패키지
		out.println("java : "+request.getParameter("java"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		// POST 방식 전용 인코딩 처리 , 반드시 적어줘야한다. => 추천) 필터(filter)화
		response.setCharacterEncoding("UTF-8"); 
		// response에 대해서도 인코딩 처리 , 응답에 대해서 
		
		response.setContentType("text/html; charset=UTF-8");// jsp에서 contentType역할
		System.out.println("doPost");
		PrintWriter out = response.getWriter();  // IO 패키지
		out.println("java : "+request.getParameter("java"));
		//doGet(request, response);
	}

}