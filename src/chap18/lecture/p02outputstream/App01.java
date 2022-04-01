package chap18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
	public static void main(String[] args) {
		//outputstream / byte 단위 출력할 때 사용하는 클래스
		String filename = "output/OutputStreamEx01.txt";

		try (OutputStream os = new FileOutputStream(filename);) {

			os.write(99);//1.byte 쓰기
			os.write(999999999);//1byte 쓰기
			os.write(979797979);//1byte 쓰기
		} catch (IOException e) {
			e.printStackTrace();
		}

		//	os.close();
		System.out.println("프로그램 종료...");
	}
}
