package main2;

class Gen2<T> {
	
	T obj;
	void run(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class Gen1{
	
	public static void main(String args[]) {
		Gen2<Integer>gen = new Gen2<>();
		gen.run(10);
		System.out.println(gen.get());
		
	}
}