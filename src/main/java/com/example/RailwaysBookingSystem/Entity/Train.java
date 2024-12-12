package com.example.RailwaysBookingSystem.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {
	@Id
	@GeneratedValue
	
	private int id;
	
	@Column(nullable = false)
	private  String trainName;
	
	@Column(nullable = false) 
	private String destination;
	
	@Column(nullable = false)
	private String source;
	
	private LocalDateTime departure;
	
	
	private LocalDateTime arrival;
	
	
	

}
