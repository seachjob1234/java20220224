package chap07.lecture.p03protected.package2;

import chap07.lecture.p03protected.package1.SuperClass1;

public class SubClass1 extends SuperClass1 { //ctrl shipt o 다른 패키지꺼 인포트 가능 인포트는 다른 패키지에 있는 클래스 빼오기 가능.
	public void subMethod1() {
		super.publicMethod();
		super.protectedMethod();//다른 페키지에 있지만 상속 받아서 사용가능
//		super.de
	}
}
