
public class 학생테스트 {

	public static void main(String[] args) {
		
		학생 공부하는학생 = new 학생("홍길동");	// 기본생성자
		// 공부하는학생.이름 = "홍길동";
		
		System.out.println(공부하는학생.이름);
		
		학생 조는학생 = new 학생();
		조는학생.이름 = "김가을";
		
		System.out.println(조는학생.이름);
		
	}

}
