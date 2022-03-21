package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
	//하나 try 블럭 사용
	//여러 catch블럭사용
	//컴파일 오류 해결
	try {
	FileReader fr = new FileReader("");	
	fr.read();
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}
