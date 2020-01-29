package clone1;

public class Main {

	public static void main(String[] args) {
		Clone_Class c1 = new Clone_Class("vipin", 24);
		System.out.println(c1.age);
		
		try {
			Clone_Class c2 = (Clone_Class) c1.clone();
			System.out.println("clonable age"+c2.age);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
