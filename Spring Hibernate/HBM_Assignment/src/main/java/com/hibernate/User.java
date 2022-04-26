package com.hibernate;

public class User {
	
	private int id;
	private String firstname;
	private String lastname;
	private String add1;
	private String add2;
	private String dob;
	private String email;
	private String password;
	private String city;
	private String mobile;
	public User() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public User(int id, String firstname, String lastname, String add1, String add2, String dob, String email,
			String password, String city, String mobile) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.add1 = add1;
		this.add2 = add2;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.city = city;
		this.mobile = mobile;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAdd1() {
		return add1;
	}
	public String getAdd2() {
		return add2;
	}
	public String getDob() {
		return dob;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getCity() {
		return city;
	}
	public String getMobile() {
		return mobile;
	}
	public int getId() {
		return id;
	}
	

}
