package com.spindash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="userid")
	int userid;
	@Column(name="username")
	String userName;
	@Column(name="email")
	String email;
	@Column(name="password")	
	String password;
	@Column(name="address")
	String address;
	@Column(name="phonenumber")
	Long phoneNumber;
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userid + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	public User(int userId, String userName, String email, String password, String address, Long phoneNumber) {
		super();
		this.userid = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	public User(String userName, String email, String password, String address, Long phoneNumber) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public User() {
		super();
	}
	
	
}
