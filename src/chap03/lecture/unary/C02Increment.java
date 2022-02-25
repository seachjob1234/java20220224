package chap03.lecture.unary;

public class C02Increment {
	public static void main(String[] args) {
		//증감연산자
		//증가 increment
		//감소 decrement
		
		int i = 7;
		
		i++; // i = i + 1
		System.out.println(i); //8
		
		i--;// i = i - 1
		System.out.println(i); //7
		
		// 증감 연산자 위치 : 피연산자 앞/뒤 
		
		++i; // i = i+1
		System.out.println(i); //8
		
		--i; // i = i-1
		System.out.println(i); //7 
		
		System.out.println(i++); //7
		System.out.println(i); //8
		
		System.out.println(i--); //8
		System.out.println(i); //7
		
		System.out.println(++i); // 8
		System.out.println(i); // 8
		
		System.out.println(--i); //7
		System.out.println(i); //7
		
		int j = i++;
		int k = ++i;
		
		System.out.println(j); // 7
		System.out.println(k); // 9
		
		int l = i; //9
		i++;
		
		i++;
		int m = i; //11
		
		System.out.println(l);
		System.out.println(m);
	
	}
}
