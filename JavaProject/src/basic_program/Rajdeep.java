package basic_program;

import java.util.ArrayList;
import java.util.Scanner;

public class Rajdeep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("size"+size);
		ArrayList ar = new ArrayList<>();
		for(int i=0;i<size;i++) {
			int size1 = sc.nextInt();
			ar.add(size1);
		}		
		System.out.println("arraylist"+ar);
	}

}
