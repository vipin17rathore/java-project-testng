package practice;

public class Constructor {

	public static void main(String[] args) {
	  //Abc a = new Abc(); // first way
		Abc ab = new Abc(5); //second way
	}

}
class Abc{
	
	/*public Abc(){
	  System.out.println("Default Constructor");
	}
	*/
	public Abc(int a){
		System.out.println("Constructor");
	}
}
