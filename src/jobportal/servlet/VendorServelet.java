package jobportal.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobportal.dao.VendorDao;
import jobportal.model.Vendor;

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
		
		List<Vendor> vendorList = VendorDao.getVendors();
		System.out.println(vendorList.size());
		request.setAttribute("vendors", vendorList);		
		request.getRequestDispatcher("vendor.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String vendorId= request.getParameter("vendorId");	

		Vendor vendor = new Vendor();
		if(vendorId != null){
			vendor.setvendorId(Integer.parseInt(vendorId));
		}
		vendor.setvendorname(vendor.getvendorname());
	
	
		if(vendorId != null && Integer.parseInt(vendorId) !=0 ){
			VendorDao.updateVendor(vendor);
		}else {
			VendorDao.saveVendor(vendor);
		}

		List<Vendor> vendorList = VendorDao.getVendors();
		request.setAttribute("vendors", vendorList);		
		response.sendRedirect("./Vendor");
	}
}
