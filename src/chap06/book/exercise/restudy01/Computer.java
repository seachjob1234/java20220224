package chap06.book.exercise.restudy01;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int... Values) {
		int sum = 0;
		for(int i = 0; i < Values.length; i++) {
			sum += Values[i];
		}
			return sum;
	}
	
}
