package com.bit.hostel.common;

public class CommonSql {

	//STAFF SQL
	public static final String STAFF_SQL = "SELECT * FROM staff";
	public static final String STAFF_ID_SQL = "SELECT * FROM STAFF WHERE STAFFID=?";
	public static final String STAFF_DELETE_SQL = "DELETE FROM STAFF WHERE STAFFID=?";
	public static final String STAFF_SAVE_SQL = "INSERT INTO `jobportal`.`staff`"
			+ " (`staffname`, `contact`, `email`, `gender`, `department`, `stafftype`, `dateofbirth`, `updatedby`, `statusenum`)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String STAFF_UPDATE_SQL = "UPDATE `jobportal`.`staff`"
			+ " SET "
			+ "`staffname`=?, `contact`=?, `email`=?, `gender`=?, `department`=?, `stafftype`=?, `dateofbirth`=?, `updatedby`=?, `statusenum`=? WHERE `staffid`=?";

	
	//STUDENT SQL
	public static final String STUDENT_SQL = "SELECT * FROM STUDENTS";
	public static final String STUDENT_ID_SQL = "";
	public static final String STUDENT_DELETE_SQL = null;
	public static final String STUDENT_SAVE_SQL = null;
	public static final String STUDENT_UPDATE_SQL = null;
	
	
	//USER SQL
	public static final String USER_SQL = "SELECT * FROM USERS";
	public static final String USER_ID_SQL = "";
	public static final String USER_DELETE_SQL = null;
	public static final String USER_SAVE_SQL = null;
	public static final String USER_UPDATE_SQL = null;

	//VENDOR SQL
	public static final String VENDOR_SQL = "SELECT * FROM VENDORS";
	public static final String VENDOR_ID_SQL = "";
	public static final String VENDOR_DELETE_SQL = null;
	public static final String VENDOR_SAVE_SQL = null;
	public static final String VENDOR_UPDATE_SQL = null;
}
