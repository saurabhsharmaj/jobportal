package jobportal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/users")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<User> userList = DBUtils.getUsers();
		request.setAttribute("users", userList);		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId= request.getParameter("userId");	
		String username= request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");


		User user = new User();
		if(userId != null){
			user.setUserId(Integer.parseInt(userId));
		}
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		if(userId != null && Integer.parseInt(userId) !=0 ){
			DBUtils.updateUser(user);
		}else {
			DBUtils.saveUser(user);
		}

		List<User> userList = DBUtils.getUsers();
		request.setAttribute("users", userList);		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}



