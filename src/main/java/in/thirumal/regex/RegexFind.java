/**
 * 
 */
package in.thirumal.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author thirumal
 *
 */
public class RegexFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "3, Sai Nayan Society, Near Saptashrungi Devi Temple , Jagtap Mala, Nashikroad, Nashik , Nashik , Maharashtra - 422101";
		Pattern p = Pattern.compile("(\\d{6})");
		Matcher m = p.matcher(text);
		String pincode = null;
		System.out.println(m.groupCount());
		if (m.find()) {
			System.out.println(m.groupCount());
			String group = m.group();
			pincode = group;
		}
		System.out.println(pincode);
	}

}
