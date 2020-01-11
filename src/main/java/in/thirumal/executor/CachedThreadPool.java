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
public class CachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService execService = Executors.newCachedThreadPool(); //Creates number of thread as many task submitted to the execute 
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		
		execService.shutdown();
		
		System.out.println("Main thread ends here...");
	}

}
