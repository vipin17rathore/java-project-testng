package primeNo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a = 100;
		int b=0;
		int j=5;
		int i=j*3;
		int k;
		//System.out.println("Enter no");
		//Scanner sc = new Scanner(System.in);
		//i = sc.nextInt();
		
		ArrayList<Integer>ar= new ArrayList<>();
		ar.add(2);
		ar.add(3);
		ar.add(5);
		
		for(k=2;k<=i;k++) {
			if(k%2==0|| k%3==0 || k%5==0) {
			
			}
			else {
				ar.add(k);
				System.out.println("Np-"+k);	
			}
		}
		
		System.out.println(ar.get(j));
		
	//	2 3 5 7 9 11 13 17

	}

}
