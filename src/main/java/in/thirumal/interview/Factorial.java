/**
 * 
 */
package in.thirumal.interview;

import java.util.stream.IntStream;

/**
 * 
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 7;
		System.out.println("Factorial of 7 => " + fact(n));
		
		int factResult = 1;
		for (int i = 2 ; i <=n; i++) {
			factResult *= i;
		}
		System.out.println(factResult);
		System.out.println("In java 8 =>" + IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b));
	}
	
	public static int fact(int n) {
		if (n == 1) {
			return n;
		}
		return n * fact(n - 1);
	}

}
