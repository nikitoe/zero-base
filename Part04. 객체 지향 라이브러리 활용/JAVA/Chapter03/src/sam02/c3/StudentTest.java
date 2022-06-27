package sam02.c3;

public class StudentTest extends Person{

	public static void main(String[] args) {
		
		Person p1 =new Person();
		Student s1 = new Student();
		
		GeMethod.displayAge(p1);
		GeMethod.displayAge(s1);
	}

}
