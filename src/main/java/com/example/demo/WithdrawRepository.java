package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Withdraw;

public interface WithdrawRepository extends CrudRepository<Withdraw, Integer> {

}
