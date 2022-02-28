package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		myMethod1(300);
		System.out.println("명령문2");
		myMethod1(3);
		System.out.println("명령문3");
	
	
	
	
	
	
	
	}
	
	//()메소드명 lowerCameCcase 복합 단어일 경우 두 번째 단어부터 대문자로 
	//()파라미터 타입과 명과 이름 작성 가능
	//파라미터 생성 했을 때 맞는 값을 넣어야돼
	public static void myMethod1(int i) {
		System.out.println("마이메소드1");
		System.out.println("파라미터 i의 값:i" + i);
	}
}
