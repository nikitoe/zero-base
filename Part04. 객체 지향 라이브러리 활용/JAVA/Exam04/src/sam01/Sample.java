package sam01;

import java.util.Date;
import java.util.Calendar;

public class Sample {
	public static void main(String[] args) {
		
		// java.lang 패키지로, import문 없이 사용 가능
		String str = "홍길동";
		System.out.println(str);
		
		// java.util 패키지로, import문 추가하여 사용 가능
		Date today = Calendar.getInstance().getTime();
		System.out.println(today);
		
		System.out.println();
	}

}
