package chap05.book;

public class C향상된for문 {
	public static void main(String[] args) {
		int[]score = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for(int scores : score) {
			sum = sum + scores;
		}
		System.out.println(" 점수 총합 : " +sum);
		
		double avg = (double) sum / score.length;
		System.out.println(" 점수 평균 : " +avg);
		
	}
}
