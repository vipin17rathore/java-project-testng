package inner;

public class Local_inner_class {

	void msg() {
		class inner{
			int age=30;
		}
		inner i = new inner();
		System.out.println(i.age);
	}
	public static void main(String[] args) {
		Local_inner_class lc = new Local_inner_class();
		lc.msg();
	}

}
