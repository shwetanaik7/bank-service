package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Pattern(regexp = "^Savings$|^savings$|^Current$|^current$")
	@NotBlank
	@Size(max=10)
	String accountType;
	
	@Range(min=500)
	Integer initialDeposit;
	
	@OneToOne(mappedBy = "account")
	Customer customer;
	
	/*@OneToOne(mappedBy = "account")
	Deposit deposit;*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Integer getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(Integer initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

}
