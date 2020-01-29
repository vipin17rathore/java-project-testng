package basic_program;

public class Feboni_Series {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int n=0;int n1=1;int n2;
		for(int i=1;i<20;i++) {
			n2=n+n1;
			n=n1;
			n1=n2;
			System.out.println(n2);
		}
	}

}
