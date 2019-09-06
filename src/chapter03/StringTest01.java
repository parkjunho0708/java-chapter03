package chapter03;

public class StringTest01 {
	public static void main(String[] args) {
		// c:\temp
		// /temp(unix) <-> d:\temp
		//System.out.println("c:\\temp\\hello.txt");
		System.out.println("/temp/hello.txt"); // <- 윈도우는 슬래시를 역슬래시로 바꾸어줌. 그렇기 때문에 디렉토리는 슬래시로 표현하는 것이 더 좋음.
		
		// "HELLO"
		System.out.println("\"HELLO\"");
		
		// ''
		char c = '\'';
		System.out.println(c);
		
		// \t => tab
		// \n => new line
		// \r => carriage return
		
	}
}
