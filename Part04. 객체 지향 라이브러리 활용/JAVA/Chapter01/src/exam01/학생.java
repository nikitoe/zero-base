package exam01;

public class 학생 {
	public String 이름;
	
	public 학생() {
		System.out.println("학생 생성자가 호출되어짐");
	}
	
	public 학생(String 이름) {
		System.out.println("이름 파라미터를 갖는 학생 생성자 호출되어짐");
		this.이름 = 이름;
	}
}
