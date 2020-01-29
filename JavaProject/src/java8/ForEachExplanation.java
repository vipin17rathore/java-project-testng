package java8;
import java.util.*;
import java.util.function.Consumer;

public class ForEachExplanation {

	public static void main(String args[]) 
	{
		ArrayList<String>ar = new ArrayList<>();
		ar.add("vipin");
		ar.add("Rahul");
		ar.add("Abhis");
		
		// Consumer<String>c = (t) -> System.out.println(t);
		
		ar.forEach((t) -> System.out.println(t));  // by for each using lamda
		ar.forEach(System.out::println);   // using call by method refrence
		ar.forEach(i -> doubleIt(3));
		//ar.forEach(ForEachExplanation::doubleIt);
	}
	
	public static void doubleIt(int i) {
		System.out.println("Res"+i*2);
	}
}
