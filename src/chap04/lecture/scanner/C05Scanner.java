package chap04.lecture.scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값>");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 값>");
		int num2 = scanner.nextInt();
		
		System.out.println("세 문자 열>");
		String str = scanner.nextLine();
		
		System.out.println(num1+ " + "+ num2 + " = " + (num1 +num2));
		System.out.println(str);
		scanner.close();
	}
}
