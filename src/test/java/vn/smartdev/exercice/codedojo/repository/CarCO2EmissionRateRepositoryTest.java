package vn.smartdev.exercice.codedojo.repository;

import org.fest.assertions.Assertions;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.exception.InvalidEngineSizeException;

public class CarCO2EmissionRateRepositoryTest {

	private CarCO2EmissionRateRepository carCO2EmissionRateRepository = new CarCO2EmissionRateRepository();

	@Test
	public void shouldReturnRate125WhenEngineSizeIs151() {
		Assertions.assertThat(carCO2EmissionRateRepository.findRateByCO2Emission(151)).isEqualTo(125.00f);
	}

	@Test
	public void shouldReturnRate125WhenEngineSizeIs165() {
		Assertions.assertThat(carCO2EmissionRateRepository.findRateByCO2Emission(165)).isEqualTo(125.00f);
	}

	@Test
	public void shouldReturnRate160WhenEngineSizeIsOver185() {
		Assertions.assertThat(carCO2EmissionRateRepository.findRateByCO2Emission(190)).isEqualTo(160.00f);
	}

	@Test(expected = InvalidEngineSizeException.class)
	public void shouldThrowInvalidEngineSizeExceptionWhenEngineSizeLessThan0() {
		carCO2EmissionRateRepository.findRateByCO2Emission(-1);
	}
}
