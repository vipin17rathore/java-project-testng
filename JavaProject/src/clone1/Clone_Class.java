package clone1;

public class Clone_Class implements Cloneable {
	
	String name;
	int age;
	
	Clone_Class(String name,int age) {
	this.age=age;
	this.name=name;
	
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
