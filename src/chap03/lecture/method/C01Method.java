package chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		
		
		System.out.println("명령문1");
		mymethod1();
		System.out.println("명령문2");
		
		
		
		mymethod1();	//메소드 호출
		System.out.println("명령문3");
	}
	
	//메소드 정의
	//작성된 메소드는 여러번 호출 가능
	public static void mymethod1() {
		System.out.println("마이메소드1");
		System.out.println("마이메소드2");
		
	}
	
}
