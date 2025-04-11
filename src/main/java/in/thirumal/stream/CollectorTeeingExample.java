/**
 * 
 */
package in.thirumal.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 
 */
public class CollectorTeeingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Alex", "Paris", 32),
                new Person("Martin", "Paris", 24),
                new Person("Tim", "Paris", 23),
                new Person("Emilie", "Berlin", 25),
                new Person("Albert", "Chicago", 24),
                new Person("Mateo", "Madrid", 25),
                new Person("Adrien", "Barcelone", 27));
		//Find the minimum and maximum age from the list of Person objects.
		var minMaxAge = people.stream().collect(Collectors.teeing(
				Collectors.minBy(Comparator.comparingInt(Person::age)),
				Collectors.maxBy(Comparator.comparingInt(Person::age)), 
				(min, max) -> "Min => " + min.get() + " Max => " + max.get()));
		System.out.println(minMaxAge);
		//Find the list of persons living in Paris and the list of persons 24 years of age
		var peronLiveinParisAndAge24 = people.stream().collect(Collectors.teeing(
				Collectors.filtering(p -> p.city().equalsIgnoreCase("paris"), Collectors.toList()),
				Collectors.filtering(p -> p.age() == 24, Collectors.toList()),
				List::of));
		System.out.println(peronLiveinParisAndAge24);
	}
	
	

}

record Person(String name, String city, int age) {
	
}
