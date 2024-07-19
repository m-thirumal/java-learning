/**
 * 
 */
package in.thirumal.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
 */
public class StreamSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Simple sort in ascending order
		System.out.println("-------Simple Sorting----------");
		Arrays.asList(10, 23, -4, 0, 18).stream().sorted().forEach(System.out::println);
		//Simple sort in descending order
		System.out.println("-------Reverse Order ----------");
		Arrays.asList(10, 23, -4, 0, 18).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//Custom soring
		System.out.println("--------Custom sort--------");
		List<User> users = List.of(new User(0, "T"), new User(1, "A"), new User(3, "B"));
		users.stream().sorted(Comparator.comparingInt(User::getId).reversed()).forEach(System.out::println);
	}

}


class User {
	
	int id;
	String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}