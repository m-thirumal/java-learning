/**
 * 
 */
package in.thirumal.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Find or get only unique values... with collectors..
 */
public class Unique {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
	    persons.add(new Person(1,"Ivan","Vasya","Petr"));
	    persons.add(new Person(2,"Ivan","Vasya","Petr"));
	    persons.add(new Person(3,"Ivan","Vasya","Petr"));
	    persons.add(new Person(4,"Ivan","Gupta","Ivan"));
	    persons.add(new Person(5,"Petr","Rama","Igor"));
	 
	    Collection<Person> uniquePersons = unique(persons);
	    System.out.println(uniquePersons.size() == 3);
	}
	
	public static Collection<Person> unique(List<Person> persons){
		// This is achived with help of hashcode and equals
	    return persons.stream().collect(Collectors.toSet());
	}
}
	
	class Person {
		   
	    public Integer id;
	    public String firstName;
	    public String secondName;
	    public String lastName;
		public Person(Integer id, String firstName, String secondName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.secondName = secondName;
			this.lastName = lastName;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(firstName, lastName, secondName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Objects.equals(firstName, other.firstName) 
					&& Objects.equals(lastName, other.lastName) && Objects.equals(secondName, other.secondName);
		}
		
	}

