package sam01;

import java.util.Date;
import java.util.Calendar;

public class Sample2 {
	
	public static boolean isHongildong(String str) {
		
		// if( str != null && str.equals("홍길동"))과 같은 의미
		if(str.equals("홍길동")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "이순신";
		String str3 = null;
		
		System.out.println(isHongildong(str1));
		System.out.println(isHongildong(str2));
		System.out.println(isHongildong(str3));
		
	}

}
