package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		ThreadedReverseGreeting trg = new ThreadedReverseGreeting();
		trg.greeter(1);
	}
	void greeter(int num) {
		Thread t = new Thread(()->{
		if(num<50) {
			greeter(num+1);
		}
		System.out.println("Hello from Thread "+ num);
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
