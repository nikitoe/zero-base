package sam02.c2;

public class Box2<T> {
	
	private T name;
	private T gender;

	public void setBox(T name, T gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public T getGender() {
		return name;
		
	}
	
	public T getLastData() {
		return gender;
		
	}

}
