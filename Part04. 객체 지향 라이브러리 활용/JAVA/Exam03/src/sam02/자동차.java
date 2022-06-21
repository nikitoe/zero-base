package sam02;

public class 자동차 extends 차량{
	public String 이름 = "자동차";
	public String 배기량;
	
	public void 정보출력() {
		System.out.println("(차량)이름 : " + super.이름);
		System.out.println("최대속도 : " + 최대속도);
		System.out.println("정원 : " + 정원);
		
		System.out.println("배기량 : " + 배기량);
		System.out.println("(자동차)이름 : " + this.이름);
	}
}
