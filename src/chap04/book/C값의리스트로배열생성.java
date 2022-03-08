package chap04.book;

public class C값의리스트로배열생성 {
	public static void main(String[] args) {
		int[] score;
		score = new int [] { 83, 90, 87 };
		int sum1 = 0;
		for(int i = 0; i<3; i++) {
			sum1 += score[i];
		}
		System.out.println(" 총합 : " + sum1);
		//리턴된 총 합을 sum2에 저장
	}
}
