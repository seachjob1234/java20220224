package chap08.book.exercise.untilsee;

public class p361Audio implements p349RemoteControl{
	//필드
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
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
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다");
		}else {
			System.out.println("무음해제 합니다");
		}
	}
}