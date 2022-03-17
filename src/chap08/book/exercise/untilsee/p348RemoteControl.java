package chap08.book.exercise.untilsee;

public interface p348RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상매소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
} //인터페이스의 메소드는 실행 블록이 필요 없는 추상 메소드로 선언.
