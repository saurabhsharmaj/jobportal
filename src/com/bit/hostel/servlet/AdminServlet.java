package com.bit.hostel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.hostel.common.UserRole;
import com.bit.hostel.dao.StaffDaoImpl;
import com.bit.hostel.dao.StudentDaoImpl;
import com.bit.hostel.dao.UserDaoImpl;
import com.bit.hostel.dao.VendorDaoImpl;
import com.bit.hostel.model.Leave;
import com.bit.hostel.model.Staff;
import com.bit.hostel.model.Student;
import com.bit.hostel.model.User;
import com.bit.hostel.model.Vendor;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserDaoImpl userDao;
	
	private StudentDaoImpl studentDao;
	
	private StaffDaoImpl staffDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        userDao = new UserDaoImpl();
        studentDao = new StudentDaoImpl();
        staffDao= new StaffDaoImpl();
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
		} else if(action.equals("leave")){
			request.setAttribute("page", "leave.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}  else if(action.equals("student")){
			List<Student> list = new StudentDaoImpl().get();
			request.setAttribute("list", list);
			request.setAttribute("page", "student.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		} else if(action.equals("vendor")){
			List<Vendor> list = new VendorDaoImpl().get();
			request.setAttribute("list", list);
			request.setAttribute("page", "vendor.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		} else if(action.equals("staff")){
			List<Staff> list = staffDao.get();
			request.setAttribute("list", list);
			request.setAttribute("page", "staff.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}else if(action.equals("logout")){	
			request.getSession().invalidate();
			request.getRequestDispatcher("./home?action=login").forward(request, response);
		}else {
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
			Staff staff = staffDao.get(user.getUserId());
			request.getSession().setAttribute("otherdetails", staff);
			List<Leave> leaves = staffDao.getLeaveDetails(staff);
			request.setAttribute("leaves",leaves);
			request.setAttribute("page", "hod_home.jsp");
		} else if(user.getRole().equals(UserRole.STAFF_ROLE)){
			request.setAttribute("page", "staff_home.jsp");
		} else if(user.getRole().equals(UserRole.STUDENT_ROLE)){
			List<Leave> leaves = studentDao.getLeaveDetails(user);
			request.setAttribute("leaves",leaves);
			request.setAttribute("page", "student_home.jsp");
		} else if(user.getRole().equals(UserRole.GARD_ROLE)){
			List<Leave> leaves = staffDao.getLeaveDetails();
			request.setAttribute("leaves",leaves);
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
