package chap07.lecture.p06polymorphism_class;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App07 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		chihuahua.breathe();
		chihuahua.cry();
		chihuahua.angry();
		
		Animal animal = chihuahua;
		animal.breathe();
		animal.cry();
//		animal.angry();.animal//xx cuz 에니멀이 치와와가 아니니까.
		
	}
}
