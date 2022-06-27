package sam02.c4;

import java.util.*;

public class Student implements Comparable<Student>{

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return o.no - this.no;
	}
	
	@Override
	public String toString() {
		return String.format("학번: %d, 이름: %s", no, name);
	}
	
}
