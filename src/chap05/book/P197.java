package chap05.book;

public class P197 {
	public static void main(String[] args) {
		/*int max = Integar.MIN_VALUE;
		int max =*/ 
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i =0; i < array.length; i++ ) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("max :" + max);
	}
}
