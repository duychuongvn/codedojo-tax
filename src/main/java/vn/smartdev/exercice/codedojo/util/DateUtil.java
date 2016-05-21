package vn.smartdev.exercice.codedojo.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date parseYYYYMMDD(String date) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Unvalid date format yyyy-MM-dd. Input: " + date);
		}
	}

}
