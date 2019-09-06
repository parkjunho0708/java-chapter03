package chapter03;

public class ObjectTest02 {
	public static void main(String[] args) {
		// 모든 객체들은 Object 클래스의 상속을 받은 형태로 만들어져 있다.
		// hashCode는 address 기반으로 hashing
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성(내용비교)
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		// String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " : " + s2.hashCode()); // 내용 기반으로 비교
		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2)); // 주소 기반으로 비교
		
		System.out.println("======= String ========");
		
		// === 결론은 이 방식으로 사용하는 게 좋음 ===
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " : " + s4.hashCode()); // 내용 기반으로 비교
		System.out.println(System.identityHashCode(s3) + " : " + System.identityHashCode(s4)); // 주소 기반으로 비교
		
//		System.out.println("======= Integer ========");
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(10);
//		System.out.println(i1 == i2);
//		System.out.println(i1.equals(i2));
		
		//String equals 좋은 코드
		String s = null;
		System.out.println(equalsHello(s));

	}
	
	public static boolean equalsHello(String s) {
		//return s.equals("hello"); // java.lang.NullPointerException 이 발생
		return "hello".equals(s); // 정상적으로 true, false 출력
	}
}
