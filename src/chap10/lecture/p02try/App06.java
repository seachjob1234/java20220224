package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 0 };

		try {
			int r = arr1[0] / arr1[2];
			System.out.println(r);
		} catch (RuntimeException e) {
			System.out.println("런타입 익셉션발생");
		}
		System.out.println("프로그램 실행 계속");
		//다른일을 하고 싶으면 캐치를 따로 잡아야.
	}
}
