/**
 * 
 */
package in.thirumal.funtionalinterface;

/**
 * @author thirumal
 *
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {

	String sayHello(String name); //Only one abstract method is allowed
	
	// What is the use of functional interface ? To implement lamda operation
	
	default int defaultMethod1() { //More than one default method is allowed
		return 1;
	}
	
	default int defaultMethod2() {
		return 2;
	}
	
}
