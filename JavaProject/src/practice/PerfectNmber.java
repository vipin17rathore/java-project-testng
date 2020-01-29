package practice;

public class PerfectNmber {

	public static void main(String[] args) {
		//Perfect number, a positive integer that is equal to the sum of its proper divisors
		int n= 28;
		boolean result = isPerfect(n);
		if(result)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect");
		
	}
	
	public static boolean isPerfect(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
	    if(num%i==0){
	    	System.out.println(sum);
	    	sum = sum+i;
	    	
	    }
		}
		if(num==sum){
			return true;
		}
		return false;
	}
}