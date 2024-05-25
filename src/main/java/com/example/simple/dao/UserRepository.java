package com.example.simple.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simple.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
