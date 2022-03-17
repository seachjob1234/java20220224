package chap08.book.exercise.untilsee;

public class p362RemoteControlExample {
	public static void main(String[] args) {
		p349RemoteControl rc= null;
		
		rc = new p350Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new p361Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
