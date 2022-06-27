package sam02.c3;

public class GeMethodTest {
	
public static void main(String[] args) {
		
		String[] names = {"자바", "파이썬", "씨플플", "씨샵", "자바스크립트"};
		Double[] scores = {100D, 98D, 65D, 50D, 95D};
	
		GeMethod.print(names);
		GeMethod.print(scores);
		
		GeMethod.firstStringPrint(names[0]);
}

}
