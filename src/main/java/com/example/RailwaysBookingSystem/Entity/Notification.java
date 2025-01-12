package com.example.RailwaysBookingSystem.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int notificationId; 
	
    @ManyToOne
    private Booking booking;


    @Column(nullable = false)
    private String message;
    
    
    

   
}
