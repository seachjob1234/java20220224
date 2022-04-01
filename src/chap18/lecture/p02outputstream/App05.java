package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App05 {
	public static void main(String[] args) {
		String path = "output/OutputStreamEx05.txt";
		try (OutputStream os = new FileOutputStream(path);) {

			byte[] data = { 3, 9, -120, 127, 99, 98, 12 };

			os.write(data, 0, 3);//3,9,-120
			os.write(data, 1, 4);//9,-120,127,99

			//첫번째는 배열 두번째는 위치 세번째는 길이
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("쓰기 종료!");
		try(InputStream is = new FileInputStream(path)){
			
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			System.out.println((byte) is.read());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}







