package com.bit.hostel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.hostel.common.UserRole;
import com.bit.hostel.dao.UserDaoImpl;
import com.bit.hostel.model.User;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserDaoImpl userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        userDao = new UserDaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./home?action=login").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = userDao.getUser(username,password);
		if(user == null){
			request.setAttribute("errormsg", "either username or password invalid.");
			request.getRequestDispatcher("./login.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("user", user);			
			response.sendRedirect("./admin");
			
		}
	
	}

}
