package com.nirbhay.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirbhay.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
