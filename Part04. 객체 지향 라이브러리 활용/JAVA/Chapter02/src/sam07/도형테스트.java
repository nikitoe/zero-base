package sam07;

public abstract class 도형테스트{
	
	public static void main(String[] args) {
		
		// 도형 도형1 = new 도형(10, 10); // 에러
		삼각형 삼각형1 = new 삼각형(10,10,100,120);
		삼각형1.그리기();
		
		사각형 사각형1 = new 사각형(15,12,200,240);
		사각형1.그리기();
		
		원 원1 = new 원(25,24,300);
		원1.그리기();
		원1.초기화();
		원1.그리기();
		
	}
	
}
