package chap11.lecture.book.exercise.p274;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용 1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용 2");
	}
	@PrintAnnotation(value = "#", number= 20)
	public void method3() {
		System.out.println("실행 내용 3");
	}
}