package com.example.flightApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.flightApp.flight.Flight;



public interface FlightRepo  extends CrudRepository<Flight,Integer> {
    void deleteByFlightId(String flightId);
}
