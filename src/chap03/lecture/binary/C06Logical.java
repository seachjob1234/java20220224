package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		//논리 연산자
		//&&(and short circuit) ||(or)
		//&(and) |(or) ^(xor)
		//피연산자 boolean
		//연산결과 boolean
		//and &&
		//양변 모두 true 일때만 true 나머지는 모두false
		System.out.println("AND &&");
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && false);
		System.out.println(false && true); 
		// or ||
		//양변모두 false 일때만 false 나머지는 모두 true
		System.out.println("OR ||");
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(false || true);
		//short circuit
		int i = 3;
		System.out.println((i > 0)&&(i++ > 0));
		System.out.println(i);
		
		System.out.println((i < 0 ) && (i++ < 0)); // 단락 (short circuit)
		System.out.println(i);
		
		System.out.println((i <0) || (i++ <0)); //short circuit
		System.out.println(i);
		
		System.out.println((i > 0) || (i++ > 0 ));
		System.out.println(i);
		
		System.out.println((i >0) & (i++ > 0));
		System.out.println(i);
		
		System.out.println((i <  0) & (i++ <0)); //short circuit xxxxxx
		System.out.println(i);
		
		// ^ (xor)
		//양변이 다를 때만 true 나머지는 false
		System.out.println();
	 System.out.println(true ^ true);
	 System.out.println(true ^ false  );
	 System.out.println(false ^ true);
	 System.out.println(false ^ false );
		
	}
}
