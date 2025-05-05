/**
 * 
 */
package in.thirumal.interview;

import java.util.PriorityQueue;

/**
 * 
 */
public class SortString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----Hi-----");
		String str = "thirumal";
		System.out.println("Given String is : " + str);
		char[] strInChar = str.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		PriorityQueue<Character> sortedString = new PriorityQueue<>();
		for (int i = 0 ; i < strInChar.length; i++) {
			sortedString.add(strInChar[i]);
		}
		while(!sortedString.isEmpty()) {
			stringBuilder.append(sortedString.poll());
		}
		System.out.println("Output String is: " + stringBuilder.toString());
	}

}
