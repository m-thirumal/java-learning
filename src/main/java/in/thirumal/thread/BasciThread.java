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
		// t.start(); //Not allowed
		///t.run(); //Runs on same thread
		System.out.println("hello");
	}
	
	
	public void run() {
		try {
			Thread.sleep(122);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
