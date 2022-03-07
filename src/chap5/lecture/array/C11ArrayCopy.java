package chap5.lecture.array;

import java.util.Arrays;

public class C11ArrayCopy {
	public static void main(String[] args) {
		int[] a = {9, 5, 2, 1};
		int[] b = new int[a.length];
		
		for(int i =0; i<a.length;i++) {
			b[i] = a[i];
		}
		int[] c = Arrays.copyOf(a, a.length);
		int[] d = new int[a.length];
		System.out.arraycopy(a, 0, d, 0, a.length);
	}
}
