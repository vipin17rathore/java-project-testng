package comparable_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Comparable_Class>ar = new ArrayList<>();
		ar.add(new Comparable_Class(19, "vipin"));
		ar.add(new Comparable_Class(17, "sahil"));
		ar.add(new Comparable_Class(18, "rahul"));
		
		Collections.sort(ar);
		for(Comparable_Class ab : ar) {
			System.out.println(ab.age);
		}
	
	}

}
