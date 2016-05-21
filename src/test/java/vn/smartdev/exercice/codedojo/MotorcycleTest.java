package vn.smartdev.exercice.codedojo;

import org.fest.assertions.Assertions;
import org.junit.Test;

import vn.smartdev.exercice.codedojo.util.DateUtil;

public class MotorcycleTest {
	
	@Test
	public void shouldReturn45WhenEngineSizeIs600() {
	
		Motorcycle motorcycle = new Motorcycle("Honda", "Airblade", DateUtil.parseYYYYMMDD("2002-01-01"), 600);
		Assertions.assertThat(motorcycle.getTax()).isEqualTo(45);
	}


}
