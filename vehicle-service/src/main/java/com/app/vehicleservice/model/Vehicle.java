package com.app.vehicleservice.model;

import javax.persistence.Entity;

@Entity
public class Vehicle {
	public String vehicleId;
    public VehicleDetails vehicleDetails;
    
	public Vehicle() {
		
	}

	public Vehicle(String vehicleId, VehicleDetails vehicleDetails) {
		this.vehicleId = vehicleId;
		this.vehicleDetails = vehicleDetails;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleDetails=" + vehicleDetails + "]";
	}
	
	
	
    
    

}
