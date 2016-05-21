package vn.smartdev.exercice.codedojo.repository;

import java.util.ArrayList;
import java.util.List;

import vn.smartdev.exercice.codedojo.exception.InvalidEngineSizeException;

public class CarCO2EmissionRateRepository {
	private List<RateEngine> rateEngines = new ArrayList<RateEngine>();

	public CarCO2EmissionRateRepository() {
		rateEngines.add(new RateEngine(0, 100, 65.00f));
		rateEngines.add(new RateEngine(101, 120, 75.00f));
		rateEngines.add(new RateEngine(121, 150, 105.00f));
		rateEngines.add(new RateEngine(151, 165, 125.00f));
		rateEngines.add(new RateEngine(165, 185, 145.00f));
		rateEngines.add(new RateEngine(186, Float.MAX_VALUE, 160.00f));
	}

	public float findRateByCO2Emission(float co2Emission) {
		for (RateEngine rateEngine : rateEngines) {
			if (rateEngine.getSizeFrom() <= co2Emission && rateEngine.getSizeTo() >= co2Emission) {
				return rateEngine.getRate();
			}
		}
		throw new InvalidEngineSizeException(co2Emission);
	}
}
