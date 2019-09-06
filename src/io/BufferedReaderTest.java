package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	// 파일을 하나 읽어서 화면에 출력
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 기반 스트림
			fr = new FileReader("./src/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.print(index + ":");
				System.out.print(line);
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("error : " + e);
			}
		}

	}
}
