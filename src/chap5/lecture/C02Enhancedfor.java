package chap5.lecture;

public class C02Enhancedfor {
	public static void main(String[] args) {
		int[] arr1 = {-1, 2, 10, 13};
		int sum = 0;
		/*		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}*/
		for(int item : arr1) {
			sum += item;	
			
		}
		
		
		
		
		System.out.println(sum);
	}
}
