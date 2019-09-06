package chapter03;

public class Singleton {
	private static Singleton instance;
	
	// 기본 생성자를 private으로 만들어야 함.
	private Singleton() {
		
	}
	
	// Singleton 메소드를 통해서만 Singleton 객체를 부를 수 있음.
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
