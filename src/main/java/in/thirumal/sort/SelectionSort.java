/**
 * 
 */
package in.thirumal.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 4, -3, -6, 0, 10};
		for (int i = 0 ; i < arr.length; i++) {
			int min = i;
		
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] =arr[min];
			arr[min] = temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
