package chap07.lecture.p06polymorphism_class;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App08 {
	Animal animal = new Chihuahua();
	animal.breathe();
	animal.cry();
	
	//angry 메소드 실행하고 싶다.
	Chihuahua chihuahua = (Chihuahua) animal();//강제 형변환
	chihuahua.angry();
	
}
