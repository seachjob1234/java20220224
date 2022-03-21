package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";

		int i = Integer.parseInt(s);
		// NumberFormatException 발생가능
		// NumberFormatException은 RuntimeException(unchecked exception)
		// 이어서 컴파일러가 검사안함

		try {
			FileReader fr = new FileReader("");
			// fileNotFoundException 발생가능
			// fileNotFoundException은 RuntimeException을 상속받지 않았음(check exception)
			// 그래서 컴파일러가 검사함(check)

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
