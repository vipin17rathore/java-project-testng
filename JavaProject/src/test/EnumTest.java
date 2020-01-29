package test;
enum days{
	Sunday,monday,tuesday, 
	
	wednesday {
		void draw(){
			
		}
	}
}

public class EnumTest {

	public static void main(String[] args) {
		days d = days.monday;
		System.out.println(d);
		for (days d1 : days.values()) {
			System.out.println(d1);
		}
		
		}
}
