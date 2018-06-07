package jobportal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.common.DBUtils;
import jobportal.model.Vendor;

public class VendorDao extends DBUtils{
	
	public static List<Vendor> getVendors() {
		List<Vendor> Vendors = new ArrayList<Vendor>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from Vendors");
			while (rs.next()) {
				Vendor Vendor = new Vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				Vendors.add(Vendor);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return Vendors;
	}
	
	public static void main(String[] args) {
		List<Vendor> list =  getVendors();
		for (Vendor Vendor : list) {
			System.out.println(Vendor.getvendorId());
		}
	}

	public static void saveVendor(Vendor Vendor) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "INSERT INTO "
					+ "`jobportal`.`Vendors`"
					+ " (`Vendorname`, `password`, `email`)"
					+ " VALUES ('"+Vendor.getvendorId()+"', '"+Vendor.getPassword()+"')";
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void deleteVendor(int VendorId) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "DELETE FROM "
					+ "`jobportal`.`Vendors`"
					+ " WHERE VendorId="+VendorId;
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static Vendor getVendor(int VendorId) {
		Vendor Vendor = null;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`Vendors`"
					+ " WHERE VendorId="+VendorId;
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Vendor = new Vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				
			}
			con.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return Vendor;
	}

	public static void updateVendor(Vendor Vendor) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "UPDATE "
					+ "`jobportal`.`Vendors`"
					+ " SET `Vendorname` ='"+Vendor.getvendorId()+"',"
							+ " `password`='"+Vendor.getPassword()+"',"
							
						+ " WHERE `VendorId`="+Vendor.getvendorId();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isVendorExist(String Vendorname, String password) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`Vendors`"
					+ " WHERE Vendorname='"+Vendorname+"' and password='"+password+"'";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				return true;
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	
	public static List<Vendor> SearchKey(String Key) {
		List<Vendor> Vendors = new ArrayList<Vendor>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`Vendors`"
					+ " WHERE Vendorname LIKE '%"+Key+"%' order by Vendorname";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Vendor Vendor = new Vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				Vendors.add(Vendor);
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return Vendors;
	}
}