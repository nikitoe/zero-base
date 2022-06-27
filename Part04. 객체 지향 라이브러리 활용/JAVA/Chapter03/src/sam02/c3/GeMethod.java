package sam02.c3;

public class GeMethod {

	/*
	 * public <T>void print(T[] item) { for(int i = 0 ;i < item.length;i++) {
	 * System.out.println(item[i]); } }
	 */

	public static <E> void print(E[] item) {
		for (int i = 0; i < item.length; i++) {
			System.out.println(item[i]);
		}
	}

	public static <T extends String> void firstStringPrint(T str) {
		
		if(str.length() > 0) {
		System.out.println(str.charAt(0));
		}
	}

	
	public static <T extends Person>void displayAge(T item) {
		System.out.println(item.getAge());
	}
	/*
	 * public void print(String[] item) { for(int i = 0 ;i < item.length;i++) {
	 * System.out.println(item[i]); } }
	 * 
	 * public void print(Double[] scores) { for(int i = 0 ;i < scores.length;i++) {
	 * System.out.println(scores[i]); } }
	 */

}
