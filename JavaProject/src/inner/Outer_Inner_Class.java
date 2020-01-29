package inner;

public class Outer_Inner_Class {
	
	private String name;
	
	class inner_class{
		int age;
	}
	public static void main(String[] args) {
		Outer_Inner_Class ot = new Outer_Inner_Class();
		Outer_Inner_Class.inner_class in= ot.new inner_class();
		System.out.println(in.age);

	}

}
