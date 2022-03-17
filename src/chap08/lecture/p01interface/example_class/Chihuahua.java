package chap08.lecture.p01interface.example_class;

public class Chihuahua extends Canine implements Pet {

	@Override
	public void cry() {
		System.out.println("멍멍!!");
	}
	
	@Override
	public void roll() {
		System.out.println("물어버립니다.");	
	}
	//추상메소드X 하지만 카니네가  추상메소드가 있으니 abstract를 넣어라.
}
