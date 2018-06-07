package jobportal.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.dao.StudentDao;
import jobportal.dao.VendorDao;
import jobportal.model.Student;
import jobportal.model.Vendor;

/**
 * Servlet implementation class VendorActionServelet
 */
@WebServlet("/VendorAction")
public class VendorActionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorActionServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String vendorId =request.getParameter("vendorid");
		Vendor vendor = new Vendor();
		
		if(action.equals("delete")){
			request.setAttribute("action", "delete");
			if(vendorId != null){
				VendorDao.deleteVendor(Integer.parseInt(vendorId));
			}
		}  else if( action.equals("edit")){
			request.setAttribute("action", "edit");
			if(vendorId != null){
				vendor  =(Vendor) VendorDao.getVendor(Integer.parseInt(vendorId));
			}
			
			request.setAttribute("vendor", vendor);
		}
		List<Vendor> vendorList = VendorDao.getVendors();
		request.setAttribute("vendor", vendorList);		
		request.getRequestDispatcher("vendor.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
