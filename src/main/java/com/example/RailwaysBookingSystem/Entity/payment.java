package com.example.RailwaysBookingSystem.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(nullable = false) 
	private int paymentId;
	
	@Column(nullable = false) 
	private int bookingId;
	
	@Column(nullable = false) 
	private String paymentMethod;

	@Column(nullable = false) 
	private String paymentStatus;
	
	
	@Column(nullable = false) 
	private LocalDateTime paymentDate;
	
	@Column(nullable = false) 
	private int amount;
	
	@Column(nullable = false) 
	private Long transactionId;
	
	

}
