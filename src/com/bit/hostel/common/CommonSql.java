package com.bit.hostel.common;

public class CommonSql {

	//STAFF SQL
	public static final String STAFF_SQL = "SELECT * FROM staff";
	public static final String STAFF_ID_SQL = "SELECT * FROM STAFF WHERE STAFFID=?";
	public static final String STAFF_DELETE_SQL = "DELETE FROM STAFF WHERE STAFFID=?";
	public static final String STAFF_SAVE_SQL = "INSERT INTO `jobportal`.`staff`"
			+ " (`staffname`, `contact`, `email`, `gender`, `department`, `stafftype`, `dateofbirth`, `updatedby`, `statusenum`)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static String STAFF_SAVE_WITH_ID_SQL ="INSERT INTO `jobportal`.`staff`"
			+ " (`staffid`,`staffname`, `contact`, `email`, `gender`, `department`, `stafftype`, `dateofbirth`, `updatedby`, `statusenum`)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
	
	public static final String STAFF_UPDATE_SQL = "UPDATE `jobportal`.`staff`"
			+ " SET "
			+ "`staffname`=?, `contact`=?, `email`=?, `gender`=?, `department`=?, `stafftype`=?, `dateofbirth`=?, `updatedby`=?, `statusenum`=? WHERE `staffid`=?";

	public static final String STAFF_HOD_LEAVE_DETAILD_SQL="SELECT a.*,s.SBranch,u.userid as sid, u.username as sname,u.imgpath as simgpath, u.role as srole,u.status as sstatus,uu.userid as aid, uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid left join students s on s.SID = u.userid left join staff st on st.department = s.SBranch and st.stafftype='HOD'left join users uu on a.approved_by = uu.userid WHERE st.staffid=?";
	
	public static final String STAFF_HOD_LEAVE_DETAILD_BY_STATUS_SQL="SELECT a.*,s.SBranch,u.userid as sid, u.username as sname,u.imgpath as simgpath, u.role as srole,u.status as sstatus,uu.userid as aid, uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid left join students s on s.SID = u.userid left join staff st on st.department = s.SBranch and st.stafftype='HOD'left join users uu on a.approved_by = uu.userid WHERE a.confirm=?";
	
    public static final String STAFF_HOD_LEAVE_DETAILD_FOR_STAFF_SQL="SELECT a.*,s.department,u.userid as stid, u.username as stname,u.imgpath as stimgpath, u.role as strole,u.status as ststatus,uu.userid as aid, uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid left join staff s on s.staffid = u.userid left join staff st on st.department = s.department and st.stafftype='STAFF'left join users uu on a.approved_by = uu.userid WHERE st.staffid=?";
    			
	public static final String STAFF_HOD_LEAVE_DETAILD_BY_STATUS_FOR_STAFF_SQL="SELECT a.*,s.department,u.userid as sid, u.username as sname,u.imgpath as simgpath, u.role as srole,u.status as sstatus,uu.userid as aid,\n" + 
			" uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid \n" + 
			" left join staff s on s.staffid = u.userid left join staff st on st.department = s.department and st.stafftype='STAFF'left join \n" + 
			" users uu on a.approved_by = uu.userid WHERE a.confirm=?";  
			
	
	public static final String STAFF_LEAVE_DETAILS_SQL = "SELECT a.*,u.userid as sid, u.username as sname,u.imgpath as simgpath, u.role as srole,u.status as sstatus,uu.userid as aid, uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid left join users uu on a.approved_by = uu.userid where u.userid=?";
	public static final String STAFF_BY_ROLE_SQL="SELECT * FROM staff WHERE department=? ";
	
	
	//STUDENT SQL
	public static final String STUDENT_SQL = "SELECT * FROM STUDENTS";
	public static final String STUDENT_ID_SQL = "SELECT * FROM STUDENTS WHERE SID=?";
	public static final String STUDENT_DELETE_SQL = "DELETE FROM STUDENTS WHERE SID=?";
	public static final String STUDENT_SAVE_SQL = "INSERT INTO "
			+ "`jobportal`.`students`"
			+ " (`FirstName`, `LastName`, `SBranch`, `SMobile`, `SGender`,"
			+ " `SRollNo`, `SEmail`, `SAddressP`, `SAddressC`, `SCity`,"
			+ " `SState`, `SDOB`, `S10Th`, `S12Th`, `SDeploma`, `SPercent`,"
			+ " `SJee`, `SDirect`, `FatherName`, `MotherName`, `FatherContact`,"
			+ " `MotherContact`, `SYear`, `SEnum`, `UpdatedOn`, `UpdatedBy`)"
			+ " VALUES (?,?,?,?,?,?,?,?,?,?"
			+ ",?,?,?,?,?,?,?,?,?,?"
			+ ",?,?,?,?,?,?)";
	
