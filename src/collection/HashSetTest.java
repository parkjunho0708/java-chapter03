package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		String s1 = new String("고길동");
		String s2 = new String("고길동");

		set.add("둘리");
		set.add("마이콜");
		set.add("둘리");
		set.add(s1);
		//set.add(s2);
		
		//주소가 아니라 값을 기반으로 비교
		//s1 안에 "고길동"이 존재함.
		System.out.println(set.contains("고길동"));
		System.out.println(set.contains(s2));
		
		set.remove(s2);
		
		// 순회
		for(String s : set) {
			System.out.println(s);
		}
		
	}
}
