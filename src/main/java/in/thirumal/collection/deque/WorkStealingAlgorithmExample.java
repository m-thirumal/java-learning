/**
 * 
 */
package in.thirumal.collection.deque;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
public class WorkStealingAlgorithmExample {

	int taskId;
	
	public WorkStealingAlgorithmExample(int taskId) {
		super();
		this.taskId = taskId;
	}
	
	public void action() {
		System.out.println("Task Id " + taskId  + " running on thread -> " + Thread.currentThread().getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService workstealing = Executors.newWorkStealingPool();
		for (int i = 0; i < 100 ; i ++ ) {
			workstealing.submit(new Thread(new WorkStealingAlgorithmExample(i)::action));
		}
		
		try {
			workstealing.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workstealing.shutdown();
	}

}


