/**
 * 
 */
package in.thirumal.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class IterviewQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findUniqueNumer();//Find a unique number from the given ArrayList
		System.out.println("\n==================");
		findingMaxFromArrayList();//Find the largest/maximum number from an ArrayList
		System.out.println("\n==================");
		printNumberAndTheirFrequency();//Print the numbers along with their frequencies
		System.out.println("\n==================");
	}
	
	private static void printNumberAndTheirFrequency() {
		System.out.println("Printing number and their frequence...");
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5);
		Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
		frequencyMap.forEach((k, v) -> System.out.println(k + " -> " + v));
	}

	private static void findingMaxFromArrayList() {
		System.out.println("Find the largest/maximum number from an ArrayList");
		Integer max = Stream.of(1, 3, 4, 5, 10).max(Integer::compareTo).get();
		System.out.println(max);
	}

	//Find a unique number from the given ArrayList
	public static void findUniqueNumer() {
		System.out.println("Finding Unique Number from ArrayList");
		List<Integer> arrs = Arrays.asList(1, 3, 2, 4, 5, 5);
		arrs.stream().filter(n -> Collections.frequency(arrs, n) == 1).forEach(System.out::print);
	}

}
