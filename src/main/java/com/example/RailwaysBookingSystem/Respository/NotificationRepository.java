package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RailwaysBookingSystem.Entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
