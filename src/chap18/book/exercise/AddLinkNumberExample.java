package chap18.book.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class AddLinkNumberExample {
	public static void main(String[] args)throws Exception {
		String filepath = "src/chap18/book/exercise/AddLineNumberExample.java";
		Reader rd = new FileReader(filepath);
		BufferedReader br = new BufferedReader(rd);
		
		String line = "";
		int lineNumber = 1;
		while((line = br.readLine()) != null) {
			System.out.println(lineNumber + ":" + line);
			lineNumber++;
		}
		
		
		
		br.close();
		rd.close();
		
	}
}
