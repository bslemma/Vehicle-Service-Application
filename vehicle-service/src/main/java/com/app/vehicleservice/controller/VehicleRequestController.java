package com.app.vehicleservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.app.vehicleservice.model.Root;
import com.app.vehicleservice.service.VehicleRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class VehicleRequestController {

	@Autowired
	private VehicleRequestService vehicleRequestService;

	/*Q1) Submit example1 (last page) into in-memory database or modern NoSQL engine 
		o	POST /vehicleInfomation/submitVehicle
		o	Example Request Body: See example 1 (last page)
	*/
	
    @PostMapping("/vehicleInfomation/submitVehicle")
    public ResponseEntity<Object> submitVehicle(@RequestBody Root root) {
		return new ResponseEntity<Object>( vehicleRequestService.submitVehicle(root),HttpStatus.OK);
    }

    
    
    /*Q2) Retrieve all entries from table example1 (last page) from in-memory database or modern NoSQL engine 
		o	GET /getVehicleInfomation
		o	Example Response: See example 1 (Last page)
    */
    
    @GetMapping("/getVehicleInfomation")
    public ResponseEntity<?> getVehicleInfomation() {
        return ResponseEntity.ok(vehicleRequestService.getVehicleInfomation());
    }
    
    

    /*Q3) Retrieve vehicle(s) of matching modelName
    		o	GET/getVehicleModelName/{modelName}
    		o	Example Request:
    				GET/getVehicleModelName/Edge
     */
    @GetMapping("/getVehicleModelName/{modelName}")
    public ResponseEntity<?> getVehicleModelName(@PathVariable("modelName") String modelName) {
        return ResponseEntity.ok(vehicleRequestService.getVehicleModelName(modelName));
    }
    
    
    /*Q4) Retrieve All vehicle(s) between from and to of finalPrice range:
    	o	GET/getVehiclePrice/{From}/{TO}
    	o	Example Request:
    		GET/ getVehiclePrice /25,000.00/35,000.00
     */
    @GetMapping("/getVehiclePrice/{From}/{TO}")
    public ResponseEntity<?> getVehiclePrice(@PathVariable("From") String from,@PathVariable("TO") String to) {
        return ResponseEntity.ok(vehicleRequestService.getVehiclePrice(from,to));
    }
    
    
    /* Q5)  Retrieve All vehicle(s) contains matching interior OR exterior feature value(if not found show error message)	
			o	GET/getVehicleByFeatures/{exterior}/{interior}
			o	length of string accepted for {exterior}/{interior} parameter must be 3 or more.
     */
    @GetMapping("/getVehicleByFeatures/{exterior}/{interior}")
    public ResponseEntity<?> getVehicleByFeatures(@PathVariable("exterior") String exterior,@PathVariable("interior") String interior) {
        return ResponseEntity.ok(vehicleRequestService.getVehicleByFeatures(exterior,interior));
    }


}