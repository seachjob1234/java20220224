package chap05.lecture.enum_time;

public class App04 {
	public static void main(String[] args) {
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		//java.lang.Enum클래스 상속
		
		//ordinal메소드
		System.out.println(s1.ordinal());
		System.out.println(s2.ordinal());
		System.out.println(s3.ordinal());
		System.out.println(s4.ordinal());
	
		//name 메소드
		//toString 메소드
		String str1 = s1.toString();
		System.out.println(str1);
		System.out.println(s2);
		
		//valueOf 메소드 (String => enum으로 변환)
		Season s5 = Season.valueOf("SUMMER");
		
		//values() enum의 모든 상수를 배열로 리턴
		Season[] arr = Season.values();
		System.out.println(arr.length);
		
		
	}
}
