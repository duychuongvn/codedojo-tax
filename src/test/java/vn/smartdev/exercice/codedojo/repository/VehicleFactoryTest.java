package vn.smartdev.exercice.codedojo.repository;

import java.util.Calendar;

import org.fest.assertions.Assertions;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.Car;
import vn.smartdev.exercice.codedojo.Motorcycle;
import vn.smartdev.exercice.codedojo.Van;
import vn.smartdev.exercice.codedojo.Vehicle;

public class VehicleFactoryTest {

	@Test
	public void shouldReturnVanWhenManufactuerIsToyotaAndModelHilux() {
		Vehicle vehicle = VehicleFactory.buildVehicle("toyota", "hilux", Calendar.getInstance().getTime());
		Assertions.assertThat(vehicle).isInstanceOf(Van.class);
	}

	@Test
	public void shouldReturnCarWhenManufactuerIsToyotaAndModelIsCamry() {
		Vehicle vehicle = VehicleFactory.buildVehicle("toyota", "camry", Calendar.getInstance().getTime());
		Assertions.assertThat(vehicle).isInstanceOf(Car.class);
	}

	@Test
	public void shouldReturnCarWhenManufactuerIsHondaAndModelIsAirblade() {
		Vehicle vehicle = VehicleFactory.buildVehicle("honda", "airblade", Calendar.getInstance().getTime());
		Assertions.assertThat(vehicle).isInstanceOf(Motorcycle.class);
	}
}
