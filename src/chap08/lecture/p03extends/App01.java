package chap08.lecture.p03extends;

public class App01 {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MySubInterface1 sub1 = o1;
		MySuperInterface1 super1 = o1;
		
		sub1.subMethod1();
		o1.subMethod1();
///		super1.subMethod1();//xxxx
		
		sub1.superMethod1();
		o1.superMethod1();
		super1.superMethod1();
		MySuperInterface2 super2 = o1;
		//수퍼메소드2 호출
		//o1 sub1 super1 super2
		
		o1.superMethod1();
		sub1.superMethod1();
		super2.superMethod2();
//xxxx	super1.superMethod2();//xxxxx
		
		//default method 수행가능
		o1.superDefaultMetod1();
		sub1.superDefaultMetod1();
		super1.superDefaultMetod1();
		
	}
}
