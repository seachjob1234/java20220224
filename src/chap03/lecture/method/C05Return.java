package chap03.lecture.method;

public class C05Return {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		System.out.println("명령문2");
		int i =myMethod2();
		System.out.println("명령문3");
		System.out.println(i);
		
	}
	public static void myMethod1() {
		System.out.println("my method1 명령문1");
		System.out.println("my method2 명령문2");
		
		//return 키워드
		//method 종료, 오른쪽에 있는 값 호출한 곳으로 return
		
		return;
		
		//System.out.println("my method 명령문3");//unreachable code 왜냐면 리턴으로 메소드를 끝냈거든. 
	}
	
	public static int myMethod2() {
		//메소드명 앞에 return하는 랎의 타입을 명시해야함.
		//만약 리턴하는 값이 없으면 void로 명시
		System.out.println("my method2 명령문1");
		return 3; 
	}
	
}
