package chap04.lecture.forloop;

public class C07for {
	public static void main(String[] args) {
		int[] arr1 = {3, 9, 7, 1, 2, 0};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		
		System.out.println("for문 사용");
		for (int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("각 값을 두 배로");
		//여러분의 코드 작성
		for(int i =0; i< arr1.length;i++) {
			arr1[i] *=2;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
		}
		
	}
}
