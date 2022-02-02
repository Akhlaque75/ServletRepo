package com.pojo;

public class Userbean {
  private String name;
  private String password;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String toString() {
	return "Userbean [name=" + name + ", password=" + password + ", email=" + email + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
