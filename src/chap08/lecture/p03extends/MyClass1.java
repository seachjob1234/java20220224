package chap08.lecture.p03extends;

public class MyClass1 implements MySubInterface1 {
//인스턴스 만들 의향 없으면 abstract로 고정.

	
	
	@Override
	public void subMethod1() {
		System.out.println("서브 인터페이스 메소드 재정의");
		}
	@Override
	public void superMethod1() {
		System.out.println("수퍼 인터페이스 메소드 정의");
		
		}
	@Override
		public void superMethod2() {
		System.out.println("수퍼인터페이스 메소드 재정의222222222");
			
		}
	@Override
		public void superDefaultMetod1() {
		System.out.println("수퍼 인터페이스 메소드 재정의333333");
		}
		
	
}
