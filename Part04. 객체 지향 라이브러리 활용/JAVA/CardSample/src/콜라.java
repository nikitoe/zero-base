
public class 콜라 {

	// 명시적 초기화
	private static int 용량 = 20;
	private int 제조일자 = 10;

	static {
		System.out.println("클래스 초기화 블럭");
		// 제조일자 = 50; // error
		용량 = 40;
		System.out.println("용량: " + 용량);
	}

	{
		System.out.println("인스턴스 초기화 블럭");
		제조일자 = 50;
		용량 = 50;
		System.out.println("용량: " + 용량);
		System.out.println("제조일자: " + 제조일자);
	}

	public 콜라() {
		System.out.println("생성자호출");
		용량 = 60;
		제조일자 = 60;
		System.out.println("용량: " + 용량);
		System.out.println("제조일자: " + 제조일자);
	}
}
