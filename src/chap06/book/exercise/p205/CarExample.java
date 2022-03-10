package chap06.book.exercise.p205;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car();기본 생성자는 호출할 수 없다.
		System.out.println("name :" + myCar.name);
		System.out.println("color : " +  myCar.color);
		System.out.println("cc : " +  myCar.cc);
	}
	
}
