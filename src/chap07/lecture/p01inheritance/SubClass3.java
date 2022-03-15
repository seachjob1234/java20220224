package chap07.lecture.p01inheritance;

public class SubClass3 extends SuperClass3{

	public SubClass3() {
//		super(); 있으나 없으나 같음
		//상위 클래스의 기본생성자가 없으면
		//파라미터 있는 생성자를 명시적으로 호출해야함.
		super("param");
		System.out.println("Subclass3 no-args constructor");
	}
	public SubClass3(int i) {
//		super();
		super("ppp");
		System.out.println("subclass3 int-param constructor");
	}
}
