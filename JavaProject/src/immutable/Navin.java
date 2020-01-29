package immutable;

final class Employee {
	int i;
	
	Employee(int i ){
		this.i=i;
	}
	public Employee modify(int i) {
	if(this.i==i) {
		return this;
	}
	else
		return new Employee(i);
	}
}

public class Navin {

	public static void main(String args[]) {
		Employee e1 = new Employee(10);
		System.out.println(e1.i);
		Employee e2 = e1.modify(100);
		System.out.println(e2.i);
		
	}
}
