/**
 * 
 */
package in.thirumal.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author thirumal
 *
 */
public class BasicRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("hi");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new BasicRunnable());
		if (t.isAlive()) {
			System.out.println("Thread is alive before start");
		}
		t.start();
		if (t.isAlive()) {
			System.out.println("Thread alive for 10 seconds");
		}
	}

}
