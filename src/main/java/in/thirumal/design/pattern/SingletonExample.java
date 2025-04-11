/**
 * 
 */
package in.thirumal.design.pattern;

/**
 * 
 */
public class SingletonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("hello singleton " + singleton);
	}

}

class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			return new Singleton();
		}
		return instance;
	}
}