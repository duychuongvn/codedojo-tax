package vn.smartdev.exercice.codedojo.repository;

import org.fest.assertions.Assertions;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.exception.VehicleNotFoundException;

public class VehicleRepositoryTest {

	private VehicleRepository vehicleRepository = new VehicleRepository();

	@Test
	public void shouldReturnEngineSize1550WhenManufactureIsToyotaAndModelIsAvensis() {
		Assertions.assertThat(vehicleRepository.findEngineSizeByManufactureAndModel("toyota", "Avensis"))
				.isEqualTo(1550);
	}

	@Test
	public void shouldReturnCo2Emission150WhenManufactureIsToyotaAndModelIsAvensis() {
		Assertions.assertThat(vehicleRepository.findC02EmissionByManufactureAndModel("toyota", "Avensis"))
				.isEqualTo(150);
	}

	@Test(expected = VehicleNotFoundException.class)
	public void shouldThrowVehicleNotFoundExceptionWhenManufatureOrModelNotFound() {
		vehicleRepository.findEngineSizeByManufactureAndModel("toyota", "unknown");
	}
}
