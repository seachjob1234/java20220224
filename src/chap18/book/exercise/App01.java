package chap18.book.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class App01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/chap18/book/exxercise/App01.java";
		//inputstream : 데이터 입력 처리 클래스
		InputStream is = new FileInputStream(fileName);
		//read : 한 바이트를 읽는 메소드
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
	}
}










/*public class App01 {
	public static void main(String[] args)throws Exception {
		String fileName = "src/chap18/lecture/p01inputstream/App01.java";
		
		//inputstream : 데이터 입력 처리 클래스
		InputStream is = new FileInputStream(fileName);
	
		//read : 한 바이트 읽는 메소드
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		
	}
}*/
