package com.springjdbc.model;

public class Student {
	
	int sid;
	String firstname,lastname,fathername,mothername,classname,section,dob,date_of_addmission,
	gender,add1,add2,s_phone,p_phone,p_email;
	int cityid;
	public Student(int sid, String firstname, String lastname, String fathername, String mothername, String classname,
			String section, String dob, String date_of_addmission, String gender, String add1, String add2,
			String s_phone, String p_phone, String p_email, int cityid) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.classname = classname;
		this.section = section;
		this.dob = dob;
		this.date_of_addmission = date_of_addmission;
		this.gender = gender;
		this.add1 = add1;
		this.add2 = add2;
		this.s_phone = s_phone;
		this.p_phone = p_phone;
		this.p_email = p_email;
		this.cityid = cityid;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(String date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public String getP_phone() {
		return p_phone;
	}
	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	
}
