package sam01;

public class 문자열테스트2 {
	
	public static void p (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 24;
		double weight = 80.1;
		
		p("이름: " + name +", 나이: " + age +", 몸무게: " + weight);
		
		String display = String.format("이름: %s, 나이: %d, 몸무게: %.2f", name, age, weight);
		p(display);
	}

}
