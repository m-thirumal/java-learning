package in.thirumal.executor;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int instanceNumber;
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("##### [-" + threadName + "] <"+ instanceNumber + "> STARTING #####");
		
		for (int i=10; i>0; i--) {
			System.out.println("[-"  + threadName + "] <"+ instanceNumber + ">TICK TICK " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("*****["  + threadName + "] <"+ instanceNumber + "> DONE ******");
	}
	
	
	public LoopTaskA() {
		this.instanceNumber = ++count;
	}
}
