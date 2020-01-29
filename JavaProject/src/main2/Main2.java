package main2;

public class Main2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("try");
			int a= 0;
			a = a/a;
		}
		catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("abcd");
	
	}

}
