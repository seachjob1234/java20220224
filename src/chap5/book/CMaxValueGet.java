package chap5.book;

public class CMaxValueGet {
	public static void main(String[] args) {
		
		int[] array = { 1, 5, 3, 8, 2};
		int max = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값:" + max);
	}
}
