package chap10.lecture.p06custom;

public class App01 {
	public static void main(String[] args) {
		try {
			method1(200);
		} catch (ValueOutOfBoundsException e) {
			
//			e.printStackTrace(e.getMessage());
			e.printStackTrace();
		}
	}
	private static void method1(int value) throws ValueOutOfBoundsException {
		if (value > 100) {
			throw new ValueOutOfBoundsException("메세지 안넣으면 null");
		}
		System.out.println("실행흐름 이어감");
	}
}
