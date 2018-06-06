package jobportal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;
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
		String userId =request.getParameter("userId");
		User user = new User();
		
		if(action.equals("delete")){
			request.setAttribute("action", "delete");
			if(userId != null){
				DBUtils.deleteUser(Integer.parseInt(userId));
			}
		}  else if( action.equals("edit")){
			request.setAttribute("action", "edit");
			if(userId != null){
				user = DBUtils.getUser(Integer.parseInt(userId));
			}
			request.setAttribute("user", user);
		} else if(action.equals("image")){
			ServletContext cntx = request.getServletContext();
		      // Get the absolute path of the image
			  user = DBUtils.getUser(Integer.parseInt(userId));
		      String filename = user.getImgPath() == null || user.getImgPath().trim().length() ==0 ? "d:/portaljob/images/default.png":user.getImgPath();
		      // retrieve mimeType dynamically
		      String mime = cntx.getMimeType(filename);
		      if (mime == null) {
		        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		        return;
		      }

		      response.setContentType(mime);
		      File file = new File(filename);
		      response.setContentLength((int)file.length());

		      FileInputStream in = new FileInputStream(file);
		      OutputStream out = response.getOutputStream();

		      // Copy the contents of the file to the output stream
		       byte[] buf = new byte[1024];
		       int count = 0;
		       while ((count = in.read(buf)) >= 0) {
		         out.write(buf, 0, count);
		      }
		    out.close();
		    in.close();
		}
		List<User> userList = DBUtils.getUsers();
		request.setAttribute("users", userList);		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
