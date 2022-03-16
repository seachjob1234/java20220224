package chap07.book.exercise.p314_320;

public class KumhoTire extends Tire {
//필드
//생성자
public KumhoTire(String location, int maxRotation) {
	super(location, maxRotation);
	
}
@Override
	public boolean roll() {
	++accumulatedRotation;//누적회전수 1 증가
	if(accumulatedRotation < maxRotation) {
		System.out.println(location + " tire 수명 :" + 
	(maxRotation - accumulatedRotation) + "회");
		return true;
	}else {
		System.out.println("***" + location + "tire 펑크 ***");
		return false;
	}
}
}
