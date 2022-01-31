package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Range;

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer enquiry_id;
	
	@Range(min=1)
	Integer account_no;
	
	@OneToOne(mappedBy = "enquiry")
	Customer customer;

	public Integer getEnquiry_id() {
		return enquiry_id;
	}

	public void setEnquiry_id(Integer enquiry_id) {
		this.enquiry_id = enquiry_id;
	}

	public Integer getAccount_no() {
		return account_no;
	}

	public void setAccount_no(Integer account_no) {
		this.account_no = account_no;
	}
	

}
