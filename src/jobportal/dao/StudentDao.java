package jobportal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.common.DBUtils;
import jobportal.model.Student;

public class StudentDao extends DBUtils {

/*Student insert, delete, update operations  */
	
	public static void saveStudent(Student student) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "INSERT INTO "
					+ "`jobportal`.`students`"
					+ " (`First_Name`, `Last_Name`, `S_Mobile`)"
					+ " VALUES ('"+student.getFirst_Name()+"', '"+student.getLast_Name()+"', '"+student.getS_Mobile()+"')";
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	

	public static List<Student> getStudent() {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from students");
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				students.add(student);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return students;
	}
	
	
	public static void deleteStudent(int S_Id) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "DELETE FROM "
					+ "`jobportal`.`studentss`"
					+ " WHERE S_Id="+S_Id;
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static void updateStudent(Student student) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "UPDATE "
					+ "`jobportal`.`users`"
					+ " SET `First_Name` ='"+student.getFirst_Name()+"',"
							+ " `Last_Name`='"+student.getLast_Name()+"',"
							+ " `S_Mobile`='"+student.getS_Mobile()+"'"
						+ " WHERE `S_Id`="+student.getS_Id();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public static boolean isStudentExist(String username, String password) {
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
	
	
	public static List<Student> Searchstudent(String Key) {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`users`"
					+ " WHERE First_Name LIKE '%"+Key+"%' order by username";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				students.add(student);
				
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return students;
	}
	
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from students");
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
				students.add(student);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return students;
	}
	
	
	
}
