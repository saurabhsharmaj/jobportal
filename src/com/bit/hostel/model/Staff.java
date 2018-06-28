package com.bit.hostel.model;

import java.util.Date;

public class Staff{
	private Integer staffId;
	private String staffname;
	private String contact;
	private String email;
	private String gender;
	private String department;
	private String stafftype;
	private Date dateofbirth;
	private String updatedby;
	private Date updatedOn;
	private String statusenum;
	public String  Section;

	
	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffname(){
		return staffname;
	}

	public void setStaffname(String staffname){
		this.staffname=staffname;
	}

	public String getContact(){
		return contact;
	}

	public void setContact(String contact){
		this.contact=contact;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getGender(){
		return gender;
	}

	public void setGender(String gender){
		this.gender=gender;
	}

	public String getDepartment(){
		return department;
	}

	public void setDepartment(String department){
		this.department=department;
	}

	public String getStafftype(){
		return stafftype;
	}

	public void setStafftype(String stafftype){
		this.stafftype=stafftype;
	}

	public Date getDateofbirth(){
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth){
		this.dateofbirth=dateofbirth;
	}

	public String getUpdatedby(){
		return updatedby;
	}

	public void setUpdatedby(String updatedby){
		this.updatedby=updatedby;
	}

	public String getStatusenum(){
		return statusenum;
	}

	public void setStatusenum(String statusenum){
		this.statusenum=statusenum;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
}