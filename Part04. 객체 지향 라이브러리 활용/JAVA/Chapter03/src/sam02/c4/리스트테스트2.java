package sam02.c4;

import java.util.*;

public class 리스트테스트2{

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		
		al.add("B");
		al.add("A");
		al.add("D");
		al.add("C");
		al.add("A");
		
		for(String x : al) {
			System.out.println(x);
		}
		
		System.out.println("==========================");
		Collections.sort(al);
		for(String x : al) {
			System.out.println(x);
		}
		

	
	}
	
}
