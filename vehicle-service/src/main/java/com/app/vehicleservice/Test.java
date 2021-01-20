package com.app.vehicleservice;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1

import java.util.List;

import com.app.vehicleservice.model.Root;
import com.app.vehicleservice.model.Vehicle;
import com.app.vehicleservice.model.Vehicles;
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
import com.fasterxml.jackson.core.JsonProcessingException;
public class Test {

	public static void main(String[] args) {
	
	    String myJsonString="{\r\n" + 
	    		"  \"vehicles\": {\r\n" + 
	    		"    \"vehicle\": [\r\n" + 
	    		"      {\r\n" + 
	    		"        \"vehicleId\": \"101\",\r\n" + 
	    		"        \"vehicleDetails\": {\r\n" + 
	    		"          \"make\": \"Ford\",\r\n" + 
	    		"          \"model\": \"ecoSport\",\r\n" + 
	    		"          \"modelYear\": \"2020\",\r\n" + 
	    		"          \"bodyStyle\": \"4D Sport Utility\",\r\n" + 
	    		"          \"engine\": \"1.0L EcoBoost\",\r\n" + 
	    		"          \"drivetype\": \"FWD\",\r\n" + 
	    		"          \"color\": \"shadow black\",\r\n" + 
	    		"          \"MPG\": \"27\",\r\n" + 
	    		"          \"vehicleFeature\": {\r\n" + 
	    		"            \"Exterior\": [\r\n" + 
	    		"              \"Acoustic-Laminate Windshld\",\r\n" + 
	    		"              \"Active Grille Shutters\",\r\n" + 
	    		"              \"Windshield Wiper De-Icer\",\r\n" + 
	    		"              \"Privacy Glass - Rear Doors\"\r\n" + 
	    		"            ],\r\n" + 
	    		"            \"Interior\": [\r\n" + 
	    		"              \"Illuminated Entry System\",\r\n" + 
	    		"              \"Powerpoints - 12V\",\r\n" + 
	    		"              \"Power Driver Seat - 6-Way\",\r\n" + 
	    		"              \"Unique Clth/Htd Frt Seats\"\r\n" + 
	    		"            ]\r\n" + 
	    		"          },\r\n" + 
	    		"          \"vehiclePrice\": [\r\n" + 
	    		"            {\r\n" + 
	    		"              \"MSRP\": \"$25,000.00\",\r\n" + 
	    		"              \"Savings\": \"$5000\",\r\n" + 
	    		"              \"finalPrice\": \"$20,000.00\"\r\n" + 
	    		"            }\r\n" + 
	    		"          ]\r\n" + 
	    		"        }\r\n" + 
	    		"      },\r\n" + 
	    		"      {\r\n" + 
	    		"        \"vehicleId\": \"102\",\r\n" + 
	    		"        \"vehicleDetails\": {\r\n" + 
	    		"          \"make\": \"Ford\",\r\n" + 
	    		"          \"model\": \"Edge\",\r\n" + 
	    		"          \"modelYear\": \"2019\",\r\n" + 
	    		"          \"bodyStyle\": \"4D Sport Utility\",\r\n" + 
	    		"          \"engine\": \"Twin-Scroll 2.0L EcoBoost\",\r\n" + 
	    		"          \"drivetype\": \"AWD\",\r\n" + 
	    		"          \"color\": \"Agate Black\",\r\n" + 
	    		"          \"MPG\": \"28\",\r\n" + 
	    		"          \"vehicleFeature\": {\r\n" + 
	    		"            \"Exterior\": [\r\n" + 
	    		"              \"Beltline Molding - Black\",\r\n" + 
	    		"              \"Door Handles - Body Color\",\r\n" + 
	    		"              \"Grille - Chrome\",\r\n" + 
	    		"              \"Taillamps-Led\"\r\n" + 
	    		"            ],\r\n" + 
	    		"            \"Interior\": [\r\n" + 
	    		"              \"60/40 Split Fold Rear Seat\",\r\n" + 
	    		"              \"Cruise Control\",\r\n" + 
	    		"              \"Dual Illum Vis Vanity Mirr\",\r\n" + 
	    		"              \"Rotary Gear Shift Dial\"\r\n" + 
	    		"            ]\r\n" + 
	    		"          },\r\n" + 
	    		"          \"vehiclePrice\": [\r\n" + 
	    		"            {\r\n" + 
	    		"              \"MSRP\": \"$30,000.00\",\r\n" + 
	    		"              \"Savings\": \"$2000\",\r\n" + 
	    		"              \"finalPrice\": \"$28,000.00\"\r\n" + 
	    		"            }\r\n" + 
	    		"          ]\r\n" + 
	    		"        }\r\n" + 
	    		"      },\r\n" + 
	    		"      {\r\n" + 
	    		"        \"vehicleId\": \"103\",\r\n" + 
	    		"        \"vehicleDetails\": {\r\n" + 
	    		"          \"make\": \"Ford\",\r\n" + 
	    		"          \"model\": \"F-150\",\r\n" + 
	    		"          \"modelYear\": \"2020\",\r\n" + 
	    		"          \"bodyStyle\": \"4D SuperCrew\",\r\n" + 
	    		"          \"engine\": \"V6 PFDI\",\r\n" + 
	    		"          \"drivetype\": \"4WD\",\r\n" + 
	    		"          \"color\": \"Blue Jeans Metallic\",\r\n" + 
	    		"          \"MPG\": \"23\",\r\n" + 
	    		"          \"vehicleFeature\": {\r\n" + 
	    		"            \"Exterior\": [\r\n" + 
	    		"              \"Headlamps - Autolamp\",\r\n" + 
	    		"              \"Locking Removable Tailgate\",\r\n" + 
	    		"              \"Manual Fold Power Mirrors\",\r\n" + 
	    		"              \"Headlamps - Auto High Beam\"\r\n" + 
	    		"            ],\r\n" + 
	    		"            \"Interior\": [\r\n" + 
	    		"              \"1Touch Up/Down Dr/Pass Win\",\r\n" + 
	    		"              \"60/40 Fold-Up Rear Bench Seat\",\r\n" + 
	    		"              \"Cruise Control\",\r\n" + 
	    		"              \"Illuminated Entry\"\r\n" + 
	    		"            ]\r\n" + 
	    		"          },\r\n" + 
	    		"          \"vehiclePrice\": [\r\n" + 
	    		"            {\r\n" + 
	    		"              \"MSRP\": \"$40,925.00\",\r\n" + 
	    		"              \"Savings\": \"$4678.00\",\r\n" + 
	    		"              \"finalPrice\": \"$36,247.00\"\r\n" + 
	    		"            }\r\n" + 
	    		"          ]\r\n" + 
	    		"        }\r\n" + 
	    		"      },\r\n" + 
	    		"      {\r\n" + 
	    		"        \"vehicleId\": \"104\",\r\n" + 
	    		"        \"vehicleDetails\": {\r\n" + 
	    		"          \"make\": \"Ford\",\r\n" + 
	    		"          \"model\": \"mustang\",\r\n" + 
	    		"          \"modelYear\": \"2017\",\r\n" + 
	    		"          \"bodyStyle\": \"4D Sport Utility\",\r\n" + 
	    		"          \"engine\": \"V8\",\r\n" + 
	    		"          \"drivetype\": \"RWD\",\r\n" + 
	    		"          \"color\": \"Blue Metallic\",\r\n" + 
	    		"          \"MPG\": \"32\",\r\n" + 
	    		"          \"vehicleFeature\": {\r\n" + 
	    		"            \"Exterior\": [\r\n" + 
	    		"              \"Dual Exhaust System\",\r\n" + 
	    		"              \"Easy Fuel Capless Filler\",\r\n" + 
	    		"              \"Headlamps - Autolamp\",\r\n" + 
	    		"              \"Headlamps- Led With Signature Lighting\"\r\n" + 
	    		"            ],\r\n" + 
	    		"            \"Interior\": [\r\n" + 
	    		"              \"Autodim Rearview Mirror\",\r\n" + 
	    		"              \"Center Console W/Armrest\",\r\n" + 
	    		"              \"Floor Mats - Front\",\r\n" + 
	    		"              \"Smart Charging Usb Port(2)\"\r\n" + 
	    		"            ]\r\n" + 
	    		"          },\r\n" + 
	    		"          \"vehiclePrice\": [\r\n" + 
	    		"            {\r\n" + 
	    		"              \"MSRP\": \"$33,645.70\",\r\n" + 
	    		"              \"Savings\": \"$4,988.20\",\r\n" + 
	    		"              \"finalPrice\": \"$28657.50\"\r\n" + 
	    		"            }\r\n" + 
	    		"          ]\r\n" + 
	    		"        }\r\n" + 
	    		"      },\r\n" + 
	    		"      {\r\n" + 
	    		"        \"vehicleId\": \"105\",\r\n" + 
	    		"        \"vehicleDetails\": {\r\n" + 
	    		"          \"make\": \"Ford\",\r\n" + 
	    		"          \"model\": \"Ranger\",\r\n" + 
	    		"          \"modelYear\": \"2016\",\r\n" + 
	    		"          \"bodyStyle\": \"Super Cab\",\r\n" + 
	    		"          \"engine\": \"2.3L EcoBoost\",\r\n" + 
	    		"          \"drivetype\": \"4WD\",\r\n" + 
	    		"          \"color\": \"Oxford White\",\r\n" + 
	    		"          \"MPG\": \"24\",\r\n" + 
	    		"          \"vehicleFeature\": {\r\n" + 
	    		"            \"Exterior\": [\r\n" + 
	    		"              \"Daytime Running Lights\",\r\n" + 
	    		"              \"Easy Fuel Capless Filler\",\r\n" + 
	    		"              \"Fuel Tank - 18.0 Gallon\",\r\n" + 
	    		"              \"Tow Hooks\"\r\n" + 
	    		"            ],\r\n" + 
	    		"            \"Interior\": [\r\n" + 
	    		"              \"110V Outlet\",\r\n" + 
	    		"              \"Dual Sliding Sunvisors\",\r\n" + 
	    		"              \"Dual Zone Auto Climate Ctl\",\r\n" + 
	    		"              \"Overhead Console\"\r\n" + 
	    		"            ]\r\n" + 
	    		"          },\r\n" + 
	    		"          \"vehiclePrice\": [\r\n" + 
	    		"            {\r\n" + 
	    		"              \"MSRP\": \"$35,515.00\",\r\n" + 
	    		"              \"Savings\": \"$5000\",\r\n" + 
	    		"              \"finalPrice\": \"$30,515.00\"\r\n" + 
	    		"            }\r\n" + 
	    		"          ]\r\n" + 
	    		"        }\r\n" + 
	    		"      }\r\n" + 
	    		"    ]\r\n" + 
	    		"  }\r\n" + 
	    		"}	\r\n" + 
	    		"";
	    ObjectMapper om = new ObjectMapper();
		try {
			Root root = om.readValue(myJsonString, Root.class);
			System.out.println(root.getVehicles());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
