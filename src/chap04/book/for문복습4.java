package chap04.book;

public class for문복습4 {
	public static void main(String[] args) {
		int[] arr1 = { 3, 1, 9, 0, 7 };

		//arr1에 있는 모든 값을 더해서 출력
		int sum = 0;

		/*sum += arr1[0];
		sum += arr1[1];
		sum += arr1[2];
		sum += arr1[3];
		sum += arr1[4];
		System.out.println(sum);*/
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println(sum);

		//arr1의 값 중 가장 큰 값을 출력
		//작은값을 출력
		int max = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			//			max =max < arr1[i] ? arr1[i] : max;
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println(max);

		int mini = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (mini > arr1[i]) {
				mini = arr1[i];
			}
		}
		System.out.println(mini);
	}
}
