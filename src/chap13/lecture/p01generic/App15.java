package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.Pet;

public class App15 {
	public static void main(String[] args) {
		MyClass15 o1 = new MyClass15();
		o1.<String>method1("java");
		o1.method1("java");
		
		o1.<String, Integer> method1("java",3);
		o1.method2("java",3);
	}
}


class MyClass15{
	public <T> void method1(T parem) {
		
	}
	public <T, U> void method2(T parem1, U parem2) {
		
	}
	public <T, U> U method3(T parem1) {
		return null;
	}
	public <T extends Pet> void method4(T parem1) {
		
	}
}