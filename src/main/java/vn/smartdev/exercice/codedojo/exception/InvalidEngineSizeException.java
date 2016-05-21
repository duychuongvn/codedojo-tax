package vn.smartdev.exercice.codedojo.exception;

public class InvalidEngineSizeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidEngineSizeException(float engineSize) {
		super("Engine size must be greater than 0. Input: " + engineSize);
	}
}
