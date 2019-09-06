package chapter03;

// 리펙토링 : 결과는 동일하게 하면서 코드를 좀 더 효율적으로 바꾸는 과정
public class Point{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(
				"점[x=" + x + ", y=" + y + "] 를 그렸습니다.");
	}

	// 메소드 오버로딩
	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println(
					"점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// hashCode()를 override를 안하면 잘못 작동할 수가 있음.
	// equals() 메소드를 실행하기 전에 hashCode()를 먼저 비교함. -> 불문율
	// hashCode()는 내용기반으로 생성이 됨.
	// hashCode()는 항상 equals() 와 같이 오버라이드를 해주어야 함.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

//	public void disappear() {
//		// TODO Auto-generated method stub
//		System.out.println(
//				"점[x=" + x + ", y=" + y + "] 를 지웠습니다.");
//	}
	
	
	
}