	public static final String STUDENT_SAVE_WITH_ID_SQL = "INSERT INTO "
			+ "`jobportal`.`students`"
			+ " (`SID`,`FirstName`, `LastName`, `SBranch`, `SMobile`, `SGender`,"
			+ " `SRollNo`, `SEmail`, `SAddressP`, `SAddressC`, `SCity`,"
			+ " `SState`, `SDOB`, `S10Th`, `S12Th`, `SDeploma`, `SPercent`,"
			+ " `SJee`, `SDirect`, `FatherName`, `MotherName`, `FatherContact`,"
			+ " `MotherContact`, `SYear`, `SEnum`, `UpdatedOn`, `UpdatedBy`)"
			+ " VALUES (?,?,?,?,?,?,?,?,?,?"
			+ ",?,?,?,?,?,?,?,?,?,?"
			+ ",?,?,?,?,?,?,?)";
			
	public static final String STUDENT_UPDATE_SQL = "UPDATE `jobportal`.`students`"
													+" SET"
													+ "`FirstName` = ?, `LastName` = ?, `SBranch` = ?, `SMobile` = ?, `SGender` = ?, `SRollNo` = ?, `SEmail` = ?, `SAddressP` = ?, `SAddressC` = ?,"
													+ " `SCity` = ?, `SState` = ?, `SDOB` = ?, `S10Th` = ?, `S12Th` = ?, `SDeploma` = ?, `SPercent` = ?,`SJee` = ?, `SDirect` = ?, `FatherName` = ?,"
													+ " `MotherName` = ?, `FatherContact` = ?, `MotherContact` = ?, `SYear` = ?, `SEnum` = ?, `UpdatedOn` = ?, `UpdatedBy` = ? `WHERE SId` = ?";
	
	public static final String STUDENT_DETAILS_ROLE_SQL = "SELECT s.* FROM USERS u JOIN STUDENTS s ON u.userid=s.sid where s.sbranch=?";
	public static final String STUDENT_DETAILS_BY_SEC_SQL ="SELECT s.* FROM USERS u JOIN STUDENTS s ON u.userid=s.sid where s.SBranch =? s.section=?";
	
	//USER SQL
	public static final String USER_SQL = "SELECT * FROM USERS";
	public static final String USER_ID_SQL = "SELECT * FORM USERS WHERE USERID=?";
	public static final String USER_USERNAME_PASSWORD_SQL = "SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=? AND STATUS=?";
	public static final String USER_DELETE_SQL = "DELETE FROM USERS WHERE USERID=?";
	public static final String USER_SAVE_SQL = "INSERT INTO `jobportal`.`users` (`username`, `password`, `email`, `imgpath`,`role`,`status`) VALUES (?, ?, ?, ?,?,?)";
	public static final String USER_UPDATE_SQL = "UPDATE `jobportal`.`USERS` SET `username`=?, `password`=?, `email`=?, `imgpath`=?,`role`=?, `status`=? WHERE `userId`=?";


	//VENDOR SQL
	public static final String VENDOR_SQL = "SELECT * FROM VENDORS";
	public static final String VENDOR_ID_SQL = "";
	public static final String VENDOR_DELETE_SQL = null;
	public static final String VENDOR_SAVE_SQL = null;
	public static final String VENDOR_UPDATE_SQL = null;
	public static final String STUDENT_LEAVE_DETAILS_SQL = "SELECT a.*,u.userid as sid, u.username as sname,u.imgpath as simgpath, u.role as srole,u.status as sstatus,uu.userid as aid, uu.username as aname,uu.imgpath as aimgpath, uu.role as arole,uu.status as astatus FROM applyleave a join users u on a.userId = u.userid left join users uu on a.approved_by = uu.userid where u.userid=?";
	public static final String LEAVE_SAVE_SQL = "INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outtime`, `confirm`, `updatedby`, `isgatepassgen`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	public static final String LEAVE_UPDATE_SQL = "UPDATE `jobportal`.`applyleave` SET `approved_by`=?, `confirm`=?, `updatedby`=? WHERE `id`=?";
	public static final String LEAVE_GATE_PASS_SQL = "UPDATE `jobportal`.`applyleave` SET `updatedby`=?, `isgatepassgen`=? WHERE `id`=?";
	public static final String LEAVE_STATUS_SQL = "SELECT COUNT(*) FROM applyleave where userid=? and confirm=?";
	public static final String ALL_LEAVE_STATUS_SQL = "SELECT COUNT(*) FROM applyleave where userid=?";
	
	
	
	
}
