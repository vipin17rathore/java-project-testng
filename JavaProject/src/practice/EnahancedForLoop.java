package practice;

import java.util.Random;

public class EnahancedForLoop {

	public static void main(String[] args) {
		int [] num = new int [10];
		Random r = new Random();
		
		for (int i=0;i<num.length-1;i++){
			num[i] = r.nextInt(60);
			//System.out.println(""+num[i]);
		}
		System.out.println(num);
		for(int n : num){
			System.out.println(n);
		}
		
	}

}
