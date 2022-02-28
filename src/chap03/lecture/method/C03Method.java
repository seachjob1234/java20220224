package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300);
		myMethod1(900);
		//myMethod1(3.14); 파라미터 값에 맞는거만 넣을 수 있어
		myMethod1('가');
		
		int j = 999;
		myMethod1(j);
		//파라미터에 적절한 값 가능.
		//파라미터는 0개 이상 가능.
	}
	
	public static void myMethod1(int i) {
		
		System.out.println(i);
	}
}
