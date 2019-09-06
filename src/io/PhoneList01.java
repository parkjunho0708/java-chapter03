package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {
	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// File : 파일에 대한 정보를 담고 있는 객체
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("=========파일정보=========");
			System.out.println(file.getAbsolutePath()); // 파일의 절대경로
			System.out.println(file.length() + "bytes"); // 파일의 size
			System.out.println(new Date(file.lastModified())); // lastModified()는 날짜의 밀리세컨드의 값을 출력해줌.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified()))); // lastModified()는

			System.out.println("=========전화번호=========");
			// 기반스트림
			FileInputStream fis = new FileInputStream(file);

			// 보조스트림1(bytes->char)
			InputStreamReader isr = new InputStreamReader(fis);

			// 보조스트림2(chars\n -> String)
			br = new BufferedReader(isr);

			// read
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");
				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token);
					if(index == 0) { // 이름
						System.out.print(":");
					} else if (index == 1) { // 번호 1
						System.out.print("-");
					} else if (index == 2) { // 번호 2
						System.out.print("-");
					}
					index++;
				}
				System.out.println();
				//System.out.println(line);
			}
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
