package vipin;

class InnerClass {
	
	static final int j;
	
	static{
		j=10;
	}
	
	public static void main(String ... args) {
		System.out.println("Main method");
		int a = 10;
		System.out.println(a--);
		
		int b = 20;
		System.out.println(--b);
		
		final int [] X = new int[5];
		X[1] = 10;
		X[1] = 20;
		
		try {
			try {
				
			} finally {
				// TODO: handle finally clause
			}
		} 
		catch(Exception e){
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			finally {
				
			}
		}
		
		
	}
}

class abc{
	
}