package practice;

public class Sample_class {

	public static void main(String args[]) {
		int i = 10;
		Integer iref = new Integer(i);  // Boxing construction the object
		System.out.println(iref);  
		
		int j = iref.intValue();  // unboxing converting object into the value
		
		Integer kref = i; // autoBoxing 
		
		int k = kref.intValue(); // autounboxing
		
		// boxing is used to convert the primitive data type into the object and strically following the OOPS
		boolean abc = true;
		Boolean bl = abc;
		boolean bcd = bl.booleanValue();
	}
	
	
}
