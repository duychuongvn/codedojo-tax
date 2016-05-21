package vn.smartdev.exercice.codedojo.exception;

public class VehicleNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public VehicleNotFoundException(String manufacture, String model) {
		super("Cannot find vehicle Manufacture = " + manufacture + " - Model = " + model);
	}

}
