package chap08.book.exercise.untilsee;

public class p350Television implements p349RemoteControl {
	//필드
	private int volume;
	
	//turnOn()추상메소드의 실체 메소드
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}
	//turnOff()메소드의 실체 메소드
	public void turnOff(){
		System.out.println("tv를 끕니다.");
	}
	//setVolume() 추상메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>p349RemoteControl.MAX_VOLUME) {
			this.volume = p349RemoteControl.MAX_VOLUME;
		}else if(volume < p349RemoteControl.MIN_VOLUME) {
			this.volume = p349RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨:" + this.volume);
	}
}
