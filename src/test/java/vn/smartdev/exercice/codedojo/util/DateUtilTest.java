package vn.smartdev.exercice.codedojo.util;

import java.util.Calendar;
import java.util.Date;

import org.fest.assertions.Assertions;
import org.junit.Test;

public class DateUtilTest {

	@Test
	public void shouldConvertStringToDate() {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = DateUtil.parseYYYYMMDD("2001-03-01");
		calendar.setTime(date);

		Assertions.assertThat(calendar.get(Calendar.YEAR)).isEqualTo(2001);
		Assertions.assertThat(calendar.get(Calendar.MONTH)).isEqualTo(3-1);
		Assertions.assertThat(calendar.get(Calendar.DATE)).isEqualTo(1);
		
	}

}
