/**
 * 
 */
package funtionalinterface;

/**
 * @author thirumal
 *
 */
public interface FunctionalInterface2 extends FunctionalInterfaceExample {

	String sayHi();
	
	default int defaultMethod1() { //More than one default method is allowed
		return 1;
	}
}
