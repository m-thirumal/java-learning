/**
 * 
 */
package in.thirumal.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 */
public class CreateStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = List.of("Thirumal", "Tamil Vendhan");
		names.forEach(System.out::println);
		//Create from collections
		Stream<String> stream1 = names.stream();
		stream1.filter(s -> s.startsWith("T")).forEach(System.out::println);
		//Create from Array
		Stream<String> stream2 = Arrays.stream(new String[] {
				"Thirumal", "james"
		});
		stream2.forEach(System.out::println);
		// Creating a Stream with Stream.of()
		Stream<Integer> stream3 = Stream.of(1, 2, 3);
		//Creating infinite streams
		Stream<Integer> stream4 = Stream.iterate(0, n -> n + 2).limit(20);
		stream4.forEach(System.out::println);
		
	}
	

}
