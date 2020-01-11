/**
 * 
 */
package in.thirumal.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author thirumal
 *
 */
public class SingleThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		ExecutorService execService = Executors.newSingleThreadExecutor(); //Execcutes in sequential order
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		
		execService.shutdown();
		
		System.out.println("Main thread ends here...");
	}

}
