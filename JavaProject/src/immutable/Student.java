package immutable;

public final class Student {

	private final String name;
	private final int id;
	
	Student(String name,int id){
		this.name= name;
		this.id= id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
