package chap07.book.restart;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("computer 객체의 areCircle() 실행");
		return Math.PI * r * r;
	}
}
