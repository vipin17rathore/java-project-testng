package collectons;

class test {
	
	public static void main(String args[]) {
	new Static_Block().run();
	
}
}

public class Static_Block {

	static {
		System.out.println("vipin is here");
	}

public void run() {
	System.out.println("run method");
}
}



