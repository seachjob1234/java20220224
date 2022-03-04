package chap5.lecture.rettype;

public class C07ReferenceType {
	public static void main(String[] args) {
		int i1 =3;
		method1(i1);
		System.out.println(i1);
	}
	
	public static void method1(int i) {
		i = 300;
	}
	
}
