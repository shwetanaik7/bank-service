package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Withdraw {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer withdraw_id;
	
	Integer acc_no;
	public Integer getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(Integer acc_no) {
		this.acc_no = acc_no;
	}
	Integer amount;
	String description;
	
	public Integer getWithdraw_id() {
		return withdraw_id;
	}
	public void setWithdraw_id(Integer withdraw_id) {
		this.withdraw_id = withdraw_id;
	}
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
