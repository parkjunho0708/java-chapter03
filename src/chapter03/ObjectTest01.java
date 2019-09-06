package chapter03;

public class ObjectTest01 {
	public static void main(String[] args) {
		// 모든 객체들은 Object 클래스의 상속을 받은 형태로 만들어져 있다.
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); //reflection
		System.out.println(p.hashCode()); // address (X)
																	// reference (X)
																	// address 기반의 hashing 값
		// hashing 이란?
		// "abcdef" -----|
		// 'c'            -----|----- 이런 여러 값을 int형으로 바꾸는 것
		// boolean  -----|
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		
		String s = "Hello World";
	}
}
