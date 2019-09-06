package collection;

import java.util.HashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<Money> s = new HashSet<Money>();
		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		s.add(new Money(1));
		
		// hashCode, equals를 완벽하게 override 해주어야 함.
		
		for(Money m : s) {
			System.out.println(m);
		}
	}
}
