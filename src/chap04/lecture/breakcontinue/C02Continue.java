package chap04.lecture.breakcontinue;

public class C02Continue {
	public static void main(String[] args) {
		
		System.out.println("stmt1");
		for(int i =0;i <10; i++) {
			System.out.println("stmt2");
			if(true) {
				continue;
			}//스테이트2만 10번 반복
			System.out.println("stmt3");
		
		}
		System.out.println("stmt4");
	}
}
