package jobportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

	static String url = "jdbc:mysql://localhost:3306/jobportal";
	static String user = "root";
	static String password = "root";

	public static Connection getConnection() throws Exception {
		// register driver.
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

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
	
	public static void main(String[] args) {
		List<User> list =  getUsers();
		for (User user : list) {
			System.out.println(user.getUsername());
		}
	}

	public static void saveUser(User user) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "INSERT INTO "
					+ "`jobportal`.`users`"
					+ " (`username`, `password`, `email`)"
					+ " VALUES ('"+user.getUsername()+"', '"+user.getPassword()+"', '"+user.getEmail()+"')";
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void deleteUser(int userId) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "DELETE FROM "
					+ "`jobportal`.`users`"
					+ " WHERE userId="+userId;
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static User getUser(int userId) {
		User user = null;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`users`"
					+ " WHERE userId="+userId;
			ResultSet rs=stmt.executeQuery(sql);
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
			Statement stmt = con.createStatement();
			String sql= "UPDATE "
					+ "`jobportal`.`users`"
					+ " SET `username` ='"+user.getUsername()+"',"
							+ " `password`='"+user.getPassword()+"',"
							+ " `email`='"+user.getEmail()+"',"
							+ "`imgpath`='"+user.getImgPath()+"'"
						+ " WHERE `userId`="+user.getUserId();
			System.out.println(sql);
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isUserExist(String username, String password) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`users`"
					+ " WHERE username='"+username+"' and password='"+password+"'";
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
	
	public static List<User> SearchKey(String Key) {
		List<User> users = new ArrayList<User>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`users`"
					+ " WHERE username LIKE '%"+Key+"%' order by username";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
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