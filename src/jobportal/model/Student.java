package jobportal.model;

public class Student {
	
	int SId;
	String FirstName="";
	String LastName="";
	String SBranch="";
	String SMobile="";
	String SGender="";
	String SRollNo="";
	String SEmail="";							
	String SAddressP="";
	String SAddressC="";
	String SCity="";
	String SState="";
	String SDOB="";
	String S10Th="";
	String S12Th="";
	String SDeploma="";
	String SPercent="";
	String SJee="";
	String SDirect="";
	String FatherName="";					
	String MotherName="";
	String FatherContact="";						
	String MotherContact="";				
	String SYear="";
	String SEnum="";
	String UpdatedOn="";
	String UpdatedBy="";
	
	
		
	
	
	public Student( int SId, String FirstName, String LastName, String SGender, String SRollNo, String SEmail, String SAddressP, String SAddressC, String SCity, String SState, String SDOB, String S10Th, String S12Th, String SDeploma, String SPercent, String SJee, String SDirect, String FatherName, String MotherName, String FatherContact, String MotherContact, String SYear, String SEnum, String UpdatedOn, String UpdatedBy){
		this.SId=SId;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.SMobile=SBranch;
		this.SBranch=SMobile;
		this.SGender=SGender;
		this.SRollNo=SRollNo;
		this.SEmail=SEmail;
		this.SAddressP=SAddressP;
		this.SAddressC=SAddressC;
		this.SCity=SCity;
		this.SState=SState;
		this.SDOB=SDOB;
		this.S10Th=S10Th;
		this.S12Th=S12Th;
		this.SDeploma=SDeploma;
		this.SPercent=SPercent;
		this.SJee=SJee;
		this.SDirect=SDirect;
		this.FatherName=FatherName;
		this.MotherName=MotherName;
		this.FatherContact=FatherContact;
		this.MotherContact=MotherContact;
		this.SYear=SYear;
		this.SEnum=SEnum;
		this.UpdatedOn=UpdatedOn;
		this.UpdatedBy=UpdatedBy;
		
		
		
	}

	public Student() {
	}

	/**
	 * @return the sId
	 */
	public int getSId() {
		return SId;
	}

