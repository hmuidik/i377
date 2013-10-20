package projekt;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if("delete".equalsIgnoreCase(request.getParameter("do"))){
			try {
				(new Dao()).removeUnit(request.getParameter("id"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		String searchString = (String) request.getParameter("searchString");
		List<Unit> units;
		
		try {
			Dao dao = new Dao();
			units = (searchString == null || searchString.length() == 0) ? dao.findAllUnits() : dao.findUnitsByName(searchString);
			
		} catch (SQLException e) {
			units = new ArrayList<Unit>();
		}
		
		request.setAttribute("units", units);
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
