package threading;

public class Thread1 implements Runnable {
	
	public /*synchronized*/ void run() {
		synchronized(this) {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread-"+i);
		}
		}
	}

	
}

class Thread2 implements Runnable{
	@Override
	public /*synchronized*/ void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Thread-"+i);
		}
	}
}

/*class main{
	
	public static void Main(String args[]) {
	 Thread1 t1 = new Thread1();
	 Thread1 t2 = new Thread1();
	 
	 Thread tn = new Thread(t1);
	 Thread tn1 = new Thread(t2);

	 tn.start();
	 tn1.start();
	}
*/	
