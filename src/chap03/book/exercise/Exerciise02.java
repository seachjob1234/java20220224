package chap03.book.exercise;

public class Exerciise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);  // ++가 먼저 행해져서 X가 11이됨. Y의 경우는 Y값을 먼저 사용하고 다음에 --가 적용됨. 
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		//변수 작성은 소문자로 시작.
	}
}
