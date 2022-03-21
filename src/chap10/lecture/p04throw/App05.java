package chap10.lecture.p04throw;

public class App05 {
	public static void main(String[] args) {
		method1();
		System.out.println("프로그램 계속..");
	}
	private static void method1() {
		method2();
		System.out.println("메소드1 계속..");
	}
	private static void method2() throws Exception {
		method3();//트라이 캐치 안쓸거면 exception쓴다고 명시
		System.out.println("메소드2 계속..");
	}
	private static void method3() throws Exception{
		throw new Exception();//exception을 발생시킬수 있으면
							 //try/catch짜서 명시 
							//아니면 익셉션이 발생한다고 명시.
	}
}
