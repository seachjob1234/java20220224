package chap13.lecture.p01generic;

import chap07.lecture.p07abstract.Chihuahua;
import chap13.book.exercise.p02.Container;

public class App04 {
	public static void main(String[] args) {
		Container4<String> o1 = new Container4<String>();
		Container4<Integer> o2 = new Container4<Integer>();
		//Container4<Animal> o3 = new Container4<Animal>();
		
	//	Container4<int> o4 = new Container4<int>();//기본타입은 type parameter로 사용불가
	//8개 wrapper class를 이용	(auto boxing unboxing)
		
		Container4<Chihuahua> o4 = new Container4<>();//type parameter 생략가능(diamond)
		
	}
}

class Container4<T>{
	public void method(T param) {
		
	}
}