/**
 * 
 */
package in.thirumal.sort;

import java.util.Random;

/**
 * 
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers  = new int[100000];
		
		for (int  i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100000);
		}
		System.out.println("Before Sort ");
		printArray(numbers);
		//
		mergeSort(numbers);
		System.out.println("");
		System.out.println("After Sort");
		printArray(numbers);
	}

	private static void mergeSort(int[] numbers) {
		int numberLength = numbers.length;
		if (numberLength < 2) {
			return; //Break the recursion
		}
		//Find mid point for divide
		int midPoint = numberLength / 2;
		int[] leftHalfNumbers = new int[midPoint];
		int[] rightHalfNumbers = new int[numberLength - midPoint];
		//Fill Left Half Number
		for (int i = 0; i < midPoint; i++) {
			leftHalfNumbers[i] = numbers[i];
		}
		// Fill Right Half Number
		for (int i = midPoint; i < numberLength; i++) {
			rightHalfNumbers[i - midPoint] = numbers[i];
		}
		mergeSort(leftHalfNumbers);
		mergeSort(rightHalfNumbers);
		//Conquer
		merge(numbers, leftHalfNumbers, rightHalfNumbers);
	}

	private static void merge(int[] numbers, int[] leftHalfNumbers, int[] rightHalfNumbers) {
		int leftHalfSize = leftHalfNumbers.length;
		int righttHalfSize = rightHalfNumbers.length;
		int i = 0, j =0, k =0;
		while (i < leftHalfSize && j < righttHalfSize) {
			if (leftHalfNumbers[i] <= rightHalfNumbers[j]) {
				numbers[k] = leftHalfNumbers[i];
				i++;
			} else {
				numbers[k] = rightHalfNumbers[j];
				j++;
			}
			k++;
		}
		//if there is any element is not added  from left array
		while ( i < leftHalfSize) {
			numbers[k] = leftHalfNumbers[i];
			i++;
			k++;
		}
		//if there is any element is not added from right array
		while ( j < righttHalfSize) {
			numbers[k] = rightHalfNumbers[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] numbers) {
		for ( int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
