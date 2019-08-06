package com.rohit.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rohit.demo.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
