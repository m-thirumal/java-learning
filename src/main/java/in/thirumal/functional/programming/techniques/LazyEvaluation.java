/**
 * 
 */
package in.thirumal.functional.programming.techniques;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 
 */
public class LazyEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----Start of Eager -----");
		System.out.println(addOrMultiply(true, add(4), multiply(4)));
		System.out.println(addOrMultiply(false, add(4), multiply(4)));
		System.out.println("----End of Eager -----");
		//Lazy Sample
		System.out.println("##############################");
		System.out.println("----Start of Lazy -----");
		 // This is a lambda expression behaving as a closure
		UnaryOperator<Integer> add = t -> {
			System.out.println("Excuting Add");
			return t + t;
		};
		
		UnaryOperator<Integer> multiply = t -> {
			System.out.println("Excuting Multiply");
			return t * t;
		};
        System.out.println(addOrMultiply(true, add, multiply, 4));
        System.out.println(addOrMultiply(false, add, multiply, 4));
		System.out.println("----End of Lazy -----");

	}
	
	//----Eager Sample-----///
	
	static int add(int x) {
		System.out.println("Executing add");// this is printed since the functions are evaluated first
		return x + x;
	}

	
	static int multiply(int x) {
		System.out.println("Executing Multiply");// this is printed since the functions are evaluated first
		return x * x;
	}
	
	static int addOrMultiply(boolean add, int onAdd, int onMultiply) {
		return (add) ? onAdd : onMultiply;
	}
	// Lazy Sample
	 // This is a higher-order-function
	static <T, R> R addOrMultiply(boolean add, Function<T, R> onAdd, Function <T, R> onMultiply, T t) {
		return add ? onAdd.apply(t) : onMultiply.apply(t);// Java evaluates expressions on ?: lazily hence only the required method is executed
	}

}

