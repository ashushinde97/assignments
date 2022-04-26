package com.yash.controller;

public class User {
String firstName,lastName,email,password;
String gen, terms_condition, cityname;

	public User()
	{}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
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

public String getGen() {
	return gen;
}

public void setGen(String gen) {
	this.gen = gen;
}

public String getTerms_condition() {
	return terms_condition;
}

public void setTerms_condition(String terms_condition) {
	this.terms_condition = terms_condition;
}

public String getCityname() {
	return cityname;
}

public void setCityname(String cityname) {
	this.cityname = cityname;
}


}
