package sam01;

public class 교직원테스트 {

	public static void main(String[] args) {
			
		교직원 교직원1 = new 교직원("홍길동", 1111, "캠퍼스", 2222);
		
		System.out.println("=======================");
		System.out.println("이름 : "+ 교직원1.이름);
		System.out.println("주민번호 : "+ 교직원1.get주민번호());
		System.out.println("학교명 : "+ 교직원1.학교명);
		System.out.println("교원번호 : "+ 교직원1.번호);
		
		사람 사람1 = 교직원1;
		
		System.out.println("=======================");
		System.out.println("이름 : "+사람1.이름);
		System.out.println("주민번호 : "+사람1.번호);
		
	}
	
}
