package vn.smartdev.exercice.codedojo;

import java.util.Date;

import vn.smartdev.exercice.codedojo.repository.CarCO2EmissionRateRepository;
import vn.smartdev.exercice.codedojo.util.DateUtil;

public class Car extends Vehicle {
	private static final Date firstMarch2001;
	private float engineSize;
	private float co2Emission = -1;
	private CarCO2EmissionRateRepository carCO2EmissionRateRepository = new CarCO2EmissionRateRepository();

	static {
		firstMarch2001 = DateUtil.parseYYYYMMDD("2001-03-01");
	}

	public Car(String manufacture, String model, Date dateOfRegistration, float engineSize) {
		super(manufacture, model, dateOfRegistration);
		this.engineSize = engineSize;

	}

	public float getEngineSize() {
		return engineSize;
	}

	@Override
	public float getTax() {
		if (getDateOfRegistration().before(firstMarch2001)) {
			if (engineSize <= 1550) {
				return 110;
			}
			return 165;
		} else {
			return carCO2EmissionRateRepository.findRateByCO2Emission(co2Emission);
		}
	}

	public float getCo2Emission() {
		return co2Emission;
	}

	public void setCo2Emission(float co2Emission) {
		this.co2Emission = co2Emission;
	}

}
