package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.RailwaysBookingSystem.Entity.Booking;

@RepositoryRestResource(path = "booking")
@CrossOrigin
public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
