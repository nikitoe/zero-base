package sam01;

public class 문자열테스트 {
	
	public static void p (Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		
		String url = " https://FastCampus.co.kr/";
		
		final String FS = " https://fastcampus.co.kr/";
		
		// length()
		int length = url.length();
		p("문자열 길이: " + length);
		p("------------------------");
		
		// charAt()
		for(int i = 0 ;i < url.length();i++) {
			p(url.charAt(i));
		}
		p("------------------------");
		
		// toCharArray()
		for(char c1 : url.toCharArray()) {
			p(c1);
		}
		p("------------------------");
		
		// contains(), indexOf() - 앞에서 부터 찾음, lastIndexOf - 뒤에서 부터 찾음
		p(url.contains("http"));
		p(url.indexOf("http"));
		p(url.lastIndexOf("http"));
		p("------------------------");
		
		// toLowerCase(), toUpperCase(), trim()
		p("[" + url + "]");
		p("[" + url.trim() + "]");	// 맨 앞, 뒤의 공백 제거
		p(url.toLowerCase());
		p(url.toUpperCase());
		p("------------------------");
		
		// equals(), equalsIgnoreCase()
		p(url.equals(FS));	// 대소문자 구분
		p(url.equalsIgnoreCase(FS));	// 대소문자 구분 안함
		p("------------------------");
		
		
		// split()
		String url2 = "https://www.naver.com/news/tv/sbs";	
		// news, 	tv, 	sbs
		// 분류, 		매체, 	방송국
		// new,		radio,	kbs
		
		String[] url2List = url2.split("/");
		for(String u : url2List) {
			p(u);
		}
		
		// replace(), replaceAll()
		p(url2);
		p(url2.replace("https://www.naver.com/",""));
		
		
		String[] url3List = url2.replace("https://www.naver.com/","").split("/");
		for(String u : url3List) {
			p(u);
		}
		p("분류: " + url3List[0]);
		p("매체: " + url3List[1]);
		p("방송국: " + url3List[2]);
		p("------------------------");
		
		// concat()
		// mariadb, mysql 문자열 조합일때, concat('a', 'b', 'c')
		// Oracle -> 'a' || 'b' || 'c'
		// MSSQL -> 'a' + 'b' + 'c'
		p(url2.concat("/index.html"));
		p("------------------------");
		
		//substring()
		p(url);
		p(url.substring(9,19));
		p("------------------------");
		
		// valueOf() , 
		// String.valueOf(), 입력값에 대해 문자열로 return 한다.
		// Integer.valueOf(), 입력값에 대해 int형으로 return 한다.
		String v1 = String.valueOf(12);
		String v2 = 12 + "";
		
		int n1 = Integer.valueOf(v1);
		p("------------------------");
		
		//compareTo
		//사전적위치로 앞에있으면	, 양수
		//사전적위치로 뒤에 그외에 있으면	, 음수
		//0		, 동일한 경우	
		String str2 = "홍길동";
		String str3 = "이순신";
		p(str2.compareTo(str2));
		p(str2.compareTo(str3));
		p(str3.compareTo(str2));
	}

}
