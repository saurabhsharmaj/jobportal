package com.bit.hostel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.hostel.dao.StudentDaoImpl;
import com.bit.hostel.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private StudentDaoImpl studentDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        studentDao = new StudentDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String SID = request.getParameter("SID");
		if(action == null || action.length() == 0){
    		List<Student> list = studentDao.get();
    		request.setAttribute("list", list);
    		request.setAttribute("page", "student.jsp");
    		request.getRequestDispatcher("./index.jsp").forward(request, response);
		}
		
		else if(action.equals("add")){
			request.setAttribute("page", "AddStd.jsp");
			request.getRequestDispatcher("./index.jsp").forward(request, response);
		}
		
	/*	else if(action.equalsIgnoreCase("edit")){
    		if(SID != null) {
    			List<Student> list = studentDao.get();
        		request.setAttribute("list", list);
    			request.setAttribute("errormsg", "either student is not exist or some issue with it.");
    			request.setAttribute("page", "AddStd.jsp");
    			request.getRequestDispatcher("./index.jsp").forward(request, response);
    	}
		}    */
		
		else if( action.equals("edit")){
			if(SID != null){
				studentDao.get(Integer.parseInt(SID));
			}
			
			request.setAttribute("student", studentDao);
			List<Student> list = studentDao.get();
    		request.setAttribute("list", list);	
    		request.setAttribute("page", "AddStd.jsp");
			request.getRequestDispatcher("./index.jsp").forward(request, response);
			
		}
		
		 else if(action.equalsIgnoreCase("delete")){
	    		Integer student = studentDao.delete(Integer.parseInt(SID));
	    		request.setAttribute("student", student);
	    		List<Student> list = studentDao.get();
	    		request.setAttribute("list", list);
	    		request.setAttribute("page", "student.jsp");
	    		request.getRequestDispatcher("./index.jsp").forward(request, response);
	    		}      

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String SID= request.getParameter("SId");	
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
	//	String SDOB = request.getParameter("SDOB");
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
	//	String UpdatedOn = request.getParameter("UpdatedOn");
		String UpdatedBy = request.getParameter("UpdatedBy");


		Student student = new Student();
		if(SID != null){
			student.setSID(Integer.parseInt(SID));
		}
		student.setFirstName(FirstName);
		student.setLastName(LastName);
		student.setsBranch(SBranch);
		student.setsMobile(SMobile);
		student.setsGender(SGender);
		student.setsRollNo(SRollNo);
		student.setsEmail(SEmail);
		student.setsAddressP(SAddressP);
		student.setsAddressC(SAddressC);
		student.setsCity(SCity);
		student.setsState(SState);
	//	student.setsDOB(SDOB);
		student.setS10Th(S10Th);
		student.setS12Th(S12Th);
		student.setsDeploma(SDeploma);
		student.setsPercent(SPercent);
		student.setsJee(SJee);
		student.setsDirect(SDirect);
		student.setFatherName(FatherName);
		student.setMotherName(MotherName);
		student.setFatherContact(FatherContact);
		student.setMotherContact(MotherContact);
		student.setsYear(SYear);
		student.setsEnum(SEnum);
	//	student.setUpdatedOn(UpdatedOn);
		student.setUpdatedBy(UpdatedBy);
		
		studentDao.saveOrUpdate(student);
		List<Student> list = studentDao.get();
		request.setAttribute("list", list);		
		response.sendRedirect("studentServlet");


	}

}
