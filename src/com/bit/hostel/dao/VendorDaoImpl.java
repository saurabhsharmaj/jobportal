package com.bit.hostel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.hostel.common.CommonSql;
import com.bit.hostel.model.Vendor;

public class VendorDaoImpl extends CommonDao<Vendor>{


	

	@Override
	public List<Vendor> get() {
		List<Vendor> list= new ArrayList<Vendor>();
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. VENDOR_SQL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Vendor vendor = new Vendor();
				vendor.setVendorId(rs.getInt(1));
				vendor.setVendorname(rs.getString(2));
				vendor.setPurpose(rs.getString(3));
				vendor.setImagepath(rs.getString(4));
				list.add(vendor);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();	
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}

	@Override
	public Vendor get(int id) {
		Vendor vendor = null;
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. VENDOR_ID_SQL);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				vendor = new Vendor();
			}
			
		}catch(Exception ex){
			ex.printStackTrace();	
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return vendor;
	}

	@Override
	public void saveOrUpdate(Vendor vendor) {		
		Connection con = getConnection();
		try{
			PreparedStatement stmt = null;
			if(vendor.getVendorId() == null || vendor.getVendorId() == 0){
				stmt = con.prepareStatement(CommonSql. VENDOR_SAVE_SQL);
			} else {
				stmt = con.prepareStatement(CommonSql. VENDOR_UPDATE_SQL);
				
			}
			
			stmt.executeUpdate();
			
		}catch(Exception ex){
			ex.printStackTrace();	
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	
	
	}

	@Override
	public int delete(int id) {

		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. VENDOR_DELETE_SQL);
			stmt.setInt(1, id);
			return stmt.executeUpdate();
			
		}catch(Exception ex){
			ex.printStackTrace();	
		}finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return 0;
	
	}

	@Override
	public int delete(Vendor obj) {
		// TODO Auto-generated method stub
		return 0;
	}}
