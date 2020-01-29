package clone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.zip.ZipFile;

class abc implements Cloneable{
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void run() {
		final String vip;
		System.out.println("run method");
	//	BufferedReader br = null;
		
		/*try {
			br = new BufferedReader(new FileReader("C://test.txt"));
			System.out.println(br.readLine());
		}
		catch(Exception e) {
			
		}  //try catch 
		*/
		
	try(BufferedReader br = new BufferedReader(new FileReader("C://test.txt")); 
		       ZipFile zf = new ZipFile("test1.zip");){
		
	}
	catch(Exception e) {
		
	}  //try with resource 
	
		
	}
}
public class CloneClass {

	public static void main(String[] args) {
		abc obj1 = new abc();
		System.out.println(obj1);
		try {
			abc obj2 = (abc) obj1.clone();
			System.out.println(obj2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
