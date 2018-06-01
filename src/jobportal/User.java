package jobportal;

public class User {

	int userId;
	String username="";
	String password="";
	String email="";
	String imgPath ="default.png";
	public User(){
		
	}
	
	public User(int id , String username,String password, String email, String imgPath){
		this.userId=id;
		this.username=username;
		this.password=password;
		this.email=email;
		this.imgPath=imgPath;
	}
	
	public  int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
