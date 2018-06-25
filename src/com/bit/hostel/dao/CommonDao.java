package com.bit.hostel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.bit.hostel.common.CommonSql;
import com.bit.hostel.common.DBUtils;
import com.bit.hostel.model.Leave;

public abstract class CommonDao<T> {
	public Connection getConnection(){
		return DBUtils.getConnection();
		
	}
	public abstract List<T> get();
	public abstract T get(int id);
	public abstract void saveOrUpdate(T obj);
	public abstract int delete(int id);
	public abstract int delete(T obj);
	
	public void saveLeave(Leave leave) {		
		Connection con = getConnection();
		try{
			PreparedStatement stmt = null;
			if(leave.getId() == null || leave.getId() == 0){
				stmt = con.prepareStatement(CommonSql. LEAVE_SAVE_SQL);
				stmt.setInt(1,leave.getUser().getUserId());
				stmt.setString(2, leave.getPurpose());
				stmt.setString(3, leave.getRemark());
				stmt.setTimestamp(4, new Timestamp(leave.getIntime().getTime()));
				stmt.setTimestamp(5, new Timestamp(leave.getOutTime().getTime()));
				stmt.setString(6, "pending");
				stmt.setString(7, leave.getUser().getUsername());
				stmt.setInt(8, 0);
			} else {
				stmt = con.prepareStatement(CommonSql. LEAVE_UPDATE_SQL);
				
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
}
