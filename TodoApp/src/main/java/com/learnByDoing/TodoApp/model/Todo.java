package com.learnByDoing.TodoApp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
//import org.hibernate.annotations.Entity;
import javax.persistence.Entity;



@Entity
@Table(name="TBL_EMPLOYEES")
public class Todo {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date")
	private String date;
	
	@Column (name="author")
	private String author;
	
	@Column (name="description")
	private String desc;
	
	public String getDesc() {return desc;}
	public void setDesc(String desc) {this.desc = desc;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	 public long getId() {
	        return this.id;
	    }
	
}
