package chapter03;

import java.util.Scanner;

// try catch는 어떤 로직을 완성하기 위해 사용해서는 안된다!!
// code도 복잡해지고 가독성이 떨어짐.
public class NumericStringTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		// \d (0~9)를 의미 
		// Integer를 의미하는 정규표현식
		if (s.matches("-?\\d+") == false) {
			System.out.println("숫자만 입력해야 합니다.");
			return;
		}

		int value = -1; // local variable needs to be initialize
		value = Integer.parseInt(s);
		
//		try {
//			value = Integer.parseInt(s);
//			System.out.println(value);
//		} catch (NumberFormatException e) {
//			System.out.println("숫자만 입력해야 합니다.");
//			return;
//		}
		System.out.println(value);
	}
}
