package practice;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int a=0; int b=1; int c=1;
		System.out.println("1 1");
		while(a<=n){
			a = b+c;
			System.out.println(a);
			b=c;
			c=a;
		}
	}
}
