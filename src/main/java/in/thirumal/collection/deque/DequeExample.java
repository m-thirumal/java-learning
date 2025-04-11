/**
 * 
 */
package in.thirumal.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 */
public class DequeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<Integer> linkedListDeque = new LinkedList<>();
		linkedListDeque.addFirst(1);
		linkedListDeque.addLast(2);
		linkedListDeque.offer(4);
		linkedListDeque.forEach(System.out::println);
		Deque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.add(1);
		arrayDeque.addFirst(3);
		System.out.println(arrayDeque.pop());
	}

}
