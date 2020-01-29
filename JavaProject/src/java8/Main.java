package java8;
import java.util.*;

public class Main implements Drawing
{
	public static void main (String args[]) {
		ArrayList<String>ar = new ArrayList<>();
		ar.add("vipin");
		ar.add("rahul");
		ar.add("abhishek");
		
		ar.forEach(i->System.out.println(i));
		InterfaceClass c = new InterfaceClass();
		c.draw();
   }
}