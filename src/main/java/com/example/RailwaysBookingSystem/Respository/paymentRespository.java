package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RailwaysBookingSystem.Entity.payment;

public interface paymentRespository extends JpaRepository<payment, Integer> {

}
