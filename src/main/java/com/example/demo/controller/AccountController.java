package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/account")
	Iterable<Account> getAccount() {
		return accountService.getAccount();
	}
	
	@GetMapping("/account/{id}")
	Optional<Account> getAccounts(@PathVariable("id") Integer id) {
		return accountService.getAccounts(id);
	}
	
	
	@PostMapping("/account/{id}")
	void createAccount(@RequestBody @Valid Account account, @PathVariable("id") Integer id) {
		System.out.println(account.getAccountType());
		accountService.saveAccount(account);
	}

}
