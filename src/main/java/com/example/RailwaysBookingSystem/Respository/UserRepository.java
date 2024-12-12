package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RailwaysBookingSystem.Entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	

}
