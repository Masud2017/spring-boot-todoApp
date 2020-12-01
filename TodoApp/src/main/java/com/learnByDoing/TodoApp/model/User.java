package com.learnByDoing.TodoApp.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="First name")
	private String fname;
	@Column(name= "Last name")
	private String lname;
	@Column(name="Email")
	private String email;
	@Column(name="Address")
	private String address;
	@Column(name="Date")
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address
				+ ", date=" + date + "]";
	}
	
	public String getFullName() {
		String fullName = fname + " " + lname;
		return fullName;
	}

}
