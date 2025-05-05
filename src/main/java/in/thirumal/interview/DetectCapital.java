package in.thirumal.interview;

public class DetectCapital {

	public static void main(String[] args) {
		String word = "Flag";
		boolean isProper = false;
		if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) {
			isProper = true;
		}
		if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
			isProper = true;
		}
		System.out.println("Has proper capital : " + isProper);
	}

}
