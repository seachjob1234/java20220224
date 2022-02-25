package chap03.book.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		int pencils = 534;
		int student = 30;
		
		//학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = (pencils / student);
		System.out.println(pencilsPerStudent);
		
		//남는 연필 수
		
		int pencilsLeft  = (pencils % student);//변수 바꾸고 싶을 때 ctrl 1 
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value - 56);
		System.out.println(value / 100 * 100);
		System.out.println(value - (value % 100));
		
		int lengthtop = 5;
		int lengthbottom = 10;
		int height = 7;
	//	double area = ((lengthtop + lengthbottom)*7 / 2);//
		double area = (lengthtop + (double) lengthbottom) * height / 2; //0r 2를 2.0으로 더블 연산자로 변환하던지.
		
		System.out.println(area);
		
		
		
	}
}
