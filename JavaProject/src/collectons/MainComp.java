package collectons;

import java.util.ArrayList;
import java.util.Collections;

public class MainComp {
	public static void main(String args[]) {
		Teacher t1 = new Teacher(5, "rahul");
		Teacher t2 = new Teacher(4, "vipin");
		Teacher t3 = new Teacher(6, "abhi");
		
		ArrayList<Teacher>t = new ArrayList<Teacher>();
		t.add(t1);
		t.add(t2);
		t.add(t3);
		
		Collections.sort(t, new Comp2());
		for(Teacher th : t) {
			System.out.println(th.id);
		}
		
	}
}
