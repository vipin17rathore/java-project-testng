package java8;

interface A {
	void show();
}

/*class dis implements A {

	public void show() {
		System.out.println("inside show method");
	}

}
*/
public class LamdaDemo {
	public static void main(String args[]) {
		A obj;
		obj = ()->System.out.println("inside method");
			   obj.show();
	}
}
