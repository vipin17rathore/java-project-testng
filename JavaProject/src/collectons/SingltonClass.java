package collectons;

public class SingltonClass {

	public static void main(String[] args) {
		Abc ab = Abc.getInstance();
		System.out.println(ab);
		Abc ab1 = Abc.getInstance();
		System.out.println(ab1);
	}

}

class Abc{
	
	static Abc obj = new Abc();
	
	private Abc(){
		
	}
	
	public static Abc getInstance() {
		return obj;
		
	}
}
