package chap07.lecture.p06polymorphism_class;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		//angry 메소드 실행원해
		Chihuahua chihuahua = (Chihuahua) animal;//classcastexception발생
		chihuahua.angry();
		//가
		//강제 형변환(casting)는 매우 주의해서 작성해야함.
		
		System.out.println("명령문 진행 계속..............");
	}
}
