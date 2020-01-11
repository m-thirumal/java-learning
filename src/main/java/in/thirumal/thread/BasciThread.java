/**
 * 
 */
package in.thirumal.thread;

/**
 * @author thirumal
 *
 */
public class BasciThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new BasciThread();
		System.out.println(t.getClass());
		t.start();
		System.out.println("hello");
	}
	
	
	public void run() {
		try {
			Thread.sleep(12222);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ji");
	}

}
