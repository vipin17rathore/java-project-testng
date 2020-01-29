package threading;

public class Main {

	public static void main(String[] args) {
		// Thread1 t1 = new Thread1();
		// Thread2 t2 = new Thread2();
		 /*
		 Thread tn = new Thread(t1);
		 Thread tn1 = new Thread(t1);*/

		 Thread t = Thread.currentThread();
		 System.out.println("name-"+t.getName()+"id"+t.getId());  //main thread
		 
		 t.setPriority(9);
		 
		 Synchro1 sn = new Synchro1();
		 Synchro2 sn1 = new Synchro2();
		 
		 Thread tn = new Thread(sn);
		 Thread tn1 = new Thread(sn1);
		 
		 tn.start();
		 tn1.start();

	}

}
