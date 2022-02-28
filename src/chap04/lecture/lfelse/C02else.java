package chap04.lecture.lfelse;

public class C02else {
	public static void main(String[] args) {
		System.out.println("statement1");
		if(true) {
			System.out.println("statement2");
			System.out.println("statement3");
		}else {
			System.out.println("statement4");
			System.out.println("statement5");
		}
		System.out.println("statement6");
		System.out.println("statement7");
	}//if가 true일때 else는 수행안됨
		//if가 false 일때 else 수행됨

}
