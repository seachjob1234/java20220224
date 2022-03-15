package chap07.book.restart;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL; //field값을 1로 초기화.
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초속음비행합니다.");
		}else {
			//Airplane  객체의 fly() 메소드 호출
			super.fly();
		}
	}
}
