package chap18.book.exercise;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class App03 {
	public static void main(String[] args)throws Exception {
		String path = "src/chap18/book/exercise/App03.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[100];//100의 byte를 읽어서 넣어줌
		is.read(datas);
		System.out.println(Arrays.toString(datas));
		
		is.read(datas);
		System.out.println(Arrays.toString(datas));
		
		is.read(datas);
		System.out.println(Arrays.toString(datas));
	}
}




/*public class App03 {
public static void main(String[] args) throws Exception {
	String path = "src/chap18/lecture/p01inputstream/App03.java";
	InputStream is = new FileInputStream(path);
	
	byte[] datas = new byte[100];
	is.read(datas);//100개의 byte를 읽어서 넣어줌
	System.out.println(Arrays.toString(datas));
	
	is.read(datas);
	System.out.println(Arrays.toString(datas));
	
	is.read(datas);
	System.out.println(Arrays.toString(datas));
}
}*/
