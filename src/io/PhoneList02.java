package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
	public static void main(String[] args) {
		Scanner scanner = null;
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

			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String name = scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();

				System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);
			}
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
