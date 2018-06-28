package com.bit.hostel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bit.hostel.common.CommonSql;
import com.bit.hostel.model.Leave;
import com.bit.hostel.model.Student;
import com.bit.hostel.model.User;

public class StudentDaoImpl extends CommonDao<Student>{

	

	@Override
	public List<Student> get() {
		List<Student> list= new ArrayList<Student>();
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. STUDENT_SQL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				int columnCounter =1;
				student.setSID(rs.getInt(columnCounter++));
				student.setFirstName(rs.getString(columnCounter++));
				student.setLastName(rs.getString(columnCounter++));
				student.setsBranch(rs.getString(columnCounter++));
				student.setsMobile(rs.getString(columnCounter++));
				student.setsGender(rs.getString(columnCounter++));
				student.setsRollNo(rs.getString(columnCounter++));
				student.setsEmail(rs.getString(columnCounter++));
				student.setsAddressP(rs.getString(columnCounter++));
				student.setsAddressP(rs.getString(columnCounter++));
				student.setsCity(rs.getString(columnCounter++));
				student.setsState(rs.getString(columnCounter++));
				student.setsDOB(rs.getDate(columnCounter++));
				student.setS10Th(rs.getString(columnCounter++));
				student.setS12Th(rs.getString(columnCounter++));
				student.setsDeploma(rs.getString(columnCounter++));
				student.setsPercent(rs.getString(columnCounter++));
				student.setsJee(rs.getString(columnCounter++));
				student.setsDirect(rs.getString(columnCounter++));
				student.setFatherName(rs.getString(columnCounter++));
				student.setMotherName(rs.getString(columnCounter++));
				student.setFatherContact(rs.getString(columnCounter++));
				student.setMotherContact(rs.getString(columnCounter++));
				student.setsYear(rs.getString(columnCounter++));
				student.setsEnum(rs.getString(columnCounter++));
				student.setUpdatedOn(rs.getDate(columnCounter++));
				student.setUpdatedBy(rs.getString(columnCounter++));
				
				list.add(student);
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
	public Student get(int id) {
		Student student = null;
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. STUDENT_ID_SQL);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				student = new Student();
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
		return student;
	}

