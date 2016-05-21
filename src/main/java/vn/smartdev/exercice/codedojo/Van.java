package vn.smartdev.exercice.codedojo;

import java.util.Date;

public class Van extends Vehicle {
	private float weigh;

	public Van(String manufacture, String model, Date dateOfRegistration, float weigh) {
		super(manufacture, model, dateOfRegistration);
		this.weigh = weigh;
	}

	public float getWeigh() {
		return weigh;
	}

	@Override
	public float getTax() {
		if (weigh <= 3500) {
			return 165;
		}
		return 190;
	}

}
