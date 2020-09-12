package com.example.HCM20_FPL_CT_INTERN_01_G1_Lab1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class student {

	@Id
	@Column(name = "id", length = 8, nullable = false)
	private String id;
	
	@Column(name = "name", length = 50, nullable = false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Column(name = "birthday", nullable = false)
	private Date birthday;
	
	@Column(name = "gender", nullable = false)
	private Boolean gender;
	
	@Column(name = "phone", length = 12, nullable = false)
	private String phone;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "major", length = 50, nullable = false)
	private String major;
	
	@Column(name = "address", length = 500, nullable = false)
	private String address;
	
	public student() {
		super();
	}

	public student(String id, String name, Date birthday, Boolean gender, String phone, String email, String major,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.major = major;
		this.address = address;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
