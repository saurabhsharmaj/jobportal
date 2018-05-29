package jobportal;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserActionServlet
 */
@WebServlet("/useraction")
public class UserActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("delete")){
			request.setAttribute("action", "delete");
			String userId =request.getParameter("userId");
			if(userId != null){
				DBUtils.deleteUser(Integer.parseInt(userId));
			}
		} else if( action.equals("edit")){
			request.setAttribute("action", "edit");
			User user = new User();
			String userId =request.getParameter("userId");
			if(userId != null){
				user = DBUtils.getUser(Integer.parseInt(userId));
			}
			
			request.setAttribute("user", user);
		}
		List<User> userList = DBUtils.getUsers();
		request.setAttribute("users", userList);		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}