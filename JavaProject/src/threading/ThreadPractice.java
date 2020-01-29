package threading;

import java.io.IOException;

public class ThreadPractice extends Thread{

	public void run() {
		
		for (int i=0;i<=5;i++) {
		try {
			if(Thread.currentThread().isDaemon()) {
			Thread.sleep(500);
			System.out.println("Thread is running"+i);
			System.out.println(Thread.currentThread());
			}
			else
				System.out.println("normal tread"+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

	public static void main(int a) {
		System.out.println(a);
	}

	public static void main(String args[]) {
		main(100);
	/*	  try {
			Runtime.getRuntime().exec("shutdown -r -t 0");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
	*/	ThreadPractice t1 = new ThreadPractice();
		/*ThreadPractice t2 = new ThreadPractice();
		ThreadPractice t3 = new ThreadPractice();*/
		
		System.out.println("before changing"+t1.getName());
		t1.setDaemon(false);
		t1.start();
		t1.setName("vipin");
		System.out.println(t1.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   //   		t2.start();
   /// 		t3.start();
		
	}
	
}
