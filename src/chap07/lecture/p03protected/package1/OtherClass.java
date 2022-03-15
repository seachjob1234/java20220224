package chap07.lecture.p03protected.package1;

public class OtherClass {
	public static void main(String[] args) {
		SuperClass1 p1 = new SuperClass1();
		p1.publicMethod();
		p1.protectedMethod();
		p1.defaultMethod();
	}
}
