package com.example.flightApp.flight;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Flight {

	@JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String flightId = UUID.randomUUID().toString();   
	private String airline;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightId=" + flightId + ", airline=" + airline + "]";
	}
}
