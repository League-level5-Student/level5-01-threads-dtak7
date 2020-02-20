package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> clq;
	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		 clq = taskQueue;
		 

	}
	public void run() {
		while(!clq.isEmpty()) {
			clq.remove().perform();
		}
	}


}
