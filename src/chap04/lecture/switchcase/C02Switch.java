package chap04.lecture.switchcase;

public class C02Switch {
	public static void main(String[] args) {
		System.out.println("stmt1");
		switch (1) {
		case 1:
			System.out.println("stmt2");
			break;
		case 2:
			System.out.println("stmt3");
			System.out.println("stmt4");
			break;
		case 3:	
			System.out.println("stmt5");
			System.out.println("stmt6");
			break;
		}
		System.out.println("stmt7");
		System.out.println("stmt8");
		System.out.println("stmt9");
	}//break는 같은케이스 만나면 그값만 빼서 연결함.
}