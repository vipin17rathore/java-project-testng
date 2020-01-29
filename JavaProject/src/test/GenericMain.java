package test;

class Generic<T>{
	T t;
	
	Generic(T t){
		this.t =t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

public class GenericMain {

	public static void main(String[] args) {
		Generic<String>st = new Generic("Vipin");
		System.out.println(st.getT());
		st.setT("ABC");
		System.out.println(st.getT());
	}

}
