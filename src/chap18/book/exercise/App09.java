package chap18.book.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App09 {
	public static void main(String[] args) {
		String inputfile = "src/chap18/book/exercise/App09.java";
		String outputfile = "output/ExerciseOutputStreamEx02.txt";
		try(InputStream is = new FileInputStream(inputfile);
				OutputStream os = new FileOutputStream(outputfile);){
			int data1 = is.read();
			os.write(data1);
			int data2 = is.read();
			os.write(data2);
			int data3 = is.read();
			os.write(data3);
		}catch(IOException e) {
		e.printStackTrace();
		}
		System.out.println("프로그램 종료~!");
	}
}
/*public static void main(String[] args) {
	String inputFile = "src/chap18/lecture/p02outputstream/App02.java";
	String outputFile = "output/OutputStreamEx02.txt";
	
	try (InputStream is = new FileInputStream(inputFile);
			OutputStream os = new FileOutputStream(outputFile);) {
		
		int data1 = is.read();
		os.write(data1);
		
		int data2 = is.read();
		os.write(data2);
		
		int data3 = is.read();
		os.write(data3);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 종료!");
}*/