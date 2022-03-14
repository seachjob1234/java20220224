package chap06.lecture.c08access.package2;

import chap06.lecture.c08access.package1.Computer;

public class App02 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.str1 = "spring";	
		com1.str2 = "spring";//package private 필드여서 접근 불가능
		com1.str3 =  
	}
}
