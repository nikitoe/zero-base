package sam02.c4;

import java.util.*;

public class 맵테스트{

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		TreeMap<String, String> tm = new TreeMap<>();
		
		hm.put("B", "B-value");
		hm.put("A", "A-value");
		hm.put("D", "D-value");
		hm.put("C", "C-value");
		hm.put("B", "BB-value");
		
		lhm.put("B", "B-value");
		lhm.put("A", "A-value");
		lhm.put("D", "D-value");
		lhm.put("C", "C-value");
		lhm.put("B", "BB-value");
		
		tm.put("B", "B-value");
		tm.put("A", "A-value");
		tm.put("D", "D-value");
		tm.put("C", "C-value");
		tm.put("B", "BB-value");
		
		for(String key : hm.keySet()) {
			System.out.println(key + ": " + hm.get(key));
		}
		
		System.out.println("=====================");
		for(String key : lhm.keySet()) {
			System.out.println(key + ": " + lhm.get(key));
		}
		
		System.out.println("=====================");
		for(String key : tm.keySet()) {
			System.out.println(key + ": " + tm.get(key));
		}
		
		HashMap<String, Object> member = new HashMap<>();
		member.put("user_id", "superman");
		member.put("password", "1234");
		member.put("gender", "M");
		member.put("age", 20);
		member.put("using_yn", true);
		
		System.out.println("=====================");
		System.out.println("회원 아이디: "+ member.get("user_id"));
		System.out.println("성별: "+ member.get("gender"));
		System.out.println("나이: "+ member.get("age"));
	
	}
	
}
