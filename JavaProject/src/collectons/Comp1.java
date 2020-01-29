package collectons;

import java.util.Comparator;

public class Comp1 implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {
		if(o1.id==o2.id)
		return 1;
		else if(o1.id>o2.id)
			return 1;
		else
			return -1;
	}

}
