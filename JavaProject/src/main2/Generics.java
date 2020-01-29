package main2;

class abc{
	public  <E> void test(E e) {
		System.out.println(e);
	}
}

public class Generics {
	public static void main(String args[]) {
		abc a = new abc();
		a.test(16);
	}
}
