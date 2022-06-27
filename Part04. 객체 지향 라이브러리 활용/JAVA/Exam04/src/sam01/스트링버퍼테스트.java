package sam01;

public class 스트링버퍼테스트 {

	public static void p(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		/*
		StringBuffer sb = new StringBuffer();
		sb.append("홍길동")
				.append(System.lineSeparator()) // 시스템 줄을 바꿔준다.
				.append("학생")
				.append(System.lineSeparator())
				.append(20);

		p(sb);
		*/
		
		String name = "홍길동";
		String job = "학생";
		int age = 20;
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(String.format("이름: %s", name))
				.append(System.lineSeparator()) // 시스템 줄을 바꿔준다.
				.append(String.format("직업: %s", job))
				.append(System.lineSeparator())
				.append(String.format("나이: %d", age));

		p(sb2);
		p("-----------------------------");
		
		// sb2.appendLine();
		// sb2.appendFormat();
		
		StringPlus sp = new StringPlus();
		// sp.append(String.format("이름: %s", name));
		sp.appendFormat("이름: %s", name)
					.line()
					.appendFormat("직업: %s", job)
					.line()
					.appendFormat("나이: %d", age);	

		p(sp.toString());
		
	}

}
