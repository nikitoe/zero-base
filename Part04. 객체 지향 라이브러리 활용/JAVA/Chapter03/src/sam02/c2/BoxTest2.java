package sam02.c2;

public class BoxTest2 {

	public static void main(String[] args) {
		
		Box2<String> b1 = new Box2<String>();
		b1.setBox("홍길동", "남자");
		System.out.println();
		String name = b1.getGender();
		String gender = b1.getLastData();
		
		System.out.println(name + gender);
		
	}

}
