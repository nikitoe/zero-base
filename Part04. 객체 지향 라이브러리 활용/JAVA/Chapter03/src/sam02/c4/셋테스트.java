package sam02.c4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class 셋테스트{

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		LinkedHashSet<String> lsh = new LinkedHashSet<>();
		TreeSet<String> ts = new TreeSet<>();
		
		// key 값이 중복 안되게
		hs.add("4");
		hs.add("3");		
		hs.add("2");		
		hs.add("1");		
		hs.add("4");
		
		// 넣는 순서대로
		lsh.add("4");
		lsh.add("3");
		lsh.add("2");
		lsh.add("1");
		lsh.add("4");
		
		// 정렬
		ts.add("4");
		ts.add("3");
		ts.add("2");
		ts.add("1");
		ts.add("4");
		
		Iterator<String> hsi = hs.iterator();
		while(hsi.hasNext()) {
		System.out.println(hsi.next());
		}
		
		System.out.println("=====================");
		Iterator<String> lshi = lsh.iterator();
		while(lshi.hasNext()) {
		System.out.println(lshi.next());
		}
		
		System.out.println("=====================");
		Iterator<String> tsi = ts.iterator();
		while(tsi.hasNext()) {
		System.out.println(tsi.next());
		}
	}
}
