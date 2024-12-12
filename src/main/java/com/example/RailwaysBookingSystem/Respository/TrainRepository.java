package com.example.RailwaysBookingSystem.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.RailwaysBookingSystem.Entity.Train;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface TrainRepository extends JpaRepository<Train, Integer> {

}
