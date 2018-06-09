package jobportal.model;

public class Vendor {

	 int Vendorid;
	String Vendorname="";
	String password="";
	
public Vendor(){
		
	}
	
	public Vendor(int Vendorid , String Vendorname,String password, String imgPath){
		this.Vendorid=Vendorid;
		this.Vendorname=Vendorname;
		this.password=password;
		
}

	

	public  int getVendorid() {
		return Vendorid;
	}

	public void setVendorid(int Vendorid) {
		Vendorid = Vendorid;
	}

	public String getVendorname() {
		return Vendorname;
	}

	public void setVendorname(String Vendorname) {
		Vendorname = Vendorname;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}