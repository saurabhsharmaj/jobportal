package jobportal.model;

public class vendor {

	int VendorId;
	String Vendorname="";
	String password="";
	
public vendor(){
		
	}
	
	public vendor(int Id , String Vendorname,String password, String imgPath){
		this.VendorId=Id;
		this.Vendorname=Vendorname;
		this.password=password;
		
}

	

	public int getvendorId() {
		return VendorId;
	}

	public void setvendorId(int vendorId) {
		VendorId = vendorId;
	}

	public String getvendorname() {
		return Vendorname;
	}

	public void setvendorname(String vendorname) {
		Vendorname = vendorname;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}