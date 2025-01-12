package com.example.RailwaysBookingSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Long id;
	
	@Column(nullable = false)
	private String fullName;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String address;
	
	private int age;
	
	@ManyToOne
	private Booking booking;

	

}
