package vn.smartdev.exercice.codedojo.repository;

import org.fest.assertions.Assertions;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.exception.InvalidEngineSizeException;

public class MotocycleEngineRateRepositoryTest {
	private MotocycleEngineRateRepository motocycleEngineRateRepository = new MotocycleEngineRateRepository();

	@Test
	public void shouldReturnRate15WhenEngineSizeIs149() {
		Assertions.assertThat(motocycleEngineRateRepository.findRateByEngineSize(149)).isEqualTo(15.00f);
	}

	@Test
	public void shouldReturnRate30WhenEngineSizeIs151() {
		Assertions.assertThat(motocycleEngineRateRepository.findRateByEngineSize(151)).isEqualTo(30.00f);
	}

	@Test
	public void shouldReturnRate30WhenEngineSizeIsOver400() {
		Assertions.assertThat(motocycleEngineRateRepository.findRateByEngineSize(400)).isEqualTo(30.00f);
	}

	@Test
	public void shouldReturnRate60WhenEngineSizeIsOver601() {
		Assertions.assertThat(motocycleEngineRateRepository.findRateByEngineSize(601)).isEqualTo(60.00f);
	}

	@Test(expected = InvalidEngineSizeException.class)
	public void shouldThrowInvalidEngineSizeExceptionWhenEngineSizeLessThan0() {
		motocycleEngineRateRepository.findRateByEngineSize(-1);
	}
}