	/**
	 * @param sId the sId to set
	 */
	public void setSId(int SId) {
		this.SId = SId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	/**
	 * @return the sBranch
	 */
	public String getSBranch() {
		return SBranch;
	}

	/**
	 * @param sBranch the sBranch to set
	 */
	public void setSBranch(String SBranch) {
		this.SBranch = SBranch;
	}

	/**
	 * @return the sMobile
	 */
	public String getSMobile() {
		return SMobile;
	}

	/**
	 * @param sMobile the sMobile to set
	 */
	public void setSMobile(String SMobile) {
		this.SMobile = SMobile;
	}

	/**
	 * @return the sGender
	 */
	public String getSGender() {
		return SGender;
	}

	/**
	 * @param sGender the sGender to set
	 */
	public void setSGender(String SGender) {
		this.SGender = SGender;
	}

	/**
	 * @return the sRollNo
	 */
	public String getSRollNo() {
		return SRollNo;
	}

	/**
	 * @param sRollNo the sRollNo to set
	 */
	public void setSRollNo(String SRollNo) {
		this.SRollNo = SRollNo;
	}

	/**
	 * @return the sEmail
	 */
	public String getSEmail() {
		return SEmail;
	}

	/**
	 * @param sEmail the sEmail to set
	 */
	public void setSEmail(String SEmail) {
		this.SEmail = SEmail;
	}

	/**
	 * @return the sAddressP
	 */
	public String getSAddressP() {
		return SAddressP;
	}

	/**
	 * @param sAddressP the sAddressP to set
	 */
	public void setSAddressP(String sAddressP) {
		SAddressP = sAddressP;
	}

	/**
	 * @return the sAddressC
	 */
	public String getSAddressC() {
		return SAddressC;
	}

	/**
	 * @param sAddressC the sAddressC to set
	 */
	public void setSAddressC(String SAddressC) {
		this.SAddressC = SAddressC;
	}

	/**
	 * @return the sCity
	 */
	public String getSCity() {
		return SCity;
	}

	/**
	 * @param sCity the sCity to set
	 */
	public void setSCity(String SCity) {
		this.SCity = SCity;
	}

	/**
	 * @return the sState
	 */
	public String getSState() {
		return SState;
	}

	/**
	 * @param sState the sState to set
	 */
	public void setSState(String SState) {
		this.SState = SState;
	}

	/**
	 * @return the sDOB
	 */
	public String getSDOB() {
		return SDOB;
	}

	/**
	 * @param sDOB the sDOB to set
	 */
	public void setSDOB(String SDOB) {
		this.SDOB = SDOB;
	}

	/**
	 * @return the s10Th
	 */
	public String getS10Th() {
		return S10Th;
	}

	/**
	 * @param s10Th the s10Th to set
	 */
	public void setS10Th(String S10Th) {
		this.S10Th = S10Th;
	}

	/**
	 * @return the s12Th
	 */
	public String getS12Th() {
		return S12Th;
	}

	/**
	 * @param s12Th the s12Th to set
	 */
	public void setS12Th(String S12Th) {
		this.S12Th = S12Th;
	}

	/**
	 * @return the sDeploma
	 */
	public String getSDeploma() {
		return SDeploma;
	}

	/**
	 * @param sDeploma the sDeploma to set
	 */
	public void setSDeploma(String SDeploma) {
		this.SDeploma = SDeploma;
	}

	/**
	 * @return the sPercent
	 */
	public String getSPercent() {
		return SPercent;
	}

	/**
	 * @param sPercent the sPercent to set
	 */
	public void setSPercent(String SPercent) {
		this.SPercent = SPercent;
	}

	/**
	 * @return the sJee
	 */
	public String getSJee() {
		return SJee;
	}

	/**
	 * @param sJee the sJee to set
	 */
	public void setSJee(String SJee) {
		this.SJee = SJee;
	}

	/**
	 * @return the sDirect
	 */
	public String getSDirect() {
		return SDirect;
	}

	/**
	 * @param sDirect the sDirect to set
	 */
	public void setSDirect(String SDirect) {
		this.SDirect = SDirect;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return FatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String FatherName) {
		this.FatherName = FatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return MotherName;
	}

	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String MotherName) {
		this.MotherName = MotherName;
	}

	/**
	 * @return the fatherContact
	 */
	public String getFatherContact() {
		return FatherContact;
	}

	/**
	 * @param fatherContact the fatherContact to set
	 */
	public void setFatherContact(String FatherContact) {
		this.FatherContact = FatherContact;
	}

	/**
	 * @return the motherContact
	 */
	public String getMotherContact() {
		return MotherContact;
	}

	/**
	 * @param motherContact the motherContact to set
	 */
	public void setMotherContact(String MotherContact) {
		this.MotherContact = MotherContact;
	}

	/**
	 * @return the sYear
	 */
	public String getSYear() {
		return SYear;
	}

	/**
	 * @param sYear the sYear to set
	 */
	public void setSYear(String SYear) {
		this.SYear = SYear;
	}

	/**
	 * @return the sEnum
	 */
	public String getSEnum() {
		return SEnum;
	}

	/**
	 * @param sEnum the sEnum to set
	 */
	public void setSEnum(String SEnum) {
		this.SEnum = SEnum;
	}

	/**
	 * @return the updatedOn
	 */
	public String getUpdatedOn() {
		return UpdatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(String UpdatedOn) {
		this.UpdatedOn = UpdatedOn;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return UpdatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String UpdatedBy) {
		this.UpdatedBy = UpdatedBy;
	}






}
