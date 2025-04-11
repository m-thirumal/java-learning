/**
 * 
 */
package in.thirumal.collection;

/**
 * 
 */
public class LinkedListExample {

	public static void main(String[] args) {
		Node<Integer> node = new Node<>(1);
		node.setNext(new Node<>(2));
		
		System.out.println(node.toString());
	}		
	
}

class LinkedList<T extends Comparable<T>> {
	
}

class Node<T extends Comparable<T>> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
