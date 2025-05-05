package in.thirumal.interview;

import java.util.Arrays;
import java.util.HashMap;

public class SumInSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 18};
		int k = 9;
		int[] result = sumIndex(arr, k);
		Arrays.stream(result).forEach(System.out::println);
	}
	
	public static int[] sumIndex(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0 ; i < arr.length; i++) {
			int remaining =  target - arr[i];
			if (map.containsKey(remaining)) {
				return new int[] { map.get(remaining), i};
			} else {
				map.put(arr[i], i);
			}
		}
		return new int[] {1, 1};
	}

}
