package chapter03;

import java.util.HashSet;

public class ObjectTest03 {
	public static void main(String[] args) {
		HashSet<Point> set = new HashSet<Point>();
		
		// hashCode()를 이용해서 비교하지 않으면, 주소기반으로 비교를 하기 때문에, 10번줄과 12번줄을 다르게 인식함
		set.add(new Point(10, 20));
		set.add(new Point(20, 10));
		set.add(new Point(10, 20));
		
		System.out.println(set);
	}
}
