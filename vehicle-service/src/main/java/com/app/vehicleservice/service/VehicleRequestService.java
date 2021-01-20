package com.app.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vehicleservice.model.Root;
import com.app.vehicleservice.model.Vehicle;
import com.app.vehicleservice.repository.VehicleRequestRepository;

@Service
public class VehicleRequestService {
	
	@Autowired
	private VehicleRequestRepository vehicleRequestRepository;


    public Object getVehicleInfomation() {
        return vehicleRequestRepository.findAll();
    }


    public Object submitVehicle(Root root) {
        return vehicleRequestRepository.save(root);
    }

    public Object getVehicleModelName(String modelName) {
        List<Root> root = vehicleRequestRepository.findAll();
        for(Root r:root) {
        	List<Vehicle> vehicle=r.getVehicles().getVehicle();
        	for(Vehicle v:vehicle) {
        		if(v.getVehicleDetails().getModel().equalsIgnoreCase(modelName)) {
        			return r;
        		}
        	}
        }
        throw new RuntimeException("Error message: VehicleModelName not found.");
    }


	public Object getVehiclePrice(String from, String to) {
		List<Root> root = vehicleRequestRepository.findAll();
        for(Root r:root) {
        	List<Vehicle> vehicle=r.getVehicles().getVehicle();
        	for(Vehicle v:vehicle) {
        		String finalPrice =v.getVehicleDetails().getVehiclePrice().get(0).getFinalPrice();
        		if(Double.parseDouble(finalPrice)>=Double.parseDouble(from) && Double.parseDouble(finalPrice)<=Double.parseDouble(to)) {
        			return r;
        		}
        	}
        }
        throw new RuntimeException("Error message: VehiclePrice not found.");
	}


	public Object getVehicleByFeatures(String exterior, String interior) {
		 List<Root> root = vehicleRequestRepository.findAll();
	        for(Root r:root) {
	        	List<Vehicle> vehicle=r.getVehicles().getVehicle();
	        	for(Vehicle v:vehicle) {
	        		List<String> exteriors =v.getVehicleDetails().getVehicleFeature().getExterior();
	        		List<String> interiors=v.getVehicleDetails().getVehicleFeature().getInterior();
	        		if(exteriors.contains(exterior)&& interiors.contains(interior) ) {
	        			return r;
	        		}
	        	}
	        }
	        throw new RuntimeException("Error message: VehicleByFeatures not found.");
	}


}
