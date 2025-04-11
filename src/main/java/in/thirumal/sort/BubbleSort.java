/**
 * 
 */
package in.thirumal.sort;

/**
 * 
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {10, 23, 1, 4, 65, 9};
		System.out.print("Array before sorting => ");
		print(arr);
		sort(arr);
		System.out.print("\nArray after  sorting => ");
		print(arr);
	}
	
	private static String print(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		return null;
	}

	/*
	 * Time complexity O(n2)
	 */
	static int[] sort(int[] arr) {
		boolean swapped ;
		for (int i = 0; i < arr.length - 1 ; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {				
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) { //If the inner loop is not swapped any element, then it's sorted.
				break;
			}
		}
		return arr;
	}

}
