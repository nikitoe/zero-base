import java.util.Calendar; 

public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		System.out.println("원의 넓이:" + c1.getArea());
		System.out.println("원의 둘레:" + c1.getPerimeter());
		
		Circle c2 = new Circle(102);
		System.out.println("원의 넓이:" + c2.getArea());
		System.out.println("원의 둘레:" + c2.getPerimeter());
		
		
		// Calendar calendar = new Calendar(); // private로 선언되어있어서 생성자를 생성할 수 없다.
		Calendar calendar = Calendar.getInstance();
	}

}
