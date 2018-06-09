package jobportal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jobportal.common.DBUtils;
import jobportal.model.Student;

public class StudentDao extends DBUtils {

/*Student insert, delete, update operations  */
	
	public static void main(String[] args) {
		List<Student> list =  getStudents();
		for (Student student : list) {
			System.out.println(student.getFirstName());
		}
	}
	
	public static void saveStudent(Student student) {
		try {
			Connection con = getConnection();
			
			String sql= "INSERT INTO "
					+ "`jobportal`.`students`"
					+ " (`FirstName`, `LastName`, `SBranch`, `SMobile`, `SGender`,"
					+ " `SRollNo`, `SEmail`, `SAddressP`, `SAddressC`, `SCity`,"
					+ " `SState`, `SDOB`, `S10Th`, `S12Th`, `SDeploma`, `SPercent`,"
					+ " `SJee`, `SDirect`, `FatherName`, `MotherName`, `FatherContact`,"
					+ " `MotherContact`, `SYear`, `SEnum`, `UpdatedOn`, `UpdatedBy`)"
					+ " VALUES (?,?,?,?,?,?,?,?,?,?"
					+ ",?,?,?,?,?,?,?,?,?,?"
					+ ",?,?,?,?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,student.getFirstName());
			stmt.setString(2,student.getLastName());
			stmt.setString(3,student.getSBranch());
			stmt.setString(4,student.getSMobile());
			stmt.setString(5,student.getSGender());
			stmt.setString(6,student.getSRollNo());
			stmt.setString(7,student.getSEmail());
			stmt.setString(8,student.getSAddressP());
			stmt.setString(9,student.getSAddressC());
			stmt.setString(10,student.getSCity());
			stmt.setString(11,student.getSState());
			stmt.setDate(12, new Date(new java.util.Date().getTime()));
			stmt.setString(13,student.getS10Th());
			stmt.setString(14,student.getS12Th());
			stmt.setString(15,student.getSDeploma());
			stmt.setString(16,student.getSPercent());
			stmt.setString(17,student.getSJee());
			stmt.setString(18,student.getSDirect());
			stmt.setString(19,student.getFatherName());
			stmt.setString(20,student.getMotherName());
			stmt.setString(21,student.getFatherContact());
			stmt.setString(22,student.getMotherContact());
			stmt.setString(23,student.getSYear());
			stmt.setString(24,student.getSEnum());
			stmt.setDate(25, new Date(new java.util.Date().getTime()));
			stmt.setString(26,student.getUpdatedBy());			
			
			stmt.executeUpdate();
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	

	public static Student getStudent(int SId) {
		Student student = new Student();
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from students where sid = ? ");
			stmt.setInt(1, SId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25));
				
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return student;
	}
	
	
	public static void deleteStudent(int SId) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "DELETE FROM "
					+ "`jobportal`.`students`"
					+ " WHERE SId="+SId;
			stmt.executeUpdate(sql);
			con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static Student updateStudent(Student student) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "UPDATE "
					+ "`jobportal`.`students`"
					+ " SET `FirstName` =`"+student.getFirstName()+"`,"
							+ " `LastName`=`"+student.getLastName()+"`,"
							+ " `SBranch`=`"+student.getSBranch()+"`,"
							+ " `SMobile`=`"+student.getSMobile()+"`,"
							+ " `SGender`=`"+student.getSGender()+"`,"
							+ " `SrollNo`=`"+student.getSRollNo()+"`,"
							+ " `SEmail`=`"+student.getSEmail()+"`,"
							+ " `SAddressP`=`"+student.getSAddressP()+"`,"
							+ " `SAddressC`=`"+student.getSAddressC()+"`,"
							+ " `SCity`=`"+student.getSCity()+"`,"
							+ " `SState`=`"+student.getSState()+"`,"
							+ " `SDOB`=`"+student.getSDOB()+"`,"
							+ " `S10Th`=`"+student.getS10Th()+"`,"
							+ " `S12Th`=`"+student.getS12Th()+"`,"
							+ " `SDeploma`=`"+student.getSDeploma()+"`,"
							+ " `SPercent`=`"+student.getSPercent()+"`,"
							+ " `SJee`=`"+student.getSJee()+"`,"
							+ " `SDirect`=`"+student.getSDirect()+"`,"
							+ " `FatherName`=`"+student.getFatherName()+"`,"
							+ " `MotherName`=`"+student.getMotherName()+"`,"
							+ " `FatherContact`=`"+student.getFatherContact()+"`,"
							+ " `Mothercontact`=`"+student.getMotherContact()+"`,"
							+ " `SYear`=`"+student.getSYear()+"`,"
							+ " `SEnum`=`"+student.getSEnum()+"`,"
							+ " `UpdatedOn`=`"+student.getUpdatedOn()+"`,"
							+ " `UpdatedBy`=`"+student.getUpdatedBy()+"`"
						+ " WHERE `SId`="+student.getSId();
			System.out.println(sql);
			stmt.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return student;
		
	}
	
	public static boolean isStudentExist(String username, String password) {
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM "
					+ "`jobportal`.`studentss`"
					+ " WHERE username=`"+username+"` and password=`"+password+"`";
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
					+ "`jobportal`.`students`"
					+ " WHERE FirstName LIKE `%"+Key+"%` order by FirstName";
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25));
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
				try {
				Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25));
				students.add(student);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return students;
	}
	
	
	
}
