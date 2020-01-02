/**
 * 
 */
package in.thirumal.util;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * @author thirumal
 *
 */
public class DateUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(convertDateToLocalDate(new Date()));
	}

	public static LocalDate convertDateToLocalDate(Date date) {
		if (date == null) {
			return null;
		}
		return LocalDate.from(date.toInstant().atZone(ZoneId.systemDefault()));
	}
}
