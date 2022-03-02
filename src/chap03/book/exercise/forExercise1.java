package chap03.book.exercise;

public class forExercise1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("1~100의 합 :" +sum);
		
		for(int i = 3; i<=100; i += 3) {
			sum += i;
		}
		System.out.println("3의 배수의 합 100까지" + sum);
	}
}
