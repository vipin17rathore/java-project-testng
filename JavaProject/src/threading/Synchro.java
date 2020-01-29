package threading;

public class Synchro {
	
	synchronized static  void test() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread-"+i);
		}
	}
}	

class Synchro1 implements Runnable{
	
	public void run() {
		Synchro.test();
	}
}

class Synchro2 implements Runnable{
	
	public void run() {
		Synchro.test();
	}
}