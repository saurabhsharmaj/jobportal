package jobportal.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.dao.UserDao;
import jobportal.model.User;

/**
 * Servlet implementation class StaffLogin
 */
@WebServlet("/StaffLogin")
public class StaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TO DO Auto-generated method stub

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		  
	  	
		boolean isAvailable = UserDao.isUserExist(username,password);
		if(isAvailable) {
			 List<User> userList = UserDao.getUsers();
				request.setAttribute("users", userList);
			
			 request.getRequestDispatcher("staffhome.jsp").forward(request, response);
	
		}
		else {
			request.setAttribute("username", "");
			request.setAttribute("errormsg", " Username or Password is invalid.");
			request.getRequestDispatcher("staff.jsp").forward(request, response);
	} 
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
