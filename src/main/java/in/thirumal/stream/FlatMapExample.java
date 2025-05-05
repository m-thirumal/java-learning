package in.thirumal.stream;

import java.util.HashSet;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] str) {
		var multipleList = List.of(List.of(1, 2, 3, 4), List.of(9, 8, 7, 6));
		multipleList.stream().flatMap(List::stream).forEach(System.out::println);
		HashSet<Integer> hasSet = new HashSet<Integer>();
		hasSet.add(null);
		hasSet.add(null);
		System.out.println(hasSet);
	}
}
