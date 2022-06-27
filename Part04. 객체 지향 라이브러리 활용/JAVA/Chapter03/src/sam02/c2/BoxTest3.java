package sam02.c2;

public class BoxTest3 {

	public static void main(String[] args) {
		
		Box3<String, Integer> b1 = new Box3<String, Integer>();
		
		b1.setBox("홍길동", 24);
		
		String name = b1.getName();
		Integer age = b1.getAge();
		
		System.out.println("이름: " + name + ", 나이:" + age);
		
	}

}
