package kodu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("Hello!");
		HttpSession s = request.getSession();
		String id = s.getId();
		Object param = s.getAttribute("param");
		response.getWriter().println("Your session id is: " + id);
		response.getWriter().println("Session attribute is: " + param);
		
	}

}
