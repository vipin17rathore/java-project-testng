package singlton;

public class Singlton2 {

	public static void main(String[] args) {
		run r = run.getInstance();
	}

}

class run{
	static run obj =new run();
	private run(){
		
	}
	
	public static run getInstance() {
		return obj;
	}
}
