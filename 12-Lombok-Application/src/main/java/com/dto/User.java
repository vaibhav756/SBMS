package com.dto;

import lombok.Data;

@Data
public class User {
	
	private Integer userId;
	private String userName;
	private String email;
	private String pwd;
	private String gender;
	private String phno;
	/*public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", pwd=" + pwd + ", gender="
				+ gender + ", phno=" + phno + "]";
	}

	public User() {

	}
	
	public User(Integer userId, String userName, String email, String pwd, String gender, String phno) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.pwd = pwd;
		this.gender = gender;
		this.phno = phno;
	}*/

}
