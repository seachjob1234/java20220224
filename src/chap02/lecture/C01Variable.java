package chap02.lecture;

public class C01Variable {
	public static void main(String[] args) {
		//변수 선언
		//타입 변수 명;
		int val1;
		
		//변수명 : lowercamelcase
		//영문대소문자,숫자,$,_
		//숫자 시작x
		// 자바 예약어 (keyword,reserved word) 사용못함
		
//		int int; // 안됨
		int name;//됨
//      int 3name;//안됨
		int my_name; //됨
		
		//변수명 작성 관습
		//lowerCamelCase
		int myName;//ok
		
		//변수에 저장된 값을 다른 명령문에서 사용 가능
		//변수에 값 저장(할당,대입)
		int var2;
		ver2 = 3; //할당 (대입)연사자 사용
		
		System.out.println(ver2);
		
		ver2 = 5;
		System.out.println(ver2);
		
		//변수 선언과 값 할당
		int var3 = 10;
		
		System.out.println(ver3);
		
		ver3 = 11; 
		
		System.out.println(ver3);
		
		//변수 여러개 선언
		int ver4, ver5, ver6;
		var4 = 90;
		ver5 = 100;
		ver6 = 11;
		
		//변수 여러개 할당 선언, 값 할당
		int var7 = 11, var8 =12, var9 = 13;
		
		//변수 선언 후 값 할당하지 않고 사용 불가능
		
		int var10;
		//ver10 = 99;
		System.out.println(var10);
		
		int var11;
		var11 = var10 + 3;
		System.out.println(var11);
		
		
		
	}
}
