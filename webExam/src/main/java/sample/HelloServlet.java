package sample;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloServlet() {
        System.out.println("Hello Servlet 생성자 ");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("hello servlet init");
	}

	
	public void destroy() {
		System.out.println("hello servlet destory");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello servlet service");
		System.out.println("TEST TEST");
	}

}
