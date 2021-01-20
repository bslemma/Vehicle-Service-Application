package com.app.vehicleservice.model;

import java.util.List;

import javax.persistence.Entity;


@Entity
public class Vehicles {
	public List<Vehicle> vehicle;

	public Vehicles() {
		
	}

	public Vehicles(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicle=" + vehicle + "]";
	}
	
	
	
	
	

}
