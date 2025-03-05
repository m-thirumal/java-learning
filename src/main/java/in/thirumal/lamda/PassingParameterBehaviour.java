/**
 * 
 */
package in.thirumal.lamda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author thirumal
 *
 */
public class PassingParameterBehaviour implements LamdaInterface {

	public static void main(String[] str) {
		PassingParameterBehaviour pas = new PassingParameterBehaviour();
		pas.callFilter();
	}

	private void callFilter() {
		List<Integer> numbers = IntStream.range(0, 15).boxed().toList();
		Predicate<Integer> i = p -> p.intValue() % 2 == 0;
		Predicate<Integer> j = p -> p.intValue() % 3 == 0;
		System.out.println("OR: " + filter(numbers, i.or(j)));
		System.out.println("AND: " + filter(numbers, i.and(j)));
	}
}
