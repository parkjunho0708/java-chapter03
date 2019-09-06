package chapter03;

public class WrapperClassTest {
	public static void main(String[] args) {
		Integer i = new Integer(10); // 원래는 이게 맞지만 이렇게 하지 말아라!!
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		//Auto Boxing : 객체로 둘러싸줌.
		Integer i2 = 10; // JVM Constant Pool을 타서 new가 될 수도 있음.
		Integer i3 = 20;
		System.out.println(i2 == i3);
		
		// Auto Unboxing
		//int j = 20 + i2.intValue();
		int j = 20 + i2;
		
		// Auto Boxing과 Auto Unboxing이 자동으로 일어나기 때문에, 그냥 기본타입으로 써도 무방함.
		
		
	}
}
