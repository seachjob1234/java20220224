package chap04.lecture.scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("입력>");
			String line = scanner.nextLine();
			System.out.println("출력>" + line);
			
//			if(line == "exit") {
				//break; or
			if(line.equals("exit")) {//string  바꿈
				run =false;
			}
		}	
		scanner.close();
	}
}
