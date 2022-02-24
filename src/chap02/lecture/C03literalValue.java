package chap02.lecture;

public class C03literalValue {
	public static void main(String[] args) {
		
		//정수 literal
		System.out.println(10);
        
		//실수 
		System.out.println(0.1);
		System.out.println(1.137294);
		
		
		//문자 literal (하나의 문자)
		System.out.println('a');
		System.out.println('b');
		System.out.println('A');
//		System.out.println('AB');// X
//		System.out.println('');// X
		System.out.println(' ');
		System.out.println('가');
		System.out.println('0');
		System.out.println();//빈줄 출력
		System.out.println('나');
		
		//문자열 literal (0개 이상의 문자 나열)
		System.out.println("");
		System.out.println("A");
		System.out.println("ABC");
		System.out.println("가나다");
		System.out.println("🤞©©©"); // win +
		System.out.println("Hello world!@#$");
		System.out.println("Hello\tWorld");//\t탭
		System.out.println("Hello\nWorld");//\n 다음줄
		System.out.println("I'm ironman");
		//System.out.println("I am \ "ironman\"");// \
		System.out.println("backslash \\");
		
		//논리 boolrean, literal true,false 
		System.out.println(true);
		System.out.println(false);
	}
}
