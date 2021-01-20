package com.app.vehicleservice.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class VehiclePrice {
	
	@JsonProperty("MSRP") 
    public String mSRP;
    @JsonProperty("Savings") 
    public String savings;
    public String finalPrice;
    
	public VehiclePrice() {

	}

	public VehiclePrice(String mSRP, String savings, String finalPrice) {
		this.mSRP = mSRP;
		this.savings = savings;
		this.finalPrice = finalPrice;
	}

	public String getmSRP() {
		return mSRP;
	}

	public void setmSRP(String mSRP) {
		this.mSRP = mSRP;
	}

	public String getSavings() {
		return savings;
	}

	public void setSavings(String savings) {
		this.savings = savings;
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "VehiclePrice [mSRP=" + mSRP + ", savings=" + savings + ", finalPrice=" + finalPrice + "]";
	}
	
	
	
    
    

}
