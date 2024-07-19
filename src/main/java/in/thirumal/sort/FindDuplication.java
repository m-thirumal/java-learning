/**
 * 
 */
package in.thirumal.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class FindDuplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-------------Using Set--------");
		//The easiest way to find duplicate elements is by adding the elements into a Set.
		//Sets can't contain duplicate values, and the Set.add() method returns a boolean value
		//which is the result of the operation. If an element isn't added, false is returned, and vice versa.
		Stream<String> stream = Stream.of("john", "doe", "doe", "tom", "john");
		Set<String> items = new HashSet<>();

		stream.filter(s->!items.add(s)).collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println("-------------Using Map--------");
		
		List<Integer> list = Arrays.asList(9, 2, 2, 7, 6, 6, 5, 7);
		list.stream().collect(Collectors.toMap(Function.identity(), v->1, Integer::sum)).forEach((k, v) -> {
			System.out.println(k + " : " + v);
		});
		
		System.out.println("-------------Using grouping by--------");
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(a -> a.getValue() > 1)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("-------------Using frequency--------");
		list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet()).forEach(System.out::println);
		
		//Other ways are use distincts..
	}
	

}
