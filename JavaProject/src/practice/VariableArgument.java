package practice;

public class VariableArgument {

	static public  void main(String ... args) {
		Data data = new Data();
		data.show(10,10,10);

	}

}

class Data{
	public void show(int ... a){
		for (int i : a){
			System.out.println(i);
		}
	}
}