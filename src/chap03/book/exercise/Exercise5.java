package chap03.book.exercise;

public class Exercise5 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------------------");

		x++;
		++x;
		System.out.println("x=" + x); // 12

		System.out.println("----------------------------");

		y--;
		--y;
		System.out.println("y=" + y);//8

		System.out.println("----------------------------");

		z = x++;
		System.out.println("z=" + z);//12
		System.out.println("x=" + x); //13

		System.out.println("-----------------------------");

		z = ++x;
		System.out.println("z=" + z); //14
		System.out.println("z=" + x); //14 

		System.out.println("----------------------------");

		z = ++x + y++;
		System.out.println("z=" + z); //23
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9 뒤의 ++는 나중에 계산되어 24이 아님 23가됨 하지만 여기서는 ++가 적용되어 9가 된다.

		boolean play = true;
		System.out.println(play); // true

		play = !play;
		System.out.println(play); // false

		play = !play;
		System.out.println(play); //true
		// ! 는 피연산자가 true면 false 로 false 면 true 로 값을 산출한다.

	}
}
