package chap08.book.exercise.untilsee;

public interface p348_remote {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMote(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음해제합니다.");
		}
	}
	
}
