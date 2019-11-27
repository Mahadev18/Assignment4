package com.example.Springjpahibernate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleservice;
	
	//Retrieve All
	@RequestMapping("/location/all")
	public List<Vehicle> getAllVehicle()
	{
		return vehicleservice.getVehicles();
	}
	
	//update vehicles details
	@RequestMapping(method = RequestMethod.PUT,value = "/location/{location_id}")
	public void updateVehicle(@RequestBody Vehicle vehicle,@PathVariable int location_id)
	{
		vehicleservice.updateVehicle(vehicle,location_id);
	}
		
	
	//Adding the vehicle into database
	@RequestMapping(method = RequestMethod.POST,value = "/location")
	public void addVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleservice.addVehicle(vehicle);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/location/{vehicle_id}")
	public void deleteVehicle(@PathVariable int vehicle_id)
	{
		vehicleservice.deleteVehicle(vehicle_id);
	}
	
	
}
