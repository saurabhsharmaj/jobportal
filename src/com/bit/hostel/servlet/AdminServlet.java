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
 * Servlet implementation class HomeServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserDaoImpl userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        userDao = new UserDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action == null || action.length() == 0){
			if(redirect(request,response)){
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
			} else {
				request.getSession().invalidate();
				request.getRequestDispatcher("./home?action=login").forward(request, response);
			}
		} else if(action.equals("logout")){	
			request.getSession().invalidate();
			request.getRequestDispatcher("./home?action=login").forward(request, response);
		} else {
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}
	}

	private Boolean redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = (User)request.getSession().getAttribute("user");
		if(user == null){
			return false;
		} else if(user.getRole().equals(UserRole.ADMIN_ROLE)){			
			request.setAttribute("page", "");
		} else if(user.getRole().equals(UserRole.STAFF_HOD_ROLE)){
			request.setAttribute("page", "hod_home.jsp");
		} else if(user.getRole().equals(UserRole.STAFF_ROLE)){
			request.setAttribute("page", "staff_home.jsp");
		} else if(user.getRole().equals(UserRole.STUDENT_ROLE)){
			request.setAttribute("page", "student_home.jsp");
		} else if(user.getRole().equals(UserRole.GARD_ROLE)){
			request.setAttribute("page", "gard_home.jsp");
		}
		return true;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
