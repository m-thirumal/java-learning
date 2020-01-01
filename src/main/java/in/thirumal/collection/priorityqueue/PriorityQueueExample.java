/**
 * 
 */
package in.thirumal.collection.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author thirumal
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Employee must be comparable
		PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(new Employee(2L, "Jessica", 28));
		priorityQueue.add(new Employee(1L, "thirumal", 28));
		//
		priorityQueue.stream().forEach(System.out::println);
		//
		System.out.println("--------------------Custom comparator with name sorting-----------------");
		Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName);
		PriorityQueue<Employee> priorityQueueWithCustomComparator = new PriorityQueue<>(employeeComparator);
		priorityQueueWithCustomComparator.add(new Employee(2L, "Jessica", 28));
		priorityQueueWithCustomComparator.add(new Employee(1L, "thirumal", 28));		
		priorityQueueWithCustomComparator.add(new Employee(4L, "Angelina", 28));
		priorityQueueWithCustomComparator.offer(new Employee(5L, "Britney", 28));
		priorityQueueWithCustomComparator.stream().forEach(System.out::println);
		
	}

}
