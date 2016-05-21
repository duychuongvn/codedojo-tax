package vn.smartdev.exercice.codedojo;

import java.util.Date;

public abstract class Vehicle {
	private String manufactureName;
	private String model;
	private Date dateOfRegistration;

	public Vehicle(String manufacture, String model, Date dateOfRegistration) {
		this.manufactureName = manufacture;
		this.model = model;
		this.dateOfRegistration = dateOfRegistration;
	}

	public abstract float getTax();

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

}
