/**
 * 
 */
package in.thirumal.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 */
public class ComputeIfAbsent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<Integer> numbers = IntStream.range(0, 100).boxed();
		// By group by
		Map<Boolean, List<Integer>> divisibleBy = numbers.collect(Collectors.groupingBy(n -> n % 3 == 0));
		System.out.println(divisibleBy);
		// Normal loop
		Map<Object, List<Integer>> divisibleByNormalLoop = new HashMap<>();
		IntStream.range(0, 100).boxed().forEach(n -> {
			if (n % 3 == 0) {
				divisibleByNormalLoop.computeIfAbsent(true, k -> new ArrayList<Integer>()).add(n);
			} else {
				divisibleByNormalLoop.computeIfAbsent(false, k -> new ArrayList<Integer>()).add(n);
			}
		});
		//
		String text = "Tree has leaves and leaves are green and flowers of the tree are red";
		Arrays.asList(text.split(" "))

		.stream()

		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))

		.entrySet()

		.stream()

		.filter(s -> s.getValue() > 1)

		.forEach(System.out::println);	
	}

}
