package chap03.book.exercise;

public class forExercise124p {
	public static void main(String[] args) {
		//2단부터 9단까지
		for (int i = 2; i < 10; i++) {
			System.out.println("***" + i +"단***");
			for (int n = 1; n < 10; n++) {
				System.out.println( i + " x " + n + "=" +(i*n));
			}
		}
		// 4x + 5y = 60
		//1 <=x,y<=10
		for (int x = 1; x <= 10; x++) {
			for (int y = 0; y <=10; y++) {
				if((4 *x)+(5*y)==60) {
					System.out.println("("+ x +", " + y + ")");
				}
			}
			
		}
		
		//9단부터 2단까지 순서도 
		for (int i = 9; i > 1; i--) {
			System.out.println("***" + i +"단***");
			for (int j = 9; j > 0; j--) {
				System.out.println(i+ " x " + j + "=" +(i*j));
			}
		}
		
		//9단 ~ 2단 
		for (int i = 9; i > 1; i --) {
			System.out.println("***" + i +"단***");
			for (int j = 1; j < 10; j++) {
				System.out.println(i+ " x " + j + "=" +(i*j));
				
			}
		}
		
	}
}
