package jobportal.common;

import java.sql.Connection;
import java.sql.DriverManager;

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
}	
	
	
	
	
	
	
