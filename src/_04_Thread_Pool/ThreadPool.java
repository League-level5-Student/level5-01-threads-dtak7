package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task> clq = new ConcurrentLinkedQueue<Task>();

	public ThreadPool(int i) {
		threads = new Thread[i];
		for (int j = 0; j < threads.length; j++) {
			threads[j] = new Thread(new Worker(clq));
		}
	}

	void addTask(Task t) {
		clq.add(t);
	}

	void start() {
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
