package com.bit.hostel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.hostel.common.Constants;
import com.bit.hostel.common.UserRole;
import com.bit.hostel.common.Utils;
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
		User user = (User)request.getSession().getAttribute("user");
		if(user==null){
			request.getRequestDispatcher("./login.jsp").forward(request, response);
		} else if(action == null || action.length() == 0 || action.equals("home")){
			if(redirect(request,response)){
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
			} else {
				request.getSession().invalidate();
				request.getRequestDispatcher("./home?action=login").forward(request, response);
			}
		} else if(action.equals("leave")){
			request.setAttribute("page", "leave.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}   else if(action.equals("approvedleave")){
			request.setAttribute("page", "hod_home.jsp");
			String leaveId=request.getParameter("leaveId");
			Leave leave = new Leave();
			leave.setId(Integer.parseInt(leaveId));
			leave.setApprovedBy(user);
			leave.setStatus(Constants.ALLOW_LEAVE);
			staffDao.saveLeave(leave);
			request.getRequestDispatcher("./admin?action=home").forward(request, response);
		}     else if(action.equals("rejectleave")){
			request.setAttribute("page", "hod_home.jsp");
			String leaveId=request.getParameter("leaveId");
			Leave leave = new Leave();
			leave.setId(Integer.parseInt(leaveId));
			leave.setApprovedBy(user);
			leave.setStatus(Constants.CANCEL_LEAVE);
			staffDao.saveLeave(leave);
			request.getRequestDispatcher("./admin?action=home").forward(request, response);
		} else if(action.equals("user")){
			List<User> list = userDao.get();
			request.setAttribute("list", list);
			request.setAttribute("page", "user.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}   else if(action.equals("editprofile")){
			if(user.getRole().equalsIgnoreCase(UserRole.ADMIN_ROLE)){
				request.setAttribute("admin", request.getSession().getAttribute("otherdetails"));
				request.setAttribute("page", "editprofile.jsp");
			} else if(user.getRole().equalsIgnoreCase(UserRole.STAFF_HOD_ROLE) || user.getRole().equalsIgnoreCase(UserRole.STAFF_ROLE)){
				request.setAttribute("staff", request.getSession().getAttribute("otherdetails"));
				request.setAttribute("page", "staff_edit.jsp");
			} else if(user.getRole().equalsIgnoreCase(UserRole.STUDENT_ROLE)){
				request.setAttribute("student", request.getSession().getAttribute("otherdetails"));
				request.setAttribute("page", "editprofile.jsp");
			} else if(user.getRole().equalsIgnoreCase(UserRole.GARD_ROLE)){
				request.setAttribute("gard", request.getSession().getAttribute("otherdetails"));
				request.setAttribute("page", "editprofile.jsp");
			}
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}  else if(action.equals("student")){
			Staff staffDetail = (Staff)request.getSession().getAttribute("otherdetails");
			List<Student> list = studentDao.get(staffDetail.getDepartment());
			request.setAttribute("list", list);
			request.setAttribute("page", "student.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		} else if(action.equals("vendor")){
			List<Vendor> list = new VendorDaoImpl().get();
			request.setAttribute("list", list);
			request.setAttribute("page", "vendor.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		} else if(action.equals("staff")){
			Staff staffDetail = (Staff)request.getSession().getAttribute("otherdetails");
			List<Staff> list = staffDao.get(staffDetail.getDepartment());
			request.setAttribute("list", list);
			request.setAttribute("page", "staff.jsp");
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		} else if(action.equals("logout")){	
			request.getSession().invalidate();
			request.getRequestDispatcher("./home?action=login").forward(request, response);
		}   else if(action.equals("createpass")){
			request.setAttribute("page", "gard_home.jsp");
			String leaveId=request.getParameter("leaveId");
			Leave leave = new Leave();
			leave.setId(Integer.parseInt(leaveId));
			leave.setIsGatePassGenerate(1);
			leave.setUpdatedBy(user.getUsername());
			staffDao.GeneratePass(leave);
			request.getRequestDispatcher("./admin?action=home").forward(request, response);
		}     else if(action.equals("cancelpass")){
			request.setAttribute("page", "gard_home.jsp");
			String leaveId=request.getParameter("leaveId");
			Leave leave = new Leave();
			leave.setId(Integer.parseInt(leaveId));
			leave.setIsGatePassGenerate(0);
			leave.setUpdatedBy(user.getUsername());
			staffDao.GeneratePass(leave);
			request.getRequestDispatcher("./admin?action=home").forward(request, response);
		}  else {
			request.getRequestDispatcher("./admin.jsp").forward(request, response);
		}
	}

	private Boolean redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = (User)request.getSession().getAttribute("user");
		if(user == null){
			return false;
		} else if(user.getRole().equals(UserRole.ADMIN_ROLE)){
			Staff admin = new Staff();
			admin.setDepartment("ALL");
			request.getSession().setAttribute("otherdetails", admin);
			request.setAttribute("page", "");
		} else if(user.getRole().equals(UserRole.STAFF_HOD_ROLE)){
			Staff staff = staffDao.get(user.getUserId());
			request.getSession().setAttribute("otherdetails", staff);
			List<Leave> leaves = staffDao.getLeaveDetails(staff);
			Integer ispendingAvl = anyPendingRequest(leaves);
			request.setAttribute("pendingReq",ispendingAvl);
			request.setAttribute("leaves",leaves);
			List<Leave> leavesstaff = staffDao.getLeaveDetailsStaff(staff);
			request.setAttribute("leavesstaff",leavesstaff);
			request.setAttribute("page", "hod_home.jsp");
		} else if(user.getRole().equals(UserRole.STAFF_ROLE)){
			Staff staff = staffDao.get(user.getUserId());
			request.getSession().setAttribute("otherdetails", staff);
			List<Leave> leaves = staffDao.getLeaveDetails(user);
			request.setAttribute("leaves",leaves);
			request.setAttribute("page", "staff_home.jsp");
		} else if(user.getRole().equals(UserRole.STUDENT_ROLE)){
			List<Leave> leaves = studentDao.getLeaveDetails(user);
			request.setAttribute("leaves",leaves);
			request.setAttribute("page", "student_home.jsp");
		} else if(user.getRole().equals(UserRole.GARD_ROLE)){
			List<Leave> leaves = staffDao.getLeaveDetails();
			request.setAttribute("leaves",leaves);
			List<Leave> leavesstaff = staffDao.getLeaveDetailsStaff();
			request.setAttribute("leavesstaff",leavesstaff);
			request.setAttribute("page", "gard_home.jsp");
		} 
		return true;
	}

	private int anyPendingRequest(List<Leave> leaves) {
		int count = 0;
		for (Leave leave : leaves) {
			if(leave.getStatus().equals("pending")){
				count++;
			}
		}
		return count;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("leave")){
			Leave leave = new Leave();
			leave.setPurpose(request.getParameter("purpose"));
			leave.setIntime(Utils.stringToDate(request.getParameter("intime")));
			leave.setOutTime(Utils.stringToDate(request.getParameter("outtime")));
			leave.setRemark(request.getParameter("remark"));
			User user = (User)request.getSession().getAttribute("user");
			leave.setUser(user);
			studentDao.saveLeave(leave);
			response.sendRedirect("./admin");
		}
			
	}

}
