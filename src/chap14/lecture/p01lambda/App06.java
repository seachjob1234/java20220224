package chap14.lecture.p01lambda;

public class App06 {
	public static void main(String[] args) {
		int local = 0; //final of effectivley final
		MyInterface6 o1 = new MyInterface6() {
			@Override
			public void method1() {
					System.out.println(local);
			}
		};
	//	local = 4;
	//	local = 5;
		MyInterface6 o2 = ()-> System.out.println(local);
	}
}
@FunctionalInterface
interface MyInterface6{
	void method1();
}