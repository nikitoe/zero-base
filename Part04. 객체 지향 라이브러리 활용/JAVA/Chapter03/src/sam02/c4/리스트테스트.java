package sam02.c4;

import java.util.*;

public class 리스트테스트{

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		al.add("B");
		al.add("A");
		al.add("D");
		al.add("C");
		al.add("A");

		ll.add("B");
		ll.add("A");
		ll.add("D");
		ll.add("C");
		ll.add("A");
		
		for(String x : al) {
			System.out.println(x);
		}
		
		System.out.println("====================");
		for(String x : ll) {
			System.out.println(x);
		}
		
	
	}
	
}
