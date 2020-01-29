package practice1;

public class Test {

	public void finalize() {
		System.out.println("inside finalize");
	}
	public final void run() {
		System.out.println("run method");
	}
	
	public static void main(String args[]) {
		final String val ="abc";
		Test t = new Test();
		t = null;
		System.gc();
		
		String a ="abc";
		String b ="abc";
		
		if(a.equals(b)) {
			System.out.println("equals");
		}
		else {
			System.out.println("else");
		}
	}
}
