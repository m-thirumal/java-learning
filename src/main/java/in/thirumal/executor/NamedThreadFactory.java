/**
 * 
 */
package in.thirumal.executor;

import java.util.concurrent.ThreadFactory;

/**
 * @author thirumal
 *
 */
public class NamedThreadFactory implements ThreadFactory {

	private static int count = 0;
	private static String NAME = "MyThread-";
	
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r, NAME + ++count);
		return t;
	}


}
