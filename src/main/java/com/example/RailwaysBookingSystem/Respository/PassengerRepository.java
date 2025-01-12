package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RailwaysBookingSystem.Entity.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger

, Long> {

}
