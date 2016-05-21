package vn.smartdev.exercice.codedojo.repository;

import java.util.ArrayList;
import java.util.List;

import vn.smartdev.exercice.codedojo.exception.InvalidEngineSizeException;

public class MotocycleEngineRateRepository {
	private List<RateEngine> rateEngines = new ArrayList<RateEngine>();

	public MotocycleEngineRateRepository() {
		rateEngines.add(new RateEngine(0, 150, 15.00f));
		rateEngines.add(new RateEngine(151, 400, 30.00f));
		rateEngines.add(new RateEngine(401, 600, 45.00f));
		rateEngines.add(new RateEngine(601, Float.MAX_VALUE, 60.00f));
	}

	public float findRateByEngineSize(float engineSize) {
		for (RateEngine rateEngine : rateEngines) {
			if (rateEngine.getSizeFrom() <= engineSize && rateEngine.getSizeTo() >= engineSize) {
				return rateEngine.getRate();
			}
		}
		throw new InvalidEngineSizeException(engineSize);
	}
}
