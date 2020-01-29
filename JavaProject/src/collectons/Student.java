package collectons;

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	
	Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name   = name;
				
	}

	@Override
	public int compareTo(Student st) {
			if(rollNo==st.rollNo)
		return 0;
			
			else if(rollNo>st.rollNo)
				return 1;
	
			else
				return -1;
	}
}
