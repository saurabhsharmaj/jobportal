package com.bit.hostel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.hostel.common.CommonSql;
import com.bit.hostel.common.Constants;
import com.bit.hostel.model.User;

public class UserDaoImpl extends CommonDao<User>{



	@Override
	public List<User> get() {
		List<User> list= new ArrayList<User>();
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. USER_SQL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setImgpath(rs.getString(5));
				list.add(user);
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
	public User get(int id) {
		User user = null;
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. USER_ID_SQL);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();			
			while (rs.next()) {
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setImgpath(rs.getString(5));
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
		return user;
	}

	@Override
	public void saveOrUpdate(User user) {
		Connection con = getConnection();
		try{
			PreparedStatement stmt = null;
			if(user.getUserId() == null || user.getUserId() == 0){
				stmt = con.prepareStatement(CommonSql. USER_SAVE_SQL);
			} else {
				stmt = con.prepareStatement(CommonSql. USER_UPDATE_SQL);

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
			PreparedStatement stmt = con.prepareStatement(CommonSql. USER_DELETE_SQL);
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
	public int delete(User obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getUser(String username, String password) {
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. USER_USERNAME_PASSWORD_SQL);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, Constants.ACTIVE);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setImgpath(rs.getString("imgpath"));
				user.setRole(rs.getString("role"));
				user.setStatus(rs.getInt("status"));
				user.setLastLogin(rs.getTimestamp("lastlogin"));
				return user;
				
			}
			return null;

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
		return null;
	}
}
