package com.app.vehicleservice.model;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class VehicleDetails {
	    public String make;
	    public String model;
	    public String modelYear;
	    public String bodyStyle;
	    public String engine;
	    public String drivetype;
	    public String color;
	    @JsonProperty("MPG") 
	    public String mPG;
	    public VehicleFeature vehicleFeature;
	    public List<VehiclePrice> vehiclePrice;
    
	public VehicleDetails() {
	
	}

	public VehicleDetails(String make, String model, String modelYear, String bodyStyle, String engine,
			String drivetype, String color, String mPG, VehicleFeature vehicleFeature,
			List<VehiclePrice> vehiclePrice) {
		this.make = make;
		this.model = model;
		this.modelYear = modelYear;
		this.bodyStyle = bodyStyle;
		this.engine = engine;
		this.drivetype = drivetype;
		this.color = color;
		this.mPG = mPG;
		this.vehicleFeature = vehicleFeature;
		this.vehiclePrice = vehiclePrice;
	}

	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDrivetype() {
		return drivetype;
	}

	public void setDrivetype(String drivetype) {
		this.drivetype = drivetype;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getmPG() {
		return mPG;
	}

	public void setmPG(String mPG) {
		this.mPG = mPG;
	}

	public VehicleFeature getVehicleFeature() {
		return vehicleFeature;
	}

	public void setVehicleFeature(VehicleFeature vehicleFeature) {
		this.vehicleFeature = vehicleFeature;
	}

	public List<VehiclePrice> getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(List<VehiclePrice> vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	@Override
	public String toString() {
		return "VehicleDetails [make=" + make + ", model=" + model + ", modelYear=" + modelYear + ", bodyStyle="
				+ bodyStyle + ", engine=" + engine + ", drivetype=" + drivetype + ", color=" + color + ", mPG=" + mPG
				+ ", vehicleFeature=" + vehicleFeature + ", vehiclePrice=" + vehiclePrice + "]";
	}
	
	
    
    
}
