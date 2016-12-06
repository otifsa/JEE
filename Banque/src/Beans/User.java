package Beans;

public class User {
  int id_user;
  String username;
  String password;
  int type;
public int getId_user() {
	return id_user;
}
public void setId_user(int id_user) {
	this.id_user = id_user;
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
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public User(int id_user, String username, String password, int type) {
	super();
	this.id_user = id_user;
	this.username = username;
	this.password = password;
	this.type = type;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [id_user=" + id_user + ", username=" + username
			+ ", password=" + password + ", type=" + type + "]";
}
public void show(){
	System.out.println(toString());
} 
  
}
