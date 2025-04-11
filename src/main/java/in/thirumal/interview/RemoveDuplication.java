/**
 * 
 */
package in.thirumal.interview;

/**
 * 
 */
public class RemoveDuplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "programming";
		StringBuilder stringBuilder = new StringBuilder();
		boolean[] seen = new boolean[256];
		for (char c : str.toCharArray()) {
			if (!seen[c]) {
				seen[c] = true;
				stringBuilder.append(c);	
			}
		}
		System.out.println(stringBuilder.toString());
	}

}
