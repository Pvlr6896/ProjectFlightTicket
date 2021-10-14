package com.example.flightApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.flightApp.flight.Flight;
import com.example.flightApp.service.FlightService;


@RestController
@RequestMapping("/flights")
public class FlightController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	private FlightService flightservice;
    
    @Autowired
    public FlightController(FlightService flightservice){
        this.flightservice = flightservice;
    }

    @GetMapping
    public List<Flight> getFlights(){
        return flightservice.getFlights();
    }

    @DeleteMapping("{flightId}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable String flightId){
        return ResponseEntity.ok(flightservice.deleteFlight(flightId));
    }

    @PostMapping
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
        return ResponseEntity.ok(flightservice.addFlight(flight));
    }
}
