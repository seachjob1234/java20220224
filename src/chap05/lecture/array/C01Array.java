package chap05.lecture.array;

public class C01Array {
	public static void main(String[] args) {

		
		//선언후 초기화
		int[]arr2;
		arr2 = new int[] {11, 22, 33};
		
		//배열 선언화 초기화
		int[] arr1 = new int [] {10, 20, 30};
		
		
		//배열 선언과 초기화 (new 생략)
		int[] arr3 = {99, 88, 77}; 
		
		//배열 선언 
		int[] arr4;
		
		//초기값 없이 배열 만들어서 할당(배열의 길이만 제정)
		arr4 = new int[5];
		
		arr4[0] = 2;
		arr4[1] = 99;
		arr4[2] = 100;
		
		for(int i= 0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		//배열 선언 후 길이만 정해줌
		int[] arr5 = new int[10];
	

	}
}
