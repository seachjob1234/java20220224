package chap04.lecture.lfelse;

public class C03elseif {
	public static void main(String[] args) {
		System.out.println("statement1");
		if(false) {
			System.out.println("statement2");
		}else if(true) {
			System.out.println("statement3");
		}else {
			System.out.println("statement4");
		}//위에가 다false일때 사용되는 것 else.	
		System.out.println("statement5");
		System.out.println("statement6");
		System.out.println("statement7");
		System.out.println("statement8");
	}
}
