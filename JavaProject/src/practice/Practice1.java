package practice;

public class Practice1 {

	public static void main(String args[]){
		
		String message = "5";  //Swich Statement
		switch(message){
			case "3":
				System.out.println(""+message);
				break;
			case "5":
				System.out.println(""+message);
				break;
			default :
				System.out.println("inside else");
		}
		
	   int i= 1;
		while(i<=10){
			System.out.println(i);
			i++;
		} 
		 
		for(int j=1;j<=1;j++){
			System.out.println("*"); 
			for(int k=1;k<=1;k++){
				System.out.println("* *"); 
			}
		}
		for (int p=0;p<=127;p++){
			System.out.printf("%d : %c ",p,p);
		}
	}
	
}
