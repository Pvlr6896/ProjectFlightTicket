package com.example.flightApp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.flightApp.flight.Flight;
import com.example.flightApp.repository.FlightRepo;



@Service
public class FlightService {
	
	private FlightRepo flightrepo;
	
	@Autowired
    public FlightService(FlightRepo flightrepo){
        this.flightrepo = flightrepo;
    }
	
	public List<Flight> getFlights(){
	        //return repo.findAll();

	        List<Flight> flightList = new ArrayList<>();
	        flightrepo.findAll().forEach(flight -> flightList.add(flight));
	        return flightList;
	}
	
	@Transactional
    public boolean deleteFlight(String flightId){
//        List<User> users = getUsers();
//        boolean isDeleted = false;
//        Optional<User> userOptional = users.stream().filter(u-> u.getUserId().equals(userId)).findFirst();
//        if(userOptional.isPresent()){
//            // delete the user in case existing
//            repo.delete(userOptional.get());
//            isDeleted = true;
//        }
//        return isDeleted;
        flightrepo.deleteByFlightId(flightId);
        return true;
    }
	
	public Flight addFlight(Flight flight){
        return flightrepo.save(flight);
    }
}
