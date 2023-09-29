package com.example.fcosamuel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fcosamuel.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}