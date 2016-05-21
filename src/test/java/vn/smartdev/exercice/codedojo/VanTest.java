package vn.smartdev.exercice.codedojo;

import java.util.Calendar;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class VanTest {

	@Test
	public void shouldReturn165WhenWeighLessThan3500() {
		Van van = new Van("Toyota", "Hilux", Calendar.getInstance().getTime(), 3499);
		Assertions.assertThat(van.getTax()).isEqualTo(165);
	}

	@Test
	public void shouldReturn165WhenWeighIs3500() {
		Van van = new Van("Toyota", "Hilux", Calendar.getInstance().getTime(), 3500);
		Assertions.assertThat(van.getTax()).isEqualTo(165);
	}

	@Test
	public void shouldReturn190WhenWeighIsGreaterThan3501() {
		Van van = new Van("Toyota", "Hilux", Calendar.getInstance().getTime(), 3501);
		Assertions.assertThat(van.getTax()).isEqualTo(190);
	}
}
