package jobportal.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.dao.StudentDao;
import jobportal.model.Student;

/**
 * Servlet implementation class StudentActionServlet
 */
@WebServlet("/StudentAction")
public class StudentActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String SId =request.getParameter("SId");
		Student student = new Student();
		
		if(action.equals("delete")){
			request.setAttribute("action", "delete");
			if(SId != null){
				StudentDao.deleteStudent(Integer.parseInt(SId));
			}
		}  else if( action.equals("edit")){
			request.setAttribute("action", "edit");
			if(SId != null){
				student  = StudentDao.getStudent(Integer.parseInt(SId));
			}
			
			request.setAttribute("student", student);
		}
		List<Student> studentList = StudentDao.getStudents();
		request.setAttribute("students", studentList);		
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
