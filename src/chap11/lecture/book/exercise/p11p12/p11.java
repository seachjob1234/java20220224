package chap11.lecture.book.exercise.p11p12;

public class p11 {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		//이런건 무조건 equals로 비교하자고 생각
	}
}
