package chap08.book.exercise.untilsee;

public class p351Audio implements p349RemoteControl {
	//필드
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}
	@Override
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
