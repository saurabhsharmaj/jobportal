package jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.common.DBUtils;
import jobportal.model.User;

public class UserDao extends DBUtils {
	
	public static List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users");
			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
				users.add(user);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return users;
	}
	
	public static void saveUser(User user) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO users (username,password,email) VALUES(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.executeUpdate();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void deleteUser(int userId) {
		try {
			Connection con = getConnection();			
			String sql= "DELETE FROM users WHERE userId = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			stmt.executeUpdate();
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
public static void main(String[] args) {
	System.out.println(getUser(2));
}
	public static User getUser(int userId) {
		String sql= "SELECT * FROM USERS WHERE USERID = ?";
		User user = null;
		try {
			Connection con = getConnection();			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
			}
			con.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return user;
	}

	public static void updateUser(User user) {
		try {
			Connection con = getConnection();			
			String sql= "UPDATE  users SET username = ?, password = ?, email = ? WHERE userId = ?";
			System.out.println(sql);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.setInt(4, user.getUserId());
			stmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isUserExist(String username, String password) {
		try {
			Connection con = getConnection();			
			String sql= "SELECT * FROM  users WHERE username = ? and password = ? ";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				return true;
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	
	public static List<User> SearchKey(String key) {
		List<User> users = new ArrayList<User>();
		try {
			Connection con = getConnection();			
			String sql= "SELECT * FROM  users WHERE username LIKE '%?%' order by username";
			System.out.println(sql);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				users.add(user);
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return users;
	}
}
