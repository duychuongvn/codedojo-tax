package vn.smartdev.exercice.codedojo;

import java.util.Date;

import vn.smartdev.exercice.codedojo.repository.MotocycleEngineRateRepository;

public class Motorcycle extends Vehicle {

	private float engineSize;

	private MotocycleEngineRateRepository motocycleEngineRateRepository = new MotocycleEngineRateRepository();

	public Motorcycle(String manufacture, String model, Date dateOfRegistration, float engineSize) {
		super(manufacture, model, dateOfRegistration);
		this.engineSize = engineSize;
	}

	public float getEngineSize() {
		return engineSize;
	}

	@Override
	public float getTax() {
		return motocycleEngineRateRepository.findRateByEngineSize(engineSize);
	}

}
