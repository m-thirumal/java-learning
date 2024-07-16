/**
 * 
 */
package in.thirumal.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */
public class PartitionByExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Orange", "Banana", "fig", "Owl");
		Map<Boolean, List<String>> result = words.stream().collect(Collectors.partitioningBy(s -> s.matches("^[AEIOUaeiou].*")));
		System.out.println("True => " + result.get(true));
		System.out.println("False => " + result.get(false));
	}

}
