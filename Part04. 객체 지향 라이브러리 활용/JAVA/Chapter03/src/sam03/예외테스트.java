package sam03;

public class 예외테스트 {
	public static void method1(int i, int j) throws Exception {
		
		if(j == 0) {
			throw new Exception("0으로 나눌수 없습니다.");
		}
		
		int k = i / j;
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		
		// 예외처리 방법
		// 1. 직접 try, catch 한다
		// 2. thorow한다, 넘긴다
	
			try {
				method1(1, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	
	}

}
