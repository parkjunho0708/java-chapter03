package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest0 {
	public static void main(String[] args) {
		// Vector : 다른 타입을 저장한다는 개념?
		Vector<String> v = new Vector<String>();
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		// 순회1
		int count = v.size();
		for(int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		v.removeElementAt(1);
		System.out.println();
		
		// 순회2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}
}
