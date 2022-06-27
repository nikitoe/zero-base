package sam01;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class 날짜테스트2 {
	
	public static void p (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		Date today = Calendar.getInstance().getTime();
		p(today);
		p("--------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		p(simpleDateFormat.format(today));
		p("--------------------------");
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		p(year);
		p("--------------------------");
		
		
	}

}
