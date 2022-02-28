package chap04.lecture.switchcase;

public class C01Switch {

	public static void main(String[] args) {
		
		System.out.println("stmt1");
		switch(2) {
		case 1:
			System.out.println("stmt2");
		case 2:
			System.out.println("stmt3");
		case 3:
			System.out.println("stmt4");
		}
		
		System.out.println("stmt5");
		//switch는 값을 정하고 케이스가 맞을때 그 케이스 부터 수행
	}
}