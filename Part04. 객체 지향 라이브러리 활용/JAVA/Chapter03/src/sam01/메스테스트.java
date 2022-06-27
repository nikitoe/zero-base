package sam01;

public class 메스테스트 {
	
	public static void p (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		double d1 = 12.426;
		// 소수점 2째자리까지 표현
		// 올림, 반올림, 버림
		// 12.43
		// 12.43
		// 12.42
		
		double x1 = 0;
		double y1 = 0;
		double x2 = 3;
		double y2 = 4;
		
		p(SmartMath.distance(x1, x2, y1, y2));
		p("--------------------------");
		
		p(d1);
		p(Math.round(d1));	//12
		p(Math.ceil(d1));	//13.0
		p(Math.floor(d1));	//12.0
		
		p("--------------------------");
		p(SmartMath.round(d1, 2));	//12.43
		p(SmartMath.ceil(d1, 2));		//12.43
		p(SmartMath.floor(d1, 2));	//12.42

	}

}
