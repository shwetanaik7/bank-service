package com.example.demo.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Withdraw;
import com.example.demo.service.BCustomerService;
import com.example.demo.service.WithdrawService;

@RestController
public class BankController {
	@Autowired
	BCustomerService customerService;
	
	@Autowired
	WithdrawService withdrawService;

	@GetMapping("/customer")
	Iterable<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@PostMapping("/customer")
	void createCustomer(@RequestBody @Valid Customer customer) {
		System.out.println(customer.getName());
		customerService.saveCustomer(customer);
	}
	
	@GetMapping("/withdraw")
	Iterable<Withdraw> getWithdraws() {
		return withdrawService.getWithdraws();
	}
	
	@PostMapping("/withdraw")
	void createWithdraw(@RequestBody @Valid Withdraw withdraw) {
		System.out.println(withdraw.getAcc_no());
		withdrawService.saveWithdraw(withdraw);
	}

}
