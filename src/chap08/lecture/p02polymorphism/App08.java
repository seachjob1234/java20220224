package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App08 {
	public static void main(String[] args) {
		//instanceof
		
		Animal animal1 = new Retriever();
		
		System.out.println(animal1 instanceof Retriever);//true
		System.out.println(animal1 instanceof Animal);//true
		System.out.println(animal1 instanceof Canine);//true
		System.out.println(animal1 instanceof Fenine);//false
		System.out.println(animal1 instanceof Pet);//true
		System.out.println(animal1 instanceof Helper);//true
		
		
		if(animal1 instanceof Helper) {
			Helper helper = (Helper) animal1;
			helper.help();
		} //instanceof는 왼쪽에 있는 인스턴스가 오른쪽에 있는 인스턴스를 해당하는지 안하는지 감정시킨다.
		
		
		
	}
}
