package projekt;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("add.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Unit unit = new Unit(request.getParameter("name"), request.getParameter("code"));
		if(!unit.isEmpty()){
			try {
				Dao dao = new Dao();
				dao.addUnit(unit);
				//System.out.println("Added data: " + unit);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		response.sendRedirect("Search");
	}

}
