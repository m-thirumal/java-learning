/**
 * 
 */
package in.thirumal.collection.priorityqueue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author thirumal
 *
 */
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {

	private Long id;
	private String name;
	private int age;
	
	@Override
	public int compareTo(Employee employee) {
		return this.getId().compareTo(employee.getId());
	}

}
