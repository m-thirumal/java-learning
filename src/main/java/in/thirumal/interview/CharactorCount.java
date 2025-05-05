/**
 * 
 */
package in.thirumal.interview;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 
 */
public class CharactorCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Programming";
		System.out.println(str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                Function.identity(), 
                Collectors.counting()
            ));

	}

}
