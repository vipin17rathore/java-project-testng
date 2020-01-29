package vipin;
	
public enum out_class{
	tcs,infosis,TechM;
	
	void sum() {
		System.out.println("enum method");
	}
}

class Main {

	enum value{
		SUnday,Monday
	}
	
	public static void main(String[] args) {
		for(value v :value.values()) {
			System.out.println(v);
		}
		
		for (out_class o : out_class.values()) {
			System.out.println(o);  o.sum();
		}
		
		//out_class.values().s
	}

}
