package chapter03;

public class StringTest02 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;

		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");

		// String s6 = "!!".toString();

		// method chain
		String s5 = "!!".concat(s2).concat("@"); // 메소드 체이닝(연결)이 가능함
		// System.out.println(s5);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
