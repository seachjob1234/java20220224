package chap04.book;

public class for문복습 {
	public static void main(String[] args) {
		System.out.println("stmt1");
		for (int i= 0;i < 3; i++) {
		//()안 : 3개의 명령문 작성
		//1번:초기값 왼쪽
		//2번:조건식   가운데
		//3번: 코드블럭	
		//4번:증감식   오른쪽	
		//실행순서:for 만나면 1번 실행 다음에 2번실행(조건이라서 true or false에 따라서 값이 달라짐.) true ->3번 ->4번->다시 2번 ->3번 ->4번 이순으로 
		//                                                                       false -> 다음 실행 흐름.	
			System.out.println("stmt2");
			System.out.println("stmt3");
		}	
		System.out.println("stmt4");
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
		}
		// x값을 수숭해서 반복문이 7이 되도록
		int x = 7;
		for (int i = 1; i <= x; i++) {
			System.out.println("java");
		}
		for (int i = 5; i >= 0; i--) {
			System.out.println("spring");
		}
		int y = 14;
		for (int i = y; i >= 10; i--) {
			System.out.println("jsp");
		}
		for(int i = 0; i <3 ; i++) {
			System.out.println(i);
		}
		int i;//for문 종료 후에도 사용하기 원할 때 for문 이전에 넣어서 사용
		for(i = 0; i<5; i++) {
			System.out.println(i);
		}
		//System.out.println(i);//oo
		
		
	}
}

	
	

