package chap08.lecture.p01interface.example_class;

public class StreetCat extends Fenine implements Pet {
@Override
public void cry() {
	System.out.println("야오옹!");
}
@Override
	public void roll() {
		System.out.println("뭐시기합니다.");	
	}
	//default method  재정의 가능
	@Override
		public void sit() {
			System.out.println("무시하고 도망갑니다.");
		}
}
