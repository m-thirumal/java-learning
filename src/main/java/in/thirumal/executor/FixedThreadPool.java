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
public class FixedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		ExecutorService executorService = Executors.newFixedThreadPool(2); //Only 2 thread at a time
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		
		//executorService.execute(new LoopTaskA()); //throw error
		
		System.out.println("Main thread ends here...");
	}

}
