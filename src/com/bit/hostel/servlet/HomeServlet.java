package com.bit.hostel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action == null || action.length() == 0){
			request.getRequestDispatcher("./index.jsp").forward(request, response);
		} else if(action.equals("login")){
			request.getRequestDispatcher("./login.jsp").forward(request, response);
		} else if(action.equals("dashboard")){
			request.setAttribute("page", "main.jsp");
			request.getRequestDispatcher("./index.jsp").forward(request, response);
		} else if(action.equals("admin")){
			request.getRequestDispatcher("./admin").forward(request, response);
		} else if(action.equals("user")){
			request.getRequestDispatcher("./userServlet").forward(request, response);
		} else if(action.equals("student")){
			request.getRequestDispatcher("./studentServlet").forward(request, response);
		} else if(action.equals("vendor")){
			request.getRequestDispatcher("./vendorServlet").forward(request, response);
		} else if(action.equals("staff")){
			response.sendRedirect("./staffServlet");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
