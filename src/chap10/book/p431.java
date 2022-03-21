package chap10.book;

public class p431 {
	public static void main(String[] args) {
		String data1 = "a";
		String data2 = "3";
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCtchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		}finally {
			System.out.println("숫자로 변환하세요.");
		}
		
	}
}
