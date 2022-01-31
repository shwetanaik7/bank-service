package com.example.demo.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
	@Pattern(regexp = "^[A-Za-z][A-Za-z\s]+$")
	private String name;
	
	@NotEmpty
	@Pattern(regexp = "^male$|^female$|^Male$|^Female$")
	private String gender;
	
	@NotEmpty
	private String dob;
	
	@NotNull
	@Size(max=50)
	@NotBlank(message = "Address is mandatory")
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z][A-Za-z\s]+$")
	private String address;
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "City is mandatory")
	@NotEmpty 
	@Pattern(regexp = "^[A-Za-z][A-Za-z\s]+$")
	private String city;
	
	@NotNull
	@Size(max=25)
	@NotBlank(message = "State is mandatory")
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z][A-Za-z\s]+$")
	private String state;
	
	@NotNull
	@Size(max=7)
	@NotBlank(message = "pin is mandatory")
	@NotEmpty
	@Pattern(regexp = "^[1-9][0-9\s]+$")
	private String pin;
	
	@Size(max=15)
	@Pattern(regexp = "^[0-9]+$")
	private String phone;
	
	@Size(max=15)
	private String fax;
	
	@Email
	@NotEmpty
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="deposit_id", referencedColumnName = "id")
	Deposit deposit;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="account_id", referencedColumnName = "id")
	Account account;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="enquiryid", referencedColumnName = "enquiry_id")
	Enquiry enquiry;
	
	public Enquiry getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Deposit getDeposit() {
		return deposit;
	}
	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}
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
