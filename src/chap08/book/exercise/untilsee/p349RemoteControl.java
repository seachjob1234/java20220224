package chap08.book.exercise.untilsee;

public interface p349RemoteControl {
	//상수
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴드 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다");
		}else {
			System.out.println("무음해제 합니다");
		}
	}
	
	//정적 메소드
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
}
