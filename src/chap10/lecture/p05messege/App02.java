package chap10.lecture.p05messege;

public class App02 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void method1() throws Exception {
		throw new RuntimeException("사용자 메세지#@$!@$@");
	}
}	
