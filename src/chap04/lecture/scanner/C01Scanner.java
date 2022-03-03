package chap04.lecture.scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		//키보드 입력 준비
		Scanner scanner;
		scanner = new Scanner(System.in);
		//반드시;잘달아라
		
		
		String Line = scanner.nextLine();//키보드로 입력한 값을 enter를 만날 때 까지 문자열로 리턴
		
		
		
		//스캐너 닫기
		scanner.close();
	}
}
