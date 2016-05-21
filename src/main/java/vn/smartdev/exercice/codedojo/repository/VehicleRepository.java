package vn.smartdev.exercice.codedojo.repository;

import java.util.ArrayList;
import java.util.List;

import vn.smartdev.exercice.codedojo.exception.VehicleNotFoundException;

public class VehicleRepository {

	private List<VehicleModel> vehicleModels = new ArrayList<VehicleRepository.VehicleModel>();

	static enum VehicleType {
		CAR, MOTORCYCLE, VAN
	}

	public VehicleRepository() {
		vehicleModels.add(new VehicleModel("Toyota", "Avensis", 1550, 150, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Toyota", "Camry", 1800, 180, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Toyota", "Pirus", 1800, 100, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Toyota", "Avalon", 1550, 80, VehicleType.CAR, 1000));

		vehicleModels.add(new VehicleModel("Toyota", "Hilux", 1550, 80, VehicleType.VAN, 3500));
		
		vehicleModels.add(new VehicleModel("Toyota", "Corolla", 1800, 180, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Honda", "Civic", 1400, 140, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Honda", "CRV", 1800, 180, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("Honda", "Airblade", 150, 0, VehicleType.MOTORCYCLE, 1000));
		vehicleModels.add(new VehicleModel("BMW", "320i", 1800, 160, VehicleType.CAR, 1000));
		vehicleModels.add(new VehicleModel("BMW", "BMWi3", 1800, 150, VehicleType.CAR, 1000));
	}

	public float findEngineSizeByManufactureAndModel(String manufacture, String model) {
		for (VehicleModel vehicle : vehicleModels) {
			if (vehicle.manufacture.equalsIgnoreCase(manufacture) && vehicle.model.equalsIgnoreCase(model)) {
				return vehicle.engineSize;
			}
		}
		throw new VehicleNotFoundException(manufacture, model);
	}

	public float findC02EmissionByManufactureAndModel(String manufacture, String model) {
		for (VehicleModel vehicle : vehicleModels) {
			if (vehicle.manufacture.equalsIgnoreCase(manufacture) && vehicle.model.equalsIgnoreCase(model)) {
				return vehicle.co2Emission;
			}
		}
		throw new VehicleNotFoundException(manufacture, model);
	}

	public VehicleModel findByByManufactureAndModel(String manufacture, String model) {
		for (VehicleModel vehicle : vehicleModels) {
			if (vehicle.manufacture.equalsIgnoreCase(manufacture) && vehicle.model.equalsIgnoreCase(model)) {
				return vehicle;
			}
		}
		throw new VehicleNotFoundException(manufacture, model);
	}

	static class VehicleModel {
		private String model;
		private String manufacture;
		private float engineSize;
		private float co2Emission = -1;
		private VehicleType type;
		private float weigh;
		private VehicleModel(String manufacture, String model, float engineSize, float co2Emission, VehicleType type, float weigh) {
			this.model = model;
			this.manufacture = manufacture;
			this.engineSize = engineSize;
			this.co2Emission = co2Emission;
			this.type = type;
			this.weigh = weigh;
		}

		public String getModel() {
			return model;
		}

		public String getManufacture() {
			return manufacture;
		}

		public float getEngineSize() {
			return engineSize;
		}

		public float getCo2Emission() {
			return co2Emission;
		}

		public VehicleType getType() {
			return type;
		}

		public float getWeigh() {
			return weigh;
		}

		
	}
}
