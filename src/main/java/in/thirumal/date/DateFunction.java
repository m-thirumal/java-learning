package in.thirumal.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateFunction {

	public static void main(String[] args) {
		Date date1 = new Date("01/26/2020");
		Date date2 = new Date();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date1.equals(date2));
		System.out.println(date1.before(date2));
	}

}
