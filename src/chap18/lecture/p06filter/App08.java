package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);

		Writer opw = new OutputStreamWriter(os);
		Writer bfw = new BufferedWriter(opw);
		
		for (int i = 0; i < 10000000; i++) {
			bfw.write("천만번");
		}
	

		
		bfw.close();
		
		System.out.println("끝");
	}
}
