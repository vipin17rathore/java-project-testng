package practice;
import java.util.*;
import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		
	List<String>ls = new ArrayList<String>();
	ls.add("java");
	ls.add("oracle");
	
	Collections.addAll(ls,"spring","dotnet");
	System.out.println(ls);
	
	System.out.println(Collections.max(ls));
	System.out.println(Collections.min(ls));
	
	Collections.sort(ls, Collections.reverseOrder());
	
	Iterator itr = ls.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}


	}
	

}
