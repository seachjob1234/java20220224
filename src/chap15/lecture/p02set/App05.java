package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App05 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("java");
		set1.add("java");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		set2.add(new Car("tesla"));
		set2.add(new Car("tesla"));
		System.out.println(set2.size());//2
		System.out.println(set2);
	}
}

class Car {
	private String model;

	Car(String model) {
		this.model = model;
	}
}
