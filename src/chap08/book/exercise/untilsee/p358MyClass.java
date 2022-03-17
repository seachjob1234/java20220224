package chap08.book.exercise.untilsee;

public class p358MyClass {
	//필드
	p349RemoteControl rc = new p350Television();
	
	//생성자
	
	p358MyClass(p349RemoteControl rc){
		this.rc = rc;		
	}
	//메소드
	void methodA() {
	//로컬변수
		p349RemoteControl rc = new p351Audio();
	}
	void methodB(p349RemoteControl rc) {}
	
}
	

	
