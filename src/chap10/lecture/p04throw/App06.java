package chap10.lecture.p04throw;

import java.io.FileReader;

public class App06 {
	public static void main(String[] args) {
		method1();
	}
	private void method1() throws FileNotFoundException,IOException{
		FileReader fr = new FileReader("");
		fr.read();
	}
}
