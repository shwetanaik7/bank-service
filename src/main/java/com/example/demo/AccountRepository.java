package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
