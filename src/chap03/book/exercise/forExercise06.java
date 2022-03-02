package chap03.book.exercise;

public class forExercise06 {
	public static void main(String[] args) {
		String star ="*";
		
		for (int i=0;i<5;i++) {
			System.out.println(star);
			star += "*";
			
		}
		System.out.print("출력1(끝에 enter없이)");
		System.out.print("출력1");
		System.out.print("출력2");
		System.out.println();
		System.out.print("출력3");
		System.out.println("출력4");
		System.out.println("출력5");
		
		//enter없이 출력 가능 ln삭제
		//그냥 한줄 내리고 싶다. 파라미터 없이 쓰면 다음줄
		
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
