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
<<<<<<< HEAD
	/**
	 * 
	 */
	private static final long serialVersionUID = 2283570999121331620L;


	/**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
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
	
		String SId= request.getParameter("SId");	
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String SBranch = request.getParameter("SBranch");
		String SMobile = request.getParameter("SMobile");
		String SGender = request.getParameter("SGender");
		String SRollNo = request.getParameter("SRollNo");
		String SEmail = request.getParameter("SEmail");
		String SAddressP = request.getParameter("SAddressP");
		String SAddressC = request.getParameter("SAddressC");
		String SCity = request.getParameter("SCity");
		String SState = request.getParameter("SState");
		String SDOB = request.getParameter("SDOB");
		String S10Th = request.getParameter("S10Th");
		String S12Th = request.getParameter("S12Th");
		String SDeploma = request.getParameter("SDeploma");
		String SPercent = request.getParameter("SPercent");
		String SJee = request.getParameter("SJee");
		String SDirect = request.getParameter("SDirect");
		String FatherName = request.getParameter("FatherName");
		String MotherName = request.getParameter("MotherName");
		String FatherContact = request.getParameter("FatherContact");
		String MotherContact = request.getParameter("MotherContact");
		String SYear = request.getParameter("SYear");
		String SEnum = request.getParameter("SEnum");
		String UpdatedOn = request.getParameter("UpdatedOn");
		String UpdatedBy = request.getParameter("UpdatedBy");


		Student student = new Student();
		if(SId != null){
			student.setSId(Integer.parseInt(SId));
		}
		student.setFirstName(FirstName);
		student.setLastName(LastName);
		student.setSBranch(SBranch);
		student.setSMobile(SMobile);
		student.setSGender(SGender);
		student.setSRollNo(SRollNo);
		student.setSEmail(SEmail);
		student.setSAddressP(SAddressP);
		student.setSAddressC(SAddressC);
		student.setSCity(SCity);
		student.setSState(SState);
		student.setSDOB(SDOB);
		student.setS10Th(S10Th);
		student.setS12Th(S12Th);
		student.setSDeploma(SDeploma);
		student.setSPercent(SPercent);
		student.setSJee(SJee);
		student.setSDirect(SDirect);
		student.setFatherName(FatherName);
		student.setMotherName(MotherName);
		student.setFatherContact(FatherContact);
		student.setMotherContact(MotherContact);
		student.setSYear(SYear);
		student.setSEnum(SEnum);
		student.setUpdatedOn(UpdatedOn);
		student.setUpdatedBy(UpdatedBy);
		if(SId != null && Integer.parseInt(SId) !=0 ){
			StudentDao.updateStudent(student);
		}else {
			StudentDao.saveStudent(student);
		}

		List<Student> studentList = StudentDao.getStudents();
		request.setAttribute("students", studentList);		
		response.sendRedirect("./Student");
	
	}
=======
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

>>>>>>> branch 'master' of https://github.com/saurabhsharmaj/jobportal.git

}

	