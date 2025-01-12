 package com.example.RailwaysBookingSystem.Entity;

import java.time.LocalDateTime;
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
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @ManyToOne
    private  User user;

    @ManyToOne
    private Train train;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private LocalDateTime journeyDate;

    @Column(nullable = false)
    private int seatNumber;

//    @Column(nullable = false)
//    private String reservation; 

    @Column(nullable = false)
    private String paymentStatus;

    @Column(nullable = false)
    private String bookingStatus;

    @Column(nullable = false)
    private long pnrNo;
    
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "booking")
    private List<Notification> notificaton;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "booking")
    private List<Passenger> passengers;
    
}
