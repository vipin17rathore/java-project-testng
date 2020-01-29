package java8;

public interface Drawing {

	 public default void draw() {
		System.out.println("inside interface");
	}
}
