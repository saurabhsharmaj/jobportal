package jobportal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Key=request.getParameter("search");
		
	//	boolean isAvailable = DBUtils.isSearchExist(Key);
	//	if(isAvailable) {
			List<User> users = DBUtils.SearchKey(Key);
			request.setAttribute("users", users);	
			request.getRequestDispatcher("home.jsp").forward(request, response);
	/*	}
		else {
			request.setAttribute("Key", "");
			request.setAttribute("resultmsg", " Username not exist.");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}*/
				
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
