package vn.smartdev.exercice.codedojo.repository;

import java.util.Date;

import vn.smartdev.exercice.codedojo.Car;
import vn.smartdev.exercice.codedojo.Motorcycle;
import vn.smartdev.exercice.codedojo.Van;
import vn.smartdev.exercice.codedojo.Vehicle;
import vn.smartdev.exercice.codedojo.repository.VehicleRepository.VehicleModel;
import vn.smartdev.exercice.codedojo.repository.VehicleRepository.VehicleType;

public class VehicleFactory {

	private static VehicleRepository vehicleRepository = new VehicleRepository();

	public static Vehicle buildVehicle(String manufacture, String model, Date dateOfRegistration) {
		Vehicle vehicle;
		VehicleModel vehicleModel = vehicleRepository.findByByManufactureAndModel(manufacture, model);
		if(vehicleModel.getType() == VehicleType.CAR) {
			Car car = new Car(manufacture, model, dateOfRegistration, vehicleModel.getEngineSize());
			car.setCo2Emission(vehicleModel.getCo2Emission());
			vehicle = car;
		} else if(vehicleModel.getType() == VehicleType.VAN) {
			vehicle = new Van(manufacture, model, dateOfRegistration, vehicleModel.getWeigh());
		} else {
			vehicle = new Motorcycle(manufacture, model, dateOfRegistration, vehicleModel.getEngineSize());
		}
		return vehicle;
	}
}
