package chap07.book.exercise.p310;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}//부모 타입은 자식에서 재정의
	
	public void method3() {
		System.out.println("child-method3()");
	}
}
