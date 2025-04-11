/**
 * 
 */
package in.thirumal.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 */
public class CompareExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Thirumal", 34));
		persons.add(new Person(2, "Tamil Vendhan", 1));
		persons.add(new Person(3, "Sowndarya", 27));
		Collections.sort(persons);
		persons.forEach(System.out::println);
		
		// If i want to sort by id, without modifying the source code of Person class, i can use comparator
		
		Comparator<Person> soterById = (p1, p2) -> Integer.compare(p1.id, p2.id);
		Collections.sort(persons, soterById);
		System.out.println("-----------Sort by ID using comparator---------");
		persons.forEach(System.out::println);
	}

}


@Getter@Setter
@ToString
@AllArgsConstructor@NoArgsConstructor
class Person  implements Comparable<Person>{
	
	int id;
	String name;
	int age;
	
	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
	
}