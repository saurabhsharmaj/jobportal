package jobportal.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.dao.VendorDao;
import jobportal.model.vendor;

/**
 * Servlet implementation class VendorServelet
 */
@WebServlet("/Vendor")
public class VendorServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<vendor> vendorList = VendorDao.getvendors();
		request.setAttribute("vendors", vendorList);		
		request.getRequestDispatcher("vendor.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String vendorId= request.getParameter("vendorId");	

		vendor vendor = new vendor();
		if(vendorId != null){
			vendor.setvendorId(Integer.parseInt(vendorId));
		}
		vendor.setvendorname(vendor.getvendorname());
	
	
		if(vendorId != null && Integer.parseInt(vendorId) !=0 ){
			VendorDao.updatevendor(vendor);
		}else {
			VendorDao.savevendor(vendor);
		}

		List<vendor> vendorList = VendorDao.getvendors();
		request.setAttribute("vendors", vendorList);		
		response.sendRedirect("./vendor");
	}
}
