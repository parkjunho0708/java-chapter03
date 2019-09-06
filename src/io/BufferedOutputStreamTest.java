package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림(소스에 연결)
			fos = new FileOutputStream("test.txt");
			
			// 보조 스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos); // 보조스트림의 생성자에 기반스트림을 인자로 전달
			
			// a는 ascii 코드로 97 ~ 122
			for(int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		}finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				System.out.println("error : " + e);
			}
		}
	}
}
