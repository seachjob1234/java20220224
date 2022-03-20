package chap09.lecture.p01nested;

public class MyClass5 {
	void method1() {
		//local class
		class LocalClass1{
			//로컬 클래스에서 스태특맴버 사용불가
			int field;
		//	static int field2;//xxx
			
			void method1() {
				
			}
		//	static void method2() {///xxx
				
			}
		}
	}

