package chap14.book.exercise;

import java.util.function.IntSupplier;

public class p04 {
	public static int method(int x, int y) {
		IntSupplier supplier = ()-> {
			//final이라 정해진 값을 다시 바꿀 수없대.값은 고정
			//참고로 int x 가 정해진 값.
	//		x *= 10;
			int result = (x * 10) + y ;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
}
