package jobportal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class C
 */
@WebServlet("/LogIn")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 
		 HttpSession session=request.getSession();
		 session.removeAttribute("username");
		 List<User> userList = DBUtils.getUsers();
			request.setAttribute("users", userList);
		 request.setAttribute("LogOut", " You Have Successfully Logged Out.");
		 request.getRequestDispatcher("index.jsp").forward(request, response);
		 
	}
		
	

		

	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		          
		    String username=request.getParameter("username"); 
		    String password=request.getParameter("password"); 
		  
		  	
			boolean isAvailable = DBUtils.isUserExist(username,password);
			if(isAvailable) {
				
				 HttpSession session=request.getSession();
				 session.setAttribute("username", username);
				 List<User> userList = DBUtils.getUsers();
					request.setAttribute("users", userList);
				 request.setAttribute("LogIn", " Welcome : " +username);
				 request.getRequestDispatcher("home.jsp").forward(request, response);
				
			}
			
			else {
				request.setAttribute("username", "");
				request.setAttribute("errormsg", " Username or Password invalid.");
				request.getRequestDispatcher("index.jsp").forward(request, response);
		} 
	}  
}


