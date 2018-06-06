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
 * Servlet implementation class StudentServler
 */
@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> studentList = StudentDao.getStudents();
		request.setAttribute("students", studentList);		
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String S_Id= request.getParameter("S_Id");	
		String First_Name = request.getParameter("First_Name");
		String Last_Name = request.getParameter("Last_Name");
		String S_Mobile = request.getParameter("S_Mobile");


		Student student = new Student();
		if(S_Id != null){
			student.setS_Id(Integer.parseInt(S_Id));
		}
		student.setFirst_Name(First_Name);
		student.setLast_Name(Last_Name);
		student.setS_Mobile(S_Mobile);
		if(S_Id != null && Integer.parseInt(S_Id) !=0 ){
			StudentDao.updateStudent(student);
		}else {
			StudentDao.saveStudent(student);
		}

		List<Student> studentList = StudentDao.getStudents();
		request.setAttribute("students", studentList);		
		response.sendRedirect("./Student");
	}


}

	