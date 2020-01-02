/**
 * 
 */
package in.thirumal.util;

/**
 * @author thirumal
 *
 */
public class ReplaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "The The Pencil";
		System.out.println(replaceExample(text, "e", "a"));
		System.out.println(replaceAllExample(text, "e", "a"));
	}
	
	//Replace char
	public static String replaceExample(String text, String oldChar, String replaceText) {
		return text.replace(oldChar, replaceText);
	}

	//Replace string
	public static String replaceAllExample(String text, String oldChar, String replaceText) {
		return text.replaceAll(oldChar, replaceText);
	}
}