	@Override
	public void saveOrUpdate(Student student) {
		
		Connection con = getConnection();
		try{
			PreparedStatement stmt = null;
			if(isStudentExist(student.getSID())==false){
				
				stmt = con.prepareStatement(student.getSID()>0 ?CommonSql.STUDENT_SAVE_WITH_ID_SQL:CommonSql.STUDENT_SAVE_SQL);
				int count =1;
				if(student.getSID()>0 ){
					stmt.setInt(count++, student.getSID());
				}
				
				stmt.setString(count++,student.getFirstName());
				stmt.setString(count++,student.getLastName());
				stmt.setString(count++,student.getsBranch());
				stmt.setString(count++,student.getsMobile());
				stmt.setString(count++,student.getsGender());
				stmt.setString(count++,student.getsRollNo());
				stmt.setString(count++,student.getsEmail());
				stmt.setString(count++,student.getsAddressP());
				stmt.setString(count++,student.getsAddressC());
				stmt.setString(count++,student.getsCity());
				stmt.setString(count++,student.getsState());
				stmt.setDate(count++, new java.sql.Date(new Date().getTime()));
				stmt.setString(count++,student.getS10Th());
				stmt.setString(count++,student.getS12Th());
				stmt.setString(count++,student.getsDeploma());
				stmt.setString(count++,student.getsPercent());
				stmt.setString(count++,student.getsJee());
				stmt.setString(count++,student.getsDirect());
				stmt.setString(count++,student.getFatherName());
				stmt.setString(count++,student.getMotherName());
				stmt.setString(count++,student.getFatherContact());
				stmt.setString(count++,student.getMotherContact());
				stmt.setString(count++,student.getsYear());
				stmt.setString(count++,student.getsEnum());
				stmt.setDate(count++, new java.sql.Date(new Date().getTime()));
				stmt.setString(count++,student.getUpdatedBy());
			} else {
				stmt = con.prepareStatement(CommonSql. STUDENT_UPDATE_SQL);
				stmt.setString(1,student.getFirstName());
				stmt.setString(2,student.getLastName());
				stmt.setString(3,student.getsBranch());
				stmt.setString(4,student.getsMobile());
				stmt.setString(5,student.getsGender());
				stmt.setString(6,student.getsRollNo());
				stmt.setString(7,student.getsEmail());
				stmt.setString(8,student.getsAddressP());
				stmt.setString(9,student.getsAddressC());
				stmt.setString(10,student.getsCity());
				stmt.setString(11,student.getsState());
				stmt.setDate(12, new java.sql.Date(new Date().getTime()));
				stmt.setString(13,student.getS10Th());
				stmt.setString(14,student.getS12Th());
				stmt.setString(15,student.getsDeploma());
				stmt.setString(16,student.getsPercent());
				stmt.setString(17,student.getsJee());
				stmt.setString(18,student.getsDirect());
				stmt.setString(19,student.getFatherName());
				stmt.setString(20,student.getMotherName());
				stmt.setString(21,student.getFatherContact());
				stmt.setString(22,student.getMotherContact());
				stmt.setString(23,student.getsYear());
				stmt.setString(24,student.getsEnum());
				stmt.setDate(25, new java.sql.Date(new Date().getTime()));
				stmt.setString(26,student.getUpdatedBy());
				stmt.setInt(27, student.getSID());
				
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

	private boolean isStudentExist(Integer sid) {
		if(sid == null || sid == 0)
			return false;
		else{
			if(get(sid)==null){
				return false;
			}
		}
			
		return true;
	}

	@Override
	public int delete(int id) {

		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. STUDENT_DELETE_SQL);
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
	public int delete(Student obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Leave> getLeaveDetails(User u) {

		List<Leave> leaves = new ArrayList<Leave>();
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. STUDENT_LEAVE_DETAILS_SQL);
			stmt.setInt(1, u.getUserId());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Leave leave = new Leave();
				leave.setId(rs.getInt("id"));
				
				User user = new User();
				user.setUserId(rs.getInt("sid"));
				user.setUsername(rs.getString("sname"));
				user.setImgpath(rs.getString("simgpath"));
				user.setRole(rs.getString("srole"));
				user.setStatus(rs.getInt("sstatus"));
				leave.setUser(user);
				
				leave.setPurpose(rs.getString("purpose"));
				leave.setRemark(rs.getString("remark"));
				leave.setIntime(rs.getTimestamp("intime"));
				leave.setOutTime(rs.getTimestamp("outtime"));
				leave.setStatus(rs.getString("confirm"));
				leave.setUpdatedBy(rs.getString("updatedby"));
				leave.setUpdatedOn(rs.getTimestamp("updatedon"));
				leave.setIsGatePassGenerate(rs.getInt("isgatepassgen"));
				
				User approvedBy = new User();
				approvedBy.setUserId(rs.getInt("aid"));
				approvedBy.setUsername(rs.getString("aname"));
				approvedBy.setImgpath(rs.getString("aimgpath"));
				approvedBy.setRole(rs.getString("arole"));
				approvedBy.setStatus(rs.getInt("astatus"));
				
				leave.setApprovedBy(approvedBy);
				leaves.add(leave);
				
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
		return leaves;
	
	}

	public List<Student> get(String branchName) {


		List<Student> students = new ArrayList<Student>();
		Connection con = getConnection();
		try{
			PreparedStatement stmt = con.prepareStatement(CommonSql. STUDENT_DETAILS_ROLE_SQL);
			stmt.setString(1, branchName);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				try{
					Student student = new Student();
					student.setSID(rs.getInt(1));
					student.setFirstName(rs.getString(2));
					student.setLastName(rs.getString(3));
					student.setsBranch(rs.getString(4));
					students.add(student);				
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
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
		return students;
	
	
	}
	

}
