package jobportal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.common.DBUtils;
import jobportal.model.vendor;
import jobportal.model.vendor;

public class vendorDoa extends DBUtils{
	
	public static List<vendor> getvendors() {
		List<vendor> vendors = new ArrayList<vendor>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from vendors");
			while (rs.next()) {
				vendor vendor = new vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				vendors.add(vendor);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return vendors;
	}
	
	public static void main(String[] args) {
		List<vendor> list =  getvendors();
		for (vendor vendor : list) {
			System.out.println(vendor.getvendorname());
		}
	}

	public static void savevendor(vendor vendor) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "INSERT INTO "
					+ "`jobportal`.`vendors`"
					+ " (`vendorname`, `password`, `email`)"
					+ " VALUES ('"+vendor.getvendorname()+"', '"+vendor.getPassword()+"')";
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void deletevendor(int vendorId) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "DELETE FROM "
					+ "`jobportal`.`vendors`"
					+ " WHERE vendorId="+vendorId;
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static vendor getvendor(int vendorId) {
		vendor vendor = null;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`vendors`"
					+ " WHERE vendorId="+vendorId;
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				vendor = new vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				
			}
			con.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return vendor;
	}

	public static void updatevendor(vendor vendor) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "UPDATE "
					+ "`jobportal`.`vendors`"
					+ " SET `vendorname` ='"+vendor.getvendorname()+"',"
							+ " `password`='"+vendor.getPassword()+"',"
							
						+ " WHERE `vendorId`="+vendor.getvendorId();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isvendorExist(String vendorname, String password) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`vendors`"
					+ " WHERE vendorname='"+vendorname+"' and password='"+password+"'";
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
	
	public static List<vendor> SearchKey(String Key) {
		List<vendor> vendors = new ArrayList<vendor>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`vendors`"
					+ " WHERE vendorname LIKE '%"+Key+"%' order by vendorname";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				vendor vendor = new vendor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				vendors.add(vendor);
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return vendors;
	}
}