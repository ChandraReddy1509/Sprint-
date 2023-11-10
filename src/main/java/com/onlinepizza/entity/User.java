package com.onlinepizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



@Entity
@Table(name="User_table")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	private String userName;
	private String password;
	private Long contactNo;
	private String email;
	private String city;
	//Admin, Customer
	private String userRole;
	
	
public User() {}


public User(Integer userId, String userName, String password, Long contactNo, String email, String city,
		String userRole) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
	this.contactNo = contactNo;
	this.email = email;
	this.city = city;
	this.userRole = userRole;
}


public Integer getUserId() {
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


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public Long getContactNo() {
	return contactNo;
}


public void setContactNo(Long contactNo) {
	this.contactNo = contactNo;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getUserRole() {
	return userRole;
}


public void setUserRole(String userRole) {
	this.userRole = userRole;
}


@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", contactNo=" + contactNo
			+ ", email=" + email + ", city=" + city + ", userRole=" + userRole + "]";
}



}
