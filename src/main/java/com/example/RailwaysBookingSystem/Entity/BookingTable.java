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
public class BookingTable {
    @Id
    @GeneratedValue
    private int bookingId;

    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private int trainNo;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private LocalDateTime journeyDate;

    @Column(nullable = false)
    private int seatNumber;

    @Column(nullable = false)
    private String reservation; 

    @Column(nullable = false)
    private String paymentStatus;

    @Column(nullable = false)
    private String bookingStatus;

    @Column(nullable = false)
    private long pnrNo;
}
