package basic_program;

public class Armstrong_No {

	public static void main(String[] args) {
		//456
		 int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");  
		    
		    int acb = 1/10;
		    System.out.println(acb);
	}

}
