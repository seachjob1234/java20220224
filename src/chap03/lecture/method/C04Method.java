package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
		myMethod1(3,5);
		//파라미터 값에 두 개 넣었으면 무조건 두 개
		//ex myMethod1(3); x ,myMethod(); x
		myMethod1(33,55);
		myMethod1('가',35);
		
		myMethod2(999,888);
	}
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
		
	}
	//파라미터명 :lowerCamelCase
	//ctrl 1로 수정
	public static void myMethod2(int age, int height) {
		System.out.println(age * 2);
		System.out.println(height * 2);
	}
	
	public static void myMethod3(int j, boolean b, long l, double d) {
		
	}
	
}
