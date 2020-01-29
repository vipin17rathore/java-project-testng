package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Employee{
	int salary;
	Employee(int a){
		a=salary;
	}
}

class Student{
	Student(String a){
		
	}
}
public class QueueA {

	public static void main(String[] args) {
		Queue<String> q = new  PriorityQueue<>();
		q.add("vipin");
		q.add("xamesh");
		q.add("suresh");
		q.add("abc");
		
		System.out.println("head:"+q.element()); 
		System.out.println("peek:"+q.peek()); 
		
		Iterator<String>itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		//ternary operator
		int a=10;int b;
		b = (a==4)?45:56;
		System.out.println(b);
		
		String ab="VIP";
		String abc;
		
		abc = (ab.equals("VIP"))?"Rathore":"sharma";
		System.out.println(abc);
		
		ArrayList<Object> ar = new ArrayList<>();
		Employee e = new Employee(10);
		Student s =new Student("vipin");
		ar.add(e);
		ar.add(s);
		
		System.out.println(ar);
		
		Iterator<Object>itr1 = ar.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
