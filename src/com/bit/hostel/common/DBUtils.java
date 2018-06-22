package com.bit.hostel.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	static String url = "jdbc:mysql://localhost:3306/jobportal";
	static String user = "root";
	static String password = "root";

	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		try{
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
		}catch(Exception ex){
			return null;
		}
	}
}