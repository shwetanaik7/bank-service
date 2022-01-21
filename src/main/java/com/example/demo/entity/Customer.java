package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "Name is mandatory")
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String gender;
	
	@NotEmpty
	private String dob;
	
	@NotNull
	@Size(max=50)
	@NotBlank(message = "Address is mandatory")
	@NotEmpty
	private String address;
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "City is mandatory")
	@NotEmpty 
	private String city;
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "State is mandatory")
	@NotEmpty
	private String state;
	
	@NotNull
	@Size(max=7)
	@NotBlank(message = "pin is mandatory")
	@NotEmpty
	private String pin;
	
	@Size(max=15)
	private String phone;
	
	@Size(max=15)
	private String fax;
	
	@Email
	@NotEmpty
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
