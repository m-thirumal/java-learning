/**
 * 
 */
package in.thirumal.funtionalinterface;

/**
 * @author thirumal
 *
 */
public class ClassImplement implements FunctionalInterface2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FunctionalInterface2 c = new ClassImplement();
		System.out.println(c.defaultMethod1());

	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sayHi() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int defaultMethod1() { //More than one default method is allowed
		return 4;
	}

}
