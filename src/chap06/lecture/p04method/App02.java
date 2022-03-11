package chap06.lecture.p04method;

public class App02 {
	public static void main(String[] args) {
		Worker s1 = new Worker("킹갓왕짱");
		Worker s2 = new Worker("왕짱풀");	
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		s1.work();
		s2.work();
	}
}

