package sam01;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class 날짜테스트 {
	
	public static void p (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		p(localDate);
		
		LocalTime localTime = LocalTime.now();
		p(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		p(localDateTime);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		p(localDateTime.format(dateTimeFormatter));
	
		
		p(localDateTime
				.plusYears(1)
				.plusMonths(1)
				.plusDays(1)
				.format(dateTimeFormatter));
	}

}
