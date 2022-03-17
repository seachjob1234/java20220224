package chap08.book.exercise.untilsee;

public class p359RemoteControlExample {
	public static void main(String[] args) {
		
		p349RemoteControl rc = null;
		
		rc = new p350Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new p351Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
