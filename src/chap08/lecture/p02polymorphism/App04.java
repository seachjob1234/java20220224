package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		Pet pet1 = chihuahua;
		
		StreetCat streetcat = new StreetCat();
		Pet pet2 = streetcat;
		
		pet1.roll();
		pet2.roll();
		
		Tiger tiger= new Tiger();
	//	Pet pet3 = tighr;//xxx
		
		Wolf wolf = new Wolf();
	//	Pet pet4 = Wolf;//xxx
		
		method(pet1);
		method(pet2);
		method(new Chihuahua());
		method(new StreetCat());
		
	}
	
	public static void method(Pet pet) {
		pet.roll();
	}
	
}
