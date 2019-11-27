package com.example.Springjpahibernate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehiclerepository;

	//Retrieving all the vehicles details
	public List<Vehicle> getVehicles() {
		
		return (List<Vehicle>) vehiclerepository.findAll(); 
		
	}

	//Updating the vehicles details
	public void updateVehicle(Vehicle vehicle, int location_id) {
		vehiclerepository.save(vehicle);
		
	}

	//Adding the vehicles into database
	public void addVehicle(Vehicle vehicle) {
		vehiclerepository.save(vehicle);	
	}

	//Deleting the vehicle from the database
	public void deleteVehicle(int vehicle_id) {
		vehiclerepository.deleteById(vehicle_id);
		
	}
	
	
}
