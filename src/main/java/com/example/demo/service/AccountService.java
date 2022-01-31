package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccountRepository;
import com.example.demo.CustomerRepository;
import com.example.demo.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	CustomerRepository customerRepository;

	public Iterable<Account> getAccount() {
		return accountRepository.findAll();
	}

	public void saveAccount(Account account) {
		accountRepository.save(account);
	}

	public Optional<Account> getAccounts(Integer id) {
		return accountRepository.findById(id);
	}

}
