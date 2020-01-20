/**
 * 
 */
package in.thirumal.thread;

/**
 * @author thirumal
 *
 */
public class ThirdWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			System.out.println("hi, Runnable thread using lamda expression");
		});
		t.start();
	}

}
