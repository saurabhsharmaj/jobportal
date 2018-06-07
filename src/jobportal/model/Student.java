package jobportal.model;

public class Student {
	
	int S_Id;
	String First_Name="";
	String Last_Name="";
	String S_Mobile;

	public Student(){
		
	}
	
	public Student(int S_Id , String First_Name,String Last_Name, String S_Mobile){
		this.S_Id=S_Id;
		this.First_Name=First_Name;
		this.Last_Name=Last_Name;
		this.S_Mobile=S_Mobile;

	}
	
	

	public  int getS_Id() {
		return S_Id;
	}
	public void setS_Id(int S_Id) {
		this.S_Id = S_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}
	public String getS_Mobile() {
		return S_Mobile;
	}
	public void setS_Mobile(String S_Mobile) {
		this.S_Mobile = S_Mobile;
	}
	


}
