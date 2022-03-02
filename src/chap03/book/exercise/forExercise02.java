package chap03.book.exercise;

public class forExercise02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i+=3) {
			sum += i;
			System.out.println(i);
			
		}
		System.out.println("합:" + sum);
	}
}
