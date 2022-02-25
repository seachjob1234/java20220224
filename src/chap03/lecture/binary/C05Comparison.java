package chap03.lecture.binary;

public class C05Comparison {
	public static void main(String[] args) {
		//비교연산자
		//type boolean
		//>,>=,<,==,i=
		//결과 type = boolrean
		
		int i1 = 3, i2 =5;
		System.out.println(i1 = i2 ); // false
		System.out.println(i1 != i2 );//같으면 true 아니면 false
		System.out.println(i1 > i2);//왼쪽 값이 크면 true,아니면 false
		System.out.println(i1 >= i2);//왼쪽 값이 크거나 같으면 true 아니면 false
		System.out.println(i1 < i2);//왼쪽 값이 적으면 true,아니면 false
		System.out.println(i1 <= i2);// 왼쪽 값이 적거나 같으면 true, 아니면 false
		
		System.out.println(3.14 <= 9.9);
		System.out.println('A' <= 'B'); // UNICODE 비교
		System.out.println('A'+0);
		
		//실수 TYPE비교
		double v4 = 0.1;
		double v5 = 0.1f;
		
		System.out.println(v4 == v5);//false
		
	}
}
