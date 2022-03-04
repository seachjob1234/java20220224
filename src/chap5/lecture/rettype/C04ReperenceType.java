package chap5.lecture.rettype;

public class C04ReperenceType {
	public static void main(String[] args) {
		int[] arr1;//참조타입이니까 데이터 뭉치를 만들 것을 
		arr1 = new int [] {8, 2, 1, -1, 0};
		
		int[] arr2;
		arr2 =arr1;//true;    //  new int [] {8, 2, 1, -1, 0};//false
		System.out.println(arr1 == arr2); 
		arr1[0] = 7;
		for (int i = 0 ; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		for(int i = 0 ; i < arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		arr2[0] = 99;
		System.out.println(arr2[0]);
	}
}
