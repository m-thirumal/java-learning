/**
 * 
 */
package in.thirumal.funtionalinterface;

/**
 * @author thirumal
 *
 */
public class SampleClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		callFunctionalInterfaceMethodUsingLamda((String name)->{
			return "Hello " + name;
		});
	}
	
	public static void callFunctionalInterfaceMethodUsingLamda(FunctionalInterfaceExample functionalInterfaceExample) {
		System.out.println(functionalInterfaceExample.sayHello("Thirumal"));
	}

}
