package com.app.vehicleservice.model;

import javax.persistence.Entity;

@Entity
public class Root {
	
	public Vehicles vehicles;

	public Root() {

	}

	public Root(Vehicles vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicles getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Root [vehicles=" + vehicles + "]";
	}
	
	
	
	

}
