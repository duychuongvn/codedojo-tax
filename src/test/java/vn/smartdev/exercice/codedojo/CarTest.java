package vn.smartdev.exercice.codedojo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.util.DateUtil;

public class CarTest {

	private Date beforeFirstMarch2001;

	private Date firstMarch2001;
	private Date secondMarch2001;

	@Before
	public void init() throws ParseException {
		// Thu Feb 01 2001
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		beforeFirstMarch2001 = dateFormat.parse("2001-02-28");
		firstMarch2001 = DateUtil.parseYYYYMMDD("2001-03-01");
		secondMarch2001 = DateUtil.parseYYYYMMDD("2001-03-02");
	}

	@Test
	public void shouldReturn110WhenRegistrationBeforeFirstMarch2001AndEngineSizeIs1550() {

		Car car = new Car("Toyota", "Avenis", beforeFirstMarch2001, 1550);
		Assertions.assertThat(car.getTax()).isEqualTo(110);
	}

	@Test
	public void shouldReturn110WhenRegistrationBeforeFirstMarch2001AndEngineSizeIs1549() {

		Car car = new Car("Toyota", "Avenis", beforeFirstMarch2001, 1549);
		Assertions.assertThat(car.getTax()).isEqualTo(110);
	}

	@Test
	public void shouldReturn165WhenRegistrationBeforeFirstMarch2001AndEngineSizeIs1551() {

		Car car = new Car("Toyota", "Avenis", beforeFirstMarch2001, 1551);
		Assertions.assertThat(car.getTax()).isEqualTo(165);
	}

	@Test
	public void shouldReturn75WhenRegistrationIsFirstMatch2001AndCo2EmissionIs101() {

		Car car = new Car("Toyota", "Avenis", firstMarch2001, 1551);
		car.setCo2Emission(101);
		Assertions.assertThat(car.getTax()).isEqualTo(75);
	}

	@Test
	public void shouldReturn75WhenRegistrationAfterFirstMatch2001AndCo2EmissionIs101() {
		Car car = new Car("Toyota", "Avenis", secondMarch2001, 1551);
		car.setCo2Emission(101);
		Assertions.assertThat(car.getTax()).isEqualTo(75);
	}
}
