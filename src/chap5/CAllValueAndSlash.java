package chap5;

public class CAllValueAndSlash {
	public static void main(String[] args) {
		int[][] array = {{ 95, 86 }, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i< array.length ; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}
}
