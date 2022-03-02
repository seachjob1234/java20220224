package chap04.book;

public class for문복습2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(("1부터 5까지 출력"));

		for (int i = 1; i <= 5; i++) {
			System.out.println(i); //o
		}

		System.out.println("0~10까지 짝수만");
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);

		}

		System.out.println("1부터 9까지 홀수만 ");

		for (int i = 1; i <= 9; i += 2) {
			System.out.println(i);

		}

		System.out.println("5부터 1까지 출력");//54321

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);//o
		}

		System.out.println("4부터 ~0까지 짝수만 출력");

		for (int i = 4; i >= 0; i -= 2) {
			System.out.println(i);
		}

		System.out.println("10부터 0까지 짝수만 출력");

		for (int i = 10; i >= 0; i -= 2) {
			/*if( i % 2 == 0) {
			System.out.println(i);
			}i--의 경우*/
			System.out.println(i);
		}
		System.out.println("9~1까지 홀수만 출력");
		for (int i = 9; i >= 1; i--) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 3; i++) {
				System.out.println(i);
			}
		}
		////
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
			}
		}
		//배열(array)
		//여러값을 가진 데이터 자료구조(data structure)
		//특징:순서(index)가 있음
		//
		
		int i1 =3; //하나의 변수에 하나의 값 대입 
		
		int[] arr1 = {10, 20, 30};//arr1은 int 배열 타입. arr1에 여러개의 int 대입
		
		System.out.println(arr1[0]);//첫번째 값은 0번
		System.out.println(arr1[1]);//두번째 값은 1번
		System.out.println(arr1[2]);//세번째 값은 2번
		
		arr1[0] =100;
		arr1[2] =200;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//배열의 길이(값 가지고 있는 수)
		System.out.println(arr1.length);
		
		
	}

}
