/**
 * 
 */
package in.thirumal.sort;

import java.util.Arrays;

/**
 * 
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 10, -9 , 4, 3, 1, 2, 0};
		for (int i = 1 ; i < arr.length; i ++) {
			int last = i - 1;
			int key = arr[i];
			while (last >= 0 && arr[last] > key) {
				arr[last + 1] = arr[last];
				last--;
			}
			arr[last + 1] = key;
			System.out.println(" i = " + i + " & j = " + last);
			Arrays.stream(arr).forEach(System.out::print);
			System.out.println();
		
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
