package com.app.vehicleservice.model;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class VehicleFeature{
	
	@JsonProperty("Exterior") 
    public List<String> exterior;
    @JsonProperty("Interior") 
    public List<String> interior;
    
	public VehicleFeature() {

	}

	public VehicleFeature(List<String> exterior, List<String> interior) {
		this.exterior = exterior;
		this.interior = interior;
	}

	public List<String> getExterior() {
		return exterior;
	}

	public void setExterior(List<String> exterior) {
		this.exterior = exterior;
	}

	public List<String> getInterior() {
		return interior;
	}

	public void setInterior(List<String> interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "VehicleFeature [exterior=" + exterior + ", interior=" + interior + "]";
	}
    
	
	
    
    
}