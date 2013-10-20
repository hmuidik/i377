package projekt;

import java.io.IOException;
import java.sql.SQLException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if("clear_data".equalsIgnoreCase(request.getParameter("do"))){
			try {
				(new Dao()).deleteData();;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else if("insert_data".equalsIgnoreCase(request.getParameter("do"))){
			try {
				new SetupDao().addData();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*switch(request.getParameter("do")){
		case "clear_data":
			try {
				(new Dao()).deleteData();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "insert_data":
			new SetupDao().addData();
			break;
		
		default:
			break;
		}*/
		
		response.sendRedirect("Search");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
