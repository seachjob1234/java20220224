package chap06.lecture.p04method;

public class App04 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int res = c1.plus(10,20);
		//사용할때는 변수에 담아야
		//변수에 담지않으면 리턴 사용 값을 못써.
		
		System.out.println(res);
		System.out.println(c1.plus(30, 40));
	}
}
