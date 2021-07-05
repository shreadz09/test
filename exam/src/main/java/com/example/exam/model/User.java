package com.example.exam.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="bday")
	private Date bday;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	
	public User() {
		this.setId(UUID.randomUUID().toString());
	}
	
	public User(String id, String name, String email, String mobile, Date bday, int age, String gender) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.bday = bday;
		this.age = age;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = Period.between(getBday().toLocalDate(), LocalDate.now()).getYears();
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
